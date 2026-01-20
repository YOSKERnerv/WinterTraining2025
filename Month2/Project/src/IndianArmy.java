
abstract public class IndianArmy {
	protected String presidentName;
	protected String presidentPassCode;
	protected String presidentID;
	protected double salary;
	IndianArmy(String presidentName, String presidentPassCode,String presidentID){
		this.presidentPassCode = presidentPassCode;
		this.presidentName = presidentName;
		this.presidentID = presidentID;
	}
	IndianArmy(){
		
	}
	public abstract void registerPresident(String presidentID,String presidentPassCode);
	public abstract void updateNewPresident(String presidentID, String newPresidentPassCode);
	
}