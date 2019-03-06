package JeuDeFramework;

public abstract class FabriqueJeu {

	protected int nombreDeTourTotal;
	protected int tourCourant;
	protected Joueur joueurCourant;
	protected IStrategie strategieCourante;
	protected CollectionJoueur listeJoueurs;
	protected CollectionDe listeDes;
	protected Iterator iterJoueur;
	protected boolean seraitUnNouveauTour = false;

	public FabriqueJeu() {
		fabriqueJeu();
	}

	///Methodes primitives
	public abstract void creerJoueurs();
	public abstract void creerDes();
	public abstract void creerJeu();
	public abstract void attacherStrategie();

	///Methode template
	public void fabriqueJeu() {
		creerJoueurs();
		creerDes();
		attacherStrategie();
		creerJeu();	//Gestion des tours
	}

	/**
	 * Iteration cyclique à travers une collection de joueurs. Un reset correspond à un nouveau tour.
	 */
	public void changerDeJoueur() {
		if(iterJoueur.hasNext()) {
			joueurCourant = (Joueur) iterJoueur.next();
		}else {
			iterJoueur = listeJoueurs.creerIterateur(); //RESET
			joueurCourant = (Joueur) iterJoueur.next();
			seraitUnNouveauTour = true;
		}
		System.out.println("Joueur Actuel : " + joueurCourant.toString());
	}

	public void calculerScore() {
		strategieCourante.calculPoint(tourCourant, listeDes, joueurCourant);
	}

	public void setJoueurCourant(Joueur j) {
		this.joueurCourant = j;
	}
	public Joueur getJoueurCourant() {
		return joueurCourant;
	}

}
