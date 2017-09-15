public class Cat
{
	private String name;
	private int age;
	private String owner;
	
	public Cat(String yeet)
	{
		setName(yeet);
	}
	public Cat()
	{
	
	}
	
	public Sting getName()
	{
		return name;
	}
	
	public void setName(String n)
	{
		name = n;
	}
	
	public int getAge()
	{
		return age;
	}
	
	public int setAge(int a)
	{
		age = a;
	}
	
	public String getOwner()
	{
		return owner;
	}
	
	public void setOwner(String o)
	{
		owner = o;
	}
	
	public void eat(String food)
	{
		System.out.println(name + " just ate " + food);
	}
	
}