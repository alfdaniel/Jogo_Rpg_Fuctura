package DedicaJavaBD.DedicaJavaBD;

import java.util.List;
import java.util.Scanner;

import dao.RPGGeralDAO;
import dao.RPGGeralDAOImpl;
import entidade.Arma;
import entidade.Armadura;
import entidade.Classe;
import entidade.Personagem;
import entidade.Raca;

/**
 * Hello world!
 *
 */
public class JogoTesteBanco {

	public static void main(String[] args) {
		
		RPGGeralDAO geralDAO = new RPGGeralDAOImpl();
		
		List<Arma> listaArma = geralDAO.listar(new Arma());
		List<Armadura> listaArmadura = geralDAO.listar(new Armadura());
		List<Raca> listaRaca = geralDAO.listar(new Raca());
		List<Classe> listaClasse = geralDAO.listar(new Classe());
		
		Scanner scOpc = new Scanner(System.in);
		Scanner scTexto = new Scanner(System.in);
		
		top();
	
		System.out.println("Bem vindo ao Mundo Dos Mortos");
		System.out.println("Olá, éhhhh...\nVocê pode se identifique-se, removendo o capus por favor.");
		
		int opcRaca;
		
		System.out.println("\n#Escolha sua Raça:");
		for (int i = 0; i < listaRaca.size(); i++) {
			Raca raca = listaRaca.get(i);
			System.out.println(i + " - " + raca.getNome());
		}
		
		opcRaca = scOpc.nextInt();

		//Raca excolhida pelo usuario
		Raca raca = listaRaca.get(opcRaca);

		System.out.println("===============================");
		System.out.println(raca.getNome());
		System.out.println("===============================");


		switch (raca.getNome()) {
		case ("HUMANO"):
			System.out.println("\nO que um HUMANO faz nesta areas contamidade!");
			break;
		case ("ELFO"):
			System.out.println("\nOlha um ELFO, faz tempo que não vejo um!");
			break;
		case ("DEMI HUMANO"):
			System.out.println("\nComo vocês DEMI HUMANO são assustadores!");
			break;

		default:
			System.out.println("\nComo vocês " + raca.getNome() + " não deveriam andar por aqui !");
			break;
		}
		

		int opcClasse;
		
		System.out.println("\n#Escolha sua Classe: ");
		for (int i = 0; i < listaClasse.size(); i++) {
			Classe classe = listaClasse.get(i);
			System.out.println(i + " - " + classe.getNome());
		}
		
		opcClasse = scOpc.nextInt();

		//Raca excolhida pelo usuario
		Classe classe = listaClasse.get(opcClasse);

		System.out.println("===============================");
		System.out.println(classe.getNome());
		System.out.println("===============================");
		
		switch (classe.getNome()) {
		case ("LUTADOR"):
			System.out.println("\nBelas espadas Senhor(a) "+classe.getNome()+", elas eram usada\npor grandes LUTADORES antes da contaminação.");
			break;
		case ("MERCENÁRIO"):
			System.out.println("\nDesculpe Senhor(a) "+classe.getNome()+" Não reconheci você!");
			break;
		case ("ATIRADOR"):
			System.out.println("\nEsta sua Arma e muito Atiga Senhor(a)"+classe.getNome());
			break;
		default:
			System.out.println("\nClasses dessa "+classe.getNome()+" não são muito vistas!");
			break;
		}
		
		//Aqui inicia o cadastro do personagem
		Personagem personagem = new Personagem();
		personagem.setRaca(raca);
		personagem.setClasse(classe);
		personagem.setArma(listaArma.get(0));
		personagem.setArmadura(listaArmadura.get(0));
		
		System.out.print("Opa! descula meus modos.\nQual seu nome? ");
		personagem.setNome(scTexto.nextLine());
		
		//Preencher atributos do personagem
		personagem.setAgilidade(personagem.getRaca().getAgilidade());
		personagem.setAtaque(personagem.getArma().getAtaque());
		personagem.setDefesa(personagem.getArmadura().getDefesa());
		personagem.setVida(100);
		personagem.setMoeda(100);
		
		personagem = (Personagem)geralDAO.salvar(personagem);
		
		System.out.println("===============================");
//		System.out.println(geralDAO.salvar(personagem));
		System.out.println(personagem.getNome() + " - " + personagem.getId());		
		System.out.println("===============================");
		
		System.out.println(" Agora conheço você " + personagem.getNome() + ", pode seguir sua jornada...");
		
	}
//Funções
	public static void linha() {
		for (int i = 0; i < 73; i++) {
			System.out.print("=");
		}
		System.out.println("");
	}
	
	public static void top() {
		linha();
		for (int i = 0; i < 60; i++) {
			if (i == 0) {
				System.out.print("|");
			} else if (i == 30) {
				System.out.print(" RPG DE TEXTO ");
			} else if (i == 59) {
				System.out.print("|\n");
			} else {
				System.out.print("*");
			}
		}
		linha();
	}

}
