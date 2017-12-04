package fr.paris10.parismiage.composite;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;


public class Directory extends AbstractFile {

    private Map<Integer, File> contents;

    public Directory(String name, String username) {
        super(name, username);
        this.contents = new HashMap<>();
    }

    File add(File f) {
        return contents.put(f.getId(), f);
    }

    private File remove(File f) {
        return contents.remove(f.getId());
    }

    public File getById(Integer fileId) {
        return contents.get(fileId);
    }

    public File getByName(String fileName) {
        return contents.values().stream()
                .filter(f -> f.getName().equals(fileName))
                .findAny()
                .orElse(null);
    }

    @Override
    public String toString() {
        return String.format("(d)%s [%s]",
                super.toString(),
                contents.values().stream()
                        .map(f -> f.toString())
                        .collect(Collectors.joining("\n")));
    }

    @Override
    public String read() {
        if (getMode() == OpenMode.READ) {
            return contents.values().stream()
                    .map(f -> f.toString())
                    .collect(Collectors.joining("\n"));
        } else {
            return null;
        }
    }

    @Override
    public boolean write(String content) {
        if (getMode() == OpenMode.WRITE) {
            contents.clear();
            File file = new SimpleFile(content, getUser().getUid());
            add(file);
            return true;
        } else if (getMode() == OpenMode.APPEND) {
            File file = new SimpleFile(content, getUser().getUid());
            add(file);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int size() {
        return contents.size();
    }
}
