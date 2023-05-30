/* Construa um algoritmo que recba três números, e enquanto a soma deleds for diferente e 48 ou 71, continue recebendo três valores infinitamented
Nathaly ambrosio
30/05/2023
 */
  import java.util.Scanner;
    public class exercicio2{
        public static void main (String args[]) {
 
 //criando a variavel
int n1, n2, n3, soma;

Scanner leitor = new Scanner(System.in);

System.out.print("Digite um número ");
n1 = leitor.nextInt();

System.out.print("Digite o segundo número ");
n2 = leitor.nextInt();

System.out.print("Digite o terceiro número ");
n3 = leitor.nextInt();

//calculo das somas
soma = n1 + n2 + n3;


//vericar se as é igual a 48 ou 71
if (soma == 48 ||  soma == 71){    
    System.out.print("a soma dos números é igual a 48 || 71");                     
}
    leitor.close();
    }
    }




























