class Solution {
    List<String> list = new ArrayList<>();
    StringBuilder sb = new StringBuilder();
    public List<String> generateParenthesis(int n) {
        recursion(n, n);
        return list;
    }
    void recursion(int open, int close){
        if(open == 0 && close == 0){
            list.add(sb.toString());
            return;
        }
        if(open > 0){
            sb.append('(');
            recursion(open-1, close);
            sb.deleteCharAt(sb.length()-1);
        }
        if(close > open){
            sb.append(')');
            recursion(open, close-1);
            sb.deleteCharAt(sb.length()-1);
        }
    }
}
