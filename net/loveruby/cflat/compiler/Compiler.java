package net.loveruby.cflat.compiler;

import java.util.List;

import net.loveruby.cflat.util.ErrorHandler;

/**
 * Compiler
 */
public class Compiler {
    static final public String ProgramName = "cbc";
    static final public String Version = "1.0.0";

    public static void main(String[] args) {
        new Compiler(ProgramName).commandMain(args);
    }

    public Compiler(String programName) {
        this.errorHandler = new ErrorHandler(programName);
    }

    private final ErrorHandler errorHandler;

    private void commandMain(String[] args) {
        Options opts = Options.parse(args);
        List<SourceFile> srcs = opts.sourceFiles();
        build(srcs, opts);
    }

    public void build(List<SourceFile> srcs, Options opts) {
        for (SourceFile src : srcs) {
            compile(src.path(), opts.asmFileNameOf(src), opts);
            assemble(src.path(), opts.objFileNameOf(src), opts);
        }
        link(opts);
    }

    public void compile(String srcPath, String destPath, Options opts) {
        // TODO: compile
    }

    public void assemble(String srcPath, String destPath, Options opts) {
        // TODO asseble
    }

    public void link(Options opts) {
        // TODO: link
    }
}
