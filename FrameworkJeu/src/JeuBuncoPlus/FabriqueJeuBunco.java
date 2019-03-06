package JeuBuncoPlus;


import java.util.Collections;

import JeuDeFramework.*;

public class FabriqueJeuBunco extends FabriqueJeu {




	@Override		
	public void creerJoueurs() {
		listeJoueurs = new CollectionJoueur(4);
		///On cree des joueurs pour une partie de Bunco+///
		Joueur joueur1 = new Joueur("Anthony");
		Joueur joueur2 = new Joueur("Moussa");
		Joueur joueur3 = new Joueur("Xaddim");
		Joueur joueur4 = new Joueur("Gabriel");
		listeJoueurs.ajouterJoueur(joueur1);
		listeJoueurs.ajouterJoueur(joueur2);
		listeJoueurs.ajouterJoueur(joueur3);
		listeJoueurs.ajouterJoueur(joueur4);

	}

	@Override
	public void creerDes() {
		listeDes = new CollectionDe(3);
		///On cree les dÃ©s avec 6 faces initialisés à -1///
		De de1 = new De(6);	
		De de2 = new De(6);	
		De de3 = new De(6);	

		listeDes.ajouterDe(de1);
		listeDes.ajouterDe(de2);
		listeDes.ajouterDe(de3);
	}

	@Override
	public void creerJeu() {
		initialisation();

		while (tourCourant < nombreDeTourTotal) { //Logique du jeu ICI
			changerDeJoueur(); // Iteration cyclique dans la collection de Joueur.
			while(!strategieCourante.estTourCourantTerminer()) {
				lancerDes();
				calculerScore();

				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			if(seraitUnNouveauTour) {
				seraitUnNouveauTour = false;
				System.out.println("Changement de tour");
				tourCourant++;
			}
		}

	}
	/**
	 * Initialisation de l'environnement de gestion des tours
	 */
	private void initialisation() {
		nombreDeTourTotal = 2;
		tourCourant = 1;
		iterJoueur =  listeJoueurs.creerIterateur();
	}
	/**
	 * Itération à travers une CollectionDe et appel lanceDe sur chacun de ceux-ci.
	 */
	private void lancerDes(){
		//System.out.println(listeDes.size());
		for (Iterator i = listeDes.creerIterateur(); i.hasNext(); ) {
			De de = (De) i.next();
			de.lanceDe(); // On roule chaque dés
			System.out.println(de.toString());
		}

	}

	@Override
	public void attacherStrategie() {
		this.strategieCourante = new StrategieBunco();
	}

}
