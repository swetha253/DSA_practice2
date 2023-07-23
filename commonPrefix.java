class Solution {
    public String longestCommonPrefix(String[] strs) {
        String prefix = new String(strs[0]);
        for (int i = 1; i < strs.length && !prefix.equals(""); i++) {
            while (!prefix.equals("") && !strs[i].startsWith(prefix)) {
                prefix = prefix.substring(0, prefix.length() - 1);
            }
        }
        return prefix;
    }
}
