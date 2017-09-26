/**
 * Problem 021.Merge Two Sorted Lists
 * --Description:
 * Merge two sorted linked lists and return it as a new list.
 * The new list should be made by splicing together the nodes of the first two lists.
 */
public class Problem021 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(0);
        ListNode root = result;
        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                result.next = new ListNode(l1.val);
                l1 = l1.next;
            }else {
                result.next = new ListNode(l2.val);
                l2 = l2.next;
            }
            result = result.next;
        }
        if (l1!=null) result.next = l1;
        if (l2 != null) result.next = l2;
        return root.next;
    }

        //  第二种方法：递归法
//        if (l1 == null) {
//            return l2;
//        }
//        if (l2 == null) {
//            return l1;
//        }
//        if (l1.val < l2.val) {
//            l1.next = mergeTwoLists(l1.next, l2);
//            return l1;
//        } else {
//            l2.next = mergeTwoLists(l1, l2.next);
//            return l2;
//        }
//    }

    public static void main(String[] args) {
        Problem021 test = new Problem021();
        int[] a1 = new int[]{1, 3, 5, 7, 9};
        int[] a2 = new int[]{2, 4, 6, 8, 10};
        ListNode l1=new ListNode(0), root1 = l1;
        ListNode l2=new ListNode(0), root2=l2;
        for (int i : a1) {
            l1.next = new ListNode(i);
            l1 = l1.next;
        }
        for (int i : a2) {
            l2.next = new ListNode(i);
            l2 = l2.next;
        }
        System.out.println(test.mergeTwoLists(root1.next,root2.next));
    }
}
