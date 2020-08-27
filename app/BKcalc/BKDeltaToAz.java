package app.BKcalc;

public class BKDeltaToAz {

	private int x1;
	private int y1;
	private int x2;
	private int y2;
	
	

	public BKDeltaToAz(int g1, int g2) {
		
		this.x1 = Integer.parseInt(Integer.toString(g1).substring(0, (Integer.toString(g1).length()/2)));
		this.y1 = Integer.parseInt(Integer.toString(g1).substring((Integer.toString(g1).length()/2), Integer.toString(g1).length()));
		this.x2 = Integer.parseInt(Integer.toString(g2).substring(0,(Integer.toString(g2).length()/2)));
		this.y2 = Integer.parseInt(Integer.toString(g2).substring((Integer.toString(g2).length()/2), Integer.toString(g2).length()));
		/*this.x1 = Integer.parseInt(Integer.toString(g1).substring(0, 4));;
		this.y1 = Integer.parseInt(Integer.toString(g1).substring(4, 8));;
		this.x2 = Integer.parseInt(Integer.toString(g2).substring(0, 4));;
		this.y2 = Integer.parseInt(Integer.toString(g2).substring(4, 8));;
	*/
	}
	

	public void setX1(int g1) {
		this.x1 = Integer.parseInt(Integer.toString(g1).substring(0, (Integer.toString(g1).length()/2)));
	}

	public void setY1(int g1) {
		this.y1 = Integer.parseInt(Integer.toString(g1).substring((Integer.toString(g1).length()/2), Integer.toString(g1).length()));
	}

	public void setX2(int g2) {
		this.x2 = Integer.parseInt(Integer.toString(g2).substring(0,(Integer.toString(g2).length()/2)));
	}

	public void setY2(int g2) {
		this.y2 = Integer.parseInt(Integer.toString(g2).substring((Integer.toString(g2).length()/2),Integer.toString(g2).length()));
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
	}

	public double azimuth() {
		return ((-Math.atan2(y2-y1,x2-x1)*3200.0/Math.PI)+8000)%6400.0;
	}
	/*public double distance() {
		
		return Math.sqrt(((x2-x1)*(x2-x1))+((y2-y1)*(y2-y1)))*10;
	}*/
	public double distance(){
	 if(Integer.toString(x1).length()==4 && Integer.toString(y1).length()==4 && Integer.toString(x2).length()==4 && Integer.toString(y2).length() == 4){
	 return Math.sqrt(((x2-x1)*(x2-x1))+((y2-y1)*(y2-y1)))*10;
	 }
	 if(Integer.toString(x1).length()==3 && Integer.toString(y1).length()==3 && Integer.toString(x2).length()==3 && Integer.toString(y2).length() == 3){
	 return Math.sqrt(((x2-x1)*(x2-x1))+((y2-y1)*(y2-y1)))*100;
	 }
	 else{
	 throw new IllegalArgumentException("Not valid grid");
	 }
	 }
	 

/*public static void main(String[] args) { 
	BKDeltaToAz bk2 = new BKDeltaToAz(8000,4000,4000,8000);
	System.out.println(bk2.azimuth());
	System.out.println(bk2.distance());
	
}*/
}
