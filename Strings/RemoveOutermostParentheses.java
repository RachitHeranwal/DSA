package Strings;

public class RemoveOutermostParentheses {
    public static void main(String[] args) {
        // Example input
        String s = "(()())(())";

        // Call the function
        String result = removeOuterParentheses(s);

        // Print input and output
        System.out.println("Input:  " + s);
        System.out.println("Output: " + result);
    }

    public static String removeOuterParentheses(String s) {
        StringBuilder result = new StringBuilder(); // For final answer
        int counter = 0;

        for(char ch : s.toCharArray()){
            if(ch == '('){
                if(counter > 0){
                    result.append('(');
                }
                counter++;
            }else {
                counter--;
                if (counter > 0){
                    result.append(')');
                }
            }
        }

        return result.toString(); // Final answer
    }
}

