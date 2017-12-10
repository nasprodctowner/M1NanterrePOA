package pattern.abstractfactory.gui.client;

import pattern.abstractfactory.gui.api.Button;
import pattern.abstractfactory.gui.api.GUIFactory;

public class Application {
    public static void main(String[] args) {
        int os = 0; //supposant qu'on est sur windows
        //os=1;//si on est sur mac
        GUIFactory guiFactory = GUIFactory.getFactory(os);
        Button button = guiFactory.createButton();
        button.setCaption("PLAY");
        button.paint();
    }
}
