import java.util.Scanner;

public class Exercicio {
    public static void main(String[] args) {
        Scanner inicialScanner = new Scanner(System.in);
        double temperatura;
        double soma =0.0;
        double leitura =0;

        for(int i= 0; i<12;i++){
        
            System.out.println("Digite a temperatura:");
            temperatura = inicialScanner.nextDouble();

            while (temperatura<4 || temperatura >10) {
                System.out.println("Apenas numeros de 4 a 10.\nDigite a temperatura:");
                temperatura = inicialScanner.nextDouble();
               
            }
            soma +=temperatura;
            leitura++;
        }
        
        double media = soma/leitura;
        System.out.println("\nA média de hoje é: "+media+"°\n");

        inicialScanner.close();
    }
    
}
