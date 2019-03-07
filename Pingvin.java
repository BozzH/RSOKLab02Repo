
public class Pingvin extends Zivotinja implements Kretanje
{
	
	Pingvin(String ime)
	{
		super(ime);
	}
	
	// metode iz interfejsa Kretanje
	@Override //sluzi kao znak da je metod prepisan
	public void nacinKretanja() 
	{
		System.out.println("Pliva i skace.");
	}
	
	@Override
	public String toString()
	{
		return "Pingvin: " + ime;
	}
}
