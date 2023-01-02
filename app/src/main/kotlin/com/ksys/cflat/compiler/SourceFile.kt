package com.ksys.cflat.compiler

import java.io.File

class SourceFile {
    companion object {
        val EXT_CFLAT_SOURCE = ".cb"
        val EXT_ASSEMBLY_SOURCE = ".s"
        val EXT_OBJECT_FILE = ".o"
        val EXT_STATIC_LIBRARY = ".a"
        val EXT_SHARED_LIBRARY = ".so"
        val EXT_EXECUTEABLE_FILE = ""
        // FIXME: error
        // val KNOWN_EXTENSIONS: String[] = {
        //     EXT_CFLAT_SOURCE,
        //     EXT_ASSEMBLY_SOURCE,
        //     EXT_OBJECT_FILE,
        //     EXT_STATIC_LIBRARY,
        //     EXT_SHARED_LIBRARY,
        //     EXT_EXECUTEABLE_FILE
        // };
    }

    private val originalName: String
    private var currentName: String

    constructor(name: String) {
        originalName = name
        currentName = name
    }

    fun path(): String {
        return currentName
    }

    fun asmFileName(): String {
        return replaceExt(EXT_ASSEMBLY_SOURCE)
    }

    fun objFileName(): String {
        return replaceExt(EXT_OBJECT_FILE)
    }

    private fun replaceExt(ext: String): String {
        return baseNameStrip(originalName, true) + ext
    }

    private fun baseNameStrip(path: String, stripExt: Boolean): String {
        if (stripExt) {
            return baseName(path).replaceFirst("\\.[^.]*$".toRegex(), "")
        }
        return baseName(path)
    }

    private fun baseName(path: String): String {
        return File(path).getName()
    }
}
