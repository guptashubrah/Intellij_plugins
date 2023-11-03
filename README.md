# Intellij_plugins

This repo contains my experiments with Intellij Idea Plugins, written in Java. <br>
First commit helps to enter a custom comment using an option on the Tool Menu and EditPopup Menu in another instance.


How to run?
1. Clone the files in the Intellij Idea IDE, and on the right-hand side of the screen below x(close), there is an icon of **Gradle** along with the notification icon.
2. Click on Gradle->Tasks->intellij and search for runIde there, and then double click on runIde to see a new instance of IDE opened, where we open a test project.
3. Activate our plugin through right-click on the editor or tool menu to get a popup menu and choose "Gems" or whatever name we have assigned (the name has been given in the plugin.xml file).


How to build the plugin that we developed?
1. Gradle(in the right, icon) -> Tasks -> intellij -> buildPlugin
2. This will create a zip file for our plugin in the folder build -> distributions.
3. If we want to apply this plugin to some other project (let's say Project Y) in a new instance of IntelliJ IDEA,
    go to File -> Settings -> Plugin -> Gear icon on the top of menu -> Install Plugin from disk -> Upload the zip created in previous step -> Install it there, and use       in the editor.
   




Resources:<br>
https://www.youtube.com/watch?v=_VFbRlF_tp0 <br>
https://www.freecodecamp.org/news/how-to-create-an-intellij-plugin-lets-build-a-simple-dictionary-finder-6c5192b449c/<br>

