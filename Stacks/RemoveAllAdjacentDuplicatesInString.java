class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> stack = new Stack<>();

        for(char c: s.toCharArray()){
            if(!stack.isEmpty() && stack.peek() == c){
                stack.pop();
            }else {
                stack.push(c);
            }
        }
        StringBuilder sd = new StringBuilder();
        for(char c: stack){
            sd.append(c);
        }
        return sd.toString();
    }
}