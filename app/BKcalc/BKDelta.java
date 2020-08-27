package app.BKcalc;



public class BKDelta {
	
	private int g1;
	private int g2;
/*	private int x1;
	private int y1;
	private int x2;
	private int y2;*/
	
	
	//Trenger å få inn g1 og g2 inn til BKDelta. 

	/*public BKDelta(int g1, int g2) {
		this.g1 = g1;
		this.g2 = g2;
	}*/

	public int getG1() {
		return g1;
	}

	public void setG1(int g1) {
		if(((Integer.toString(g1).length()==8 ) || (Integer.toString(g1).length()==6))) {
			this.g1= g1;
		}
		else {
			throw new IllegalArgumentException("Grid point must be 6 or 8digit.");
		}
		
	}

	public int getG2() {
		return g2;
	}

	public void setG2(int g2) {
		if(((Integer.toString(g2).length()==8 ) || (Integer.toString(g2).length()==6))) {
			this.g2= g2;
		}
		else {
			throw new IllegalArgumentException("Grid point must be 6 or 8digit.");
		}
	}
	/*public void setX1(int g1) {
		this.x1 = Integer.parseInt(Integer.toString(g1).substring(0, 4));
	}
	public void setY1(int g1) {
		this.y1 = Integer.parseInt(Integer.toString(g1).substring(4, 8));
	}
	public void setX2(int g2) {
		this.x2 =  Integer.parseInt(Integer.toString(g2).substring(0, 4));
	}
	public void setY2(int g2) {
		this.y2 = Integer.parseInt(Integer.toString(g2).substring(4, 8));
	}
	public int getX1() {
		return x1;
	}
	public int getY1() {
		return y1;
	}
	public int getX2() {
		return x2;
	}
	public int getY2() {
		return y2;
	}*/

	/*int x1 = Integer.parseInt(Integer.toString(g1).substring(0, 4));
	int y1 = Integer.parseInt(Integer.toString(g1).substring(4, 8));
	int x2 = Integer.parseInt(Integer.toString(g2).substring(0, 1));
	int y2 = Integer.parseInt(Integer.toString(g2).substring(4, 8));
	*/

	
	

}
