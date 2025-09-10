package Projeto_logica_DIO;

/*
Projeto DIO-Savegnago L�gica De Programa��o
     Terceiro Desafio: 
**O que pode ser utilizado**
- Vari�veis
- Operadores
- La�os de repeti��o
- Estruturas de decis�es
- Fun��es
- Classes e Objetos
   ## Objetivo:
Crie uma classe generica que represente um her�i de uma aventura e que possua as seguintes propriedades:
- nome
- idade
- tipo (ex: guerreiro, mago, monge, ninja )
al�m disso, deve ter um m�todo chamado atacar que deve atender os seguientes requisitos:
- exibir a mensagem: "o {tipo} atacou usando {ataque}")
- aonde o {tipo} deve ser concatenando o tipo que est� na propriedade da classe
- e no {ataque} deve seguir uma descri��o diferente conforme o tipo, seguindo a tabela abaixo:
	se mago -> no ataque exibir (usou magia)
	se guerreiro -> no ataque exibir (usou espada)
	se monge -> no ataque exibir (usou artes marciais)
	se ninja -> no ataque exibir (usou shuriken)
 			## Sa�da
Ao final deve se exibir uma mensagem:
- "o {tipo} atacou usando {ataque}"
  ex: mago atacou usando magia
  guerreiro atacou usando espada
@author Paulo Fernando
*/

import java.util.Scanner;

public class JogoJogar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Criando vari�veis
		String resposta;
		String escolha;
		Scanner teclado = new Scanner(System.in);
		// Usando um la�o de repeti��o
		do {
			System.out.print(
					"Escolha o her�i  digitando :   \n A para o Mago\n B para o Guerreiro\n C para o Monge\n D para o Ninja\n");
			escolha = teclado.next();
			escolha = escolha.toUpperCase();
			// Utilizando a estrutura condicional switch case e estanciando a classe
			switch (escolha) {
			case "A":
				Heroi h1 = new Heroi();
				h1.nome = "Mago";
				h1.idade = 100;
				h1.atacar_caracteristica = "magia";

				System.out.println("Heroi � " + h1.nome + ", idade dele � " + h1.idade + " anos" + " ele atacou usando "
						+ h1.atacar_caracteristica);
				break;
			case "B":
				Heroi h2 = new Heroi();
				h2.nome = "Guerreiro";
				h2.idade = 75;
				h2.atacar_caracteristica = "espada";

				System.out.println("Heroi � o " + h2.nome + ", idade dele � " + h2.idade + " anos"
						+ " ele atacou usando " + h2.atacar_caracteristica);
				break;
			case "C":
				Heroi h3 = new Heroi();
				h3.nome = "Monge";
				h3.idade = 120;
				h3.atacar_caracteristica = "artes marciais";

				System.out.println("Heroi � o " + h3.nome + ", idade dele � " + h3.idade + " anos"
						+ " ele atacou usando " + h3.atacar_caracteristica);
				break;
			case "D":
				Heroi h4 = new Heroi();
				h4.nome = "Ninja";
				h4.idade = 30;
				h4.atacar_caracteristica = "shuriken";

				System.out.println("Heroi � o " + h4.nome + ", idade dele � " + h4.idade + " anos"
						+ " ele atacou usando " + h4.atacar_caracteristica);
				break;
			default:
				System.out.println("Her�i inexistente.");
				break;

			}
			System.out.println("\nDeseja contina se sim digite S se n�o digite N");
			resposta = teclado.next();
			resposta = resposta.toUpperCase();
		} while (resposta.equals("S"));
		teclado.close();
	}

	// Criando a classe e os atributos ou objetos
	static class Heroi {
		String nome;
		int idade;
		String atacar_caracteristica;

		// Construtor padr�o
		Heroi() {

		}
	}
}
