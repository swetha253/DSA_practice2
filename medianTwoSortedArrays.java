class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
         int arr[]= new int[nums1.length+nums2.length];
       int i=0;
       for(int num:nums1){
           arr[i]=num;
           i++;
       }
       for(int num:nums2){
            arr[i]=num;
            i++;
        }
        Arrays.sort(arr);
       int len=arr.length;
       int mid=len/2;
       if(len%2==0){
           return (arr[mid]+arr[mid-1])/2f;
       }else {
           return arr[mid];
       }
    }
}
