
package Lesson3;

public class Test4 {
    public static void main(String[] args) {
        int a = 11;
        int b = 3;
        
        //double a = 11;
        //double b = 3;
        
        //int c = a / b; // Отсекается дробная часть. не округляется, а отсекается. int / int == int.
        //double c = a / b;
        
        // Оператор % показывает остаток от деления
        int celoyaChast = a / b;
        int ostatoc = a % b; // Остаток от деления a на b
        
        int x = 5;
        
//        System.out.println(celoyaChast);
//        System.out.println(ostatoc);
        System.out.println(x++);
    }
}
