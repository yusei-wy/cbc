package com.ksys.cflat.compiler

import kotlin.test.Test
import kotlin.test.assertEquals

class SourceFileTest {
    @Test fun testPath() {
        val sourceFile = SourceFile("main.c")
        assertEquals(sourceFile.path(), "")
    }
}
