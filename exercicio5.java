/*Elabore um programa que faça uma contagem de 10 a 0 e mostrwe "fim" quando termina
Nathaly Ambrosio
30/05/2023
 */

public class exercicio5 {
    public static void main(String args []) {

        //criando a variavel
        int dez;

        //iniciando
        dez = 10;
        
        //contagem
        do {
            System.out.println(dez);
            dez--;
        } while (dez >= 0);
        
        System.out.println("fim");
    }
}
