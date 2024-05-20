import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int total = 0, primos =0, naoPrimos = 0;


        while (true) {
            System.out.println("Entre com um número: ");
            int numero = entrada.nextInt();
            if (numero == 0) {
                break;
            }


            boolean ePrimo = verificarPrimo(numero);
            mostrarNumeros(ePrimo);

            total++;
            if (ePrimo) {
                primos++;
            }
            else {
                naoPrimos++;
            }

        }
        System.out.println("Números lidos = "+total);
        System.out.println("Números Primos = "+primos);
        System.out.println("Números não primos = "+naoPrimos);
    }

    //----------------------------

  public static boolean verificarPrimo(int numero) {
      if(numero <= 1) {
          return false;
      }
      for(int i = 2; i <= Math.sqrt(numero); i++) {
          if(numero % i == 0) {
              return false;
          }
      }
      return true;
  }
    //----------------------------------------
    public static void mostrarNumeros(boolean ePrimo) {

        if (ePrimo) {
            System.out.println("é primo");
        }
        else{
            System.out.println("Não é primo");
        }
    }
}
