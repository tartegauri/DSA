
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
    String ans = "";

    for(int i= str.length()-1 ; i>= 0  ;i-- ){
        ans = ans + str.charAt(i);
    }

    return ans;
    

  
  }


  public static int fibonacci(int n ,int[] arr) {
  //  1 1 2 3 5  
  
    if( n <= 2 ){
       arr[n] = 1;  
      return 1;
     
    }

    if(arr[n] != 0){ 
       return arr[n];
    }  

    int k = fibonacci(n-1 , arr)+fibonacci(n-2 , arr); 
    arr[n]= k;
    // 4 : 3 , 2 
    // 5 : 4 , 3 
    // 6 : 5 , 4 

    return k;

  }

  public static int factorial(int n , int arr[]) {
    //4.3.2.1 if n is 1 then just return
  
      if(n == 1){
        arr[n] = 1;
        return 1;
      }  

     int k = n *factorial(n-1 , arr);

     arr[n] =k ; 
     
      return k;
  }

  public static void main(String[] args) {
    String sentence = "I love India";
   

    countCharacters(sentence); 
    int n = 5;
     int arr[] = new int[n+1];
    System.out.println("Reversed: " + reverseString(sentence));
    System.out.println( fibonacci(n , arr));
    System.out.println(Arrays.toString(arr));


   
   

    int num = 5;
    int ar[] = new int[num+1]; 
   
    System.out.println("Factorial: " + factorial(num , ar));
    System.out.println(Arrays.toString(ar));

  }
}