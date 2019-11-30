package chapter6;

public class Procedure {
	private String procedureName;
	private String date;
	private String practitioner;
	private double charges = 0.0;
	
	public Procedure() {
		procedureName = "";
		date = "";
		practitioner = "";
		charges = 0.0;
	}
	
	public Procedure(String pn, String d, String p, double c) {
		procedureName = pn;
		date = d;
		practitioner = p;
		charges = c;
	}
	
	public void setProcedureName(String pn) {
		procedureName = pn;
	}
	
	public String getProcedureName() {
		return procedureName;
	}
	
	public void setDate(String d) {
		date = d;
	}
	
	public String getDate() {
		return date;
	}
	
	public void setPractitioner(String p) {
		practitioner = p;
	}
	
	public String getPractitioner() {
		return practitioner;
	}
	
	public void setCharges(double c) {
		charges = c;
	}
	
	public double getCharges() {
		return charges;
	}
}
