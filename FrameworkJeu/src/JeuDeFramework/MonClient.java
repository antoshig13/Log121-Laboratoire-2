package JeuDeFramework;

import JeuBuncoPlus.FabriqueJeuBunco;

public class MonClient {
	
	public static void main(String[] args) {
    	FabriqueJeuBunco f = new FabriqueJeuBunco();
    	//f.creerJeu();
    }
	
	public static void imprimer(Iterable unIterable)
	{
		/*Iterator i = unIterable.creerIterateur();
		while (i.hasNext()) {
			System.out.println(i.next().toString());
		}*/
	}
}
