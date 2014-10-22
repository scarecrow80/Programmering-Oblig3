/*Klassen Sykkel skal representere en sykkel i programmet. Klassen skal ha en konstant MAXTID som representerer maksimalt antall timer
sykkelen kan leies og som skal settes til 3 timer. Hver sykkel skal ha et unikt heltallig id-nummer.
Dette skal genereres automatisk hver gang et sykkel-objekt opprettes. (Hvordan du kan gjøre det kan du lese om i kapittel 8,
Eksempel: Automatisk generering av medlemsnumre.) Foruten nødvendige datafelt skal klassen ha en konstruktør og en get-metode for id-nummeret.

a) Programmer klassen Sykkel.*/


public class Sykkel
{

	public static final int MAXTID = 3600000 * 3;
	private int sykkelId;
	private static int nestenummer = 100;

	public Sykkel()
	{
		sykkelId = nestenummer++;
	}

     public int getSykkelId()
     {
		return  sykkelId;

	 }


}
