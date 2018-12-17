package com.example.kqc.leetcode.LinkList;

/**
 * Created by yq
 * Date  on : 2018/10/15
 * 设计链表的实现。您可以选择使用单链表或双链表。单链表中的节点应该具有两个属性：val 和 next。val 是当前节点的值，next 是指向下一个节点的指针/引用。如果要使用双向链表，则还需要一个属性 prev 以指示链表中的上一个节点。假设链表中的所有节点都是 0-index 的。
 * <p>
 * 在链表类中实现这些功能：
 * <p>
 * get(index)：获取链表中第 index 个节点的值。如果索引无效，则返回-1。
 * addAtHead(val)：在链表的第一个元素之前添加一个值为 val 的节点。插入后，新节点将成为链表的第一个节点。
 * addAtTail(val)：将值为 val 的节点追加到链表的最后一个元素。
 * addAtIndex(index,val)：在链表中的第 index 个节点之前添加值为 val  的节点。如果 index 等于链表的长度，则该节点将附加到链表的末尾。如果 index 大于链表长度，则不会插入节点。
 * deleteAtIndex(index)：如果索引 index 有效，则删除链表中的第 index 个节点。
 */
public class SingleList {
    public static void main(String[] args) {
        ListNode linkedList = new ListNode(1, new ListNode(1, new ListNode(2, new ListNode(1))));
//        ListNode linkedList = new ListNode(1,new ListNode(2,new ListNode(3,new ListNode(4,new ListNode(5)))));
        System.out.print(new Solution().isPalindrome(linkedList) + "");

    }

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }

        ListNode(int x, ListNode n) {
            val = x;
            next = n;
        }
    }
    //给定一个单链表，把所有的奇数节点和偶数节点分别排在一起。请注意，这里的奇数节点和偶数节点指的是节点编号的奇偶性，而不是节点的值的奇偶性。
//    static class Solution {
//        public ListNode oddEvenList(ListNode head) {
//            int i=1;
//            ListNode fast=head.next;
//            ListNode slow=head;
//            while(fast.next!=null){
//                i++;
//                if(i%2==0){
//                    ListNode node=fast.next;
//                    fast.next=node.next;
//                    node.next=slow.next;
//                    slow.next=node;
//                    slow=slow.next;
//                }else{
//                    fast=fast.next;
//                }
//            }
//            return head;
//
//        }
//    }
//请判断一个链表是否为回文链表。
    static class Solution {
        public boolean isPalindrome(ListNode head) {
            if (head == null || head.next == null)
                return true;
            ListNode slow = head;
            ListNode fast = head;
            ListNode node = head.next;
            while (fast != null && fast.next != null) {
                fast = fast.next.next;
                slow = slow.next;
            }
            ListNode a=head;
            ListNode temp;
            while (node!=slow) {
                temp= node.next;
                node.next = head;
                a.next = temp;
                head = node;
                node = temp;
            }
            if (fast != null)
                slow = slow.next;
            while (slow != null) {
                if (slow.val != head.val) {
                    return false;
                }
                slow = slow.next;
                head = head.next;
            }
            return true;
        }
    }
//    public class Solution {
//        public boolean hasCycle(ListNode head) {
//            if(head==null) return false;
//            ListNode slowP=head.next;
//            if(slowP==null)return false;
//            while(head==slowP){
//                if(slowP!=null && slowP.next!=null)
//                    slowP=slowP.next;
//                else
//                    return false;
//            }
//            return true;
//
//        }
}
