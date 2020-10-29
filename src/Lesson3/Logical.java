package Lesson3;

public class Logical {
    public static void main(String[] args) {
        boolean x = false;
        boolean y = false; 
        boolean z = false;
        
        boolean result = x || y || z;
        
        boolean a = true;
        boolean b = false;
        
        int a2 = 10;
        int b2 = 50;
        int c2 = 99;
        int d2 = 100;
        //boolean f = !(c > d);
        //boolean c = a2 < b2 && c2++ == d2; // true && false == false
        //boolean c = a2 > b2 && c2++ == d2; // false && false == false, c2++ - не выполняется
        //boolean c = a2 > b2 || ++c2 == d2; // false || (к с2 прибавилась 1 = 100) true == true
        //boolean c = a2 < b2 || ++c2 == d2; // true, дальше не выполняется и с2 = 99
        //boolean c = a2 < b2 | ++c2 == d2;
        boolean c = a2 > b2 & ++c2 == d2;
        
        int a1 = 10;
        int b1 = 5;
               
        //System.out.println(c);
        //System.out.println(c2);
        //System.out.println(a1 | b1);
        
        boolean q1 = false;
        boolean q2 = false;
        boolean q3 = false;
        boolean q4 = true;
        
        System.out.println(q1 ^ q2 ^ q3 ^ q4);
    }
}
