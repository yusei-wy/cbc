package com.ksys.cflat.compiler;

enum CompilerMode {
    Assemble("-c"),
    Compile("-S");

    private final String option;

    CompilerMode(String option) {
        this.option = option;
    }
}