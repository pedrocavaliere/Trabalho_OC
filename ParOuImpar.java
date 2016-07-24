import java.util.*;

public class ParOuImpar {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		int n = input.nextInt();
		while (n!=0){
			String [] ganhadores = new String[n];
			String jogadorPar = input.nextLine();
			String jogadorImpar = input.nextLine();
			
			for (int i=0; i<n; i++){
				int jogada1 = input.nextInt();
				int jogada2 = input.nextInt();
				
				if ((jogada1+jogada2)%2==0){
					ganhadores [i] = jogadorPar;
				}
				else{
					ganhadores[i] = jogadorImpar;
				}
			}
			
			n = input.nextInt();
		}
	}
}
