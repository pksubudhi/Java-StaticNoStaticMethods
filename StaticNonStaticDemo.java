class Student
{
	int sCode;
	String sName;
	static String brName="COMPUTER SCIENCE"; //This is Static and value is Fixed
	Student()
	{
		sCode=-1;
		sName="UNKNOWN";
	}
	Student(int sc, String sn)
	{
		sCode=sc;
		sName=sn;
	}
	public void ShowDetail()		//Non-Static or Instance method
	{
		//Can access both Static and Non-Static fields
		
		System.out.println(sCode+": Name: "+sName+", ("+brName+")");
	}
	public static void ShowBranch()	//Static or Class Method
	{
		//Here you are not allowed to access any non-static member 
		//NOTE: brName is static
		
		System.out.println("Branch Name "+brName);
	}
}
public class StaticNonStaticDemo 
{
	public static void main(String argv[])
	{
		Student p=new Student();
		
		Student q=new Student(101, "Michel");
		Student r=new Student(102, "Peter");
		Student s=new Student(103, "Lucy");
		p.ShowDetail();			//Must be called with Object reference
		q.ShowDetail();
		r.ShowDetail();
		s.ShowDetail();
		Student.ShowBranch();	//Must be called with Class Reference (I have used class name)
	}
	
	
}
