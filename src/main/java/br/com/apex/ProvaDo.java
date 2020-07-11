package br.com.apex;

public class ProvaDo {

	public static void main(String[] args) {
		
		int i = 1;
				while (i < 5) {
					i = i * 2;
				}
				if (i < 6.0) {
					i = i * 10;
					System.out.println("valor de " + i);
				}
				else {
					i = i / 2;
					System.out.println("valor de " + i);
				}
				
}
}
