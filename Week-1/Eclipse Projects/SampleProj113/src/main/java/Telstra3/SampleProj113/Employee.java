package Telstra3.SampleProj113;


public class Employee {
	private int eID;
	private String eName;
	public Employee(int eID, String eName) {
		super();
		this.eID = eID;
		this.eName = eName;
	}
	@Override
	public String toString() {
		return "employee [eID=" + eID + ", eName=" + eName + "]";
	}
	public int geteID() {
		return eID;
	}
	public void seteID(int eID) {
		this.eID = eID;
	}
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	

}
