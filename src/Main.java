import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        String[] text = s.trim().split(" ");
        char temp;
        for (int i = 0; i < text.length; i++) {
            char letters[] = text[i].toCharArray();
            for (int j = 0; j < ((letters.length) / 2); j++){
                temp = letters[j];
                letters[j] = letters[letters.length - 1 - j];
                letters[letters.length - 1 - j] = temp;
            }
            System.out.print(new String(letters) + " ");
        }
        System.out.println();
    }
}
