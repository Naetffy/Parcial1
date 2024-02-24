package edu.eci.cvds.tdd;

public class AgeException extends Exception{
    public static String invalidAge="Invalid Age";
    public AgeException(String message){
        super(message);
    }
}