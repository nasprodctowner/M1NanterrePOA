package pattern.abstractfactory.gui.api;

class WinFactory extends GUIFactory {

    @Override
    public Button createButton() {
        return new WinButton();
    }
}
