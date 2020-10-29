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
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        Comparator<ListNode> customComparator = new Comparator<ListNode>(){

            public int compare(ListNode a, ListNode b){

                return a.val-b.val;
            }
        };


        Queue<ListNode> minHeap = new PriorityQueue<ListNode>(customComparator);

        ListNode temp = l1;
        while(temp != null){

            minHeap.add(temp);
            temp = temp.next;
        }

        temp = l2;
        while(temp != null){

            minHeap.add(temp);
            temp = temp.next;
        }

        ListNode head = null;
        temp = null;

        while(!minHeap.isEmpty()){

            if(head == null){

                head = minHeap.poll();
                head.next = null;
                temp = head;

            } else {

                temp.next = minHeap.poll();
                temp = temp.next;
                temp.next = null;

            }
        }

        return head;
    }
}
