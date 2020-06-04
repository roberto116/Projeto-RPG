package Jogo;

import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
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

		while (hpUsuario > 0) {
			hpCpu = 11 + i;

			System.out.println("=-=-=-=-=-=-=-=-=-=");
			System.out.println("    INIMIGO " + i);
			System.out.println("=-=-=-=-=-=-=-=-=-=\n");

			while (hpUsuario > 0 && hpCpu > 0) {
				HP(hpUsuario, hpCpu, especiais);
				ataque = AtaqueUsuario();
				switch (ataque) {
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
					System.out.println("Op��o Invalida.");
					break;
				}
				if (hpCpu > 0) {
					ataque = AtaqueCpu();
					switch (ataque) {
					case 1:
						System.out.println("Oponente Atacou com um Soco.");
						hpUsuario -= 2 + (int) (i / 10);
						break;
					case 2:
						System.out.println("Oponente Atacou com um Chute.");
						hpUsuario -= 3 + (int) (i / 10);
						break;
					case 3:
						System.out.println("Oponente Atacou com um Especial");
						hpUsuario -= 4 + (int) (i / 20);
						break;
					}

				} else {
					System.out.println("Inimigo Derrotado");
				}
			}
			if (hpUsuario > 0) {
				hpUsuario += 5;
				if (hpUsuario > 150) {
					hpUsuario = 150;
				}
				if (i % 10 == 0) {
					especiais++;
					if (especiais > 5) {
						especiais = 5;
					}
				}
			}

			i++;
		}
		return i;
	}

	static void JogarBatalha() {
		int cont = 1;
		int record = 0;
		while (cont == 1) {

			int inimigos = Combate();
			if (inimigos > record) {
				record = inimigos;
			}
			System.out.println("Record Atual: " + record);

			System.out.println("Fim do Jogo. Deseja Continuar?");
			System.out.println("(1) Sim");
			System.out.println("(2) N�o");
			cont = scan.nextInt();
		}
		if (cont == 2) {
			Menu();
		}

	}

	static void DesafioQi() {
		int cont = 0;
		int chances = 3;
		boolean acertou = false;
		List alternativas = new ArrayList();
		alternativas.add("Processo cognitivo pelo qual se escolhe um plano de a��o"); 
		alternativas.add("Processo de Piramide");
		alternativas.add("Processo Arbistral");
		alternativas.add("Processo Anabolico");
		alternativas.add("Processo Disciplinar");
		
		System.out.println("Disciplina: Fundamentos de Administra��o.");
		System.out.println("Responda as 5 quest�es a seguir para testa o seu QI.\n Para cada pergunta Voc� tera 3 chances:" + "\n");
		
		do {
			Collections.shuffle(alternativas);
			System.out.println("Qual o processo de tomada de decis�o?");
			System.out.println("a) " + alternativas.get(0));
			System.out.println("b) " + alternativas.get(1));
			System.out.println("c) " + alternativas.get(2));
			System.out.println("d) " + alternativas.get(3));
			System.out.println("e) " + alternativas.get(4));
			System.out.print("Escolha uma alternativa: ");
			String resposta = scan.next();
			switch (resposta) {
			case "a":
			case "A":
				if (alternativas.get(0).equals("Processo cognitivo pelo qual se escolhe um plano de a��o")) {
					System.out.println("Resposta correta!\n");
					acertou = true;
					cont++;
				} else {
					System.out.println("Resposta incorreta!\n");
					chances--;
				}
				break;
			case "b":
			case "B":
				if (alternativas.get(1).equals("Processo cognitivo pelo qual se escolhe um plano de a��o")) {
					System.out.println("Resposta correta!\n");
					acertou = true;
					cont++;
				} else {
					System.out.println("Resposta incorreta!\n");
					chances--;
				}
				break;
			case "c":
			case "C":
				if (alternativas.get(2).equals("Processo cognitivo pelo qual se escolhe um plano de a��o")) {
					System.out.println("Resposta correta!\n");
					acertou = true;
					cont++;
				} else {
					System.out.println("Resposta incorreta!\n");
					chances--;
				}
				break;
			case "d":
			case "D":
				if (alternativas.get(3).equals("Processo cognitivo pelo qual se escolhe um plano de a��o")) {
					System.out.println("Resposta correta!\n");
					acertou = true;
					cont++;
				} else {
					System.out.println("Resposta incorreta!\n");
					chances--;
				}
				break;
			case "e":
			case "E":
				if (alternativas.get(4).equals("Processo cognitivo pelo qual se escolhe um plano de a��o")) {
					System.out.println("Resposta correta!\n");
					acertou = true;
					cont++;
				} else {
					System.out.println("Resposta incorreta!\n");
					chances--;
				}
				break;
			default:
				System.out.println("Escolha inv�lida!\n");
			}
		} while (!acertou && chances > 0);
		
		if(chances == 0) {
			System.out.println("Vo�� n�o Conseguiu Acertar essa quest�o!");
			System.out.println("Vamos para proxima quest�o.\n");
		}
		
		int chances2 = 3;
		acertou = false;
		
		List alternativas2 = new ArrayList();
		alternativas2.add("Lideran�a Autocr�tica, Liberal, Democr�tica"); 
		alternativas2.add("Literal, Artistica, civil");
		alternativas2.add("Lideran�a Arrogante, diplomata, Car�ter");
		alternativas2.add("Autocr�tica, Autentica, Assertiva");
		alternativas2.add("Lideran�a a Distancia, Aristocr�tica");
		
		do {
			Collections.shuffle(alternativas2);
			System.out.println("Quais os tipos de lideran�a na administra��o?");
			System.out.println("a) " + alternativas2.get(0));
			System.out.println("b) " + alternativas2.get(1));
			System.out.println("c) " + alternativas2.get(2));
			System.out.println("d) " + alternativas2.get(3));
			System.out.println("e) " + alternativas2.get(4));
			System.out.print("Escolha uma alternativa: ");
			String resposta = scan.next();
			switch (resposta) {
			case "a":
			case "A":
				if (alternativas2.get(0).equals("Lideran�a Autocr�tica, Liberal, Democr�tica")) {
					System.out.println("Resposta correta!\n");
					acertou = true;
					cont++;
				} else {
					System.out.println("Resposta incorreta!\n");
					chances2--;
				}
				break;
			case "b":
			case "B":
				if (alternativas2.get(1).equals("Lideran�a Autocr�tica, Liberal, Democr�tica")) {
					System.out.println("Resposta correta!\n");
					acertou = true;
					cont++;
				} else {
					System.out.println("Resposta incorreta!\n");
					chances2--;
				}
				break;
			case "c":
			case "C":
				if (alternativas2.get(2).equals("Lideran�a Autocr�tica, Liberal, Democr�tica")) {
					System.out.println("Resposta correta!\n");
					acertou = true;
					cont++;
				} else {
					System.out.println("Resposta incorreta!\n");
					chances2--;
				}
				break;
			case "d":
			case "D":
				if (alternativas2.get(3).equals("Lideran�a Autocr�tica, Liberal, Democr�tica")) {
					System.out.println("Resposta correta!\n");
					acertou = true;
					cont++;
				} else {
					System.out.println("Resposta incorreta!\n");
					chances2--;
				}
				break;
			case "e":
			case "E":
				if (alternativas2.get(4).equals("Lideran�a Autocr�tica, Liberal, Democr�tica")) {
					System.out.println("Resposta correta!\n");
					acertou = true;
					cont++;
				} else {
					System.out.println("Resposta incorreta!\n");
					chances2--;
				}
				break;
			default:
				System.out.println("Escolha inv�lida!\n");
			}
		} while (!acertou && chances2 > 0);
		
		if(chances2 == 0) {
			System.out.println("Vo�� n�o Conseguiu Acertar essa quest�o!");
			System.out.println("Vamos para proxima quest�o.\n");
		}
		
        int chances3 = 3;
		acertou = false;
		List alternativas3 = new ArrayList();
		alternativas3.add("Peter Ferdinand Drucker"); 
		alternativas3.add("Neymar Junior");
		alternativas3.add("Lionel Andr�s Messi");
		alternativas3.add("Cristiano Ronaldo");
		alternativas3.add("Ronaldinho Ga�cho");
		
		do {
			Collections.shuffle(alternativas3);
			System.out.println("Quem � o pai da administra��o moderna?");
			System.out.println("a) " + alternativas3.get(0));
			System.out.println("b) " + alternativas3.get(1));
			System.out.println("c) " + alternativas3.get(2));
			System.out.println("d) " + alternativas3.get(3));
			System.out.println("e) " + alternativas3.get(4));
			System.out.print("Escolha uma alternativa: ");
			String resposta = scan.next();
			switch (resposta) {
			case "a":
			case "A":
				if (alternativas3.get(0).equals("Peter Ferdinand Drucker")) {
					System.out.println("Resposta correta!\n");
					acertou = true;
					cont++;
				} else {
					System.out.println("Resposta incorreta!\n");
					chances3--;
				}
				break;
			case "b":
			case "B":
				if (alternativas3.get(1).equals("Peter Ferdinand Drucker")) {
					System.out.println("Resposta correta!\n");
					acertou = true;
					cont++;
				} else {
					System.out.println("Resposta incorreta!\n");
					chances3--;
				}
				break;
			case "c":
			case "C":
				if (alternativas3.get(2).equals("Peter Ferdinand Drucker")) {
					System.out.println("Resposta correta!\n");
					acertou = true;
					cont++;
				} else {
					System.out.println("Resposta incorreta!\n");
					chances3--;
				}
				break;
			case "d":
			case "D":
				if (alternativas3.get(3).equals("Peter Ferdinand Drucker")) {
					System.out.println("Resposta correta!\n");
					acertou = true;
					cont++;
				} else {
					System.out.println("Resposta incorreta!\n");
					chances3--;
				}
				break;
			case "e":
			case "E":
				if (alternativas3.get(4).equals("Peter Ferdinand Drucker")) {
					System.out.println("Resposta correta!\n");
					acertou = true;
					cont++;
				} else {
					System.out.println("Resposta incorreta!\n");
					chances3--;
				}
				break;
			default:
				System.out.println("Escolha inv�lida!\n");
			}
		} while (!acertou && chances3 > 0);
		
		if(chances3 == 0) {
			System.out.println("Vo�� n�o Conseguiu Acertar essa quest�o!");
			System.out.println("Vamos para proxima quest�o.\n");
		}
		
		int chances4 = 3;
		acertou = false;
		
		List alternativas4 = new ArrayList();
		alternativas4.add("� a fase de 1780, quando se inicia a Revolu��o Industrial"); 
		alternativas4.add("fase de aproximadamente 1888, quando se descobri Brazil");
		alternativas4.add("fase de 1500, onde inicializou uma guerra civil");
		alternativas4.add("fase de 1886, onde inicializou a produ��o de carros");
		alternativas4.add("fase do seculo XIX, quando surgiu a Administra��o");
		
		do {
			Collections.shuffle(alternativas4);
			System.out.println("Quando foi a fase artesanal e o que se inicializou na epoca?");
			System.out.println("a) " + alternativas4.get(0));
			System.out.println("b) " + alternativas4.get(1));
			System.out.println("c) " + alternativas4.get(2));
			System.out.println("d) " + alternativas4.get(3));
			System.out.println("e) " + alternativas4.get(4));
			System.out.print("Escolha uma alternativa: ");
			String resposta = scan.next();
			switch (resposta) {
			case "a":
			case "A":
				if (alternativas4.get(0).equals("� a fase de 1780, quando se inicia a Revolu��o Industrial")) {
					System.out.println("Resposta correta!\n");
					acertou = true;
					cont++;
				} else {
					System.out.println("Resposta incorreta!\n");
					chances4--;
				}
				break;
			case "b":
			case "B":
				if (alternativas4.get(1).equals("� a fase de 1780, quando se inicia a Revolu��o Industrial")) {
					System.out.println("Resposta correta!\n");
					acertou = true;
					cont++;
				} else {
					System.out.println("Resposta incorreta!\n");
					chances4--;
				}
				break;
			case "c":
			case "C":
				if (alternativas4.get(2).equals("� a fase de 1780, quando se inicia a Revolu��o Industrial")) {
					System.out.println("Resposta correta!\n");
					acertou = true;
					cont++;
				} else {
					System.out.println("Resposta incorreta!\n");
					chances4--;
				}
				break;
			case "d":
			case "D":
				if (alternativas4.get(3).equals("� a fase de 1780, quando se inicia a Revolu��o Industrial")) {
					System.out.println("Resposta correta!\n");
					acertou = true;
					cont++;
				} else {
					System.out.println("Resposta incorreta!\n");
					chances4--;
				}
				break;
			case "e":
			case "E":
				if (alternativas4.get(4).equals("� a fase de 1780, quando se inicia a Revolu��o Industrial")) {
					System.out.println("Resposta correta!\n");
					acertou = true;
					cont++;
				} else {
					System.out.println("Resposta incorreta!\n");
					chances4--;
				}
				break;
			default:
				System.out.println("Escolha inv�lida!\n");
			}
		} while (!acertou && chances4 > 0);
		
		if(chances4 == 0) {
			System.out.println("Vo�� n�o Conseguiu Acertar essa quest�o!");
			System.out.println("Vamos para proxima quest�o.\n");
		}
		
		int chances5 = 3;
		acertou = false;
		
		List alternativas5 = new ArrayList();
		alternativas5.add("S�culo XIX"); 
		alternativas5.add("S�culo XXI");
		alternativas5.add("S�culo IXX");
		alternativas5.add("S�culo XX");
		alternativas5.add("S�culo XV");
		
		do {
			Collections.shuffle(alternativas5);
			System.out.println("Quando surgiu a administra��o?");
			System.out.println("a) " + alternativas5.get(0));
			System.out.println("b) " + alternativas5.get(1));
			System.out.println("c) " + alternativas5.get(2));
			System.out.println("d) " + alternativas5.get(3));
			System.out.println("e) " + alternativas5.get(4));
			System.out.print("Escolha uma alternativa: ");
			String resposta = scan.next();
			switch (resposta) {
			case "a":
			case "A":
				if (alternativas5.get(0).equals("S�culo XIX")) {
					System.out.println("Resposta correta!\n");
					acertou = true;
					cont++;
				} else {
					System.out.println("Resposta incorreta!\n");
					chances5--;
				}
				break;
			case "b":
			case "B":
				if (alternativas5.get(1).equals("S�culo XIX")) {
					System.out.println("Resposta correta!\n");
					acertou = true;
					cont++;
				} else {
					System.out.println("Resposta incorreta!\n");
					chances5--;
				}
				break;
			case "c":
			case "C":
				if (alternativas5.get(2).equals("S�culo XIX")) {
					System.out.println("Resposta correta!\n");
					acertou = true;
					cont++;
				} else {
					System.out.println("Resposta incorreta!\n");
					chances5--;
				}
				break;
			case "d":
			case "D":
				if (alternativas5.get(3).equals("S�culo XIX")) {
					System.out.println("Resposta correta!\n");
					acertou = true;
					cont++;
				} else {
					System.out.println("Resposta incorreta!\n");
					chances5--;
				}
				break;
			case "e":
			case "E":
				if (alternativas5.get(4).equals("S�culo XIX")) {
					System.out.println("Resposta correta!\n");
					acertou = true;
					cont++;
				} else {
					System.out.println("Resposta incorreta!\n");
					chances5--;
				}
				break;
			default:
				System.out.println("Escolha inv�lida!\n");
			}
		} while (!acertou && chances5 > 0);
		
		if(chances5 == 0) {
			System.out.println("Vo�� n�o Conseguiu Acertar essa quest�o!");
		}
		
		if(cont == 5) {
			System.out.println("Parabens, Voc� Acertou Todas as Quest�es.\n");
		}else if(cont == 4) {
			System.out.println("Parabens, Voc� Acertou 4 Questoes e errou 1.\n");
		}else if(cont == 3) {
			System.out.println("Parabens, Voc� Acertou 3 Quest�es e errou 2.\n");
		}else if(cont == 2) {
			System.out.println("Voc� foi Ruim no Desafio, Acertou apenas 2 e errou 3.\n");
		}else if(cont == 1) {
			System.out.println("Voc� foi muito Ruim no Desafio, Acertou apesnas 1 e errou 4.\n");
		}else if(cont == 0) {
			System.out.println("Voc� foi Pessimo no Desafio, Errou todas Quest�es!\n");
		}

	}

	static void InstrucaoBatalha() {

	}

	static void InstrucaoDesafio() {
		
	}

	static void Historia() {

	}

	static void Menu() {
		int op;

		do {
			System.out.println("**=-=-=-=-MENU-=-=-=-=**");
			System.out.println("1 - Jogar Batalha");
			System.out.println("2 - Jogar Desafio QI");
			System.out.println("3 - Instru��es da Batalha");
			System.out.println("4 - Instru��es do Desafio QI");
			System.out.println("5 - Historia do Jogo");
			System.out.println("6 - Sair");
			op = scan.nextInt();

			while (op < 1 || op > 6) {
				System.out
						.println("Numero Digitado � menor ou maior que as opi��es Disponiveis!Tente Novamente." + "\n");
				System.out.println("*--MENU--*");
				System.out.println("1 - Jogar Batalha");
				System.out.println("2 - Jogar Desafio QI");
				System.out.println("3 - Instru��es da Batalha");
				System.out.println("4 - Instru��es do Desafio QI");
				System.out.println("5 - Historia do Jogo");
				System.out.println("6 - Sair");
				op = scan.nextInt();
			}

			switch (op) {
			case 1:
				JogarBatalha();
				break;
			case 2:
				DesafioQi();
				break;
			case 3:
				InstrucaoBatalha();
				break;
			case 4:
				InstrucaoDesafio();
				break;
			case 5:
				Historia();
			case 6:
				System.out.println("Voc� saiu do Jogo.");
			}
		} while (!(op == 6));

	}

	public static void main(String[] args) {
		Menu();
	}

}
