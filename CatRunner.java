import java.awt.Color;

public class CatRunner
{
	public static void main(String[] args)
	{
		Cat blake = new Cat();
		Cat skrrt = new Cat("whip");
		skrrt.eat("memes");
		blake.setName("Blake");
		blake.eat("cat food");
		
		Lion leo = new Lion();
		leo.setName("Leo");
		leo.setManeColor(Color.YELLOW);
		leo.roar();
	}
}