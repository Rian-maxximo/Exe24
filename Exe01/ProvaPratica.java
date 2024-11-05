import java.util.Scanner;

public class ProvaPratica {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double valor_carro = 0;
        double custo_carro;
        
        System.out.print("Digite o custo de fabrica do carro: ");
        valor_carro = scanner.nextDouble();
     custo_carro = valor_carro * 0.28 + valor_carro * 0.45;


     System.out.print("O Valor final do carro é?  " + custo_carro);
     
	}
}
