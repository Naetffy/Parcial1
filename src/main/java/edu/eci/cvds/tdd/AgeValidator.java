package edu.eci.cvds.tdd;

public class AgeValidator {
    public boolean underAge(int age) throws AgeException{

        boolean res = true;
    /*
        if(age < 0 || age > 135){
            throw new AgeException(AgeException.invalidAge);
        }
        else if(age < 18 ){
            res = true;
        }
        else{
            res = false;
        }*/
        return res;
    }

}