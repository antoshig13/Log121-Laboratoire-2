package JeuDeFramework;
import java.util.Random;

public class De {
	
	private int nbFaces;
	private int faceMin;
	private int faceMax;
	private int Face;
	
	
	/*
	 * Constructeur Dé 
	 */
	public De(int nbFaces) {
		this.nbFaces = nbFaces;
		this.faceMax = nbFaces;
	}
	public void lanceDe(){
		
			if (faceMin >= faceMax) {
				throw new IllegalArgumentException("max must be greater than min");
			}

			Random r = new Random();
			this.Face=r.nextInt((faceMax - faceMin) + 1) + faceMin;
	}

	/*
	 * Obtenir la face obtenu 
	 */
	public int getFacesObtenu() {
		return nbFaces;
	}

	/*
	 * 
	 */
	public void setNbFaces(int nbFaces) {
		this.nbFaces = nbFaces;
	}
	public String toString(){
		lanceDe();
		return "La face est :"+Face;
		
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

	
}
