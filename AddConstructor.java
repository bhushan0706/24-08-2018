
public class AddConstructor 
{
	void add(int x, int y)
	{
		int z= x+y;
		System.out.println("addition numbers: "+z);
	}
	void add(float x, int y)
	{
		float z= x+y;
		System.out.println("addition numbers: "+z);
	}
	void add(int x,double y, int n)
	{
		double z= x+y+n;
		System.out.println("addition numbers: "+z);
	}
	public static void main(String[] args) 
	{
	
			AddConstructor a= new AddConstructor();
			a.add(3, 123);
			a.add(1.3f, 2);
			a.add(3, 2.3, 8);
			
	}

}
