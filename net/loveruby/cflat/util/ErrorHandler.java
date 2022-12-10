package net.loveruby.cflat.util;

import java.io.OutputStream;
import java.io.PrintStream;

public class ErrorHandler {
    protected String programId;
    protected PrintStream stream;
    protected long errCnt;
    protected long warnCnt;

    public ErrorHandler(String programId) {
        programId = programId;
        stream = System.err;
    }

    public ErrorHandler(String programId, OutputStream stream) {
        programId = programId;
        this.stream = new PrintStream(stream);
    }
}
