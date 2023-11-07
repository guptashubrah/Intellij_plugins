package actions;

import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.actionSystem.CommonDataKeys;
import com.intellij.openapi.command.WriteCommandAction;
import com.intellij.openapi.editor.Editor;
import com.intellij.openapi.editor.EditorModificationUtil;
import com.intellij.openapi.project.Project;
import com.intellij.psi.PsiDocumentManager;
import com.intellij.psi.PsiFile;

import com.intellij.openapi.application.ApplicationManager;
import com.intellij.openapi.command.CommandProcessor;
import com.intellij.openapi.project.Project;

public class Message extends AnAction {
    @Override
    public void actionPerformed(AnActionEvent e) {
        Project project = e.getProject();
        if (project != null) {
            Editor editor = e.getData(CommonDataKeys.EDITOR);
            if (editor != null) {
                PsiFile file = PsiDocumentManager.getInstance(project).getPsiFile(editor.getDocument());
                if (file != null && file.getName().endsWith(".java")) {
                    // Generate your custom comment text
                    String comment = "// This is a custom comment";

                    // Insert the comment into the file

//                    Runnable r = ()-> editor.getDocument().insertString(0, comment);
                    Runnable r = ()-> EditorModificationUtil.insertStringAtCaret(editor, comment);
                    WriteCommandAction.runWriteCommandAction(project, r);
                    //                    editor.getDocument().insertString(0, comment);
                }
            }
        }
    }

    @Override
    public void update(AnActionEvent e) {
        PsiFile file = e.getData(CommonDataKeys.PSI_FILE);


        boolean isJavaFile = (file != null) && (file.getName().endsWith(".java"));
        e.getPresentation().setEnabledAndVisible(isJavaFile);

    }
}
