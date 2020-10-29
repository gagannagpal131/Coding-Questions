/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        Set<ListNode> nodes = new HashSet<ListNode>();

        ListNode temp = headA;

        while(temp != null){

            nodes.add(temp);
            temp = temp.next;
        }

        temp = headB;
        while(temp != null){

            if(nodes.contains(temp))
                return temp;

            temp = temp.next;
        }

        return null;
    }
}
