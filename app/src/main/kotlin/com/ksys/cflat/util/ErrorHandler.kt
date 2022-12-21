package com.ksys.cflat.util

import java.io.OutputStream
import java.io.PrintStream

class ErrorHandler {
    val programId: String
    var stream: PrintStream
    // var errCnt: long
    // var warnCnt: long

    constructor(programId: String) {
        this.programId = programId
        stream = System.err
    }

    constructor(programId: String, stream: OutputStream) {
        this.programId = programId
        this.stream = PrintStream(stream)
    }
}
