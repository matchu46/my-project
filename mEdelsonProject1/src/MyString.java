import java.util.Arrays;
public class MyString {
    char[] chars;
    int curr_length;
    public MyString(){//default constructor
       chars = null;
        curr_length = 0;
    }
    public MyString(String string){//parameterized constructor
        curr_length = string.length();
        chars = new char[curr_length];
        for(int i = 0; i < string.length(); i++) {//fills chars array
            chars[i] = string.charAt(i);

        }

    }
    MyString(MyString mystring){//copy constructor
        chars = mystring.chars;
        curr_length = mystring.curr_length;
    }
    public int length(){//returns length
        return this.curr_length;
    }
    private void ensureCapacity(){
        char[] temp = chars;
        int temp_size= curr_length;//temp variables to we can copy things over to make a bigger array
        curr_length = curr_length*4; //increases array size
        chars = new char[curr_length];
        for(int i = 0; i < temp_size; i++){//fills new array with old array
            chars[i] = temp[i];
        }
    }
    public String toString() {
        String word = "";
        for (int i = 0; i < curr_length; i++) {//builds the word using the array
            word = word + chars[i];
        }
        return word;
    }
        public MyString concat(MyString mystring) {
            if(mystring.length() > (curr_length-this.toString().length()) ){//makes sure the array is big enough to hold the combined words
                ensureCapacity();
           }
            int counter = 0;
            for (int i = 0; i < this.curr_length; i++){
               if (this.chars[i] != 0){//lets us know how much the current array is filled so we can add the new chars
                   counter++;
               }
            }
            for (int i = counter; i < this.curr_length; i++){
                this.chars[i] = mystring.get(i-counter);//adds the new chars into the array
            }
            return this;
        }

        public boolean equals(MyString mystring) {
            if (this.curr_length == mystring.length()) {
                for (int i = 0; i < this.curr_length; i++) {//checks the ascii values to see if they are the same
                    if ((int) chars[i] == (int) mystring.get(i)) ;
                    else
                        return false;

                }
                return true;
            }
            return false;
        }
        public char get(int m) {
                return chars[m];
        }
        public int compareTo(MyString mystring){
        if(this.equals(mystring) == true){
            return 0;
        }
        else{
            for (int i = 0; i < this.curr_length; i++) {//uses ascii to see if any letters come before of after for alphabetical order
                if ((int) chars[i] > (int) mystring.get(i))
                    return 1;

                else if((int) chars[i] < (int) mystring.get(i))
                    return -1;

                else;
            }
        }
        return 10;
        }
    public MyString toUpper(MyString mystring){
        for(int i = 0; i < this.curr_length; i++) {
            if((int)chars[i] >= 97 && (int)chars[i] <= 122){//uses ascii to change letter into uppercase
              int temp = (int)chars[i] - 32;
              chars[i] = (char)temp;
            }
            else;
        }
        return mystring;
    }
    public MyString toLower(MyString mystring){//uses ascii to change letter into lowercase
        for(int i = 0; i < this.curr_length; i++) {
            if((int)chars[i] >= 65 && (int)chars[i] <= 90){
                int temp = (int)chars[i] + 32;
                chars[i] = (char)temp;
            }
            else;
        }
        return mystring;
    }
    public String substring(int m){
     String word = "";
        for (int i = m-1; i < curr_length; i++) {//builds word from chosen starting index
            word = word + chars[i];
        }
        return word;
    }
    public String substring(int m, int n){//builds word from chosen starting and ending indexes
        String word = "";
        for (int i = m-1; i < n; i++) {
            word = word + chars[i];
        }
        return word;
    }
    public int indexOf(MyString mystring){
        char letter = 'b';
        for (int i = 0; i < this.curr_length; i++){//searches through array for first index of the char
            if(chars[i] == letter)
                return i;
        }
        return -1;
    }
    public int lastIndexOf(MyString mystring){//searches through array for last index of the char
        char letter = 'b';
        for (int i = this.curr_length-1; i > 0 ; i--){
            if(chars[i] == letter)
                return i;
        }
        return -1;
    }
}
