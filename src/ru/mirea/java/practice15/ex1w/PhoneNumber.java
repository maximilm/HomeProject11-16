package ru.mirea.java.practice15.ex1w;
import java.lang.StringBuffer;
public class PhoneNumber {
    StringBuffer outputString = new StringBuffer("");

    void createPhoneNumber(StringBuffer key){
        outputString.delete(0,outputString.length());
        if (key.charAt(0) == '+')
            key.deleteCharAt(0);
        outputString.append("+<").append(key.substring(0,key.length()-10)).append("><").append(key.substring(key.length()-10,key.length()-7)).append("><").append(key.substring(key.length()-7,key.length()-4)).append("><").append(key.substring(key.length()-4,key.length())).append(">");
    }

    @Override
    public String toString() {
        return "PhoneNumber{" +
                 outputString +
                '}';
    }
}
