package DedicaJavaBD.DedicaJavaBD;

import java.util.List;

import dao.RPGGeralDAO;
import dao.RPGGeralDAOImpl;
import entidade.Fase;
import entidade.Missao;

public class TesteMissao {

	public static void main(String[] args) {
		RPGGeralDAO geralDAO = new RPGGeralDAOImpl();
		
		List<Missao> listaMissao = geralDAO.listar(new Missao());
		
		for (Missao missao : listaMissao) {
			for (Fase fase : missao.getListaFases()) {
				System.out.println(fase.getId() + " - "+ fase.getHistoria());
			}
		}

	}

}
