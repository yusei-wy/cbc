package com.ksys.cflat.compiler

import com.ksys.cflat.util.ErrorHandler

/** Compiler */
class Compiler(val programName: String) {
    val errorHandler: ErrorHandler

    init {
        errorHandler = ErrorHandler(programName)
    }

    fun commandMain(args: List<String>) {
        val opts = Options.parse(args)
        val srcs = opts.sourceFiles
        build(srcs, opts)
    }

    fun build(srcs: List<SourceFile>, opts: Options) {
        for (src in srcs) {
            compile(src.path(), opts.asmFileNameOf(src), opts)
            assemble(src.path(), opts.objFileNameOf(src), opts)
        }
        link(opts)
    }

    fun compile(srcPath: String, destPath: String, opts: Options) {
        // TODO: compile
    }

    fun assemble(srcPath: String, destPath: String, opts: Options) {
        // TODO asseble
    }

    fun link(opts: Options) {
        // TODO: link
    }
}

const val PROGRAM_NAME = "cbc"
const val VERSION = "1.0.0"

fun main(args: List<String>) {
    // NOTE: なぜ commandMain は static じゃないのにエラーじゃない？
    Compiler(PROGRAM_NAME).commandMain(args)
}
