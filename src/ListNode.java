/**
 * Created by GY on 2017/9/26.
 */
public class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {val = x; next = null;}

    @Override
    public String toString() {
        ListNode node = this;
        StringBuilder builder = new StringBuilder();
        builder.append(node.val);
        while (node.next != null) {
            node = node.next;
            builder.append("->");
            builder.append(node.val);
        }
        return builder.toString();
    }
}
