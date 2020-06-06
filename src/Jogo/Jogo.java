package Jogo;

import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class Jogo {

	static Scanner scan = new Scanner(System.in);

	static int AtaqueUsuario(int soco, int chute, int especiais) {
		int ataque;
		System.out.println("*--Escolha seu Ataque--*");
		System.out.println("1 - Soco ");
		System.out.println("2 - Chute ");
		System.out.println("3 - Especial Kamehameha ");
		ataque = scan.nextInt();
		return ataque;
	}

	static int AtaqueCpu() {
		Random gerador = new Random();
		return gerador.nextInt(3) + 1;
	}

	static void HP(int hpUsuario, int hpCpu, int contagemEspeciais) {
		System.out.println("=======================");
		System.out.println("- HP Goku: " + hpUsuario);
		System.out.println("- HP Oponente: " + hpCpu);
		System.out.println("- Especiais: " + contagemEspeciais);
		System.out.println("=======================");
	}

	static int VerificarEspeciais(int especiais) {
		int n = 0;
		if (especiais < 1) {
			System.out.println("GOKU n�o tem mais energia para atacar com o Especial!");
			n = 0;
		}

		return n;
	}

	static int Combate() {
		int hpUsuario = 300;
		int hpCpu;
		int soco = 7;
		int chute = 5;
		int especiais = 20;
		int ataque;
		int i = 1;
		int resposta;
		int continuar;

		System.out.println("Oi, eu sou o Goku! Preciso da sua ajuda para deter o Frezza, antes que ele pegue todas as esferas do drag�o do planeta Namekusei.");
		System.out.println("Ele deseja algo diab�lico com esse poder, n�o podemos deixar que esse poder caia em suas m�os!");
		System.out.println("Kuririm, Gohan e Bulma chegaram antes de mim, ser� que eles est�o bem?");
		System.out.println("n�o vejo a hora de mostrar todo meu treinamento, sera que existem inimigos fortes la?");
		System.out.println("Sera que kuririm, Gohan e Bulma est�o bem?");
		System.out.println("1 - Para Continuar");
		resposta = scan.nextInt();
		
		while (resposta > 1 || resposta < 1) {
			System.out.println("Valor Invalido!");
			System.out.println("Digite 1 para conitinua!");
			resposta = scan.nextInt();
		}

			if (resposta == 1) {
				System.out.println("Goku logo que chega no planeta sente o ki de kuririn e gohan e parte com todo sua velocidade para ajuda-los ");
				System.out.println("Depois de ajudar seus companheiros, Rikum uns dos memebro das for�as especias Gyuniu vendo que seus inimigos est�o se recuperando,");
				System.out.println("Come�a a se auto explodir, Goku parte pra cima e o confronta");
				System.out.println("1 - Para Batalhar");
				continuar = scan.nextInt();
				
				while (continuar > 1 || continuar < 1) {
					System.out.println("Valor Invalido!");
					System.out.println("Digite 1 para conitinua!");
					continuar = scan.nextInt();
				}

					hpCpu = 20;
					System.out.println("=-=-=-=-=-=-=-=-=-=");
					System.out.println("      Rikum     ");
					System.out.println("=-=-=-=-=-=-=-=-=-=\n");

					while (hpUsuario > 0 && hpCpu > 0) {
						HP(hpUsuario, hpCpu, especiais);
						ataque = AtaqueUsuario(soco, chute, especiais);

						if (ataque == 1) {
							System.out.println("Goku Atacou com um Soco.");
							hpCpu -= 7;
							soco--;
						} else if (ataque == 2) {
							System.out.println("Goku Atacou com um Chute.");
							hpCpu -= 5;
							chute--;
						} else if (ataque == 3 && especiais > 0) {
							System.out.println("Goku Atacou com um Kamehameha.");
							hpCpu -= 20;
							especiais--;
						} else if (ataque == 3 && especiais < 1) {
							System.out.println("Goku n�o tem mais especiais.");
						} else {
							System.out.println("Op��o Invalida!");
						}

						if (hpCpu > 0) {
							ataque = AtaqueCpu();
							switch (ataque) {
							case 1:
								System.out.println("Rikum atacou com um Soco.");
								hpUsuario -= 2 + (int) (i / 5);
								break;
							case 2:
								System.out.println("Rikum atacou com um Chute.");
								hpUsuario -= 3 + (int) (i / 5);
								break;
							case 3:
								System.out.println("Rikum atacou com um Especial");
								hpUsuario -= 4 + (int) (i / 10);
								break;
							}

						} else {
							System.out.println("Rikum Derrotado\n");
						}
					}
			}
			if (hpUsuario > 0) {
				hpUsuario += 5;
				if (hpUsuario > 300) {
					hpUsuario = 300;
				}
				if (i % 6 == 0) {
					especiais++;
					if (especiais > 5) {
						especiais = 5;
					}
				}
			}

			i++;
		

		while (hpUsuario > 0) {

			System.out.println("Depois que Goku derrota Rikum, Yuz um dos seus companheiros das for�as especias Gyuniu");
			System.out.println("Comovido pela raiva, parte sem ao menos pensar para cima de Goku");
			System.out.println("Ser� que Yuz perdeu a sanidade?");
			System.out.println("1 - Para Batalhar");
			continuar = scan.nextInt();
			
			while (continuar > 1 || continuar < 1) {
				System.out.println("Valor Invalido!");
				System.out.println("Digite 1 para conitinua!");
				continuar = scan.nextInt();
			}

			if (continuar == 1) {
				hpCpu = 32;
				System.out.println("=-=-=-=-=-=-=-=-=-=");
				System.out.println("    Yuz    ");
				System.out.println("=-=-=-=-=-=-=-=-=-=\n");

				while (hpUsuario > 0 && hpCpu > 0) {
					HP(hpUsuario, hpCpu, especiais);
					ataque = AtaqueUsuario(soco, chute, especiais);
					if (ataque == 1) {
						System.out.println("Goku Atacou com um Soco.");
						hpCpu -= 7;
						soco--;
					} else if (ataque == 2) {
						System.out.println("Goku Atacou com um Chute.");
						hpCpu -= 5;
						chute--;
					} else if (ataque == 3 && especiais > 0) {
						System.out.println("Goku Atacou com um Kamehameha.");
						hpCpu -= 20;
						especiais--;
					} else if (ataque == 3 && especiais < 1) {
						System.out.println("Goku n�o tem mais especiais.");
					} else {
						System.out.println("Op��o Invalida!");
					}
					if (hpCpu > 0) {
						ataque = AtaqueCpu();
						switch (ataque) {
						case 1:
							System.out.println(" Yuz Atacou com um Soco.");
							hpUsuario -= 2 + (int) (i / 5);
							break;
						case 2:
							System.out.println(" Yuz Atacou com um Chute.");
							hpUsuario -= 3 + (int) (i / 5);
							break;
						case 3:
							System.out.println(" Yuz Atacou com um Especial");
							hpUsuario -= 4 + (int) (i / 10);
							break;
						default:
							System.out.println("Op��o Invalida.");
							break;
						}

					} else {
						System.out.println("Yuz Derrotado\n");
					}
				}
			}
			if (hpUsuario > 0) {
				hpUsuario += 5;
				if (hpUsuario > 300) {
					hpUsuario = 300;
				}
				if (i % 6 == 0) {
					especiais++;
					if (especiais > 5) {
						especiais = 5;
					}
				}

			}

			i++;
		}
	     while (hpUsuario > 0) {

			System.out.println("Boter das for�as especias vendo isso, recua rapidamente(Boter � um dos seres mais rapidos do universo)\n");
			System.out.println("-- Boter -- O que � aquele cara? como ele pode derrotar nos da a for�a gyuniu fomos escolhidos a dedo pelo senhor frezza");
			System.out.println("-- Goku  -- Estava perguntando de mim?");
			System.out.println("-- Boter -- Como voce ...");
			System.out.println("Boter espantado parte para cima de Goku");
			System.out.println("1 - Para Batalhar");
			continuar = scan.nextInt();
			
			while (continuar > 1 || continuar < 1) {
				System.out.println("Valor Invalido!");
				System.out.println("Digite 1 para conitinua!");
				continuar = scan.nextInt();
			}

			if (continuar == 1) {

				hpCpu = 37;
				System.out.println("=-=-=-=-=-=-=-=-=-=");
				System.out.println("    Boter    ");
				System.out.println("=-=-=-=-=-=-=-=-=-=\n");

				while (hpUsuario > 0 && hpCpu > 0) {
					HP(hpUsuario, hpCpu, especiais);
					ataque = AtaqueUsuario(soco, chute, especiais);
					if (ataque == 1) {
						System.out.println("Goku Atacou com um Soco.");
						hpCpu -= 7;
						soco--;
					} else if (ataque == 2) {
						System.out.println("Goku Atacou com um Chute.");
						hpCpu -= 5;
						chute--;
					} else if (ataque == 3 && especiais > 0) {
						System.out.println("Goku Atacou com um Kamehameha.");
						hpCpu -= 20;
						especiais--;
					} else if (ataque == 3 && especiais < 1) {
						System.out.println("Goku n�o tem mais especiais.");
					} else {
						System.out.println("Op��o Invalida!");
					}
					if (hpCpu > 0) {
						ataque = AtaqueCpu();
						switch (ataque) {
						case 1:
							System.out.println(" Boter Atacou com um Soco.");
							hpUsuario -= 2 + (int) (i / 5);
							break;
						case 2:
							System.out.println(" Boter Atacou com um Chute.");
							hpUsuario -= 3 + (int) (i / 5);
							break;
						case 3:
							System.out.println(" Boter Atacou com um Especial");
							hpUsuario -= 4 + (int) (i / 10);
							break;
						}

					} else {
						System.out.println("Boter Derrotado\n");
					}
				}
			}
			if (hpUsuario > 0) {
				hpUsuario += 5;
				if (hpUsuario > 300) {
					hpUsuario = 300;
				}
				if (i % 6 == 0) {
					especiais++;
					if (especiais > 5) {
						especiais = 5;
					}
				}
			}

			i++;
		}
		while (hpUsuario > 0) {

			System.out.println("Apos Goku derrotar Boter ele volta para o campo de batalha\n");
			System.out.println("-- Gurdo -- Onde esta Boter? O que voce fez com ele seu miseravel?");
			System.out.println("-- Goku  -- Ah,Aquele rapinho? Apenas oque ele merecia por machucar meus amigos ");
			System.out.println("-- Gurdo -- Ora seu... eu vou acabar com voce!!! ");
			System.out.println("1 - Para Batalhar");
			continuar = scan.nextInt();
			
			while (continuar > 1 || continuar < 1) {
				System.out.println("Valor Invalido!");
				System.out.println("Digite 1 para conitinua!");
				continuar = scan.nextInt();
			}

			if (continuar == 1) {

				hpCpu = 34;
				System.out.println("=-=-=-=-=-=-=-=-=-=");
				System.out.println("    Gurdo    ");
				System.out.println("=-=-=-=-=-=-=-=-=-=\n");

				while (hpUsuario > 0 && hpCpu > 0) {
					HP(hpUsuario, hpCpu, especiais);
					ataque = AtaqueUsuario(soco, chute, especiais);
					if (ataque == 1) {
						System.out.println("Goku Atacou com um Soco.");
						hpCpu -= 7;
						soco--;
					} else if (ataque == 2) {
						System.out.println("Goku Atacou com um Chute.");
						hpCpu -= 5;
						chute--;
					} else if (ataque == 3 && especiais > 0) {
						System.out.println("Goku Atacou com um Kamehameha.");
						hpCpu -= 20;
						especiais--;
					} else if (ataque == 3 && especiais < 1) {
						System.out.println("Goku n�o tem mais especiais.");
					} else {
						System.out.println("Op��o Invalida!");
					}
					if (hpCpu > 0) {
						ataque = AtaqueCpu();
						switch (ataque) {
						case 1:
							System.out.println(" Gurdo Atacou com um Soco.");
							hpUsuario -= 4 + (int) (i / 5);
							break;
						case 2:
							System.out.println(" Gurdo Atacou com um Chute.");
							hpUsuario -= 5 + (int) (i / 5);
							break;
						case 3:
							System.out.println(" Gurdo Atacou com um Especial");
							hpUsuario -= 6 + (int) (i / 10);
							break;
						}

					} else {
						System.out.println("Gurdo Derrotado\n");
					}
				}
			}
			if (hpUsuario > 0) {
				hpUsuario += 5;
				if (hpUsuario > 300) {
					hpUsuario = 300;
				}
				if (i % 6 == 0) {
					especiais++;
					if (especiais > 5) {
						especiais = 5;
					}
				}

			}

			i++;
		}
		while (hpUsuario > 0) {

			System.out.println("-- Capit�o Ginyu  -- Vejo que voce lidou bem com meus auxiliados,porem agora que o verdadeiro desafio come�ou!!");
			System.out.println("-- Goku  -- Espero que voce n seja uma decep��o como os outros");
			System.out.println("-- Capit�o Ginyu -- Pode apostar que n�o ");
			System.out.println("1 - Para Batalhar");
			continuar = scan.nextInt();
			
			while (continuar > 1 || continuar < 1) {
				System.out.println("Valor Invalido!");
				System.out.println("Digite 1 para conitinua!");
				continuar = scan.nextInt();
			}

			hpCpu = 45;
			System.out.println("=-=-=-=-=-=-=-=-=-=");
			System.out.println("    Capit�o Ginyu    ");
			System.out.println("=-=-=-=-=-=-=-=-=-=\n");

			while (hpUsuario > 0 && hpCpu > 0) {
				HP(hpUsuario, hpCpu, especiais);
				ataque = AtaqueUsuario(soco, chute, especiais);
				if (ataque == 1) {
					System.out.println("Goku Atacou com um Soco.");
					hpCpu -= 7;
					soco--;
				} else if (ataque == 2) {
					System.out.println("Goku Atacou com um Chute.");
					hpCpu -= 5;
					chute--;
				} else if (ataque == 3 && especiais > 0) {
					System.out.println("Goku Atacou com um Kamehameha.");
					hpCpu -= 20;
					especiais--;
				} else if (ataque == 3 && especiais < 1) {
					System.out.println("Goku n�o tem mais especiais.");
				} else {
					System.out.println("Op��o Invalida!");
				}
				if (hpCpu > 0) {
					ataque = AtaqueCpu();
					switch (ataque) {
					case 1:
						System.out.println(" Capit�o Gyuniu Atacou com um Soco.");
						hpUsuario -= 5 + (int) (i / 5);
						break;
					case 2:
						System.out.println(" Capit�o Gyuniu Atacou com um Chute.");
						hpUsuario -= 6 + (int) (i / 5);
						break;
					case 3:
						System.out.println(" Capit�o Gyuniu Atacou com um Especial");
						hpUsuario -= 7 + (int) (i / 10);
						break;
					}

				} else {
					System.out.println("Antes de Capit�o Ginyu ser derrotado ele usou sua carta na manga,");
					System.out.println("seu verdadeiro poder � trasferir sua mente a outro corpo sendo assim trocando de corpo ");
					System.out.println("logo ele usa esse poder contra Goku, so que um sapo ao inves de Goku foi alvejado");
					System.out.println("Enviando sua conciencia para sempre dentro de um sapo, e vendo seu corpo sair saltitando e coaxando como um sapo\n");
				}
			}
			if (hpUsuario > 0) {
				hpUsuario += 5;
				if (hpUsuario > 300) {
					hpUsuario = 300;
				}
				if (i % 6 == 0) {
					especiais++;
					if (especiais > 5) {
						especiais = 5;
					}
				}

			}

			i++;
		}
		while (hpUsuario > 0) {

			hpCpu = 50;
			System.out.println("=-=-=-=-=-=-=-=-=-=");
			System.out.println("    Dodoria    ");
			System.out.println("=-=-=-=-=-=-=-=-=-=\n");

			while (hpUsuario > 0 && hpCpu > 0) {
				HP(hpUsuario, hpCpu, especiais);
				ataque = AtaqueUsuario(soco, chute, especiais);
				if (ataque == 1) {
					System.out.println("Goku Atacou com um Soco.");
					hpCpu -= 7;
					soco--;
				} else if (ataque == 2) {
					System.out.println("Goku Atacou com um Chute.");
					hpCpu -= 5;
					chute--;
				} else if (ataque == 3 && especiais > 0) {
					System.out.println("Goku Atacou com um Kamehameha.");
					hpCpu -= 20;
					especiais--;
				} else if (ataque == 3 && especiais < 1) {
					System.out.println("Goku n�o tem mais especiais.");
				} else {
					System.out.println("Op��o Invalida!");
				}
				if (hpCpu > 0) {
					ataque = AtaqueCpu();
					switch (ataque) {
					case 1:
						System.out.println(" Dodoria Atacou com um Soco.");
						hpUsuario -= 7 + (int) (i / 5);
						break;
					case 2:
						System.out.println(" Dodoria Atacou com um Chute.");
						hpUsuario -= 8 + (int) (i / 5);
						break;
					case 3:
						System.out.println(" Dodoria Atacou com um Especial");
						hpUsuario -= 9 + (int) (i / 10);
						break;
					}

				} else {
					System.out.println("Dodoria Derrotado");
				}
			}
			if (hpUsuario > 0) {
				hpUsuario += 5;
				if (hpUsuario > 300) {
					hpUsuario = 300;
				}
				if (i % 6 == 0) {
					especiais++;
					if (especiais > 5) {
						especiais = 5;
					}
				}

			}

			i++;
		}
		while (hpUsuario > 0) {

			hpCpu = 55;
			System.out.println("=-=-=-=-=-=-=-=-=-=");
			System.out.println("    Zarbon     ");
			System.out.println("=-=-=-=-=-=-=-=-=-=\n");

			while (hpUsuario > 0 && hpCpu > 0) {
				HP(hpUsuario, hpCpu, especiais);
				ataque = AtaqueUsuario(soco, chute, especiais);
				if (ataque == 1) {
					System.out.println("Goku Atacou com um Soco.");
					hpCpu -= 7;
					soco--;
				} else if (ataque == 2) {
					System.out.println("Goku Atacou com um Chute.");
					hpCpu -= 5;
					chute--;
				} else if (ataque == 3 && especiais > 0) {
					System.out.println("Goku Atacou com um Kamehameha.");
					hpCpu -= 20;
					especiais--;
				} else if (ataque == 3 && especiais < 1) {
					System.out.println("Goku n�o tem mais especiais.");
				} else {
					System.out.println("Op��o Invalida!");
				}
				if (hpCpu > 0) {
					ataque = AtaqueCpu();
					switch (ataque) {
					case 1:
						System.out.println("Zarbon Atacou com um Soco.");
						hpUsuario -= 9 + (int) (i / 5);
						break;
					case 2:
						System.out.println("Zarbon Atacou com um Chute.");
						hpUsuario -= 10 + (int) (i / 5);
						break;
					case 3:
						System.out.println("Zarbon Atacou com um Especial");
						hpUsuario -= 11 + (int) (i / 10);
						break;
					}

				} else {
					System.out.println("Dodoria Derrotado");
				}
			}
			if (hpUsuario > 0) {
				hpUsuario += 5;
				if (hpUsuario > 300) {
					hpUsuario = 300;
				}
				if (i % 6 == 0) {
					especiais++;
					if (especiais > 5) {
						especiais = 5;
					}
				}

			}

			i++;
		}
		while (hpUsuario > 0) {

			hpCpu = 70;
			System.out.println("=-=-=-=-=-=-=-=-=-=");
			System.out.println("   Frezza    ");
			System.out.println("=-=-=-=-=-=-=-=-=-=\n");

			while (hpUsuario > 0 && hpCpu > 0) {
				HP(hpUsuario, hpCpu, especiais);
				ataque = AtaqueUsuario(soco, chute, especiais);
				if (ataque == 1) {
					System.out.println("Goku Atacou com um Soco.");
					hpCpu -= 7;
					soco--;
				} else if (ataque == 2) {
					System.out.println("Goku Atacou com um Chute.");
					hpCpu -= 5;
					chute--;
				} else if (ataque == 3 && especiais > 0) {
					System.out.println("Goku Atacou com um Kamehameha.");
					hpCpu -= 20;
					especiais--;
				} else if (ataque == 3 && especiais < 1) {
					System.out.println("Goku n�o tem mais especiais.");
				} else {
					System.out.println("Op��o Invalida!");
				}
				if (hpCpu > 0) {
					ataque = AtaqueCpu();
					switch (ataque) {
					case 1:
						System.out.println(" Frezza Atacou com um Soco.");
						hpUsuario -= 13 + (int) (i / 5);
						break;
					case 2:
						System.out.println(" Frezza Atacou com um Chute.");
						hpUsuario -= 14 + (int) (i / 5);
						break;
					case 3:
						System.out.println(" Frezza Atacou com um Especial");
						hpUsuario -= 15 + (int) (i / 10);
						break;
					}

				} else {
					System.out.println("Frezza Derrotado");
				}

				i++;

			}
		}
		  
		return i;
	}

	static void JogarBatalha() {
		int cont = 1;

		while (cont == 1) {

			int inimigos = Combate();
			
			if(inimigos == 8) {
				System.out.println("Parabens, Voc� Derrotou todos os Adversarios!");
			}else {
				System.out.println("Game Over, Voc� Perdeu o Jogo!");
			}

			System.out.println("Fim do Jogo. Deseja Jogar novamente?");
			System.out.println("(1) Sim");
			System.out.println("(2) N�o");
			cont = scan.nextInt();
			while(cont > 2 || cont < 1) {
				System.out.println("Valor Invalido!Digite 1 ou 2");
				cont = scan.nextInt();
			}
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
		System.out.println("Responda as 5 quest�es a seguir para testa o seu QI.\n Para cada pergunta Voc� tera 3 chances:"+ "\n");

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

		if (chances == 0) {
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

		if (chances2 == 0) {
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

		if (chances3 == 0) {
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

		if (chances4 == 0) {
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

		if (chances5 == 0) {
			System.out.println("Vo�� n�o Conseguiu Acertar essa quest�o!");
		}

		if (cont == 5) {
			System.out.println("Parabens, Voc� Acertou Todas as Quest�es.\n");
		} else if (cont == 4) {
			System.out.println("Parabens, Voc� Acertou 4 Questoes e errou 1.\n");
		} else if (cont == 3) {
			System.out.println("Parabens, Voc� Acertou 3 Quest�es e errou 2.\n");
		} else if (cont == 2) {
			System.out.println("Voc� foi Ruim no Desafio, Acertou apenas 2 e errou 3.\n");
		} else if (cont == 1) {
			System.out.println("Voc� foi muito Ruim no Desafio, Acertou apesnas 1 e errou 4.\n");
		} else if (cont == 0) {
			System.out.println("Voc� foi Pessimo no Desafio, Errou todas Quest�es!\n");
		}

	}

	static void InstrucaoBatalha() {

	}

	static void InstrucaoDesafio() {
		System.out.println("             *=-=-=-=-=-=-= INSTRU��ES DO DESAFIO QI =-=-=-=-=-=-=");
		System.out.println(" O Desafio de Qi � um teste para testa seu Conhecimento na �rea de Administra��o.");
		System.out.println(" Voc� tera que responder 5 quest�es, e para cada uma delas voc� tera 3 chances. ");
		System.out.println(" Voc� tera que escolher uma alternativa entre A, B, C, D, E. O teste terminara quando");
		System.out.println(" voc� acerta todas quest�es ou quando suas chances terminarem. O resultado sera mostrado");
		System.out.println(" assim que o teste terminar.\n");
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
			System.out.println("5 - Sair");
			op = scan.nextInt();

			while (op < 1 || op > 6) {
				System.out.println("Numero Digitado � menor ou maior que as op��es Disponiveis!Tente Novamente." + "\n");
				System.out.println("***=-=-=-=-MENU-=-=-=-=**");
				System.out.println("1 - Jogar Batalha");
				System.out.println("2 - Jogar Desafio QI");
				System.out.println("3 - Instru��es da Batalha");
				System.out.println("4 - Instru��es do Desafio QI");
				System.out.println("5 - Sair");
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
				System.out.println("Voc� saiu do Jogo.");
			}
		} while (!(op == 5));

	}

	public static void main(String[] args) {
		Menu();
	}

}
