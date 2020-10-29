
package Lesson3;

public class Unari {
    public static void main(String[] args) {
        int x = 5;
        
        int y = 3;

        //int z = x - y++; // Сначала от x отнимается y, а ПОСЛЕ ЭТОГО к y прибавляется единица
        int a = x - ++y; // СНАЧАЛА к y прибавляется единица, а после этого от x отнимается y

        System.out.println(a);
        
        int b = 5;
        
        
    }
}
