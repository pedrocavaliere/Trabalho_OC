import java.util.*;

public class ParOuImpar {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		List<String> ganhadores = new ArrayList<String>();
		
		int partidas = 0;
		List<Integer> rodadasPorPartida = new ArrayList<Integer>();
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
			rodadasPorPartida.add(n);
			partidas++;
			n = input.nextInt();
		}
		int h = 0;
		for (int j=0; j<partidas; j++){
			System.out.println("Teste " + (j+1));
			for (int g=0; g<rodadasPorPartida.get(j); g++){
				System.out.println(ganhadores.get(h));
				h++;
			}
			System.out.println();
		}
	}
}
