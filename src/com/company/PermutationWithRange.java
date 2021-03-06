package com.company;

import java.util.*;

public class PermutationWithRange {

    // 有重复
    public Map<Integer, List<String>> permuation (char[] chars, int s, int e) {
        Map<Integer, List<String>> res = new HashMap<>();
        if (s > e || s > chars.length) {
            return res;
        }
        Arrays.sort(chars);
        boolean[] visited = new boolean[chars.length];

        helper (res, visited, new StringBuilder(), s, e, chars);
        return res;
    }

    void helper (  Map<Integer, List<String>> res, boolean[] visited, StringBuilder sb, int s, int e, char[] chars) {
        int length = sb.length();
        if (sb.length() >= s && sb.length() <= e) {
            res.putIfAbsent(sb.length(), new ArrayList<>());
            res.get(sb.length()).add(sb.toString());
            if (sb.length() == e) {
                return;
            }
        }
        for (int i = 0; i < chars.length; i++) {
            if (i > 0 && chars[i] == chars[i - 1] && !visited[i - 1] || visited[i]) {
                continue;
            }
            visited[i] = true;
            sb.append(chars[i]);
            helper (res,visited, sb, s, e, chars);
            visited[i] = false;
            sb.setLength(length);
        }
    }
}
