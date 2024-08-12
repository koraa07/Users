import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)throws IOException {


        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите имя пользователя: ");
        String name = scanner.nextLine();

        System.out.print("Введите возраст пользователя: ");
        String age = scanner.nextLine();

        FileWriter fileWriter = new FileWriter("users.txt");
        fileWriter.write("Имя: "+ name + " Возраст: "+ age);
        fileWriter.close();


        FileReader fileReader = new FileReader("users.txt");
        int character;
        System.out.println("Содержимое файла:");
        while ((character = fileReader.read()) != -1) {
            System.out.print((char) character);




        }
    }
}