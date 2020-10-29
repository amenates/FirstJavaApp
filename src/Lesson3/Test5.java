package Lesson3;

public class Test5 {
    public static void main(String[] args) {
        int a = 3;
        int b = 5; 
        int c = 15;
        int d = 5;
        int f = 10;        
        int c1 = 0;
        
        long a1 = 100L;        
        
//        a += 3; // То же самое, что и a = a + 3; Выражение говорит, сначала прибавь, а потом присвой.
//        b -= 2; // 2
//        c /= 5; // 3
//        d *= 5; // 25
//        f++; // То же самое, что и f = f + 1. Еще нет разницы, если написать ++f.
        
        // Множественное присвоение:
        // Оператор присвоение, начинает работать с права, т.е.
        // сначала c1 = 18, потом b = 18, потом a = 18.
        a = b = c1 = 18;
        
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
//        System.out.println(d);
//        System.out.println(f);
    }
}
