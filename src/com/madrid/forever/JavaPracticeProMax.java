package com.madrid.forever;

public class JavaPracticeProMax {

    static int awesomeJersey = 20;
    static int whiteTiger = 97;
    static String StringPractice = " String is life";

    public static void main(String[] args) {
        //variablePractice();
        //parameterPractice(awesomeJersey);
        //parameterPracticeOne(whiteTiger);
        //add(200, 500);
        //System.out.println(divisionPracticeTwo (90, 560));
        //System.out.println(StringPractice());
        //System.out.println(StringPracticeTwo());
        concatenation();
    }

    //variablePractice
    public static void variablePractice() {
        int Hatim = 400;
        int killer = 300;
        int jogonnath = Hatim + killer;
        System.out.println(jogonnath);
    }

    //parameterPractice
    public static void parameterPractice(int awesomeJersey) {
        int ronaldo = 7;
        int benzema = 10;
        int striker = ronaldo + benzema + awesomeJersey;
        System.out.println(striker);
    }

    public static void parameterPracticeOne(int whiteTiger) {
        int shakira = 15;
        int pique = 16;
        int loveBird = shakira + pique + whiteTiger;
        System.out.println(loveBird);

    }
    //addPractice
 public static void add(int lukaModric, int tonyKroos){
        int bestMid = lukaModric + tonyKroos;
     System.out.println(bestMid);

 }
 //divisionPractice
    public static int divisionPracticeTwo (int anamul, int zaki){
        int dominosPizza = zaki/anamul;
        return dominosPizza;
    }
public static String StringPractice(){
        String Higuain = " String is life";
        return Higuain;

}

public static String StringPracticeTwo(){
        String Ramos = "best defender ever";
        String Carlos = "awesomeJersey";
        return Ramos+Carlos;
}

public static void concatenation(){
        String Hungry = "I love MY";
        String Hangry = " Dominos Pizza";
        String pizzaLover = "Hungry" + "Hangry";
    System.out.println(pizzaLover);
}

}
