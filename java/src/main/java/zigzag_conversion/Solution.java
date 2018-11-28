package zigzag_conversion;

public class Solution {
  public String convert(String s, int numRows) {
    if (numRows <= 1 || s.length() <= numRows) {
      return s;
    }
    char[] ans = new char[s.length()];
    int current = 0;
    for (int i = 0; i < numRows; i++) {
      int patterNum = 2 * numRows - 2;
      int intervalNum = 2 * (numRows - i) - 2;
      for (int j = i; j < s.length(); j += patterNum) {
        ans[current] = s.charAt(j);
        current++;
        if (i != 0 && i != numRows - 1  && j + intervalNum < s.length()) {
          ans[current] = s.charAt(j + intervalNum);
          current++;
        }
      }
    }
    return String.valueOf(ans);
  }
}
