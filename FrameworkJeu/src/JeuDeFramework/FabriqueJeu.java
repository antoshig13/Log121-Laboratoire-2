package JeuDeFramework;

public abstract class FabriqueJeu {
	
	public FabriqueJeu() {
		fabriqueJeu();
	}
	 	
	///Methodes primitives
	public abstract void creerJoueurs();
	public abstract void creerDes();
	public abstract void creerJeu();
	
	///Methode template
	public void fabriqueJeu() {
		creerJoueurs();
		creerDes();
		creerJeu();	
	}
}
