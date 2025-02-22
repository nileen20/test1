import java.util.Scanner;

public class plainToCipher {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Text: ");
        String input = sc.nextLine();
        System.out.println("Enter value: ");
        int value = sc.nextInt();
        // System.out.println(input + "\t" + value);
        sc.close();
        System.out.println(cipherText(input, value));
    }

    public static String cipherText(String input, int value){
        StringBuilder sb = new StringBuilder("");
        char aray[] = new char[input.length()];
        for(int i=0; i<aray.length; i++){
            aray[i] = input.charAt(i);
        }

        for(int i=0; i<aray.length; i++){
            if (Character.isUpperCase(aray[i])) {
                char temp = (char)(((aray[i] - 'A' + value) % 26) + 'A');
                sb.append(temp);
            }
            else if (Character.isLowerCase(aray[i])) {
                char temp = (char)(((aray[i] - 'a' + value) % 26) + 'a');
                sb.append(temp);
            }
            else{
                sb.append(aray[i]);
            }
        }
        return sb.toString();
    }
}