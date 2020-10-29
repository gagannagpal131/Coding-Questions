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
    public ListNode mergeKLists(ListNode[] lists) {

        //Custom Comparator for Min Heap
        Comparator<ListNode> myComparator = new Comparator<ListNode>(){

            public int compare(ListNode a, ListNode b){

                return a.val - b.val;
            }
        };

        Queue<ListNode> minHeap = new PriorityQueue<ListNode>(myComparator);

        for(int i=0; i<lists.length; i++){

            if(lists[i] == null)
                continue;

            ListNode node = lists[i];

            while(node != null){

                minHeap.add(node);
                node = node.next;
            }
        }

        ListNode head = new ListNode();
        head = minHeap.poll();
        ListNode temp = head;

        while(!minHeap.isEmpty()){

            ListNode node = minHeap.poll();
            node.next = null;
            temp.next = node;
            temp = temp.next;
        }

        return head;
    }
}
