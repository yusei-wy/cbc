package net.loveruby.cflat.compiler;

public class SourceFile {
    private final String originalName;
    private String currentName;

    SourceFile(String name) {
        this.originalName = name;
        this.currentName = name;
    }

    String path() {
        return this.currentName;
    }
}
