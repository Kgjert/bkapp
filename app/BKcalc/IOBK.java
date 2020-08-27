package app.BKcalc;

import java.io.IOException;

public interface IOBK {
	public void saveBKGrid(int nn,int grid);
	
	public String loadBKGrid(int nn) throws IOException;

}
