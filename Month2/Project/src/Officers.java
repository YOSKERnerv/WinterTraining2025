
public class Officers extends ArmyPersonnel{
	public Officers(String militaryID, String name, String rank, double salary) {
		// TODO Auto-generated constructor stub
	}
	public void display() {
		System.out.println("This is Officers display");
	}
	Officers(){
		super("Officers");
	}
	@Override
	void receiveCommand(String command) {
		// TODO Auto-generated method stub
		
	}

}
