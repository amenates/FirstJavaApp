package Lesson2;

public class PrimitiveDataTypes {
    public static void main(String[] args) {
        
        byte b1 = 10;
        byte b2 = 20;
        byte b3 = 100;
        
        short s1 = 5;
        short s2 = -10;
        short s3 = 0;
        
        int i1 = 500; // дефолтный тип для целых
        
        long l1 = 1000L;
        long l2 = 1000000000000L;
        long l3 = 51L;
        
        float f1 = 3.14F;
        float f2 = 2.4f;
        float f3 = 20.0f;
        
        double d1 =  5.5D; // дефолный тип для дробных, т.е. можно не использовать D/d в конце
        double d2 =  87.65d;
        
        char c1 = 'a';
        char c2 = 'Ъ';
        char c3 = '7';
        char c4 = ' ';
        
        char c5 = 500; // переменная будет содержать значение 300-ого символа в Unicode. 10ти ричная система счисления.
        
        char c6 = '\u05DA'; //16ти ричная система счисления
        
        
        boolean bool1 = true;
        boolean bool2 = false;
        
        
        int a1 = 60;
        
        int a2 = 0B11_11_00; // 0B/0b показывает что дальше идет двоичное число
        int a3 = 0b111100;
        
        int a4 = 0_74; // в восьмиричной системе счисления
        
        int a5 = 0x3C; // 0х/0X показывает что дальше идет число в шестнадцатиричной системе счисления
        int a6 = 0X3c;
        
        
        int a7 = 1_000______000;
        
        System.out.println("for commit");
    }
}
