package pattern.abstractfactory.gui.api;

public abstract class Button {
    private String caption;
    public abstract void paint();

    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }
}
