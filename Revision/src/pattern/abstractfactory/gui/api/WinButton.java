package pattern.abstractfactory.gui.api;

public class WinButton extends Button {

    @Override
    public void paint(){
        System.out.println("Paint on windows : "+getCaption());
    }
}
