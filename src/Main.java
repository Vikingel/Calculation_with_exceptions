import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.lang.ArithmeticException;
import java.util.NoSuchElementException;

public class Main {
    public static void main(String[] args) {
        example1();
    }

    private static void example1() {
        String s = "a&b.txt";
        try {
            Scanner scanner = new Scanner(new File(s));
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            System.out.println("в файле целые числа a=" + a + " и b=" + b);
            System.out.println("a+b=" + new Sum().calc(a, b));
            System.out.println("a-b=" + new Dif().calc(a, b));
            System.out.println("a*b=" + new Multiply().calc(a, b));
            System.out.println("a/b=" + new Divide().calc(a, b));
        }
        catch(FileNotFoundException e){
            System.out.println("файл "+s+" не найден!");
        }
        catch(InputMismatchException e){
            System.out.println("в файле "+s+" не целые числа!");
        }
        catch(ArithmeticException e){
            System.out.println("делить на 0 нельзя!");
        }
        catch(NoSuchElementException e){
            System.out.println("файл "+s+" пустой!");
        }
        System.out.println("продолжайте работу");
    }
}
