package JeuDeFramework;

public class Joueur implements Comparable<Joueur>{
	
	private String nom;
	private int score;
	
	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
	
	public void ajouterScore(int scoreAjouter) {
		this.score += scoreAjouter;
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

	@Override
	public int compareTo(Joueur joueur){  
		if(joueur==null)  throw new IllegalArgumentException();
		if(this.score==joueur.getScore())  
		      return 0;  
		   else if(this.score>joueur.getScore())  
		      return 1;  
		   else  
		      return -1;  
		}

	

}


