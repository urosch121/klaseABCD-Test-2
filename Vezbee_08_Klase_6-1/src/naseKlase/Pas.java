package naseKlase;

public class Pas extends Zivotinja 
{
	protected String rasa;
	
	public Pas(String rasa, String ime)
	{
		super("rasa", ime);
		this.rasa = rasa;
	}
	public void Rezi()
	{
		System.out.println("Rrrrrrrrrrr ! ! ! !");
	}
	
	@Override
	public String toString() 
	{
		return "Pas rase " + this.rasa + " zvani " + this.ime;
	}
	
	@Override
	public int GetVrednost() 
	{
		return super.GetVrednost() + 60;
	}
}
