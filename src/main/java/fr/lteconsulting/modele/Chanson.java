package fr.lteconsulting.modele;

public class Chanson
{
	private String nom;
	private int dureeEnSecondes;
	private String disqueId;
	private String idChanson;

	public Chanson()
	{
	}


	public Chanson(String nom,int dureeEnSecondes )
	{
		this.nom = nom;
		this.dureeEnSecondes = dureeEnSecondes;
	}

	public String getNom()
	{
		return nom;
	}

	public void setNom( String nom )
	{
		this.nom = nom;
	}

	public int getDureeEnSecondes()
	{
		return dureeEnSecondes;
	}

	public void setDureeEnSecondes( int dureeEnSecondes )
	{
		this.dureeEnSecondes = dureeEnSecondes;
	}
	
	public String getDisqueId() {
		return disqueId;
	}
	
	public void setDisqueId(String disqueId) {
		this.disqueId = disqueId;
	}
	
	public String getIdChanson() {
		return idChanson;
	}
	
	public void setIdChanson(String idChanson) {
		this.idChanson = idChanson;
	}

	public void afficher()
	{
		System.out.println(nom + " (" + dureeEnSecondes + " sec.)" );
	}
}
