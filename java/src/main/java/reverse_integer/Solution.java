package reverse_integer;

public class Solution {
  public int reverse(int x) {
    try {
      if (x == Integer.MIN_VALUE) {
        return 0;
      }
      StringBuffer sb = new StringBuffer(String.valueOf(Math.abs(x)));
      int ans = Integer.parseInt(sb.reverse().toString());
      if (x < 0) {
        return -ans;
      } else {
        return ans;
      }
    } catch (NumberFormatException e) {
      return 0;
    }
  }
}
