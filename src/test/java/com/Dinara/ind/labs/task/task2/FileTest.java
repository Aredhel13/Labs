package com.Dinara.ind.labs.task.task2;

import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FileTest {
    @Test
    void WordsCounterFileTest() throws IOException {
        WordCounterFile test = new WordCounterFile("src\\main\\resources\\");
        assertEquals(test.col("Hello"),2);
        assertEquals(test.col("111"),2);
        assertEquals(test.col("Dinara"),3);
    }
}