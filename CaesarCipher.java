import java.util.scanner;

public class Main{
publuc static final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";



public static void main(String[] arg){
Scanner scanner = new Scanner(System.in);
System.out.println("Insert string: ");
String letter = new String;
letter = scanner.next();
System.out.println(encrypt(letter, 3));
System.out.println(discrypt(encrypt(letter, 3), 3));
}
}
