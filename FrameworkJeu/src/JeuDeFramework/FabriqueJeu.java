package JeuDeFramework;

public abstract class FabriqueJeu {
	
	protected int nombreDeTourTotal;
	protected int tourCourant;
	
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
		creerJeu();	
	}

}
