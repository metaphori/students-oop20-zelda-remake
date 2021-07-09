package model.people;

public interface Entity {
	/**
	 * 
	 * @return coordinata y dell'entit�
	 */
	int getY();
	
	/**
	 * 
	 * @return coordinata x dell'entit�
	 */
	int getX();
	
	/**
	 * settaggio coordinata x dell'entit�
	 * @param x
	 */
	void setX(int x);
	
	/**
	 * settaggio coordinata y dell'entit�
	 * @param y
	 */
	void setY(int y);
	
	/**
	 * 
	 * @return Stringa con path immagine
	 */
	String getImgPath();
	
}
