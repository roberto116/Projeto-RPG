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
			System.out.println("GOKU não tem mais energia para atacar com o Especial!");
			n = 0;
		}

		return n;
	}

	static int Combate() {
		int hpUsuario = 300;
		int hpCpu;
		int soco = 7;
		int chute = 5;
		int especiais = 5;
		int ataque;
		int i = 1;
		int resposta;
		int continuar;

		System.out.println("Oi, eu sou o Goku! Preciso da sua ajuda para deter o Frezza, antes que ele pegue todas as esferas do dragão do planeta Namekusei.");
		System.out.println("Ele deseja algo diabólico com esse poder, não podemos deixar que esse poder caia em suas mãos!");
		System.out.println("Kuririm, Gohan e Bulma chegaram antes de mim, será que eles estão bem?");
		System.out.println("não vejo a hora de mostrar todo meu treinamento, sera que existem inimigos fortes la?");
		System.out.println("Sera que kuririm, Gohan e Bulma estão bem?");
		System.out.println("1 - Para Continuar");
		resposta = scan.nextInt();
		
		while (resposta > 1 || resposta < 1) {
			System.out.println("Valor Invalido!");
			System.out.println("Digite 1 para conitinua!");
			resposta = scan.nextInt();
		}

			if (resposta == 1) {
				System.out.println("Goku logo que chega no planeta sente o ki de kuririn e gohan e parte com todo sua velocidade para ajuda-los ");
				System.out.println("Depois de ajudar seus companheiros, Rikum uns dos memebro das forças especias Gyuniu vendo que seus inimigos estão se recuperando,");
				System.out.println("Começa a se auto explodir, Goku parte pra cima e o confronta");
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
							System.out.println("Goku não tem mais especiais.");
						} else {
							System.out.println("Opção Invalida!");
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
		

		if (hpUsuario > 0) {

			System.out.println("Depois que Goku derrota Rikum, Yuz um dos seus companheiros das forças especias Gyuniu");
			System.out.println("Comovido pela raiva, parte sem ao menos pensar para cima de Goku");
			System.out.println("Será que Yuz perdeu a sanidade?");
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
						System.out.println("Goku não tem mais especiais.");
					} else {
						System.out.println("Opção Invalida!");
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
							System.out.println("Opção Invalida.");
							break;
						}

					} else {
						System.out.println("Yuz Derrotado\n");
						break;
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
	     if(hpUsuario > 0) {

			System.out.println("Boter das forças especias vendo isso, recua rapidamente(Boter é um dos seres mais rapidos do universo)\n");
			System.out.println("-- Boter -- O que é aquele cara? como ele pode derrotar nos da a força gyuniu fomos escolhidos a dedo pelo senhor frezza");
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
						System.out.println("Goku não tem mais especiais.");
					} else {
						System.out.println("Opção Invalida!");
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
		if (hpUsuario > 0) {

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
						System.out.println("Goku não tem mais especiais.");
					} else {
						System.out.println("Opção Invalida!");
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
		if (hpUsuario > 0) {

			System.out.println("-- Capitão Ginyu  -- Vejo que voce lidou bem com meus auxiliados,porem agora que o verdadeiro desafio começou!!");
			System.out.println("-- Goku  -- Espero que voce n seja uma decepção como os outros");
			System.out.println("-- Capitão Ginyu -- Pode apostar que não ");
			System.out.println("1 - Para Batalhar");
			continuar = scan.nextInt();
			
			while (continuar > 1 || continuar < 1) {
				System.out.println("Valor Invalido!");
				System.out.println("Digite 1 para conitinua!");
				continuar = scan.nextInt();
			}

			hpCpu = 45;
			System.out.println("=-=-=-=-=-=-=-=-=-=");
			System.out.println("    Capitão Ginyu    ");
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
					System.out.println("Goku não tem mais especiais.");
				} else {
					System.out.println("Opção Invalida!");
				}
				if (hpCpu > 0) {
					ataque = AtaqueCpu();
					switch (ataque) {
					case 1:
						System.out.println(" Capitão Gyuniu Atacou com um Soco.");
						hpUsuario -= 5 + (int) (i / 5);
						break;
					case 2:
						System.out.println(" Capitão Gyuniu Atacou com um Chute.");
						hpUsuario -= 6 + (int) (i / 5);
						break;
					case 3:
						System.out.println(" Capitão Gyuniu Atacou com um Especial");
						hpUsuario -= 7 + (int) (i / 10);
						break;
					}

				} else {
					System.out.println("Antes de Capitão Ginyu ser derrotado ele usou sua carta na manga,");
					System.out.println("seu verdadeiro poder é trasferir sua mente a outro corpo sendo assim trocando de corpo ");
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
		if (hpUsuario > 0) {
			
			 hpCpu = 50;
	            System.out.println("-- Goku  -- Ei, Kuririm onde está frezza?");
	            System.out.println("-- Kuririm  -- Ah 4 km ao norte");
	            System.out.println("-- Goku -- Certo,estou indo para lá, cuide de Gohan ");
	            System.out.println("-- Kuririm  -- Tome cuidado Goku, Frezza não é como esses caras");
	            System.out.println("-- Goku -- Eu sei ... não se preocupe logo estaremos em casa\n");
	            System.out.println("Goku a caminho de Frezza se depara com dois seres estramamente fortes");
	            System.out.println("-- Goku -- Quem são voces?");
	            System.out.println("-- Dodoria -- Eu sou Dodoria e esse é Zarbon, somos os mais fortesdo imperio de Frezza para chegar até ele tera que passar por nos");
	            System.out.println("-- Zarbon -- Não diga nossos nomes para esse verme Dodoria!!");
	            System.out.println("-- Dodoria -- Fique tranquilo ele não vivera para lembrar");
	            System.out.println("Goku velozmente a ataca Dodoria,Mas ele desvia");
	            System.out.println("-- Dodoria -- Então voce quer lutar comigo? Vamos lá, não interfira Zarbon ele é meu");
	            System.out.println("-- Zarbon -- ... ");

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
					System.out.println("Goku não tem mais especiais.");
				} else {
					System.out.println("Opção Invalida!");
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
					System.out.println("-- Dodoria -- Como voce é tão forte?... bom não importa voce não ganhara de Zarbon");
                    System.out.println("Dodoria Derrotado\n");
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
		if (hpUsuario > 0) {
			
			hpCpu = 55;
            System.out.println("-- Zarbon  -- Então voce derrotou Dodoria,não pensa que ira me vencer sou o braço direito "
                    + "de frezza e não tenho misericordia");
            System.out.println("-- Goku  -- Então voce é forte né? isso é o que nos vamos ver");

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
					System.out.println("Goku não tem mais especiais.");
				} else {
					System.out.println("Opção Invalida!");
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
					System.out.println("Um dragão gigantesco surge derepente, sera que Frezza conseguiou todas as esferas?");
                    System.out.println("-- Zarbon  -- Tarde de mais, voce pode até ter me derrotado, mas n podera ganhar de Frezza após realizar seu desejo");
                    System.out.println("Goku desesperadamente voa até onde Frezza está,sera que ele chegara a tempo?");
                    System.out.println("Zarbon Derrotado\n");
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
		if (hpUsuario > 0) {

			hpCpu = 70;

            System.out.println("Goku chega e ve Frezza gritando com o dragão do planeta Namekusei");
            System.out.println("-- Frezza  -- POR QUE VOCE NÃO REALIZA MEU DESEJO?");
            System.out.println("-- Goku  -- Voce tem que lhe dizer as falas certas antes de falar seu desejo");
            System.out.println("-- Frezza  -- Oque eu tenho que falar e quem é voce?");
            System.out.println("-- Goku  -- Meu nome é Goku e vim derrotar voce pelo bem do planeta e do universo");
            System.out.println("-- Frezza  -- Me derrotar? Não seja tolo, ME DIGA OQUE EU TENHO QUE DIZER SE NÃO EU TE MATO");
            System.out.println("-- Goku  -- Voce tera que me derrotar para descobrir");
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
					System.out.println("Goku não tem mais especiais.");
				} else {
					System.out.println("Opção Invalida!");
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
					System.out.println("Frezza Derrotado\n");
					System.out.println("-- Kuririm  -- Boa Goku voce conseguiu derrotalo");
                    System.out.println("Frezza faz kuririm flutuar e logo depois o explode");
                    System.out.println("-- Goku  -- kURIRIM, NÃOOOOOOOO!!");
                    System.out.println("-- Goku  -- EU NÃO VOU PERDOALOOOOOOO!!");
                    System.out.println("Raios começam a surgir em volta de Goku e seu cabelo começa a ficar loiro,sera que ele é lendario Super Sayajin?Não a duvidas que sim");
                    System.out.println("-- Frezza  -- Como voce... eu achava que isso era um mito,não é possivel,vo...vo...voce é um Super Sayajin!!!");
                    System.out.println("Frezza corre para sua nave e foge para longe do planeta,Deixando o planeta a salvo e Kuririm morto");
                    System.out.println("Como será que Goku reagira a isso?");
                    System.out.println("Continua...\n");
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
				System.out.println("Parabens, Você Derrotou todos os Adversarios!");
			}else {
				System.out.println("Game Over, Você Perdeu o Jogo!");
			}

			System.out.println("Fim do Jogo. Deseja Jogar novamente?");
			System.out.println("(1) Sim");
			System.out.println("(2) Não");
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
		alternativas.add("Processo cognitivo pelo qual se escolhe um plano de ação");
		alternativas.add("Processo de Piramide");
		alternativas.add("Processo Arbistral");
		alternativas.add("Processo Anabolico");
		alternativas.add("Processo Disciplinar");

		System.out.println("Disciplina: Fundamentos de Administração.");
		System.out.println("Responda as 5 questões a seguir para testa o seu QI.\n Para cada pergunta Você tera 3 chances:"+ "\n");

		do {
			Collections.shuffle(alternativas);
			System.out.println("Qual o processo de tomada de decisão?");
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
				if (alternativas.get(0).equals("Processo cognitivo pelo qual se escolhe um plano de ação")) {
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
				if (alternativas.get(1).equals("Processo cognitivo pelo qual se escolhe um plano de ação")) {
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
				if (alternativas.get(2).equals("Processo cognitivo pelo qual se escolhe um plano de ação")) {
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
				if (alternativas.get(3).equals("Processo cognitivo pelo qual se escolhe um plano de ação")) {
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
				if (alternativas.get(4).equals("Processo cognitivo pelo qual se escolhe um plano de ação")) {
					System.out.println("Resposta correta!\n");
					acertou = true;
					cont++;
				} else {
					System.out.println("Resposta incorreta!\n");
					chances--;
				}
				break;
			default:
				System.out.println("Escolha inválida!\n");
			}
		} while (!acertou && chances > 0);

		if (chances == 0) {
			System.out.println("Voçê não Conseguiu Acertar essa questão!");
			System.out.println("Vamos para proxima questão.\n");
		}

		int chances2 = 3;
		acertou = false;

		List alternativas2 = new ArrayList();
		alternativas2.add("Liderança Autocrática, Liberal, Democrática");
		alternativas2.add("Literal, Artistica, civil");
		alternativas2.add("Liderança Arrogante, diplomata, Caráter");
		alternativas2.add("Autocrática, Autentica, Assertiva");
		alternativas2.add("Liderança a Distancia, Aristocrática");

		do {
			Collections.shuffle(alternativas2);
			System.out.println("Quais os tipos de liderança na administração?");
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
				if (alternativas2.get(0).equals("Liderança Autocrática, Liberal, Democrática")) {
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
				if (alternativas2.get(1).equals("Liderança Autocrática, Liberal, Democrática")) {
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
				if (alternativas2.get(2).equals("Liderança Autocrática, Liberal, Democrática")) {
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
				if (alternativas2.get(3).equals("Liderança Autocrática, Liberal, Democrática")) {
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
				if (alternativas2.get(4).equals("Liderança Autocrática, Liberal, Democrática")) {
					System.out.println("Resposta correta!\n");
					acertou = true;
					cont++;
				} else {
					System.out.println("Resposta incorreta!\n");
					chances2--;
				}
				break;
			default:
				System.out.println("Escolha inválida!\n");
			}
		} while (!acertou && chances2 > 0);

		if (chances2 == 0) {
			System.out.println("Voçê não Conseguiu Acertar essa questão!");
			System.out.println("Vamos para proxima questão.\n");
		}

		int chances3 = 3;
		acertou = false;
		List alternativas3 = new ArrayList();
		alternativas3.add("Peter Ferdinand Drucker");
		alternativas3.add("Neymar Junior");
		alternativas3.add("Lionel Andrés Messi");
		alternativas3.add("Cristiano Ronaldo");
		alternativas3.add("Ronaldinho Gaúcho");

		do {
			Collections.shuffle(alternativas3);
			System.out.println("Quem é o pai da administração moderna?");
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
				System.out.println("Escolha inválida!\n");
			}
		} while (!acertou && chances3 > 0);

		if (chances3 == 0) {
			System.out.println("Voçê não Conseguiu Acertar essa questão!");
			System.out.println("Vamos para proxima questão.\n");
		}

		int chances4 = 3;
		acertou = false;

		List alternativas4 = new ArrayList();
		alternativas4.add("É a fase de 1780, quando se inicia a Revolução Industrial");
		alternativas4.add("fase de aproximadamente 1888, quando se descobri Brazil");
		alternativas4.add("fase de 1500, onde inicializou uma guerra civil");
		alternativas4.add("fase de 1886, onde inicializou a produção de carros");
		alternativas4.add("fase do seculo XIX, quando surgiu a Administração");

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
				if (alternativas4.get(0).equals("É a fase de 1780, quando se inicia a Revolução Industrial")) {
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
				if (alternativas4.get(1).equals("É a fase de 1780, quando se inicia a Revolução Industrial")) {
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
				if (alternativas4.get(2).equals("É a fase de 1780, quando se inicia a Revolução Industrial")) {
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
				if (alternativas4.get(3).equals("É a fase de 1780, quando se inicia a Revolução Industrial")) {
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
				if (alternativas4.get(4).equals("É a fase de 1780, quando se inicia a Revolução Industrial")) {
					System.out.println("Resposta correta!\n");
					acertou = true;
					cont++;
				} else {
					System.out.println("Resposta incorreta!\n");
					chances4--;
				}
				break;
			default:
				System.out.println("Escolha inválida!\n");
			}
		} while (!acertou && chances4 > 0);

		if (chances4 == 0) {
			System.out.println("Voçê não Conseguiu Acertar essa questão!");
			System.out.println("Vamos para proxima questão.\n");
		}

		int chances5 = 3;
		acertou = false;

		List alternativas5 = new ArrayList();
		alternativas5.add("Século XIX");
		alternativas5.add("Século XXI");
		alternativas5.add("Século IXX");
		alternativas5.add("Século XX");
		alternativas5.add("Século XV");

		do {
			Collections.shuffle(alternativas5);
			System.out.println("Quando surgiu a administração?");
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
				if (alternativas5.get(0).equals("Século XIX")) {
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
				if (alternativas5.get(1).equals("Século XIX")) {
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
				if (alternativas5.get(2).equals("Século XIX")) {
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
				if (alternativas5.get(3).equals("Século XIX")) {
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
				if (alternativas5.get(4).equals("Século XIX")) {
					System.out.println("Resposta correta!\n");
					acertou = true;
					cont++;
				} else {
					System.out.println("Resposta incorreta!\n");
					chances5--;
				}
				break;
			default:
				System.out.println("Escolha inválida!\n");
			}
		} while (!acertou && chances5 > 0);

		if (chances5 == 0) {
			System.out.println("Voçê não Conseguiu Acertar essa questão!");
		}

		if (cont == 5) {
			System.out.println("Parabens, Você Acertou Todas as Questões.\n");
		} else if (cont == 4) {
			System.out.println("Parabens, Você Acertou 4 Questoes e errou 1.\n");
		} else if (cont == 3) {
			System.out.println("Parabens, Você Acertou 3 Questões e errou 2.\n");
		} else if (cont == 2) {
			System.out.println("Você foi Ruim no Desafio, Acertou apenas 2 e errou 3.\n");
		} else if (cont == 1) {
			System.out.println("Você foi muito Ruim no Desafio, Acertou apesnas 1 e errou 4.\n");
		} else if (cont == 0) {
			System.out.println("Você foi Pessimo no Desafio, Errou todas Questões!\n");
		}

	}

	static void InstrucaoBatalha() {
		System.out.println("             *=-=-=-=-=-=-= INSTRUÇÕES DA BATALHA =-=-=-=-=-=-=");
        System.out.println(" Para jogar o modo batalha o usuario tera 3 alternativas de Ataque sendo elas soco,  ");
        System.out.println(" chute, e o especial Kamehameha. o usuario tera que digita entre 1, 2, 3 para atacar ");
        System.out.println(" com um golpe. o ataque especial se inicia com 5 e quando o usuario derrotar 6 oponentes");
        System.out.println(" sera adicionado mais 1 ataque especial. Mas enquanto o especial estiver em 0, o usuario");
        System.out.println(" não conseguira usar o especial e se ele tentar usar esse ataque mesmo assim perdera uma jogada.\n");
	}

	static void InstrucaoDesafio() {
		System.out.println("             *=-=-=-=-=-=-= INSTRUÇÕES DO DESAFIO QI =-=-=-=-=-=-=");
		System.out.println(" O Desafio de Qi é um teste para testa seu Conhecimento na área de Administração.");
		System.out.println(" Você tera que responder 5 questões, e para cada uma delas você tera 3 chances. ");
		System.out.println(" Você tera que escolher uma alternativa entre A, B, C, D, E. O teste terminara quando");
		System.out.println(" você acerta todas questões ou quando suas chances terminarem. O resultado sera mostrado");
		System.out.println(" assim que o teste terminar.\n");
	}
	
	static void Historia() {
		System.out.println("           *-=-=-=-=-= Historia =-=-=-=-=-*            ");
        System.out.println("Quase toda a Saga Freeza se passa no planeta Namekusei.");
        System.out.println("O enredo principal é a tão aguardada luta entre Goku e Freeza,");
        System.out.println("com Kuririn, Gohan, Piccolo, e Vegeta também participando.");
    }

	static void Menu() {
		int op;

		do {
			System.out.println("**=-=-=-=-MENU-=-=-=-=**");
			System.out.println("1 - Jogar Batalha");
			System.out.println("2 - Jogar Desafio QI");
			System.out.println("3 - Instruções da Batalha");
			System.out.println("4 - Instruções do Desafio QI");
			System.out.println("5 - Sair");
			op = scan.nextInt();

			while (op < 1 || op > 6) {
				System.out.println("Numero Digitado é menor ou maior que as opções Disponiveis!Tente Novamente." + "\n");
				System.out.println("***=-=-=-=-MENU-=-=-=-=**");
				System.out.println("1 - Jogar Batalha");
				System.out.println("2 - Jogar Desafio QI");
				System.out.println("3 - Instruções da Batalha");
				System.out.println("4 - Instruções do Desafio QI");
				System.out.println("5 - Historia");
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
				System.out.println("Você saiu do Jogo.");
			}
		} while (!(op == 6));

	}

	public static void main(String[] args) {
		Menu();
	}

}
