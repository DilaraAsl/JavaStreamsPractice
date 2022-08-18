package com.cydeo;
import java.util.stream.*;
import java.io.IOException;
import java.util.stream.IntStream;

public class JavaStreams {
    public static void main(String[] args) throws IOException {

        // 1. Integer Stream

        IntStream
                .range(1,10) // range of integers from 1,9 - 10 is not included
                .forEach(System.out::print); // class :: method
        System.out.println();
    }
}
