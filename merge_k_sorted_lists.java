class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<Integer> que = new PriorityQueue<>();
        for(ListNode temp : lists){
            while(temp != null){
                que.add(temp.val);
                temp = temp.next;
            }
        }
        ListNode head = null;
        ListNode temp = head;
        while(!que.isEmpty()){
            if(head == null){
                ListNode obj = new ListNode(que.poll());
                head = obj;
                temp = head;
            }
            else{
                temp.next = new ListNode(que.poll());
                temp=temp.next;
            }
        }
        return head;
    }
}
