
public class Delfin extends Zivotinja implements Kretanje
{
	Delfin(String ime)
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
		return "Delfin: " + ime;
	}
}
