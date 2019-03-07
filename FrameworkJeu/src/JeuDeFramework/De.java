package JeuDeFramework;
import java.util.Random;

public class De implements Comparable<De> {
	
	private int nbFaces;
	private int faceMin;
	private int faceMax;
	private int face;
	
	
	/*
	 * Constructeur Dé 
	 */
	public De(int nbFaces) {
		this.face = -1;
		this.nbFaces = nbFaces;
		this.faceMax = nbFaces;
		this.faceMin = 1;
	}
	public void lanceDe(){
		
			if (faceMin >= faceMax) {
				throw new IllegalArgumentException("max must be greater than min");
			}

			Random r = new Random();
			this.face=r.nextInt((faceMax - faceMin) + 1) + faceMin;
	}

	/*
	 * Obtenir la face obtenu 
	 */
	public int getFacesObtenu() {
		return face;
	}
	/*
	 * Set la face obtenu 
	 */
	public void setFacesObtenu(int i) {
		 this.face=i;
	}

	/*
	 * 
	 */
	public void setNbFaces(int nbFaces) {
		this.nbFaces = nbFaces;
	}
	public String toString(){
		//lanceDe();
		return "La face est :"+face;
		
	}
	public int getFaceMax() {
		return faceMax;
	}
	public void setFaceMax(int faceMax) {
		this.faceMax = faceMax;
	}
	public int getFaceMin() {
		return faceMin;
	}
	public void setFaceMin(int faceMin) {
		this.faceMin = faceMin;
	}
	@Override
	public int compareTo(De de){   
		if(de==null)  throw new IllegalArgumentException();
		if(this.face==de.getFacesObtenu())  
		      return 0;  
		   else if(this.face>de.getFacesObtenu())  
		      return 1;  
		   else  
		      return -1; 
 
	}
	
}