package LeetCode;

import LeetCode.domain.ListNode;

public class AddTwoNumbers {

    public static void main(String[] args) {

      /*ListNode l1=new ListNode(2);
      ListNode l2=new ListNode(5);
      ListNode o=addTwoNumbers(l1,l2);
      System.out.println(o);*/
      int[] a=new int[]{2,4,3};
      int[] b=new int[]{5,6,4};

      ListNode l1=buildListNode(a);
      ListNode l2=buildListNode(b);

      ListNode listNode;

      listNode=l1;
      while (listNode!=null){
          System.out.println(listNode.val);
          listNode=listNode.next;
      }
      System.out.println();
        listNode=l2;
        while (listNode!=null){
            System.out.println(listNode.val);
            listNode=listNode.next;
        }
        System.out.println();
      listNode=addTwoNumbers(l1,l2);
      while (listNode!=null){
          System.out.println(listNode.val);
          listNode=listNode.next;
      }



    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        if (l1 == null && l2 == null) {
            return null;
        }

        if (l1 == null) {
            return l2;
        }

        if (l2 == null) {
            return l1;
        }

        ListNode p1 = l1;
        ListNode p2 = l2;

        int carry = 0;

        ListNode head = new ListNode(0);
        ListNode result = head;

        while (carry != 0 || p1 != null || p2 != null) {

            int v1 = 0;
            if (p1 != null) {
                v1 = p1.val;
                p1 = p1.next;
            }

            int v2 = 0;
            if (p2 != null) {
                v2 = p2.val;
                p2 = p2.next;
            }

            int tmp = v1 + v2 + carry;
            carry = tmp / 10;
            head.next = new ListNode(tmp % 10);
            head = head.next;
        }

        return result.next;
    }
    public static ListNode buildListNode(int[] list){
        ListNode first=null;
        ListNode last=null;
        ListNode newNode;
        for (int i=0;i<list.length;i++){
            newNode=new ListNode(list[i]);
            if (first==null){
                first=newNode;
                last=newNode;
            }else {
                last.next=newNode;
                last=newNode;
            }
        }
        return first;
    }
}
