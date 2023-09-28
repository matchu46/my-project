//This work is the work of Matthew Edelson and co
public class Main {
    public static void main(String[] args) {
    MyString string1 = new MyString("Go");
    MyString string2 = new MyString("Dbacks");
    MyString string3 = new MyString(string1);
    System.out.println("string1 has " + string1.length() + " characters.");
    System.out.println("The string2 array contains " + string2.toString());
    System.out.println("The copy constructor output of string1 to a new string. String1: " + string1.toString() + ", new string: " + string3.toString() );
    System.out.println("The concatenation of string1 & 2 is " + string1.concat(string2));
    System.out.println(string1.equals(string2));
    System.out.println(string1.compareTo(string2) + " means that string one is alphabetically after string2");
    System.out.println("The third letter in string2 is " + string2.get(2));
    System.out.println("String2 in upper case is " + string2.toUpper(string2));
    System.out.println("String2 in lower case is " + string2.toLower(string2));
    System.out.println("String2 starting at its third letter is: " + string2.substring(3));
    System.out.println("String2 starting at its third letter and ending at fifth letter: " + string2.substring(3,5));
    System.out.println("The index of b in string2 is " + string2.indexOf(string2));
    System.out.println("The last index of b in string2 is " + string2.lastIndexOf(string2));

    }

}

