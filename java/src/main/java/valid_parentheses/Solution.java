package valid_parentheses;

import java.util.LinkedList;

public class Solution {
  public boolean isValid(String s) {
    LinkedList<Character> parenthesesStack = new LinkedList<>();
    for (char ch : s.toCharArray()) {
      if (ch == '(' || ch == '{' || ch == '[') {
        parenthesesStack.push(ch);
      } else if (!parenthesesStack.isEmpty()) {
        char openParentheses = parenthesesStack.pop();
        if (!(openParentheses == '(' && ch == ')')
            && !(openParentheses == '{' && ch == '}')
            && !(openParentheses == '[' && ch == ']')) {
          return false;
        }
      } else {
        return false;
      }
    }
    return parenthesesStack.isEmpty();
  }
}
