
package com.mycompany.stringoperation;


public class StringOperations 
{
 public int getLength(String str) {
        int count = 0;
        for(char c : str.toCharArray()){
            count++;
        }
        return count;
    }

    public String reverseString(String str) {
        String rev = "";
        for(int i = str.length() - 1; i >= 0; i--){
            rev = rev + str.charAt(i);
        }
        return rev;
    }

    public String toUpper(String str) {
        return str.toUpperCase();
    }
}
