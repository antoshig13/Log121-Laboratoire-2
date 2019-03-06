package JeuDeFramework;


public interface IStrategie {

	//public void calculPoint();

	public void calculPoint(int tourCourant, CollectionDe listeDes, Joueur j);

	public boolean estTourCourantTerminer();
}
