import java.util.Scanner;
public class Sistema_Cad {
    static Scanner digitar = new Scanner(System.in);
    public static double MenuPrincipal(double totalPedido){
    
        System.out.println("\n|--- MENU PRINCIPAL ---|");
       
        System.out.println("\nEntradas......... ( 1 )"); 
        System.out.println("Principais....... ( 2 )");
        System.out.println("Bebidas.......... ( 3 )");
        System.out.println("Sair............. ( 4 )");

        System.out.print("\nSelecione uma opção: ");
        int opcao = digitar.nextInt();

        switch (opcao){

            case 1: 
                return entradas();

            case 2:
                return principais();

            case 3:
                return bebidas();

            case 4:
                System.out.printf("\nTotal do pedido: R$ %.2f%n", totalPedido);
                calcularTroco(totalPedido);
                System.out.println("Encerrando Sistema...");
                System.exit(0);
            break;

            default:
                System.out.println("Opção inválida!!!");
            break;
        }
        return 0;
    }

    public static double entradas(){

        String[] nomes = {"Saladas", "Frios", "Torradas", "Petiscos"};
        double[] precos = {5.00, 8.00, 10.00, 15.00};
        double soma = 0;

        System.out.println("\n|--- ENTRADAS ---|");
       
        System.out.println("\n( 1 ) Saladas..........R$ 05.00"); 
        System.out.println("( 2 ) Frios............R$ 08.00");
        System.out.println("( 3 ) Torradas.........R$ 10.00");
        System.out.println("( 4 ) Petiscos.........R$ 15.00");

        System.out.print("\nSelecione uma opção: ");
        int opcao = digitar.nextInt();

        System.out.print("Quantidade: ");
        int qtd = digitar.nextInt();

        if(opcao >= 1 && opcao <= 4){
            soma = precos[opcao - 1] * qtd;
            System.out.println("* " + nomes [opcao - 1] + " ADICIONADO *");
            System.out.printf("Valor adicionado ao pedido: R$ %.2f%n", soma);
        } else {
            System.out.println("Opção inválida!!!");
        }

        return soma;

    }

    public static double principais(){

        String[] nomes = {"Massas", "Sopa", "Parmegiana", "Carne"};
        double[] precos = {10.00, 15.00, 25.00, 30.00};
        double soma = 0;

        System.out.println("\n|--- PRINCIPAIS ---|");
       
        System.out.println("\n( 1 ) Massas...........R$ 10.00"); 
        System.out.println("( 2 ) Sopa.............R$ 15.00");
        System.out.println("( 3 ) Parmegiana.......R$ 25.00");
        System.out.println("( 4 ) Carne............R$ 30.00");

        System.out.print("\nSelecione uma opção: ");
        int opcao = digitar.nextInt();

        System.out.print("Quantidade: ");
        int qtd = digitar.nextInt();

        if(opcao >= 1 && opcao <= 4){
            soma = precos[opcao - 1] * qtd;
            System.out.println("* " + nomes [opcao - 1] + " ADICIONADO *");
            System.out.printf("Valor adicionado ao pedido: R$ %.2f%n", soma);
        } else {
            System.out.println("Opção inválida!!!");
        }

        return soma;
        
    }

    public static double bebidas(){

        String[] nomes = {"Água", "Refrigerante", "Sucos", "Alcólicas"};
        double[] precos = {7.00, 8.50, 8.00, 15.00};
        double soma = 0;

        System.out.println("\n|--- BEBIDAS ---|");
       
        System.out.println("\n( 1 ) Água.............R$ 07.00"); 
        System.out.println("( 2 ) Refrigerante.....R$ 08.50");
        System.out.println("( 3 ) Sucos............R$ 08.00");
        System.out.println("( 4 ) Alcólicas........R$ 15.00 ");

        System.out.print("\nSelecione uma opção: ");
        int opcao = digitar.nextInt();

        System.out.print("Quantidade: ");
        int qtd = digitar.nextInt();

       if(opcao >= 1 && opcao <= 4){
            soma = precos[opcao - 1] * qtd;
            System.out.println("* " + nomes [opcao - 1] + " ADICIONADO *");
            System.out.printf("Valor adicionado ao pedido: R$ %.2f%n", soma);
        } else {
            System.out.println("Opção inválida!!!");
        }
        
        return soma;
    }

    public static double calcularTroco (double totalPedido){

        System.out.print("Digite o valor pago: ");
        double resultado = digitar.nextDouble();

        if (resultado < totalPedido){
            System.out.println("O valor pago não pode ser menor que o valor total do pedido!!!");
            System.out.println("Encerrando Sistema...");
            System.exit(0);
        }

        double troco = resultado - totalPedido;

        System.out.println("\n|----------------------------|");
        System.out.printf("|Valor pago:  R$ %.2f%n", resultado);
        System.out.printf("|Total:       R$ %.2f%n", totalPedido);
        System.out.printf("|Troco:       R$ %.2f%n", troco);
        System.out.println("|----------------------------|");
        
        return troco;
    }

    public static void main(String[] args) throws Exception {

        System.out.println("|------------------------|");
        System.out.println("|--- CARDÁPIO DIGITAL ---|");
        System.out.println("|------------------------|");

        double totalPedido = 0;

        while (true){
           totalPedido += MenuPrincipal(totalPedido);
        }
    }
}