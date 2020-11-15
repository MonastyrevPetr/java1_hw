package hw1;

public class Main {
    public static void main(String[] args) {
        byte byteValue=-120;
        short shortValue=1000;
        int intValue=12442;
        long longValue=2000000L;
        float floatValue=12.34f;
        double doubleValue=123.3;
        char charValue='t';
        boolean booleanValue=false;
    }
    public static float expression(float a, float b, float c, float d){
        return a*(b+(c/d));
    }
    public static boolean interval(int a, int b){
        return  (a+b)>=10 && (a+b)<=20;
    }
    public static void positiveNumber(int number){
        if (number>=0){
            System.out.println("Положительное");
        }else {
            System.out.println("Отрицательное");
        }
    }
    public static boolean negativeNumber(int number){
        return number<0;
    }
    public static void helloName(String name){
        System.out.println("Привет, "+name+"!");
    }
    public static void leapYear(int year){
        if ((year%400==0) || (year%4==0 && year%100!=0)){
            System.out.println("Високосный");
        }else{
            System.out.println("Невисокосный");
        }
    }
}
