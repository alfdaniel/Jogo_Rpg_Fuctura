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
import sun.text.resources.ar.FormatData_ar_SY;

public class BuscarObj {

	Scanner scannerTexto = new Scanner(System.in);
	Scanner scannerInt = new Scanner(System.in);
	Scanner scannerClasse = new Scanner(System.in);

	RPGGeralDAO geralDao = new RPGGeralDAOImpl();

	List<Arma> listArma = geralDao.listar(new Arma());
	List<Armadura> listArmadura = geralDao.listar(new Armadura());
	List<Raca> listRaca = geralDao.listar(new Raca());
	List<Classe> listClasse = geralDao.listar(new Classe());
	List<Personagem> listaPersonagem = geralDao.listar(new Personagem());

	Scanner scNome = new Scanner(System.in);
	Scanner scTexto = new Scanner(System.in);
	Scanner scInt = new Scanner(System.in);

	public void personagemInicial() {
		for (int i = 0; i < listaPersonagem.size(); i++) {
			Personagem personagem = listaPersonagem.get(i);
			System.out.println(i + " - " + personagem.getNome());
		}
	}
		
	
	public void escolherPersonagem() {
		for (int i = 0; i < listaPersonagem.size(); i++) {
			Personagem personagem = listaPersonagem.get(i);
			System.out.println(i + " - " + personagem.getNome());
		}
		System.out.println("Escolha seu persongem: ");
		int opcPersonagem = scannerInt.nextInt();
		Personagem personagem = listaPersonagem.get(opcPersonagem);
		System.out.println(personagem.getNome() + " - " + personagem.getRaca().getNome() + " - " + personagem.getClasse().getNome()
				+ " - " + personagem.getArma().getNome() + " - " + personagem.getArmadura().getNome());
		System.out.println("Vida- " + personagem.getRaca().getVida() + ", Ataque- " + personagem.getRaca().getAtaque()
				+ ", Defesa- " + personagem.getRaca().getDefesa() + ", Agilidade- " + personagem.getRaca().getAgilidade());
		
	}

	
}
