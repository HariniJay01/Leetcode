https://leetcode.com/problems/middle-of-the-linked-list/submissions/944498628/
//Given the head of a singly linked list, return the middle node of the linked list.
//If there are two middle nodes, return the second middle node.

 

Example 1:


Input: head = [1,2,3,4,5]
Output: [3,4,5]
Explanation: The middle node of the list is node 3.
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
    public ListNode middleNode(ListNode head) {
        ArrayList<ListNode> arr=new ArrayList<>();
        int leng=0;
        while(head!=null){
            arr.add(head);
            leng+=1;
            head=head.next;
        }
        return arr.get(leng/2);
    }
}


SOLUTION 2
  
 */
class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode mid=head;
        ListNode end=head;
        while(end!=null && end.next!=null){
            mid=mid.next;
            end=end.next.next;
        }
        return(mid);
    }
}
