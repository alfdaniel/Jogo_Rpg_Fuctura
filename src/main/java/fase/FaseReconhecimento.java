package fase;

import java.util.List;
import java.util.Scanner;

import javax.swing.text.StyledEditorKit.BoldAction;

import criarBuscarObj.BuscarObj;
import criarBuscarObj.CriarObj;
import dao.RPGGeralDAO;
import dao.RPGGeralDAOImpl;
import entidade.Arma;
import entidade.Armadura;
import entidade.Classe;
import entidade.Personagem;
import entidade.Raca;

public class FaseReconhecimento {

	Scanner scannerTexto = new Scanner(System.in);
	Scanner scannerInt = new Scanner(System.in);
	Scanner scannerClasse = new Scanner(System.in);

	RPGGeralDAO geralDao = new RPGGeralDAOImpl();

	List<Arma> listArma = geralDao.listar(new Arma());
	List<Armadura> listArmadura = geralDao.listar(new Armadura());
	List<Raca> listRaca = geralDao.listar(new Raca());
	List<Classe> listClasse = geralDao.listar(new Classe());
	List<Personagem> listaPersonagem = geralDao.listar(new Personagem());

	CriarObj criarPersonagens = new CriarObj();
	BuscarObj buscarPersonagem = new BuscarObj();

	public void inicioFaseReconhecimento() {
		// Apresentação da história

		linha();
		System.out.println("Segue a história...");

		linha();
		System.out.println("Selecione um personagem: ");
		buscarPersonagem.personagemInicial();
		int opcPersonagem = scannerInt.nextInt();
		Personagem personagem = listaPersonagem.get(opcPersonagem);
		Personagem meuPersonagem = personagem;

		linha();
		System.out.println(meuPersonagem.getNome() + " Vem tranquilo! Vem tranquilo!... ");
		linha();

		System.out.println("Chegou a hora! Passe pelo desafio e consiga sua primeira arma... ");
		linha();

		System.out.println("Responda certo e tenha a primeira arma: ");
		System.out.println("-------------------------------");

		Boolean desafio1 = false;
		while (desafio1 == false) {
			System.out.println("Qual a resposta para o Vida, o Universo e Tudo Mais?");
			System.out.println(" 42 ");
			System.out.println(" 3,14 ");
			System.out.println(" 8 infinito ");
			System.out.println(" Big Bang ");
			System.out.println("Digite sua resposta: ");
			String resp = scannerInt.nextLine();
			if (resp.equals("42")) {
				System.out.println("Você passou pelo primeiro desafio ");
				linha();
				System.out.println("Escolha sua arma: ");
				for (int i = 0; i < listArma.size(); i++) {
					Arma arma = listArma.get(i);
					System.out.println(i + " - " + arma.getNome());
				}
				int opcArma = scannerInt.nextInt();
				Arma arma = listArma.get(opcArma);
				System.out.println("Arma selecionada: " + arma.getNome());
				meuPersonagem.setArma(arma);
				geralDao.salvar(meuPersonagem);

				desafio1 = true;
			} else
				linha();
				System.out.println("Resposta errada");
		}
		linha();
		System.out.println("Você passou pelo primeiro desafio...");
	}

	public static void linha() {
		for (int i = 0; i < 73; i++) {
			System.out.print("=");
		}
		System.out.println("");
	}
}
