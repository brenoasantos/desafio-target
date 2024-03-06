import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite uma string: ");
        String input = scanner.nextLine();
        
        String invertedString = stringInverter(input);
        
        System.out.println("String invertida: " + invertedString);
        
        scanner.close();
    }
    
    public static String stringInverter(String str) {
        StringBuilder builder = new StringBuilder();
        
        for (int i = str.length() - 1; i >= 0; i--) {
            builder.append(str.charAt(i));
        }
        
        return builder.toString();
    }
}
