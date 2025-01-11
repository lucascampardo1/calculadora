package calculadora;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
				
		System.out.println("Bem vindo(a)");
		
		System.out.println("Digite a operação desejada:");
		System.out.println("1 - Soma | 2 - Subtração | 3 - Multiplicação | 4 - Divisão");
		
		int op = sc.nextInt();
		
		if (op >= 1 && op <= 4) {
			int n1 = getNumber(sc, "Digite o primeiro número: ");
			int n2 = getNumber(sc, "Digite o segundo número: ");
			int resultado = calcular(op, n1, n2);
			
			if (op == 4 && n2 == 0) {
				System.out.println("Erro: Divisão por zero não é permitida");
			} else {
				System.out.println("O resultado é: " + resultado);
			}
		} else {
			System.out.println("Erro: Operação inválida!");
		}
		
		
		sc.close();
	}
	
	public static int getNumber(Scanner sc, String msg) {
		System.out.println(msg);
		return sc.nextInt();
	}
	
	public static int calcular(int op, int n1, int n2) {
		switch (op) {
		case 1:
			return n1 + n2;
		case 2:
			return n1 - n2;
		case 3:
			return n1 * n2;
		case 4: 
			return n2 != 0 ? n1 / n2 : 0;
		default:
			return 0;
		}
	}
}
