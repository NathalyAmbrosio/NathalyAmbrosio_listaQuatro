/*Faça um programa que some todos os números cujo quadrado (x^) for disivel por 4
Nathalt Ambrosio
29/05/2023 */                                                                                                                                                                                                                                                                                                                                                                                      ////////////////////////////////                                                                       //////////////////////////////////////////////////////////////////// 
 
public class exercicio01 {
    public static void main (String args [])  {
    //criando as variaveis
    int  nm1, some;
   
   //recebendo os valores
   nm1 = 765;
   some = 0;

   //calculo dos numeros
   for (int n = 1; n <= nm1; n++) {
     int gun = n * n; 
     
     if (gun % 4 == 0) {
        //soma dos quadrados
        some += n;

     }
    }
    System.out.println (" as somas dos quadrados " + some);
}
}
