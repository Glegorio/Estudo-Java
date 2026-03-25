import java.util.Scanner;
public class Estudo_Array {
    public static void main(String[] args) throws Exception {
        Scanner digitar = new Scanner(System.in);

        System.out.println("Testando a lógica: ARRAY");

        int[] numero = {10, 20, 30};
        String[] letra = {"Dez", "Vinte", "Trinta"};

        System.out.println("Digite uma opção entre 1 e 3: ");
        int opcao = digitar.nextInt();

        if(opcao >= 1 && opcao <= 3){
            System.out.println("O número da opção é: " + numero [opcao - 1]);
            System.out.println("Por extenso: " + letra [opcao -1]);
        }

        for (int i = 0; i < numero.length; i++){
            System.out.println("Digite um número " + (i + 1) + ": ");
            numero[i] = digitar.nextInt();
        }   

        System.out.println(numero[0]);
        System.out.println(numero[1]);
        System.out.println(numero[2]);

        digitar.close();
    }
}
