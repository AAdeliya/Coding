package org.example;

import java.lang.classfile.components.ClassPrinter;

public class LinkedListCycle {
    public boolean hasCycle(ListNode head) {

    ClassPrinter.ListNode slow = head;
    ListNode fast = head;
    while(fast !=null&&fast.next !=null)

    {
    }

    slow = slow.next;
    fast = fast.next.next;
    if(slow == fast)

    {
        return true;
    }
}
return false;
        }
}
