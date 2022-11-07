public class LongestCommonPrefix {

  public String longestCommonPrefix(String[] args) {
    String commonPrefix = "";
    for (int i = 0; i < args[i].length(); ++i) {
      char characterA = args[i].charAt(i);
      for (int j = 0; j < args[j + 1].length(); ++j) {
        char characterB = args[j + 1].charAt(j);
        for (int k = 0; k < args[k + 2].length(); ++k) {
          char characterC = args[k + 2].charAt(k);
        }
      }
    }

    return commonPrefix;
  }

  public static void main(String[] args) {
    LongestCommonPrefix utils = new LongestCommonPrefix();
    String[] words = new String[] { "flow", "flower", "flavor" };
    System.out.println(utils.longestCommonPrefix(words));
  }
}
