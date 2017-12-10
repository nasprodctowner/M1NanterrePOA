package pattern.abstractfactory.gui.api;

public class OSXButton extends Button {

    @Override
    public void paint(){
        System.out.println("Paint on OSX : "+getCaption());
    }
}
