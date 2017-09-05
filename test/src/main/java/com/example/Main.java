package com.example;

import com.leetcode.google.DecodeString;
import com.leetcode.google.GenerateParentheses;
import com.leetcode.google.MissingRanges;
import com.leetcode.google.QueueReconstructionByHeight;
import com.leetcode.google.SentenceScreenFitting;
import com.leetcode.google.ShortestDistanceFromAllBuildings;
import com.leetcode.google.StrobogrammaticNumberII;
import com.leetcode.google.UTFValidation;
import com.leetcode.google.WordBreakII;
import com.leetcode.google.WordSquares;
import com.leetcode.google.ZigzagIterator;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

public class Main {

    public static void main(String[] args) {
        List<String> lists = new WordBreakII().wordBreak("catsanddog", Arrays.asList("cat", "cats", "and", "sand", "dog"));
        for (String s : lists) {
            System.out.println(s);
        }

    }


}
