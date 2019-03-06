package JeuDeFramework;

public class Joueur {
	
	private String nom;
	private int score;
	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	/*
	 * Constructeur joueur
	 */
	public Joueur(String nom) {
		this.nom = nom;
	}
	
	/*
	 * Accesseur et mutateur
	 */
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
	public String toString(){
		return "Le Nom du Joueur:"+nom+"\n"+"Son Score est :"+score;
		
	}
	

}


