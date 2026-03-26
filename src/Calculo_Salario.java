import java.util.Scanner;
public class Calculo_Salario {
    static Scanner digitar = new Scanner(System.in);
    static double renda = 0;
    static double despesas = 0;
    static double despesacartao = 0;
    static double despesaemprestimo = 0;
    static double despesacontas = 0;
    static double despesaaluguel = 0;
    public static void menuGeral(){
        
        System.out.println("\n╭──────────────────────╮");
        System.out.println("│    MENU PRINCIPAL    │");
        System.out.println("│──────────────────────│");
        System.out.println("│ → 1. Adicionar Renda │");
        System.out.println("│ → 2. Gastos          │");
        System.out.println("│ → 3. Balanço         │");
        System.out.println("│ → 4. Sair            │");
        System.out.println("╰──────────────────────╯");
        
        System.out.print("Selecione uma opção: ");
        int opcao = digitar.nextInt();
        
        switch (opcao) {
        	case 1: 
        		renda = adicionarRenda();
        	break;
        
        	case 2:
        		despesas = despesasMensais();
        		break;
        
        	case 3:
        		balanco(renda);
        		break;
        
        	case 4:
        		System.out.println("\n┌────────────────────────────────────┐");
        		System.out.println("│        ENCERRANDO SISTEMA...       │");
        		System.out.println("└────────────────────────────────────┘");
        		System.exit(0);
        		break;
        		
        	default:
        		System.out.println("\n┌────────────────────────────────────┐");
        		System.out.println("│           OPÇÃO INVÁLIDA...        │");
        		System.out.println("└────────────────────────────────────┘");
        }
    }
    
    public static double adicionarRenda() {
    	System.out.println("\n┌────────────────────────────────────┐");
        System.out.println("│            RENDA MENSAL            │");
        System.out.println("└────────────────────────────────────┘");
        System.out.print("Digite a sua renda mensal: ");
        double renda = digitar.nextDouble();
        
    	return renda;

    }
    
    public static void balanco(double renda) {
    	 System.out.println("\n╭────────────────────────────────╮");
         System.out.println("│            BALANÇO             │");
         System.out.println("│────────────────────────────────│");
         System.out.printf("│ %-30s │%n", String.format(" Renda Mensal: R$ %,.2f", renda));
         System.out.printf("│ %-30s │%n", String.format(" Renda Anual: R$ %,.2f", renda * 12));
         System.out.printf("│ %-30s │%n", String.format(" Despesas Mensais: R$ %,.2f", despesas));
         System.out.printf("│ %-30s │%n", String.format(" Valor restante: R$ %,.2f", renda - despesas));
         System.out.println("╰────────────────────────────────╯");	
    }
    
    public static double despesasMensais() {
    int opcao = 0;
    
    while (opcao != 5) {
    	System.out.println("\n╭──────────────────────╮");
        System.out.println("│     MENU DESPESAS    │");
        System.out.println("│──────────────────────│");
        System.out.println("│ → 1. Cartão          │");
        System.out.println("│ → 2. Empréstimo      │");
        System.out.println("│ → 3. Contas          │");
        System.out.println("│ → 4. Aluguel         │");
        System.out.println("│ → 5. Total           │");
        System.out.println("╰──────────────────────╯");
        
        System.out.print("Selecione uma opção: ");
        opcao = digitar.nextInt();
        
        switch (opcao) {
        	case 1:
        		System.out.println("\n┌────────────────────────────────────┐");
                System.out.println("│          DESPESAS NO CARTÃO        │");
                System.out.println("└────────────────────────────────────┘");
                System.out.print("Digite o valor da despesa: ");
                despesacartao = digitar.nextDouble();
                
                despesas = despesas + despesacartao;
        	break;
        
        	case 2:
        		System.out.println("\n┌────────────────────────────────────┐");
                System.out.println("│       DESPESAS DE EMPRÉSTIMOS      │");
                System.out.println("└────────────────────────────────────┘");
                System.out.print("Digite o valor da despesa: ");
                despesaemprestimo = digitar.nextDouble();
                
                despesas = despesas + despesaemprestimo;
        	break;
        	
        	case 3:
        		System.out.println("\n┌────────────────────────────────────┐");
                System.out.println("│          DESPESAS DE CONTAS        │");
                System.out.println("└────────────────────────────────────┘");
                System.out.print("Digite o valor da despesa: ");
                despesacontas = digitar.nextDouble();
                
                despesas = despesas + despesacontas;
        	break;
        	
        	case 4:
        		System.out.println("\n┌────────────────────────────────────┐");
                System.out.println("│         DESPESAS DE ALUGUEL        │");
                System.out.println("└────────────────────────────────────┘");
                System.out.print("Digite o valor da despesa: ");
                despesaaluguel = digitar.nextDouble();
                
                despesas = despesas + despesaaluguel;
        	break;
        	
        	case 5:
        		System.out.println("\n╭─────────────────────────────────────╮");
                System.out.println("│            TOTAL DESPESAS           │");
                System.out.printf("│ %-35s │%n", String.format("Cartão: R$ %,.2f", despesacartao));
                System.out.printf("│ %-35s │%n", String.format("Empréstimo: R$ %,.2f", despesaemprestimo));
                System.out.printf("│ %-35s │%n", String.format("Contas: R$ %,.2f", despesacontas));
                System.out.printf("│ %-35s │%n", String.format("Aluguel: R$ %,.2f", despesaaluguel));
                System.out.println("│─────────────────────────────────────│");
                System.out.printf("│ %-35s │%n", String.format("Total: R$ %,.2f", despesaaluguel + despesacartao + despesaemprestimo + despesacontas));
                System.out.println("╰─────────────────────────────────────╯");	
            break;
        }
    }
    	return despesas;
    }

    public static void main(String[] args) throws Exception {
        System.out.println("┌────────────────────────────────────┐");
        System.out.println("│        APLICAÇÃO FINANCEIRA        │");
        System.out.println("└────────────────────────────────────┘");
        while (true){
            menuGeral();
        }

    }    
}