import java.util.*;
// valid parenthesis checker
class Demo {
    public static void main(String[] args) {
        Stack<Character> st = new Stack<>();
        var sc = new Scanner(System.in);
        String s = sc.nextLine();
        for(int i=0;i<s.length();i++)
        {
            char c = s.charAt(i);
            if( c== '(' || c == '{' || c == '[') {
                st.push(s.charAt(i));
            }
            else  {
                char a = st.pop();
                char b = s.charAt(i);
                if(!((a == '(' && b == ')') || (a == '[' && b == ']') || (a == '{' && b == '}'))) {
                    System.out.println("Expression is not valid");
                    return;
                }
            }
        }
        if(st.empty()) {
            System.out.println("Given expression is valid");
        }
        sc.close();
    }
}