package naseKlase;

public class Zivotinja 
{
	protected String vrsta;
	protected String ime;
	
	public Zivotinja(String vrsta, String ime)
	{
		this.vrsta = vrsta;
		this.ime = ime;
	}
	
	@Override
	public String toString() 
	{		
		return "Zivotinja vrste " + this.vrsta + " zvana " + this.ime;
	}
	
	public int GetVrednost()
	{
		return 100;
	}
}
