Given the head of a linked list, remove the nth node from the end of the list and return its head.

 

Example 1:


Input: head = [1,2,3,4,5], n = 2
Output: [1,2,3,5]

Take two dummy nodes, who’s next will be pointing to the head.
Take another node to store the head, initially,s a dummy node(start), and the next node will be pointing to the head. The reason why we are using this extra dummy node is that there is an edge case. If the node is equal to the length of the LinkedList, then this slow will point to slow’s next→ next. And we can say our dummy start node will be broken and will be connected to the slow next→ next.

Start traversing until the fast pointer reaches the nth node.
image.png

Now start traversing by one step both of the pointers until the fast pointers reach the end.

image.png

When the traversal is done, just do the deleting part. Make slow pointers next to the next of the slow pointer to ignore/disconnect the given node.
image.png

Last, return to the next start.
Dry Run: We will be taking the first example for the dry run, so, the LinkedList is [1,2,3,4,5] and the node which has to be deleted is 2 from the last. For the first time, fast ptr starts traversing from node 1 and reaches 2, as it traverses for node number 2, then the slow ptr starts increasing one, and as well as the fast ptr until it reaches the end.

1st traversal : fast=3, slow=1
2nd traversal : fast=4, slow=2
3rd traversal : fast=5, slow=3
Now, the slow->next->next will be pointed to the slow->next

So , the new linked list will be [1,2,3,5]


CODE:



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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode tail=new ListNode();
        tail.next=head;
        ListNode t=tail;
        for(int i=0;i<n;i++){
            head=head.next;
        }
        while(head!=null){
            head=head.next;
            t=t.next;
        }
        t.next=t.next.next;
        
        return tail.next;
    }
}
