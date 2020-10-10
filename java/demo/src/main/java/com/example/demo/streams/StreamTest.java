package com.example.demo.streams;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Stream;

import org.junit.Assert;
import org.junit.Test;

public class StreamTest {
    @Test
    public void test1() {
        List<String> words = Arrays.asList("Java", "C++", "Golang");
        long n = words.stream().filter(x -> x.length() > 3).count();
        Assert.assertTrue(n > 0);
    }

    @Test
    public void test2() {
        Stream<BigInteger> integer = Stream.iterate(BigInteger.ZERO, n -> n.add(BigInteger.ONE));
        integer.forEach(System.out::print);
    }

    @Test
    public void test3() {
        Stream<Double> random = Stream.generate(Math::random);
        Double d = random.findFirst().get();
        System.out.println(d.longValue());
    }

    @Test
    public void test4() {
        String contents = "suntonggzhangsanglisigwangwug";
        Stream<String> words = Pattern.compile("\\PL+").splitAsStream(contents);
        words.forEach(System.out::println);
    }

    @Test
    public void test5() {
        List<String> strs = Arrays.asList("", "");
        strs.stream().forEach(System.out::printf);
    }

    @Test
    public void test6() {
        System.out.println(SubClass.value);
    }

    @Test
    public void test7() {
        System.out.println("");
    }

}

class SuperClass {
    public static int value = 123;
    static {
        System.out.println("Supper Class!");
    }
}

class SubClass extends SuperClass {
    static {
        System.out.println("Sub Class!");
    }

    public static String values() {
        return "values";
    }
}
