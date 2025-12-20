class CpuUsage 
{
	public static void main(String[] args) 
	{
		// A server should be marked unstable is CPU usage excedds 85% or memory usage exceeds 90% provided the server is not under maintannance
		
		int cpuUsage = 85;
		int memoryUsage = 90%;
		boolean serverOnline = false;
		
		String result = (cpuUsage<=85)&&(memoryUsage<=90)&&(serverOnline==true)?"Stable":"Unstable";
		System.out.println(result);
	}
}
