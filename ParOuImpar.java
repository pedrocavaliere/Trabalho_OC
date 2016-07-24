import java.util.*;

public class ParOuImpar {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		List<String> ganhadores = new ArrayList<String>();
		
		int n = input.nextInt();
		while (n!=0){
			String jogadorPar = input.nextLine();
			String jogadorImpar = input.nextLine();
			
			for (int i=0; i<n; i++){
				int jogada1 = input.nextInt();
				int jogada2 = input.nextInt();
				
				if ((jogada1+jogada2)%2==0){
					ganhadores.add(jogadorPar);
				}
				else{
					ganhadores.add(jogadorImpar);
				}
			}			
			n = input.nextInt();
		}
		
	}
}
