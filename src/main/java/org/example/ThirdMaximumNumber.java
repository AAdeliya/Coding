package org.example;

import java.net.CookieHandler;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class ThirdMaximumNumber {
    public int thirdMax(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int n  : nums ) set.add(n);
        if (set.size() < 3) return Collections.max(set);
        set.remove(Collections.max(set));
        set.remove(Collections.max(set));
        return Collections.max(set);
        }
    }
}
