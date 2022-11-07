import java.util.HashMap;
import java.util.Map;

class RomanToIntSolution {

  final Map<Character, Integer> romanNumeralsMap = createRomanNums();

  public int romanToInt(String s) {
    int sum = 0;
    /* TODO: This solution only works with the roman numeral I, update this so that it will work for all numbers. */
    for (int i = 0; i < s.length(); ++i) {
      sum += getIntegerValueOfRomanNumeral(s.charAt(i));
    }
    return sum;
  }

  private int getIntegerValueOfRomanNumeral(char romanNumeral) {
    Character romanNumCharacter = Character.valueOf(romanNumeral);
    if (romanNumeralsMap.containsKey(romanNumCharacter)) {
      return romanNumeralsMap.get(romanNumCharacter);
    }
    //         if the key does not exist in the map we wont add to the sum.
    return 0;
  }

  private Map<Character, Integer> createRomanNums() {
    Map<Character, Integer> romanNumerals = new HashMap<>();
    romanNumerals.put('I', 1);
    romanNumerals.put('V', 5);
    romanNumerals.put('X', 10);
    romanNumerals.put('L', 50);
    romanNumerals.put('C', 100);
    romanNumerals.put('D', 500);
    romanNumerals.put('M', 1000);
    return romanNumerals;
  }

  public static void main(String[] args) {
    RomanToIntSolution romanNumeralUtils = new RomanToIntSolution();

    int valueOfRomanNumeralI = romanNumeralUtils.romanToInt("I");

    assert valueOfRomanNumeralI == 1;
    System.out.println(valueOfRomanNumeralI);
  }
}
