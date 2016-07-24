import java.util.*;

public class ParOuImpar {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		List<String> ganhadores = new ArrayList<String>();
		
		int partidas = 0;
		int rodadas = 0;
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
				rodadas++;
			}
			partidas++;
			n = input.nextInt();
		}
		for (int j=0; j<partidas; j++){
			System.out.println("Teste" + j+1);
			System.out.println(ganhadores.get(j));
			System.out.println();
		}
	}
}
