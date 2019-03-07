package JeuDeFramework;
import java.util.Random;

public class De implements Comparable<De> {
	
	private int nbFaces;
	private int faceMin;
	private int faceMax;
	private int face;
	
	
	/*
	 * Constructeur DÃ© 
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
	/**
	 * Setter de la valeur du dé. Utilisé pour les tests.
	 * Si les valeurs dépasses les bornes min/max alors elle prendra la valeur de la borne qu'elle dépasse.
	 * @param i la valeur du dé.
	 */
	public void setFace(int i) {
		if(i<faceMin) {
			this.face = faceMin;
		}else if(i>faceMax) {
			this.face = faceMax;
		}else{
			this.face = i;
		}
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