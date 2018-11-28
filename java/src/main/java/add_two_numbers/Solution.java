package add_two_numbers;

public class Solution {
  public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    ListNode ans = null;
    ListNode current = null;
    boolean moveUp = false;
    while (true) {
      int val = 0;
      if (l1 != null) {
        val += l1.val;
      }
      if (l2 != null) {
        val += l2.val;
      }
      if (moveUp) {
        val += 1;
        moveUp = false;
      }
      if (val >= 10) {
        val -= 10;
        moveUp = true;
      }
      ListNode tmp = new ListNode(val);
      if (ans == null) {
        ans = tmp;
        current = tmp;
      } else {
        current.next = tmp;
        current = tmp;
      }
      if (l1 != null && l1.next != null) {
        l1 = l1.next;
      } else {
        l1 = null;
      }
      if (l2 != null && l2.next != null) {
        l2 = l2.next;
      } else {
        l2 = null;
      }
      if (l1 == null && l2 == null && !moveUp) {
        return ans;
      }
    }
  }

  class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
  }
}
