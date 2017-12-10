package pattern.abstractfactory.gui.api;

class OSXFactory extends GUIFactory {

    @Override
    public Button createButton() {
        return new OSXButton();
    }
}
