package com.cydeo;
import java.util.Arrays;
import java.util.List;
import java.util.stream.*;
import java.io.IOException;
import java.util.stream.IntStream;

public class JavaStreams {
    public static void main(String[] args) throws IOException {

        // 1. Integer Stream

        IntStream
                .range(1,10) // range of integers from 1,9 - 10 is not included
                .forEach(System.out::print); // object :: method
        System.out.println();

        // 2. Integer Stream with skip
        IntStream
                .range(1,10)
                .skip(5) //skips after 5 prints numbers starting from 6-9
                .forEach(x-> System.out.print(x));
        System.out.println();


        // 3. Integer Stream with sum
        System.out.println(
                IntStream
                        .range(1,5)
                        .sum()
        );
        System.out.println();

        // 4. Stream.of sorted and findFirst
        Stream.of("Ava","Amber","Andrei")
                .sorted()
                .findFirst()
                .ifPresent(System.out::println);

        // 5. Stream from an Array, sort, filter, print

      //  String[] names={"Al","John","Vivienne","Sue","James","Steve","Tonia","Mary","Joanne"};
       // Arrays.stream(names)  // same as Stream.of (names)
        Arrays.stream(new String[]{"Al","John","Vivienne","Sue","James","Steve","Tonia","Mary","Joanne"})
                .filter(x->x.startsWith("S"))
                .sorted()
                .forEach(System.out::println);

        // 6. Average of Squares of an int array
        Arrays.stream(new int[] {2,4,6})//
                .map(x->x*x)
                .average()//4+16+36=56  56/3=22
                .ifPresent(System.out::println);

        // 7. Stream from List, filter and print
        List<String> people=Arrays.asList("Al","John","Vivienne","Sue","James","Steve","Tonia","Mary","Joanne");
        people
                .stream()
                .map(String::toLowerCase) // map accepts string object::to lowercase method
                .filter(x->x.startsWith("a"))
                .forEach(System.out::println);

    }
}
