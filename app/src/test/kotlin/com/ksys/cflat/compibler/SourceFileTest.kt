package com.ksys.cflat.compiler

import kotlin.test.Test
import kotlin.test.assertEquals

class SourceFileTest {
    @Test
    fun testPath() {
        val empty = SourceFile("")
        assertEquals(empty.path(), "")

        val source = SourceFile("main.c")
        assertEquals(source.path(), "main.c")
    }

    @Test
    fun testAsmFileName() {
        val e = SourceFile("")
        assertEquals(e.asmFileName(), ".s")

        val source = SourceFile("main.c")
        assertEquals(source.asmFileName(), "main.s")
    }

    @Test
    fun testObFileName() {
        val e = SourceFile("")
        assertEquals(e.objFileName(), ".o")

        val source = SourceFile("main.c")
        assertEquals(source.objFileName(), "main.o")
    }
}
