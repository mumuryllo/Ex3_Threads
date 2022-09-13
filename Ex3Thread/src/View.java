import java.util.Random;

public class View {

	public static void main(String[] args) {

		Random numeros = new Random();
		Thread somaVetor;
		int [][] matriz = new int[3][5];
		int[] vetor1 = new int[5];
		int[] vetor2 = new int[5];
		int[] vetor3 = new int[5];
		
		for(int i = 0; i < 3; i++){
			for (int j = 0; j < 5; j++){
				matriz[i][j] = numeros.nextInt(10) + 1;
				
				if (i == 0){
					vetor1[j] = matriz[i][j];
				} else if (i == 1){
					vetor2[j] = matriz[i][j];
				} else {
					vetor3[j] = matriz[i][j];
				}
			}
		}
		
		for (int i = 0; i < 3; i++){
			if (i == 0){
				somaVetor = new Controller(vetor1, 1);
			} else if (i == 1){
				somaVetor = new Controller(vetor2, 2);
			} else {
				somaVetor = new Controller(vetor3, 3);
			}
			
			somaVetor.start();
		}
		
	}

}
