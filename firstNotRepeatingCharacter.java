char firstNotRepeatingCharacter(String s) {

    char ch='_';
    if(s.length()<1){
        return ch;
    }
    for(char c:s.toCharArray()){
    if(s.indexOf(c) == s.lastIndexOf(c)) return c;       
    }
    return ch;
    
}
**************************************************
