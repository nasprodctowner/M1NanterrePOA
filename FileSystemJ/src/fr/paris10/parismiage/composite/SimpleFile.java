package fr.paris10.parismiage.composite;

public class SimpleFile extends AbstractFile {

    private StringBuffer contents;

    public SimpleFile(String name, String username) {
        super(name, username);
        this.contents = new StringBuffer();
    }

    @Override
    public String toString() {
        return "(f)" + super.toString();
    }

    @Override
    public String read() {
        if (getMode() == OpenMode.READ) {
            return contents.toString();
        } else {
            return null;
        }
    }

    @Override
    public boolean write(String content) {
        if (getMode() == OpenMode.WRITE) {
            this.contents = new StringBuffer(content);
            return true;
        } else if (getMode() == OpenMode.APPEND) {
            this.contents.append(content);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int size() {
        return contents.length();
    }
}
