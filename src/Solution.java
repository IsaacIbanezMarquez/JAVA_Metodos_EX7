


import java.util.*;





public class Solution
{

    // 7.- Crea un método que al ingresar por teclado un número cualquiera, muestre la cantidad de
    // números pares a partir del 2, por ejemplo: si se  introduce 7, entonces se imprimirá, 2, 4, 6, 8, 10, 12,14
    // o si se introduce 10 = 2, 4, 6, 8, 10, 12, 14, 16, 18, 20.

    public static class Ejercicio7
    {
        Scanner dato = new Scanner(System.in);
        void numerospares()
        {
            System.out.println("Introduce un numero");
            int n = dato.nextInt();
            int i =0;
            int j =1;
            System.out.println("Los numeros pares son ; ");
            do{ if(j%2==0)
            {
                System.out.print(j+","); j++; i++;
            }
            else
            {
                j++;
            }
            }while( i != n);
        }
        public static void main(String[]args){  Ejercicio7 numpar =new Ejercicio7();  numpar.numerospares();
        }
    }

}
