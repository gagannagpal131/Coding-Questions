/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {

        if(head == null)
           return null;

        return recursiveReverse(null, head, head.next);
    }

    ListNode recursiveReverse(ListNode prevNode, ListNode curNode, ListNode nextNode){

        if(nextNode == null){

            curNode.next = prevNode;
            return curNode;
        }

        curNode.next = prevNode;
        prevNode = curNode;
        curNode = nextNode;
        nextNode = nextNode.next;

        return recursiveReverse(prevNode, curNode, nextNode);
    }
}
