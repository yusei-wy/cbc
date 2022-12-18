package com.ksys.cflat.compiler

class Options {
    var mode: CompilerMode? = null
    // vbar platform = X86Linux();
    var outputFileName = ""
    // var verbose = false;
    // var loader = LibraryLoader();
    var sourceFiles = listOf<SourceFile>()

    companion object {
        fun parse(args: List<String>): Options {
            var opts = Options()
            opts.parseArgs(args)
            return opts
        }
    }

    private fun parseArgs(args: List<String>) {
        // TODO:
    }

    fun asmFileNameOf(src: SourceFile): String {
        if (outputFileName != null && mode == CompilerMode.Compile) {
            return outputFileName
        }
        return src.asmFileName()
    }

    fun objFileNameOf(src: SourceFile): String {
        if (outputFileName != null && mode == CompilerMode.Assemble) {
            return outputFileName
        }
        return src.objFileName()
    }
}
