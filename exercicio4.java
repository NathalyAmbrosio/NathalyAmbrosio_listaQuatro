/*Crie um algoritmo que pega um texto inserido pelo usuario e verifique se a qualidade de caracteres desse texto for maior que 10
Nathaly ambrosio
30/05/2023
 */
   
   import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite um texto:");
        //escaneando
        String text = leitor.nextLine();

        if (text.length() > 10) {
            System.out.println("Você digitou um palavrão");
        } else {
            System.out.println("Você digitou uma palavrinha");
            leitor.close();
        }
    }
}
