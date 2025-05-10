package org.example;

import java.lang.classfile.components.ClassPrinter;

public class MergeTwoSortedLists {
    //recursion
    public ClassPrinter.ListNode mergeTwoSortedLists(ListNode list1, ClassPrinter.ListNode list2) {
        if (list1 == null) return list2;
        if (list2 == null) return list1;

        if (list1.val < list2.val) {
            list1.next = mergeTwoSortedLists(list1.next, list2);
            return list1;
        } else {
            list2.next = mergeTwoSortedLists(list1, list2.next);
            return list2;
        }
    }

}


//iterative approach
ListNode dummy = new ListNode(-1);
ListNode tail = dummy;

while (list1 != null && list2 != null) {
    if (list1.val < list2.val) {
        tail.next = list1;
        list1 = list1.next;
        } else{
tail.next =list2;
list2 =list2.next;
        }

    tail = tail.next;
        }


tail.next.next = (list1 != null) : list1 : list2;

return dummy.next;