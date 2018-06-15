package com.insightfullogic.java8.exercises.chapter5;

import com.insightfullogic.java8.exercises.Exercises;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.mapping;

public class WordCount {

    public static Map<String, Long> countWords(Stream<String> names) {
        return names.collect(groupingBy(name -> name, counting()));
        }
    }

