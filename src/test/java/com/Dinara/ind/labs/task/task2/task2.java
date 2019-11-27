package com.Dinara.ind.labs.task.task2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.*;
import org.w3c.dom.css.Counter;

public class task2 {
    @Test
    public void CountTest(){
 //       Count count = new Count;
 //         Assertions.assertEquals(1,Count.find("i"));
        Count test = new Count("a b b b b b");
//       Assertions.assertEquals(1, test.col("a"));
        Assertions.assertEquals(5, test.col("b"));
//        Assertions.assertEquals(0, test.col("a b a"));
    }
}
