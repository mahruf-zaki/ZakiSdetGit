package com.StringMethod.Practice;

public class StringPracticeSession {

    public static void main(String[]args){
        String myString = " Love is pure";
        //System.out.println(myString);
        //System.out.println(myString.toUpperCase());
        //System.out.println(myString.toLowerCase());
        //System.out.println(myString.hashCode());
        //String newYork = myString.toUpperCase();
        StringPrac();
    }

    public static void StringPrac(){
      String myString = "Humanity is precious";
      String Virtue = "Humanity";
      String Adjective = "is precious";
      String Statement  = Virtue + Adjective;
      String greatWallOfChina = "42";
      String eifelTower= "14";
      String grocery = " rice, daal, eggs, milk, onion";
      String myGrocery = " shabji, meat";
      String story = " bowal mach is life, i brought bowal mach from canada, it can not be found in USA";
      String semiStory = "bowal mach is life, i brought bowal mach from canada, it can not be found in USA";
      String masculinity = " mango = 14$, Coconut = 16$, lychee = 20$";
      String feminism = "mango = 14$, Coconut = 16$, lychee = 20$, daal = 12";
      String feminismOne = " mango = 14$, Coconut = 16$, lychee = 20$";
      String sunni = "Prostration at a shrine is gunah, we must not visit shrines";
      String shia = "Prostration at a shrine is gunah, they do visit shrines";
      String ismaili = " ismailis are not considered as muslim, as they dont recognize rasul sa as the last prophet";
        //System.out.println(Statement);
        //System.out.println(myString.equals(Statement));
        //System.out.println(myString.trim());
        //System.out.println(myString == Statement);
        //System.out.println(myString.charAt(2));
        //System.out.println(myString.charAt(12));
        //System.out.println(myString.charAt(9));
        //System.out.println(myString.concat("!!!World is Beautiful"));
        //System.out.println(greatWallOfChina.compareTo(eifelTower));
        //System.out.println(greatWallOfChina.compareToIgnoreCase(eifelTower));
        //System.out.println(grocey.contains(myGrocery));
        //System.out.println(grocey.contentEquals(myGrocery));
        //System.out.println(story.endsWith(semiStory));
        //System.out.println(masculinity.equals(feminismOne));
        //System.out.println(masculinity.equalsIgnoreCase(feminism));
        //System.out.println(greatWallOfChina.matches(eifelTower));
        //System.out.println(greatWallOfChina.replace(eifelTower, greatWallOfChina));
        //System.out.println(sunni.indexOf(shia));
        //System.out.println(sunni.replaceFirst(ismaili, sunni));
        //System.out.println(ismaili.replace(shia, ismaili));
        //System.out.println(semiStory.toString());
        //System.out.println(sunni.isBlank());
        System.out.println(Statement.toCharArray());

    }
}
