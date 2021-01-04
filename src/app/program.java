package app;

import java.util.Scanner;
import entities.aluguelQuartos;

public class program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		aluguelQuartos[] pensao = new aluguelQuartos[10];
		
		System.out.print("Hom many roows will be rented? ");
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			System.out.println("Rent #" + i);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Room: ");
			int room = sc.nextInt();
			
			pensao[room] = new aluguelQuartos(name, email, room);
		}
		
		System.out.println("Busy rooms:");
		
		for(int i = 0; i < pensao.length; i++) {
			if(pensao[i] != null) {
				
				System.out.println(pensao[i].getRoom() + ": " + pensao[i].getName() + ", " + pensao[i].getEmail());
			}
		}
		
		sc.close();
	}

}
