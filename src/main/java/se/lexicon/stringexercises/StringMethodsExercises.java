package se.lexicon.stringexercises;

public class StringMethodsExercises {


    public static void printStringExercises(){
        String name="Java";
        String str="Ok this is not as long!";
        String sentence="Long example sentence";
        String sentence1="Even longer example sentence";
        String sentence2="Java is the worst programming language!";
        String str1="CAPS EQUALS SCREAMING";
        String sentence3="Oil and Water";
        String sentence4="Carl,Susie,Fredrick,Bob,Erik";
        String sentence5= "ThisShouldBeConverted";
        String str2="\tJ\ta\tv\ta\t";
        int num=20;
        char character[]={'J','a','v','a'};
                printStringLength(name);
                printCharAtPosition(sentence);
                printIndexPosition(sentence1);
                printSubstring(str);
                printUpperCaseToLOwerCase(str1);
                printStringReplace(sentence2);
                printStringAfterTrim(str2);
                printString(num);
                printStringArray(sentence3);
                printNameArray(sentence4);
                printCharacter(sentence5);
                printCharacterToString(character);
    }

    public static void printStringLength(String name) {
        System.out.println("=======================ex1");
        System.out.println("String length : "+ name.length());
        System.out.println();

    }

    public static void printCharAtPosition(String sentence){
        System.out.println("=======================ex2");
        System.out.println("char at Position 6: "+ sentence.charAt(6));
        System.out.println();

    }

    public static void printIndexPosition(String sentence1){
        System.out.println("=======================ex3");
        System.out.println("Index Position of o : "+ sentence1.indexOf('o'));
        System.out.println("=======================");

    }

    public static void printSubstring(String str){
        System.out.println("=======================ex4");
        System.out.println("Substring:: "+ str.substring(11,22));
        System.out.println();

    }

    public static void printUpperCaseToLOwerCase(String str){
        System.out.println("=======================ex5");
        System.out.println(str.toLowerCase());
        System.out.println((str.toLowerCase()).toUpperCase());
        System.out.println();

    }

    public static void printStringReplace(String str){
        System.out.println("=======================ex6");
        System.out.println(str.replace("worst","best"));
        System.out.println();

    }

    public static void printStringAfterTrim(String str){
        System.out.println("=======================ex7");
        System.out.println(str.trim());
        System.out.println();

    }

    public static void printString(int n){
        System.out.println("=======================ex8");
        String s=String.valueOf(n);
        System.out.println(s+20);
        System.out.println();

    }

    public static void printStringArray(String str){
        System.out.println("=======================ex9");
        String arr[]=str.split("and");
        for(String words:arr){
            System.out.println(words.trim());
        }
        System.out.println();

    }

    public static void printNameArray(String str) {
        System.out.println("=======================ex10");
        String nameArray[]=str.split(",");
        for(String words:nameArray){
            System.out.println(words);
        }
        System.out.println();
    }

    public static void printCharacter(String str){
        System.out.println("=======================ex11");
        char characterArray[]= str.toCharArray();
        for(char c:characterArray){
            System.out.println(c);
        }
        System.out.println();
    }

    public static void printCharacterToString( char c[]){
        System.out.println("=======================ex12");
        System.out.println(String.valueOf(c));
    }




}

