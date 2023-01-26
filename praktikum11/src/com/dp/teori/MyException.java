package com.dp.teori;
//make your own exception
public class MyException extends Exception{
    //klik kanan -> generate -> constructor -> pilih
    public MyException(String message) {
        super(message);
    }

}
