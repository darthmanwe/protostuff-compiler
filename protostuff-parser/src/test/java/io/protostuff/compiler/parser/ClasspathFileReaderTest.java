package io.protostuff.compiler.parser;

import org.antlr.v4.runtime.CharStream;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

/**
 * @author Kostiantyn Shchepanovskyi
 */
public class ClasspathFileReaderTest {

    @Test
    public void testRead() throws Exception {
        ClasspathFileReader reader = new ClasspathFileReader();
        CharStream a = reader.read("protostuff_unittest/messages_sample.proto");
        CharStream b = reader.read("this_file_does_not_exist.proto");
        assertNotNull(a);
        assertNull(b);
    }
}
