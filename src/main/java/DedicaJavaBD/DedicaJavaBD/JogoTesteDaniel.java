package DedicaJavaBD.DedicaJavaBD;

import java.util.List;
import java.util.Scanner;

import criarBuscarObj.BuscarObj;
import criarBuscarObj.CriarObj;
import dao.RPGGeralDAO;
import dao.RPGGeralDAOImpl;
import entidade.Arma;
import entidade.Armadura;
import entidade.Classe;
import entidade.Personagem;
import entidade.Raca;
import fase.FaseReconhecimento;

public class JogoTesteDaniel {

	public static void main(String[] args) {

//		Scanner scannerTexto = new Scanner(System.in);
//		Scanner scannerInt = new Scanner(System.in);
//		Scanner scannerClasse = new Scanner(System.in);
//
//		RPGGeralDAO geralDao = new RPGGeralDAOImpl();
//
//		List<Arma> listArma = geralDao.listar(new Arma());
//		List<Armadura> listArmadura = geralDao.listar(new Armadura());
//		List<Raca> listRaca = geralDao.listar(new Raca());
//		List<Classe> listClasse = geralDao.listar(new Classe());
//		List<Personagem> listaPersonagem = geralDao.listar(new Personagem());

		CriarObj criarPersonagens = new CriarObj();
		BuscarObj buscarPersonagem = new BuscarObj();
		FaseReconhecimento faseReconhecimento = new FaseReconhecimento();


//		criarPersonagens.criarPersonagemCompleto();

//		for (int i = 0; i < listaPersonagem.size(); i++) {
//			Personagem personagem = listaPersonagem.get(i);
//			System.out.println(i + " - " + personagem.getNome());
//		}
//		System.out.println("Escolha seu persongem: ");
//		int opcPersonagem = scannerInt.nextInt();
//		Personagem personagem = listaPersonagem.get(opcPersonagem);
//		System.out.println(personagem.getNome());
//		

		// buscarPersonagem.escolherPersonagem();

		// bloco para criação de personagens
//		System.out.println("Quantos personagens o Mestre deseja criar? " );
//		int qtdpersonagens = scannerInt.nextInt();
//		for (int i = 0; i < qtdpersonagens; i++) {
//		criarPersonagens.criarPersonagemSimples();
//		}

//		for (Personagem pers : listaPersonagem) {
//			System.out.println(pers.getNome());	
//		}		
		
		System.out.println("CRIE UM PESONAGEM PAR INICIAR SUA JORNADA");
		criarPersonagens.criarPersonagemSimples();
		faseReconhecimento.inicioFaseReconhecimento();

		System.out.println("FIm");
	}

}
