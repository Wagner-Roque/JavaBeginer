/**
 * Este códido faz o processamento de uma matriz dimencional
 * Autor: Wagner Roque
 */
package MatrizDimencional;


public class Matriz {

	public static void main(String [] args){
		
		int[][] listagem  = {{1,2,3},{9,8,7},{3,4,5,},{10,11,12},{19,17,16},{19,20,21}};
		
		int j = 0;
		int i =0;
		
		for (int i1 = 0; i1 < listagem.length; i1++) {
			for (int j2 = 0; j2 < listagem.length; j2++) {
				System.out.printf("A listagem é : "+ listagem);
			}
		}
		
		/**
		 * 
		
		Integer lista []= {1,2,3,4,5,6,7,8,9,10};
		
		int cont = 0;
		
		while( cont < 10) {
			if (lista!= null) {
				cont++;
				System.out.println(cont);
			}
			
		}
		 */
		
		/*
		 * //Matriz unidimensional
		 
		for(Integer lista1 : lista){
			System.out.println(lista1);
		}
		System.out.println("****************");
		System.out.println(lista[9]);
	*/
	}
}
