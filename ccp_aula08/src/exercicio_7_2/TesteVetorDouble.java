package exercicio_7_2;

import java.util.Arrays;

public class TesteVetorDouble {

	public static void main(String[] args) {
		VetorDouble[] db = new VetorDouble[10];
		
		//gerando um vetor com 10 DoubleBizarros aleatórios
		for(int i = 0; i < 10; i++) {
			db[i] = new VetorDouble(Math.floor(10*Math.random())+Math.random());
			System.out.println(db[i].doubleValue());
		}
		
		Arrays.sort(db);
		
		System.out.println("Ordenado somente pelas casas decimais.");
		System.out.println(Arrays.toString(db));
		
		
	}

}
