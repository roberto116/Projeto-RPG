package Jogo;

import java.util.Scanner;
import java.util.Random;
public class Jogo {
    
	static Scanner scan = new Scanner(System.in);
    
	static int AtaqueUsuario() {
		int ataque;
		System.out.println("*--Escolha seu Ataque--*");
		System.out.println("1 - Soco");
		System.out.println("2 - Especial");
		ataque = scan.nextInt();
		return ataque;
	}
	static int AtaqueCpu() {
		Random gerador = new Random();
		return gerador.nextInt(3) + 1;
	}
	static void HP(int hpUsuario, int hpCpu, int especiais) {
		System.out.println("=======================");
		System.out.println("- HP Usuario: " + hpUsuario);
		System.out.println("-HP Oponente: " + hpCpu);
		System.out.println("* Contagem Especial: " + especiais);
		System.out.println("=======================");
	}
	static int Combate() {
		int hpUsuario = 150;
		int hpCpu;
		int especiais = 5;
		int ataque;
		int i = 1;
		
		while(hpUsuario > 0) {
			hpCpu = 11 + i;
			
			System.out.println("=-=-=-=-=-=-=-=-=-=");
			System.out.println("    INIMIGO " + i);
			System.out.println("=-=-=-=-=-=-=-=-=-=\n");
			
			while(hpUsuario > 0 && hpCpu > 0) {
				HP(hpUsuario, hpCpu, especiais);
				ataque = AtaqueUsuario();
				switch(ataque) {
				    case 1:
				    	System.out.println("Usuario Atacou com um Soco.");
				    	hpCpu -= 7;
				    	break;
				    case 2:
				    	System.out.println("Usuario Atacou com um Especial.");
				    	hpCpu -= 20;
				    	especiais--;
				    	break;
				    default:
				    	System.out.println("Opção Invalida.");
				    	break;
				}
				if(hpCpu > 0) {
					ataque = AtaqueCpu();
					switch(ataque) {
					case 1:
						System.out.println("Oponente Atacou com um Soco.");
						hpUsuario -= 2 + (int) (i / 10);
						break;
					case 2:
						System.out.println("Oponente Atacou com um Chute.");
						hpUsuario -= 3 + (int)(i / 10);
						break;
					case 3:
						System.out.println("Oponente Atacou com um Especial");
						hpUsuario -= 4 + (int) (i / 20);
					    break;
					}
					
				}else {
					System.out.println("Inimigo Derrotado");
				}
			}
			if(hpUsuario > 0) {
				hpUsuario += 5;
				if(hpUsuario > 150) {
					hpUsuario = 150;
				}
				if(i % 10 == 0) {
					especiais++;
					if(especiais > 5) {
						especiais = 5;
					}
				}
			}
			
			i++;
		}
		return i;
	}
	public static void main(String [] args) {
		int cont = 1;
		int record = 0;
		while(cont == 1) {
			
			int inimigos = Combate();
			if(inimigos > record) {
				record = inimigos;
			}
			System.out.println("Record Atual: " + record);
			
			
			System.out.println("Fim do Jogo. Deseja Continuar?");
			System.out.println("(1) Sim");
			System.out.println("(2) Não");
			cont = scan.nextInt();
		}
		
	}
	
}
