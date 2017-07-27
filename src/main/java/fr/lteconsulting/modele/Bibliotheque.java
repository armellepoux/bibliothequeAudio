package fr.lteconsulting.modele;

import java.util.List;

import fr.lteconsulting.dao.DisqueDAO;

public class Bibliotheque
{
	DisqueDAO disqueDao=new DisqueDAO();

	public void ajouterDisque( Disque disque )
	{
		disqueDao.add(disque);
	}

	public List<Disque> getDisques()
	{
		return disqueDao.findAll();
	}

	public Disque rechercherDisqueParCodeBarre( String codeBarre )
	{
		return disqueDao.findById(codeBarre);
	}

	public List<Disque> rechercherDisqueParNom( String recherche )
	{
		return disqueDao.findByName(recherche);
	}

/*	public List<Disque> rechercherDisqueParNom( List<String> termes )
	{
		List<Disque> resultat = new ArrayList<>();

		for( Disque disque : disques.values() )
		{
			boolean estValide = true;
			for( String terme : termes )
			{
				if( !disque.getNom().toLowerCase().contains( terme.toLowerCase() ) )
				{
					estValide = false;
					break;
				}
			}

			if( estValide )
				resultat.add( disque );
		}

		return resultat;
	}*/

	public void afficher()
	{
		List<Disque> disques = disqueDao.findAll();
		System.out.println( "BIBLIOTHEQUE avec " + disques.size() + " disques" );
		for(Disque disque:disques){
			disque.afficher();
		}
		
	}
}
