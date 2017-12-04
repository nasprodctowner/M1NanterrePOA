package fr.paris10.parismiage.composite;

public interface File {

    public enum OpenMode {
        READ(), WRITE(), APPEND();

        private OpenMode() {
        }
    }

    int getId();

    String getName();

    UserRegistry.User getUser();

    OpenMode getMode();

    boolean open(OpenMode mode);

    boolean close();

    void rename(String name);

    String read();

    boolean write(String content);

    int size();


}
