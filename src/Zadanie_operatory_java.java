import java.util.Random;

public class Zadanie_operatory_java {
    public static void main(String[] args) {

        Random rand = new Random();
        int x = rand.nextInt(50);
        int y = rand.nextInt(60);

        System.out.println("x = " + x);
        System.out.println("y = " + y);

        boolean result;
        result = x > y;
        System.out.println("Czy x > y = " + result);

        result = 2 * x > y;
        System.out.println("2x>y =" + result);

        result = y < x+ 3 && y>x-2;
        System.out.println("Czy y jest mniejsze od sumy x+3 i jednocześnie większe od x pomniejszonego o 2?");
        System.out.println(result);

        result = (x*y)%2==0 ;
        System.out.println("Czy iloczyn liczb x i y jest parzysty?");
        System.out.println(result);
    }
}
