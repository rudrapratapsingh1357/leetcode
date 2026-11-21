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
        
        sol(head,head);
        return head;
    }
    public ListNode sol(ListNode temp,ListNode head)
    {
        if(temp==null)
        {
            return head;
        }
        ListNode res=sol(temp.next,head);
        if(res==null)return null;
        if(res==temp)return null;

    int val=temp.val;
    temp.val=res.val;
    res.val=val;
    if(res.next==temp)return null;
    return res.next;
    }
}