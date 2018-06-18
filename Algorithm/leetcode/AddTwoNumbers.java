package leetcode;

public class AddTwoNumbers {
    /**
     * You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.
     *
     * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
     *
     * Example
     *
     * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
     * Output: 7 -> 0 -> 8
     * Explanation: 342 + 465 = 807.
     *
     * */

    class Solution {
        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            int carry=0;
            ListNode listNode=new ListNode(0);
            ListNode p1=l1,p2=l2,p3=listNode;
            while(p1!=null||p2!=null){
                if(p1!=null){
                    carry+=p1.val;
                    p1=p1.next;
                }
                if(p2!=null){
                    carry+=p2.val;
                    p2=p2.next;
                }
                p3.next=new ListNode(carry%10);
                p3=p3.next;
                carry/=10;
            }
            if(carry==1)
                p3.next=new ListNode(1);
            return listNode.next;
        }
    }

    public class ListNode {
       int val;
       ListNode next;
       ListNode(int x) { val = x; }
    }
}
