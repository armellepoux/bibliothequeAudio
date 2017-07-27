package fr.lteconsulting;

import java.util.List;

import fr.lteconsulting.dao.DisqueDAO;
import fr.lteconsulting.modele.Disque;

public class ApplicationTestDisques {
	public static void main(String[] args) {
		DisqueDAO dao = new DisqueDAO();

		chercherEtAfficherDisqueById(dao, "pptt");
		chercherEtAfficherDisqueById(dao, "ppttdddd");
		afficherTousLesDisques(dao);
		// ajouterDisques(dao, "grfs", "bien");
		// afficherTousLesDisques(dao);
		// modifierDisques(dao, "grfs", "pas bien");
		// afficherTousLesDisques(dao);
		//effacerDisque(dao, "gfjd");
		//afficherTousLesDisques(dao);
		chercherEtAfficherDisqueByName(dao, "BIen");
		chercherEtAfficherDisqueByName(dao, "e");
	}

	private static void chercherEtAfficherDisqueById(DisqueDAO dao, String id) {
		Disque disque = dao.findById(id);
		if (disque != null) {
			System.out.println("Le disque " + id + " a été trouvé :");
			disque.afficher();
		} else {
			System.out.println("Le disque " + id + " n'existe pas");
		}
	}
	
	private static void chercherEtAfficherDisqueByName(DisqueDAO dao, String nom) {
		List<Disque> disque = dao.findByName(nom);
		if (disque != null) {
			System.out.println("Le disque a été trouvé : " + disque);
			disque.toString();
		} else {
			System.out.println("Le disque " + nom + " n'existe pas");
		}
	}
	

	private static void afficherTousLesDisques(DisqueDAO dao) {
		List<Disque> disques = dao.findAll();
		if (disques != null) {
			System.out.println("Les disques sont : " + disques.toString());
		} else {
			System.out.println("Aucun disque");
		}
	}

	private static void ajouterDisques(DisqueDAO dao, String id, String nom) {
		Disque disque = new Disque(id, nom);
		Disque d = dao.add(disque);
		if (disque != null) {
			System.out.println("Le disque ajouté est: " + d.toString());
		}
	}

	private static void modifierDisques(DisqueDAO dao, String id, String nom) {
		Disque disque = new Disque(id, nom);
		dao.update(disque);
		if (disque != null) {
			System.out.println("Le disque modifié est: " + disque.toString());
		}
	}

	private static void effacerDisque(DisqueDAO dao, String id) {
		dao.delete(id);
		if (id != null) {
			System.out.println("Le disque effacé est: " + id.toString());
		}
	}

}
