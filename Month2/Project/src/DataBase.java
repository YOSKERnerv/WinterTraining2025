import java.util.HashMap;

public class DataBase {

    private HashMap<String, ArmyPersonnel> personnelTable = new HashMap<>();
    private HashMap<String,PresidentClass> presidentTable  = new HashMap<>();

    public boolean addPersonnel(ArmyPersonnel p) {
        if (personnelTable.containsKey(p.getMilitaryID())){
            return false;
        }
        personnelTable.put(p.getMilitaryID(), p);
        return true;
    }
    
    //adding the president info in the database
    public boolean addPresident(PresidentClass i) {
    	if( presidentTable.containsKey(i.getPresidentID())){
    		 return false;
    	 }
    	presidentTable.put(i.getPresidentID(),i);
    	 return true;
    }

    public ArmyPersonnel getPersonnel(String id){
        return personnelTable.get(id);
    }
    public PresidentClass getPresident(String id){
        return presidentTable.get(id);
    }

    public void displayAll() {
        for (ArmyPersonnel p : personnelTable.values()){
            p.display();
        }
    }
    
    
}
