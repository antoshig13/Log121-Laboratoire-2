package JeuBuncoPlus;

import JeuDeFramework.*;

public class FabriqueJeuBunco extends FabriqueJeu {
	
	protected CollectionJoueur listeJoueurs = new CollectionJoueur(4);
    protected CollectionDe listeDes = new CollectionDe(3);
    protected IStrategie strategieCourante;
	
	@Override		
	public void creerJoueurs() {
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
		///On cree les dés avec 6 faces///
		De de1 = new De(6);	
		De de2 = new De(6);	
		De de3 = new De(6);	
		listeDes.ajouterDe(de1);
		listeDes.ajouterDe(de2);
		listeDes.ajouterDe(de3);
	}

	@Override
	public void creerJeu() {
		this.nombreDeTourTotal = 6;
		this.tourCourant = 0;
		while (tourCourant < nombreDeTourTotal) { //Logique du jeu ICI
			
		}

	}

	@Override
	public void attacherStrategie() {
		this.strategieCourante = new StrategieBunco();
	}
	
}
