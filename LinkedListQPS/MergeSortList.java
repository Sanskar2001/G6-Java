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


    ListNode midPoint(ListNode head)
    {
        ListNode slow=head;
        ListNode fast=head.next;

        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }

        return slow;
    }


    ListNode merge(ListNode a,ListNode b)
    {

        ListNode head=new ListNode(-1);
        ListNode curr=head;

        while(a!=null && b!=null)
        {
            if(a.val<=b.val)
            {
                curr.next=a;
                a=a.next;
               
            }
            else
            {
                curr.next=b;
                b=b.next;
               
            } 
            curr=curr.next;

        }

        if(a!=null)
        curr.next=a;

        if(b!=null)
        curr.next=b;

        return head.next;

        // ListNode tmp=head;
        // head=head.next;
        // tmp.next=null;
        // return head;




    }

    ListNode mergeSort(ListNode head)
    {
        if(head==null || head.next==null)
        return head;


        // Break the LL into two parts
        ListNode midNode=midPoint(head);
        ListNode b=midNode.next;
        midNode.next=null;
        ListNode a=head;

        // Sort these 2 LL
        a=mergeSort(a);
        b=mergeSort(b);


        ListNode c=merge(a,b);
        return c;

    }

    public ListNode sortList(ListNode head) {
        
        return mergeSort(head);
    }
}