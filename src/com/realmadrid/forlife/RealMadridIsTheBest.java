package com.realmadrid.forlife;

public class RealMadridIsTheBest {

    static int myAccountHacker= 12;
    static  String myString = "  return my string string";
    public static void main(String[] args) {
        //variablePractices();
        //parameterPractice( 1000);
        //add(2000, 30000);
        //add(5000, 4000);
        //add(10000, 190000);
        //System.out.println(helloString());
        //System.out.println(divisionPractice(500, 50));
        concatenationPractice();
    }

    //variablePractices;
    public static void variablePractices(){
        int myNetWorth = 0;
        int myIphoneBill = 200;
        int laptopCharger = 50;
        int currentNet = myIphoneBill + laptopCharger + myAccountHacker;
        System.out.println(currentNet);

    }


    //parameterPractice;
public static void parameterPractice(int accountHacker){
    int myNetWorth = 0;
    int myIphoneBill = 200;
    int laptopCharger = 50;
    int currentNet = myIphoneBill + laptopCharger + accountHacker;
    System.out.println(currentNet);

    }

    public static void add(int numone, int numTwo){
        int addResult = numone + numTwo;
        System.out.println(addResult);
    }
public static int divisionPractice(int numone, int numTwo){
        int division  = numone/numTwo;
        return division;
}

public static String helloString (){
        String myString = "  return my string";
        return myString;
}

    public static void concatenationPractice(){
        String superb = "jumboJet";
        String awesome = " bigJet";
        String concatResult = superb + awesome;
        System.out.println(concatResult);
        System.out.println(concatResult + 100+200);

    }
}
