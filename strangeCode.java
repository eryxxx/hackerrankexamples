String strangeCode(int s, int e) {
char prevSymb = '-';
String res = "";
while (s < e - 1) {
s++;
e--;
if (prevSymb == '-') {
prevSymb = 'a';
res += String.valueOf(prevSymb);
} else {
prevSymb = prevSymb == 'a' ? 'b' : 'a';
res += String.valueOf(prevSymb);
}
}
return res;    
}
