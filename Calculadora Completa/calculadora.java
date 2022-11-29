package numeros;

import java.util.Scanner;

public class calculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float a=0, b=0, res=0; //Adicionei a opção float para mostrar números decimais, principalmente nas divisões. Para voltar em números inteiros só alterar para "int".
		String sel=null;
		@SuppressWarnings("resource")
		Scanner tec=new Scanner(System.in);
		System.out.println("Os valores estarão em decimáis, caso deseje alterar para inteiro -> acesse o código!");
		System.out.println("Selecione a opção\n");
		System.out.println("+: Soma"
				+ "\n-: Subtração"
				+ "\n*: Multiplicação"
				+ "\n/: Divisão");
		
		sel=tec.next();
		
		switch(sel) {
		case "+": //Soma dos números 
			System.out.println("Foi selecionado a opção: Soma\nInsira os valores!");
			
			System.out.println("Insira o primeiro número:");
			a=tec.nextInt();
			System.out.println("Insira o segundo número:");
			b=tec.nextInt();
			
			res=a+b;
			
			System.out.println("Você está somando: "+a+" + "+b+" = "+res);
			break; //Para não ficar em loop infinito de contas, bloqueando apenas para está conta.
			
		case "-": //Subtração dos números
			System.out.println("Foi selecionado a opção: Subtração!\n");
			System.out.println("Insira o primeiro número:");
			a=tec.nextInt();
			System.out.println("Insira o segundo número:");
			b=tec.nextInt();
			
			res=a-b;
			
			System.out.println("Você está subtraindo: "+a+" - "+b+" = "+res);
			break; //Para não ficar em loop infinito de contas, bloqueando apenas para está conta.
			
		case "*": //Multiplicação dos números
			System.out.println("Foi selecionado a opção: Multiplicação!\n");
			System.out.println("Insira o primeiro número:");
			a=tec.nextInt();
			System.out.println("Insira o segundo número:");
			b=tec.nextInt();
			
			res=a*b;
			
			System.out.println("Você está multiplicando: "+a+" * "+b+" = "+res);
			break; //Para não ficar em loop infinito de contas, bloqueando apenas para está conta.
			
		case "/": //Divisão dos números
			System.out.println("Foi selecionado a opção: Divisão!\n");
			System.out.println("Insira o primeiro número:");
			a=tec.nextInt();
			System.out.println("Insira o segundo número:");
			b=tec.nextInt();
			
			res=a/b;
			
			System.out.println("Você está dividindo: "+a+" / "+b+" = "+res);
			break; //Para não ficar em loop infinito de contas, bloqueando apenas para está conta.
		
			default: //Caso aplique a opção errada ou a que não existe no sys.
				System.out.println("Está opção não existe, selecione apenas as opções exibidas!");
			
		}
	}
}
