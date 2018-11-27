package longest_common_prefix;

public class Solution {
  public String longestCommonPrefix(String[] strs) {
    if (strs.length == 0) return "";
    StringBuilder sb = new StringBuilder("");
    char currentChar = 0;
    for (int i = 0; ; i++) {
      for (int j = 0; j < strs.length; j++) {
        String str = strs[j];
        if (str.length() <= i) {
          return sb.toString();
        }
        char ch = str.charAt(i);
        if (j == 0) {
          currentChar = ch;
        }
        if (ch != currentChar) {
          return sb.toString();
        }
      }
      sb.append(currentChar);
    }
  }
}
