package com.twc.javaBasic;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junitpioneer.jupiter.TempDirectory;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(TempDirectory.class)
class IOTest {
    @Test
    void should_read_write_file_from_file_stream(@TempDirectory.TempDir Path dir) throws Exception {
        final String message = "Hello world!" + System.lineSeparator();
        Path filePath = dir.resolve("sample.txt");

        writeAllText(message, filePath, StandardCharsets.UTF_8);
        assertEquals(message, readAllText(filePath, StandardCharsets.UTF_8));
    }

    @SuppressWarnings("SameParameterValue")
    private static void writeAllText(String message, Path filePath, Charset charset) throws IOException {
        // TODO:
        //  please implement the method to writer text to file using `PrintWriter`.
        //  If you need help, please check page 60 of "Core Java Vol 2", section
        //  2.2.1.
        // <--start
        throw new RuntimeException("Not implemented");
        // --end-->
    }


    @SuppressWarnings("SameParameterValue")
    private static String readAllText(Path path, Charset charset) throws IOException {
        // TODO:
        //  Please implement the method to read text from file using `Files` helper
        //  methods. If you need help, please check page 62 of "Core Java Vol 2",
        //  section 2.2.2.
        // <--start
        throw new RuntimeException("Not implemented");
        // --end-->
    }

    @Test
    void should_be_able_to_write_and_read_binary_data_to_file(@TempDirectory.TempDir Path dir) throws Exception {
        Path filePath = dir.resolve("sample.bin");

        final int firstValue = 2018;
        final double pi = 3.14;

        // TODO:
        //  please write `firstValue` and `pi` to `filePath`
        //  For help, please check page 69 of "Core Java Vol 2", section 2.3.
        // <--start

        // --end-->

        int actualFirstValue = 0;
        double actualPi = 0;

        // TODO: please read `actualFirstValue` and `actualPi` from `filePath`
        // <--start

        // --end-->

        assertEquals(firstValue, actualFirstValue);
        assertEquals(pi, actualPi);
    }
}
