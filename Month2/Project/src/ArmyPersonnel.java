public abstract class ArmyPersonnel{
	protected String militaryID;
	protected String rank;
	protected String name;
	protected String unit;
	protected double salary;
	
	// basic layout of the constructor;
	public ArmyPersonnel(String militaryID, String name, String rank, double salary) {
        this.militaryID = militaryID;
        this.name = name;
        this.rank = rank;
        this.salary = salary;
    }
	// this overload constructer for making object without any paramenters;
	ArmyPersonnel(){
		
	}
	
	// this overloaded constructor for giving messages;
	ArmyPersonnel(String unit){
		this.unit = unit;
	}
	
	
	
	
// ***************************************  GETTERS    **********************************
	public String getMilitaryID() {
		return militaryID;
	}
	public String getRank() {
		return rank;
	}
	public String getName() {
		return name;
	}
	public String getUnit() {
		return unit;
	}
	public double getSalary() {
		return salary;
	}
	
	
	
// *****************************     setters   *********************************
	public void setMilitaryID(String militaryID) {
		this.militaryID = militaryID;
	}
	public void setRank(String rank) {
		this.rank = rank;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setUnit(String unit) {
		this.unit = unit;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public void display() {
        System.out.println(militaryID + " | " + name + " | " + rank + " | " + salary);
    }
	abstract void receiveCommand(String command);
	
// **************************************                ***********************************
	
	

}
