package JeuBuncoPlus;

import JeuDeFramework.CollectionDe;
import JeuDeFramework.De;
import JeuDeFramework.IStrategie;
import JeuDeFramework.Iterator;
import JeuDeFramework.Joueur;

public class StrategieBunco implements IStrategie{

	private boolean tourFini = false;

	/**
	 * Calcul les points selon l'états des dés pour un joueur donné. 
	 */
	@Override
	public void calculPoint(int tourCourant, CollectionDe listeDes, Joueur j) {
		
		Iterator i = listeDes.creerIterateur();
		int d1 = ((De) i.next()).getFacesObtenu();
		int d2 = ((De) i.next()).getFacesObtenu();
		int d3 = ((De) i.next()).getFacesObtenu();
		if(d1 == d2 && d1 == d3 && d1 != tourCourant) { // 5pts
			j.ajouterScore(5);
			System.out.println("5 POINTS");
		}else if(d1 == d2 && d1 == d3 && d1 == tourCourant) { // 21 pts bunco
			j.ajouterScore(21);
			System.out.println("21 POINTS");
			tourFini = true;
		}else {
			int temp = 0;
			if(d1 == tourCourant) {
				temp += 1;
			}
			if(d2 == tourCourant) {
				temp += 1;
			}
			if(d3 == tourCourant) {
				temp += 1;
			}
			if(temp >0) {
				j.ajouterScore(temp); // Devrait toujours être égal à 1 ou 2. 
				System.out.println(temp + " POINTS");
			}else {
				System.out.println("#0# POINTS");
				tourFini = true;
			}

		}

	}

	/**
	 * Boolean déterminant s'il faut changer de joueur et qui s'auto reset à false.
	 */
	@Override
	public boolean estTourCourantTerminer() {
		if (tourFini) {
			tourFini = false;
			return true;
		}
		return false;
	}



}
