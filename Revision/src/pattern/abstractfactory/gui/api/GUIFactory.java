package pattern.abstractfactory.gui.api;

public abstract class GUIFactory {

    public static GUIFactory getFactory(int os){
        if(os==0){
            return new WinFactory();
        }else {
            return new OSXFactory();
        }
    }

    public abstract Button createButton();

}
