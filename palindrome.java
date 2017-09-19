boolean checkPalindrome(String inputString) {
      String reverse="";
       int length = inputString.length();
 
      for ( int i = length - 1; i >= 0; i-- ){
         reverse = reverse + inputString.charAt(i);
      }
         
 
      if (inputString.equals(reverse)){
         return true;
      }
         
      else{
          return false;
      }
     
}

***********************************************
boolean checkPalindrome(String inputString) {
     return inputString.equals(new StringBuilder(inputString).reverse().toString());
  
}
