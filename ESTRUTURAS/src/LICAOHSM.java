import java.util.Scanner;

 public class LICAOHSM {
		public static void main(String[] args) {
			
			Scanner teclado = new Scanner(System.in);

				double prova1, projeto2, lista3, mediaBim1 = 0;
				double prova_1, projeto_2, lista_3, mediaBim2 = 0;
				double mediasemestral = 0;


			System.out.println("Digite as 3 notas do primeiro bimestre consecutivamente: prova, projeto, lista:");
			prova1 = teclado.nextDouble();
			projeto2 = teclado.nextDouble();
			lista3 = teclado.nextDouble();
		
			mediaBim1 = ((prova1*5)+(projeto2*3)+(lista3*2))/3;
			System.out.println("mediaBim1 = " + mediaBim1);


			System.out.println("Digite as 3 notas do segundo bimestre consecutivamente: prova, projeto, lista:");
			prova_1 = teclado.nextDouble();
			projeto_2 = teclado.nextDouble();
			lista_3 = teclado.nextDouble();
			
			mediaBim2 = ((prova_1*5)+(projeto_2*3)+(lista_3*2))/3;
			System.out.println("mediaBim2 = " + mediaBim2);


			mediasemestral = (mediaBim1 + mediaBim2)/2;
			System.out.println("mediasemestral = " +mediasemestral);

			if(mediasemestral >=8) {
				System.out.println("Você foi aprovado");
			} else if ((mediasemestral == 5) && (mediasemestral <= 7.9)) {
				System.out.println("Você precisa realizar uma avaliação final");
			} else 
			{
				System.out.println("Você está reprovado.");
		}
			}
 }
	