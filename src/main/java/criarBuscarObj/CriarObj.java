//Esse é uma classe para criação de personagens e todas suas outra habiidades.

package criarBuscarObj;

import java.util.List;
import java.util.Scanner;

import dao.RPGGeralDAO;
import dao.RPGGeralDAOImpl;
import entidade.Arma;
import entidade.Armadura;
import entidade.Classe;
import entidade.Personagem;
import entidade.Raca;

public class CriarObj {

	RPGGeralDAO geralDao = new RPGGeralDAOImpl();

	List<Arma> listArma = geralDao.listar(new Arma());
	List<Armadura> listArmadura = geralDao.listar(new Armadura());
	List<Raca> listRaca = geralDao.listar(new Raca());
	List<Classe> listClasse = geralDao.listar(new Classe());
	List<Personagem> listaPersonagem = geralDao.listar(new Personagem());

	Scanner scNome = new Scanner(System.in);
	Scanner scTexto = new Scanner(System.in);
	Scanner scInt = new Scanner(System.in);

	Raca raca = new Raca();
	Armadura armadura = new Armadura();
	Classe classe = new Classe();
	Arma arma = new Arma();
	Personagem personagem = new Personagem();

	/*
	 * Função para criar arma, manda o usuário iserir os valore dos atritudos da
	 * arma e depois chama a funcão --inseriArma -- para fazer o set no banco.
	 */
	public void criarArma() {
		System.out.print("Qual o nome da arma? ");
		String nome = scNome.nextLine();
		System.out.print("Qual o valor de ataque da arma? ");
		int ataque = scInt.nextInt();
		System.out.print("Qual o material da arma? ");
		String material = scTexto.nextLine();
		inserirArma(nome, ataque, material);

	}

	// Função para fazer o set no bando dos atributos passado na função -- criaArma
	// --
	public void inserirArma(String nome, int ataque, String material) {
		arma.setNome(nome);
		arma.setAtaque(ataque);
		arma.setMaterial(material);
		geralDao.salvar(arma);

	}

	/*
	 * Função para criar armadura, manda o usuário iserir os valore dos atritudos da
	 * arma e depois chama a funcão --inseriArmadura -- para fazer o set no banco.
	 */
	public void criarArmadura() {
		System.out.print("Qual o nome da armadura? ");
		String nome = scNome.nextLine();
		System.out.print("Qual o valor de ataque da armadura? ");
		int defesa = scInt.nextInt();
		System.out.print("Qual o material da armadura? ");
		String material = scTexto.nextLine();
		inserirArmadura(nome, defesa, material);

	}

	// Função para fazer o set dos atributos no banco passado na função --
	// criaArmadura --
	public void inserirArmadura(String nome, int defesa, String material) {
		armadura.setNome(nome);
		armadura.setDefesa(defesa);
		armadura.setMaterial(material);
		geralDao.salvar(armadura);
	}

	/*
	 * Função para criar classe de personagens, manda o usuário iserir os valore dos
	 * atritudos da classe e depois chama a funcão --inseriClasse -- para fazer o
	 * set no banco.
	 */
	public void criarClasse() {
		System.out.print("Qual o nome da Classe? ");
		String nome = scNome.nextLine();
		System.out.print("Qual o valor de vida da classe? ");
		int vida = scInt.nextInt();
		System.out.print("Qual o valor de ataque da classe? ");
		int ataque = scInt.nextInt();
		System.out.print("Qual o valor de defesa da classe? ");
		int defesa = scInt.nextInt();
		System.out.print("Qual o valor de agilidade da classe? ");
		int agilidade = scInt.nextInt();
		inserirClasse(nome, vida, ataque, defesa, agilidade);
	}

//Função para fazer o set dos atributos no banco passado na função -- criaClasse --
	public void inserirClasse(String nome, int vida, int ataque, int defesa, int agilidade) {
		classe.setNome(nome);
		classe.setVida(vida);
		classe.setAtaque(ataque);
		classe.setDefesa(defesa);
		classe.setAgilidade(agilidade);
		geralDao.salvar(classe);
	}

	/*
	 * Função para criar classe de personagens, manda o usuário iserir os valore dos
	 * atritudos da classe e depois chama a funcão --inseriClasse -- para fazer o
	 * set no banco.
	 */
	public void criarRaca() {
		System.out.print("Qual o nome da Raça? ");
		String nome = scNome.nextLine();
		System.out.print("Qual o valor de vida da Raça? ");
		int vida = scInt.nextInt();
		System.out.print("Qual o valor de ataque da Raça? ");
		int ataque = scInt.nextInt();
		System.out.print("Qual o valor de defesa da Raça? ");
		int defesa = scInt.nextInt();
		System.out.print("Qual o valor de agilidade da Raça? ");
		int agilidade = scInt.nextInt();
		inserirRaca(nome, vida, ataque, defesa, agilidade);

	}

	// Função para fazer o set dos atributos no banco passado na função -- criaRaca
	// --
	public void inserirRaca(String nome, int ataque, int defesa, int vida, int agilidade) {
		raca.setNome(nome);
		raca.setAtaque(ataque);
		raca.setDefesa(defesa);
		raca.setVida(vida);
		raca.setAgilidade(agilidade);
		geralDao.salvar(raca);
	}
//

	/*
	 * Função para criar personagens, manda o usuário iserir os valore dos atritudos
	 * da classe e depois chama a funcão --inseriPersonagem -- para fazer o set no
	 * banco.
	 */
	public void criarPersonagem() {
		System.out.print("Qual o nome da Personagem? ");
		String nome = scNome.nextLine();
		System.out.print("Qual o valor de vida da Personagem? ");
		int vida = scInt.nextInt();
		System.out.print("Qual o valor de ataque da Personagem? ");
		int ataque = scInt.nextInt();
		System.out.print("Qual o valor de defesa da Personagem? ");
		int defesa = scInt.nextInt();
		System.out.print("Qual o valor de agilidade da Personagem? ");
		int agilidade = scInt.nextInt();
//		inserirPersonagem(nome, vida, agilidade, ataque, defesa, moeda, raca, classe, arma, armadura);
	}

//	// Função para fazer o set dos atributos no banco passado na função --
//	// criarPersonagem --
//	public void inserirPersonagem(String nome, int vida, int agilidade, int ataque, int defesa, int moeda, Raca raca,
//			Classe classe, Arma arma, Armadura armadura) {
//		personagem.setNome(nome);
//		personagem.setVida(vida);
//		personagem.setAgilidade(agilidade);
//		personagem.setAtaque(ataque);
//		personagem.setDefesa(defesa);
//		personagem.setMoeda(moeda);
//		personagem.setRaca(raca);
//		personagem.setClasse(classe);
//		personagem.setArma(arma);
//		personagem.setArmadura(armadura);
//		geralDao.salvar(personagem);
//	}

	//Função para criar personagem com Nome e Raça
	public void criarPersonagemSimples() {
		System.out.print("Qual o nome do Personagem? ");
		String nome = scNome.nextLine();
		System.out.println("Qual a raça? ");
		for (int i = 0; i < listRaca.size(); i++) {
			Raca arma = listRaca.get(i);
			System.out.println(i + " - " + arma.getNome());
		}
		int opcRaca = scInt.nextInt();
		Raca raca = listRaca.get(opcRaca);
		inserirPesonagemSimples(nome, raca);
	}

	public void inserirPesonagemSimples(String nome, Raca raca) {
		personagem.setNome(nome);
		personagem.setRaca(raca);
		personagem = (Personagem)geralDao.salvar(personagem);
	}

	// Iserir personagem completo, com arma, armadura, classe e raca
	public void criarPersonagemCompleto() {
		System.out.print("Qual o nome do Personagem? ");
		String nome = scNome.nextLine();
		System.out.println("Qual a raça? ");
		for (int i = 0; i < listRaca.size(); i++) {
			Raca raca = listRaca.get(i);
			System.out.println(i + " - " + raca.getNome());
		}
		int opcRaca = scInt.nextInt();
		Raca raca = listRaca.get(opcRaca);

		System.out.println("Qual a Classe? ");
		for (int i = 0; i < listClasse.size(); i++) {
			Classe classe = listClasse.get(i);
			System.out.println(i + " - " + classe.getNome());
		}
		int opcClasse = scInt.nextInt();
		Classe classe = listClasse.get(opcClasse);

		System.out.println("Qual a tipo de arma? ");
		for (int i = 0; i < listArma.size(); i++) {
			Arma arma = listArma.get(i);
			System.out.println(i + " - " + arma.getNome());
		}
		int opcArma = scInt.nextInt();
		Arma arma = listArma.get(opcArma);
		
		System.out.println("Qual a tipo de Armadura? ");
		for (int i = 0; i < listArmadura.size(); i++) {
			Armadura armadura = listArmadura.get(i);
			System.out.println(i + " - " + armadura.getNome());
		}
		int opcArmadura = scInt.nextInt();
		Armadura armadura = listArmadura.get(opcArmadura);

		inserirPesonagemCompleto(nome, raca, arma, armadura, classe);

	}

	//função para setar os atributos classe passadas na função --criarPersonagemCompleto--
	public void inserirPesonagemCompleto(String nome, Raca raca, Arma arma, Armadura armadura, Classe classe) {
		personagem.setNome(nome);
		personagem.setRaca(raca);
		personagem.setArma(arma);
		personagem.setArmadura(armadura);
		personagem.setClasse(classe);
		geralDao.salvar(personagem);
	}

}
