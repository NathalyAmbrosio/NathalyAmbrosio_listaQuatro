/*faça um sofware que some 10 valores inteiros positivos e mostre sua raiz quadrada
Nathaly Ambrosio
30/05/2023
 */
 
 import java.util.Scanner;

public class exercicio6 {
    public static void main(String args[]) {
        Scanner leitor = new Scanner(System.in);
         
         //criando variavel
         int som, cont;

         //iniciando
          som = 0;
         cont = 1;

            while (cont <= 10) {
            System.out.print("Digite o valor " + cont + ": ");
            //criar outra variavel para atribuir o valor
            int val = leitor.nextInt();

            if (val > 0) {
                som += val;
                cont++;
            } else {
                System.out.println(" Insira um valor inteiro positivo.");
            }
        }

        double raiQ = Math.sqrt(som);

        System.out.println("A soma dos valores é: " + som);
        System.out.println("A raiz quadrada da soma é: " + raiQ);
    }
}
