package JeuDeFramework;
public class CollectionJoueur implements Iterable{
	
	private int compteur = 0;
	private int MAX_Joueur;
	private Object[] listJoueur ;

	public CollectionJoueur(int nbjoueur){
	    listJoueur = new Object[nbjoueur];
	    this.MAX_Joueur=nbjoueur;
	}
	public void ajouterJoueur(Joueur joueur){
		 
        if (compteur >= MAX_Joueur) 
            System.out.println("Full"); 
        else
        { 
            listJoueur[compteur] = joueur; 
            compteur++; 
        } 
		
	}
	public int size() {
		return this.listJoueur.length-1;
	}
	public Iterator creerIterateur() {
	      return new IteratorJoueur();
	   }
	private class IteratorJoueur  implements Iterator {

	      int index;

	      @Override
	      public boolean hasNext() {
	      
	         if(index < listJoueur.length){
	            return true;
	         }
	         return false;
	      }

	      @Override
	      public Object next() {
	      
	         if(this.hasNext()){
	            return listJoueur[index++];
	         }
	         return null;
	      }	
	}
}
