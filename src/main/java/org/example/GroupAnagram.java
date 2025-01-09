//package org.example;
//
//import java.util.*;
//
//public class GroupAnagram {
//    public String groupAnagram(String[] strs) {
//        Map<String, List<String>> map = new HashMap<>();
//        for (String word : strs) {
//            char[] chars = word.toCharArray();
//            Arrays.sort(chars);
//            String sortedString = new String(word);
//
//
//            if (!map.containsKey(sortedString)) {
//                map.put(sortedString, new ArrayList<>());
//            }
//            map.get(sortedString).add(word);
//
//        }
//
//        return  new ArrayList<>(map.values());
//    }
//
//}
