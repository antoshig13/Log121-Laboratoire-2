package JeuDeFramework;

public class CollectionDe implements Iterable{
	
	private int compteur = 0;
	private int MAX_DE;
	private Object[] listDe;
	
	public CollectionDe(int nbDe){
		this.MAX_DE=nbDe;
		listDe = new Object[nbDe];
	}

	public void ajouterDe(De de){
		 
        if (compteur >= MAX_DE) 
            System.out.println("Full"); 
        else
        { 
            listDe[compteur] = de; 
            compteur++; 
        } 
		
	}
	
	public void setMAX_DE(int nbde){
		this.MAX_DE=nbde;
	}
	
	public Iterator creerIterateur() {
	      return new IteratorDe();
	   }
	public int size() {
		return listDe.length-1;
	}
	private class IteratorDe implements Iterator {

	      int index;

	      @Override
	      public boolean hasNext() {
	      
	         if(index < listDe.length){
	            return true;
	         }
	         return false;
	      }

	      @Override
	      public Object next() {
	      
	         if(this.hasNext()){
	            return listDe[index++];
	         }
	         return null;
	      }	
	}
}
