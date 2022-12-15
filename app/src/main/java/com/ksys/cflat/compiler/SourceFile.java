package com.ksys.cflat.compiler;

import java.io.File;

public class SourceFile {
    static final String EXT_CFLAT_SOURCE = ".cb";
    static final String EXT_ASSEMBLY_SOURCE = ".s";
    static final String EXT_OBJECT_FILE = ".o";
    static final String EXT_STATIC_LIBRARY = ".a";
    static final String EXT_SHARED_LIBRARY = ".so";
    static final String EXT_EXECUTEABLE_FILE = "";

    static final String[] KNOWN_EXTENSIONS = {
            EXT_CFLAT_SOURCE,
            EXT_ASSEMBLY_SOURCE,
            EXT_OBJECT_FILE,
            EXT_STATIC_LIBRARY,
            EXT_SHARED_LIBRARY,
            EXT_EXECUTEABLE_FILE
    };

    private final String originalName;
    private String currentName;

    SourceFile(String name) {
        this.originalName = name;
        this.currentName = name;
    }

    String path() {
        return this.currentName;
    }

    String asmFileName() {
        return replaceExt(EXT_ASSEMBLY_SOURCE);
    }

    String objFileName() {
        return replaceExt(EXT_OBJECT_FILE);
    }

    // TODO: test
    private String replaceExt(String ext) {
        return baseNameStrip(originalName, true) + ext;
    }

    private String baseName(String path) {
        return new File(path).getName();
    }

    private String baseNameStrip(String path, boolean stripExt) {
        if (stripExt) {
            return new File(path).getName().replaceFirst("\\.[^.]*$", "");
        }
        return baseName(path);
    }
}
