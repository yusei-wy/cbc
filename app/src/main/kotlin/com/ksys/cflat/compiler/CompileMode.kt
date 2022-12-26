package com.ksys.cflat.compiler;

enum class CompilerMode {
    Assemble("-c"),
    Compile("-S");

    private val option: String;

    constructor(option: String) {
        this.option = option;
    }
}
