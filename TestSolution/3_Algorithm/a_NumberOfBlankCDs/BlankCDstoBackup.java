

public class BlankCDstoBackup {

	final private int conversionMB = 1024;
	final private int cDSizeMB = 700;
	
	public int calculateNumCDs(double numGB){
		int totalCDs;
		if (numGB > 0d){
			double totalMB = numGB * conversionMB;
			Double totalCDsCeil = Math.ceil(totalMB / cDSizeMB);
			totalCDs = totalCDsCeil.intValue();
		}
		else
			totalCDs = 0;
		return totalCDs;
	}
	
	public String getCDstoBackup(double numGB){
		String msj = new String();
		if (numGB <= 0d)
			msj = "you have to introduce a positive number";
		else
			msj = String.format("You will need %d CD's to make the Back up of %.2f GigaBytes", calculateNumCDs(numGB), numGB);			
		return msj;
	}
		
}
