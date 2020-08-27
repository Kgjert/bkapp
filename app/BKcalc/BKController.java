package app.BKcalc;
import java.io.IOException;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;




public class BKController {
	
	@FXML TextField g1;
	@FXML TextField g2;
	@FXML Label resultAz;
	@FXML Label resultDist;
	@FXML Button calculate;
	@FXML Button reset;
	@FXML Button bk1;
	@FXML Button bk2;
	@FXML Button bk3;
	@FXML Button bk4;
	@FXML Button set1;
	@FXML Button set2;
	@FXML Button set3;
	@FXML Button set4;
	
	BKDelta bkdelta = new BKDelta();
	
	public void getGridValues() {
		try {
	
		bkdelta.setG1(Integer.parseInt(g1.getText()));
		bkdelta.setG2(Integer.parseInt(g2.getText()));
		//BKDeltaToAz bkdeltato = new BKDeltaToAz(bkdelta.getG1(),bkdelta.getG2());
		}
		catch(Exception e) {
			System.out.println("Incorrect grid-format");
		}

		}
	public void getWpnGrid() {
		try {
			bkdelta.setG1(Integer.parseInt(g1.getText()));
		}
		catch(Exception e) {
			System.out.println("Incorrect grid-format on P1");
		}
	}
	public boolean isDigit() {
		return false;
		
	}
	/*public boolean isValidGrid() {
		if(!())
	}*/
@FXML void onCalculate() {
		getGridValues();
		try {
			BKDeltaToAz bkdeltato = new BKDeltaToAz(bkdelta.getG1(),bkdelta.getG2());
			resultAz.setText(Integer.toString((int)bkdeltato.azimuth()));
			resultDist.setText(Integer.toString((int) bkdeltato.distance()));
		}
		catch (Exception e) {
			System.out.println("Cannot calculate when grid P1 and P2 is not the same format. ");
		}
		


	}
@FXML void changeBKOne() throws IOException {
	BKFile tempfile = new BKFile();
	g1.setText(tempfile.loadBKGrid(561));
	//System.out.println(tempfile);

	
}
@FXML void changeBKTwo() throws IOException {
	BKFile tempfile = new BKFile();
	g1.setText(tempfile.loadBKGrid(562));
	//bkdelta.setG1(Hente fra fil);
}
@FXML void changeBKThree() throws IOException {
	BKFile tempfile = new BKFile();
	g1.setText(tempfile.loadBKGrid(563));
	//bkdelta.setG1(Hente fra fil);
}
@FXML void changeBKFour() throws IOException {
	BKFile tempfile = new BKFile();
	g1.setText(tempfile.loadBKGrid(564));
	//bkdelta.setG1(Hente fra fil);
}
@FXML void setBKOne() {
	getWpnGrid();
	if(bkdelta.getG1()==0) {
		System.out.println("P1 cannot be blank");
	}
	else{
		int tempgrid = bkdelta.getG1();
		System.out.println(tempgrid);
		BKFile tempfile = new BKFile();
		tempfile.saveBKGrid(561,tempgrid);
	}
	
	
	
	
}

@FXML void setBKTwo() {
	getWpnGrid();
	if(bkdelta.getG1()==0) {
		System.out.println("P1 cannot be blank");
	}
	else{
		int tempgrid = bkdelta.getG1();
		System.out.println(tempgrid);
		BKFile tempfile = new BKFile();
		tempfile.saveBKGrid(562,tempgrid);
	}
}
@FXML void setBKThree() {
	getWpnGrid();
	if(bkdelta.getG1()==0) {
		System.out.println("P1 cannot be blank");
	}
	else{
		int tempgrid = bkdelta.getG1();
		System.out.println(tempgrid);
		BKFile tempfile = new BKFile();
		tempfile.saveBKGrid(563,tempgrid);
	}
}
@FXML void setBKFour() {
	getWpnGrid();
	if(bkdelta.getG1()==0) {
		System.out.println("P1 cannot be blank");
	}
	else{
		int tempgrid = bkdelta.getG1();
		System.out.println(tempgrid);
		BKFile tempfile = new BKFile();
		tempfile.saveBKGrid(564,tempgrid);
	}
}
	
	

public static void main(String[] args) {
	BKDelta bktest = new BKDelta();
	bktest.setG1(80004000);
	bktest.setG2(81004000);
	BKDeltaToAz bktestaz = new BKDeltaToAz(bktest.getG1(),bktest.getG2());
	System.out.println(bktest.getG1());
	System.out.println(bktest.getG2());
	System.out.println(bktestaz.getX1());
	System.out.println(bktestaz.getY1());
	System.out.println(bktestaz.getX2());
	System.out.println(bktestaz.getY2());
	System.out.println(bktestaz.azimuth());
	System.out.println(bktestaz.distance());
	bktest.setG1(82004000);
	System.out.println(bktest.getG1());
	System.out.println(bktestaz.getX1());
	System.out.println(bktestaz.getY1());
	System.out.println(bktestaz.getX2());
	System.out.println(bktestaz.getY2());
	System.out.println(bktestaz.azimuth());

	/*System.out.println(BKDeltaToAz.azimuth());
	System.out.println(BKDeltaToAz.distance());*/
}
}
