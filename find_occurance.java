class Solution {
    public int strStr(String haystack, String needle) {
        if(haystack.contains(needle)){
            int s = haystack.indexOf(needle);
            return s;
        }
    return -1;
    }
}
