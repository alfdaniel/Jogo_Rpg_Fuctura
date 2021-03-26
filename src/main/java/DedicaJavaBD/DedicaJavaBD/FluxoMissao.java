package DedicaJavaBD.DedicaJavaBD;

import java.util.List;
import java.util.Scanner;

import dao.RPGGeralDAO;
import dao.RPGGeralDAOImpl;
import entidade.Fase;
import entidade.Missao;
import entidade.Personagem;

public class FluxoMissao {

	public static void main(String[] args) {
		
		RPGGeralDAO geralDAO = new RPGGeralDAOImpl();
		Scanner sTexto = new Scanner(System.in);
		Scanner sNumero = new Scanner(System.in);
		
		List<Personagem> listaPersonagem = geralDAO.listar(new Personagem());
		List<Missao> listaMissao = geralDAO.listar(new Missao());
		
		Personagem personagem = null;
		Missao missao = null;
		
		System.out.println("------------------------------------------");
		System.out.println("-------------Vamos a missão---------------");
		System.out.println("------------------------------------------");
		
		System.out.println("Escolha um personagem:");

		for (Personagem pers : listaPersonagem) {
			System.out.println(pers.getId() + " - " + pers.getNome());
		}
		
		int idPersonagem = sNumero.nextInt();
		
		personagem = retornarPersonagemId(idPersonagem, listaPersonagem);
		
		System.out.println("==============================================");
		System.out.println("----- Escolha uma missão ==-------------------");
		System.out.println("==============================================");
		
		for (Missao mis : listaMissao) {
			System.out.println(mis.getId() +" - "+ mis.getNome());
		}
		
		int idMissao = sNumero.nextInt();
		
		missao = retornaMissaoId(idMissao, listaMissao);
		
		System.out.println("==============================================");
		System.out.println("-----A fase inicial se inicia      -----------");
		System.out.println("==============================================");
		
		Fase primeiraFase = retornarPrimeiraFase(missao.getListaFases());
		
		System.out.println(primeiraFase.getHistoria());
		System.out.println("----------- op1 --------");
		System.out.println(primeiraFase.getHistResltadoOp1());
		System.out.println("----------- op2 --------");
		System.out.println(primeiraFase.getHistResutadoOp2());
		
		
		
		

	}
	
	public static Personagem retornarPersonagemId(int id, List<Personagem> listaPersonagem) {
		for (Personagem pers : listaPersonagem) {
			if(pers.getId() == id) {
				return pers;
			}
		}
		return null;
	}
	
	public static Missao retornaMissaoId(int id, List<Missao> listaMissao) {
		for (Missao mis : listaMissao) {
			if(mis.getId() == id) {
				return mis;
			}
		}
		return null;
	}
	
	public static Fase retornarPrimeiraFase(List<Fase> listaFase) {
		for (Fase fase : listaFase) {
			if (fase.getOrdem() == 1) {
				return fase;
			}
		}
		return null;
	}

}
