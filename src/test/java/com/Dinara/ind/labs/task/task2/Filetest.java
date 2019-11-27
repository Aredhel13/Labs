package com.Dinara.ind.labs.task.task2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.*;
import org.w3c.dom.css.Counter;

import java.io.FileNotFoundException;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Filetest {
    @Test
    public void CounterTest() throws FileNotFoundException {
        WordCounterFile test = new WordCounterFile();
        String f = "C:\\Users\\Lenovo\\IdeaProjects\\start\\src\\main\\resources\\8.txt";
//       Assertions.assertEquals(1, test.col("a"));
//        Assertions.assertEquals(4, test.col(f,"8"));
      Assertions.assertEquals(2, test.col(f,"f"));
    }
}
