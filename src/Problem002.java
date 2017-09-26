/**
 * 002.Add Two Numbers
 *
 * --Problem Description:
 * You are given two non-empty linked lists representing two non-negative integers.
 * The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.
 * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 *
 * --Example:
 * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
 * Output: 7 -> 0 -> 8
 */
public class Problem002 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(0);
        ListNode root = result;
        int carry = 0, value1 = 0, value2 = 0;
        while (l1 != null || l2 != null || carry != 0) {
            if (l1 != null) {
                value1 = l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                value2 = l2.val;
                l2 = l2.next;
            }
            int sum = value1 + value2 + carry;
            carry = (sum > 9) ? 1 : 0;
            result.next = new ListNode(sum%10);
            result = result.next;
        }
        return root.next;
    }

    public static void main(String[] args) {
        Problem002 test = new Problem002();
        int a = 342, b= 465;
        ListNode l1 = new ListNode(0);
        ListNode root1 = l1;
        ListNode l2 = new ListNode(0);
        ListNode root2 = l2;
        int quotient =a;
        while (quotient!=0){
            int remainder = quotient%10;
            quotient = quotient/10;
            l1.next =  new ListNode(remainder);
            l1 = l1.next;
        }
        quotient = b;
        while (quotient!=0) {
            int remainder = quotient%10;
            quotient = quotient/10;
            l2.next =  new ListNode(remainder);
            l2 = l2.next;
        }
        System.out.println(test.addTwoNumbers(root1.next,root2.next));
    }
}
