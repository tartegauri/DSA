
// 1. Get the last word from the sentence
// 2. Count the characters in the sentence for the given word
// 3. Reverse a string
// 4. Fibonacci series
// 5. Factorial
// 6. Find the count of vowels in a given string 

import java.util.*;

class StringQuestions {

  public static void countCharacters(String str) {
    // h should be capital because it is class name
    // first is the key and second is the value na
    // if dont want to coutn sapces then what first use trim but what sabout spaces
    // in ebtween if charAt is
    // " " then will will skip it

    // ALWAYS KEEP STRING EMPTY DONT ADD SPACE HO KALAL TYAT EK CHARACTER YETA SPACE
    // CHA

    str = str.toLowerCase();
 
    HashMap<Character, Integer> map = new HashMap<>();

    for (int i = 0; i < str.length(); i++) {
      // have to use contains for checking if there is element or not
      // in the map there are two funtions containsKey
      if ("aeiou".contains("" + str.charAt(i))) {

        if (map.containsKey(str.charAt(i))) {
          // if is it then just increase the previous count
          int count = map.get(str.charAt(i));
          map.put(str.charAt(i), count + 1);
        } else {
          map.put(str.charAt(i), 1);

        }
      }

    }

    System.out.println(map);
  }

  public static String reverseString(String str) {
    return " ";
  }

  public static void fibonacci(int n) {

  }

  public static long factorial(int n) {
    return 1;
  }

  public static void main(String[] args) {
    String sentence = "I love India";

    countCharacters(sentence);

    System.out.println("Reversed: " + reverseString(sentence));

    int n = 5;
    fibonacci(n);

    int num = 5;
    System.out.println("Factorial: " + factorial(num));

  }
}