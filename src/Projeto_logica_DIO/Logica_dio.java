package Projeto_logica_DIO;

/*
 Projeto DIO-Savegnago L�gica De Programa��o
O que dever ser utilizado :
-Vari�veis
-Operadores
-La�os De Repeti��o
-Estrutura De Decis�es
     Objetivo:
Criar uma vari�vel para armazenar o nome e a quantidade de experi�ncia(XP) de um her�i,
depois utilize uma estrutura de decis�o para apresentar alguma das mensagens abaixo :
Se XP for menor do que 1.000      = Ferro
Se XP for entre 1.001 e 2.000     = Bronze
Se XP for entre 2.001 e 6.000     = Prata
Se XP for entre 6.001 e 7.000     = Ouro
Se XP for entre 7.001 e 8.000     = Platina
Se XP for entre 8.001 e 9.000     = Ascendente
Se XP for entre 9.001 e 10.000    = Imortal 
Se XP for maior ou igual a 10.001 = Radiante
## Sa�da
Ao final deve exibir a seguinte mensagem :
"O her�i de nome"**{Nome}** est� no n�vel de **{n�vel}**
@author Paulo Fernando
 */

public class Logica_dio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nome = "Shieldguy";
		int multi;
		int nivel = 0;

		multi = (int) (Math.random() * 12);

		for (int i = 1; i <= multi; i++) {
			nivel = nivel + 1;
		}
		nivel = nivel * 1000;
		if (nivel <= 1000) {
			System.out.println("O her�i de nome " + nome + " est� no n�vel de Ferro");
		} else if (nivel >= 1001 && nivel <= 2000) {
			System.out.println("O her�i de nome " + nome + " est� no n�vel de Bronze");
		} else if (nivel >= 2001 && nivel <= 6000) {
			System.out.println("O her�i de nome " + nome + " est� no n�vel de Prata");
		} else if (nivel >= 6001 && nivel <= 7000) {
			System.out.println("O her�i de nome " + nome + " est� no n�vel de Ouro");
		} else if (nivel >= 7001 && nivel <= 8000) {
			System.out.println("O her�i de nome " + nome + " est� no n�vel de Platina");
		} else if (nivel >= 8001 && nivel <= 9000) {
			System.out.println("O her�i de nome " + nome + " est� no n�vel de Ascendente");
		} else if (nivel >= 9001 && nivel <= 10000) {
			System.out.println("O her�i de nome " + nome + " est� no n�vel de Imortal");
		} else {
			System.out.println("O her�i de nome " + nome + " est� no n�vel de Radiante");
		}
	}
}
