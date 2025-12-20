class SystemBackUp 
{
	public static void main(String[] args) 
	{
		String dayTime = "MidNight";
		String serverLoad = "High";
		boolean serverOnline = true;
		String result = (dayTime = "MidNight" && serverLoad = "High")|| (serverOnline = false)?"Systembackup":"No backuo mode";
		
		System.out.println(result);
	}
}
