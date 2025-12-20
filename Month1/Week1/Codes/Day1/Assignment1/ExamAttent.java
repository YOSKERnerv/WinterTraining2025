class ExamAttent 
{
	public static void main(String[] args) 
	{
		//a student is allowed  to attend an exam if attendance is above 75% or a medical certificate is submitted, but fees must be paid.
		boolean feesPaid = true;
		int attendance = 72;
		boolean medicalCertificate = false;
		
		String result  = (feesPaid == true && attendance>=75)?"can attend exam":((medicalCertificate==true)?"can attend exam":"Cannot attent Exam");
		System.out.println(result);
	}
}
