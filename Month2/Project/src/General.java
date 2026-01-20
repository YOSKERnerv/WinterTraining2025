
public class General extends ArmyPersonnel{

	General(String militaryID, String name, double salary) {
		super(militaryID, name, "General", salary);
		// TODO Auto-generated constructor stub
	}
	
	
	public void recruitSoldier(DataBase db, Soldier soldier) {
        db.addPersonnel(soldier);
    }



	@Override
	void receiveCommand(String command) {
		// TODO Auto-generated method stub
		
	}
}
