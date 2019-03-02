import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Encode {
    public  static void main(String[] args) throws FileNotFoundException {
    Scanner input = new Scanner(System.in);

    int x = 0;
    PrintStream fileOut = new PrintStream(new FileOutputStream("output.txt"));

    System.out.print("Enter the string");
    String string = input.nextLine();

    System.out.print("Enter the shift factor");

    int y = input.nextInt();

    int i = string.length();
    //System.out.println(i);
    long[] arrays = new long[i];


          while (x < i) {
        char c = string.charAt(x);
        System.out.println(c);
        long ascii1 = (long) c;
        ascii1 = ascii1 + y;
        System.out.println(ascii1);
        arrays[x] = ascii1;

        x++;

    }
        for(int n = 0; n < i; n++){

        System.out.println(arrays[n]);

        fileOut.println(arrays[n]);
    }


}
}
