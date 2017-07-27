package fr.lteconsulting;

import fr.lteconsulting.dao.ChansonDAO;
import fr.lteconsulting.modele.Chanson;

public class ApplicationTestChansons {
	
	public static void main(String[] args) {
		ChansonDAO dao = new ChansonDAO();

		chercherEtAfficherChansonById(dao, 1);
		chercherEtAfficherChansonById(dao, 2);
	
	}

	private static void chercherEtAfficherChansonById(ChansonDAO dao, int id) {
		Chanson chanson = dao.findByIdChanson(id);
		if (chanson != null) {
			System.out.println("Le disque " + id + " a été trouvé :");
			chanson.afficher();
		} else {
			System.out.println("Le disque " + id + " n'existe pas");
		}
	}
	
	

}

