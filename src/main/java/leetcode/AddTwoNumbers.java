package leetcode;

public class AddTwoNumbers {

    public static void main(String[] args) {
        ListNode param1 = new ListNode(2);
        ListNode param2 = new ListNode(4);
        ListNode param3 = new ListNode(3);
        param1.next = param2;
        param2.next = param3;

        ListNode param4 = new ListNode(5);
        ListNode param5 = new ListNode(6);
        ListNode param6 = new ListNode(4);
        param4.next = param5;
        param5.next = param6;
        addTwoNumbers(param1, param4);

    }


    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {


        return null;
    }
}


class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }

}
