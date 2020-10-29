/*
Detect a cycle in a linked list. Note that the head pointer may be 'NULL' if the list is empty.
// Use of Tortoise and Hare Algorithm

A Node is defined as:
    struct Node {
        int data;
        struct Node* next;
    }
*/

bool has_cycle(Node* head) {


	Node* slow = head;
	Node* fast = head;

	while(fast != NULL && fast->next != NULL) {

		slow = slow->next;
		fast = fast->next->next;

		if(slow == fast) {

			return true;
		}
	}
	return false;
}
