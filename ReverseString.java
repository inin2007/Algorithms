import java.until.Scanner;

public class Main{
public static void main(String[] arg){
Scanner scanner = new Scanner(System.in);
System.out.print("Inert string: ");
char[] letter = scanner.nextLine().toCharArray();
System.out.print("Reverse string: ");
for(int i = letter.length-1; i>=0; i--){
System.out.print(letter[i]);
}
}
}
