import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Decode {
    public static void main(String[] args) throws IOException {
        int x = 0;

        Scanner input = new Scanner(System.in);
        BufferedReader reader = new BufferedReader(new FileReader("output.txt"));
        String line;


        Path path = Paths.get("output.txt");
        long lineCount = Files.lines(path).count();
        System.out.println(lineCount);

        System.out.println(" ");

        System.out.print("Enter your data key: ");
        int key = input.nextInt();



        //System.out.println(lines);
        while (x < lineCount) {


            line = reader.readLine();
            int res = Integer.parseInt(line);
            res = res - key;
            String end = String.valueOf(Character.toChars(res));
            System.out.print(end);
            x++;
        }

    }
}
