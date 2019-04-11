package naseKlase;

public class Macka extends Zivotinja 
{
	protected String rasa;
	
	public Macka(String rasa, String ime)
	{
		super("macka", ime);
		this.rasa = rasa;
	}
	
	public Macka(String rasa)
	{
		super("macka", "");
		this.rasa = rasa;
	}
	
	public void SetIme(String ime)
	{
		this.ime = ime;
	}
	
	@Override
	public String toString() 
	{
		return "Macka rase " + this.rasa + " zvana " + this.ime;
	}
	
	public void Grebe()
	{
		System.out.println("Ogreban si !");
	}
	
	public void Prede()
	{
		System.out.println("Leprrrrrrrrrrr");
	}
	
	@Override
	public int GetVrednost() 
	{
		return super.GetVrednost() + 30;
	}
}
