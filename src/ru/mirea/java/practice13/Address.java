package ru.mirea.java.practice13;

import java.util.Arrays;

public class Address {
    String[] address;
    Address(String newAddress){
        address = newAddress.split(",");
    }

    @Override
    public String toString() {
        return "Address{" +
                "address=" + Arrays.toString(address) +
                '}';
    }
}
