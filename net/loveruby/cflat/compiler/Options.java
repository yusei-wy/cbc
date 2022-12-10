package net.loveruby.cflat.compiler;

import java.util.List;

public class Options {
    static Options parse(String[] args) {
        Options opts = new Options();
        opts.parseArgs(args);
        return opts;
    }

    private CompilerMode mode;
    // private Platform platform = new X86Linux();
    private String outputFileName;
    // private boolean verbose = false;
    // private LibraryLoader loader = new LibraryLoader();
    private List<SourceFile> sourceFiles;

    private void parseArgs(String[] args) {
        // TODO:
    }

    List<SourceFile> sourceFiles() {
        return sourceFiles;
    }

    String asmFileNameOf(SourceFile src) {
        if (outputFileName != null && mode == CompilerMode.Compile) {
            return outputFileName;
        }
        return src.asmFileName();
    }

    String objFileNameOf(SourceFile src) {
        if (outputFileName != null && mode == CompilerMode.Assemble) {
            return outputFileName;
        }
        return src.objFileName();
    }
}
