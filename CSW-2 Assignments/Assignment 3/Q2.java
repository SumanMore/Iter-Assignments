/*
Write a program that performs base conversion. The input is a string, an
integer b2 , and another integer b2. The string represents be an integer in
base b2. The output should be the string representing the integer in base
b2.
*/
s
class Main {
  public static void main(String[] args) 
  {
String s="615";
int b1=7;
int b2=13;
String s1=convertBase(s,b1,b2);
System.out.println(s1);}

public static String convertBase(String numAsString , int b1, int b2) {
boolean isNegative = numAsString.startsWith("-");
int numAsInt = 0;
for (int i = (isNegative ? 1 : 0); i < numAsString.length(); ++i) {
numAsInt *= b1 ;
numAsInt += Character.isDigit(numAsString.charAt(i))? numAsString .charAt(i) - '0': numAsString .charAt(i) - 'A' + 10;
}
return (isNegative ? "-": "")+ (numAsInt == 0 ? "0" : constructFromBase(numAsInt , b2));
}


private static String constructFromBase(int numAsInt, int base)
{
return numAsInt == 0? "" : constructFromBase(numAsInt / base, base)
+ (char)(numAsInt % base >= 10 ? 'A' + numAsInt % base - 10
: '0' + numAsInt % base);
}
}