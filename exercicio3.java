/*Engenhe  um algoritmo que gere 50 números inteiros e some eles numa variavel
Nathaly Ambrosio
30/05/2023
 */ 

import java.util.Random;

public class exercicio3 {
    public static void main(String args []) {

        // criando a variavel inteiros
        int valint;

        //iniciando
        valint = 0;

        Random leitor = new Random();

        for (int i = 0; i < 50; i++) {
            int numint = leitor.nextInt();
            valint += numint;
        }

        // criando a variavel real
        double valreal;

        //inicializando
        valreal = 0;

        for (int i = 0; i < 50; i++) {
            double numreal = leitor.nextDouble();
             valreal += numreal;
        }

        // Exibir as somas e o maior valor
        System.out.println("Soma dos números inteiros: " + valint);
        System.out.println("Soma dos números reais: " + valreal);

        if (valint > valreal) {
            System.out.println("A soma dos números inteiros é maior");
        } else if (valint < valreal) {
            System.out.println("A soma dos números reais é maior");
        } else {
            System.out.println("As somas dos números são iguais ");
        }
    }
} 
