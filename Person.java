/*For å kunne leie en bysykkel må syklisten være registrert i Bysykkel-systemet. Objekter av klassen Person skal representere syklistene i programmet. Klassen Person skal ha følgende datafelt:

navn
Navnet på syklisten.
idNr
Hver person skal ha et unikt id-nummer av type heltall og dette skal genereres automatisk hver gang et person-objekt opprettes.
(Hvordan du kan gjøre det kan du lese om i kapittel 8, Eksempel: Automatisk generering av medlemsnumre.)
sykkel
Objekt som representer sykkelen som personen leier. Når personen ikke leier noen sykkel skal dette feltet være null.
merknad
Tekstvariabel for å lagre anmerkninger om f.eks mislighold av leieavtalen. Hvis personen ikke har noen anmerkninger skal dette feltet vært null.
startTid
Objekt som representer starttidspunktet for leie av sykkelen. Når personen ikke leier noen sykkel skal dette feltet være null.
nesteNr
Datafelt som skal brukes til å generere unike id-nummer


Nedenfor ser du en skisse av klassen.
Din oppgave er å erstatte all pseudokode med java-instruksjoner.*/

import java.util.Date;
import java.text.DateFormat;
import javax.swing.*;

public class Person
{
   // datafelt >

   private String navn;
   private int medlemsnummer;
   private Sykkel sykkel;
   private String merknad;
   private static int nesteNr = 1;
   private int medlem;
   private Date startTid;
   private DateFormat df = DateFormat.getInstance();




   //konstruktør
   public Person( String n)
   {

	   navn = n;

	   medlemsnummer = nesteNr++;

   }

   // get-metoder for sykkel og idNr

   public Sykkel getSykkel()
   {
	   return sykkel;
   }


    public int getMedlemsnummer()
    {
		return medlemsnummer;
	}

     //Metoden skal returnere true hvis personen ikke allerede leier
       //en sykkel og ikke har noen merknader. Ellers false. >
   public boolean godkjent()
   {
		if(sykkel == null && merknad == null)
		{
			return true;
		}
		else
	    return false;
	}
	/* Metoden skal ut fra parametrene t og m lagre en tekst i datafeltet for
		       merknader. I teksten skal tidspunktet formateres  slik det er beskrevet
	       i oppgavens innledning. */

	   public void setMerknad(Date t, String m)
	   {
			merknad = df.format(t)+ " " + m;


       }

 /*< Hvis personen er godkjent, jfr. metoden godkjent(), skal metoden
       registrere at personen leier sykkelen s. Starttidspunktet for leietiden
       skal også registreres og skal være det samme som tidspunktet for når
       denne metoden blir kalt. Metoden skal så returnere true.
       Hvis personen ikke er godkjent, får vedkommende ikke leie sykkelen s
       og metoden skal returnere false. >*/

   public boolean leiSykkel(Sykkel s)
   {
	   if(godkjent())
	   {
		   sykkel = s;
		   startTid = new Date();
		   return true;
	   }
	   return false;
   }
   //Metoden skal returnere antall påbegynte timer fra starttidspunktet for
     //  leien til sluttidspunktet angitt av parameteren sluttTid. >
	 public int leietid(Date sluttTid)
   {
     long varighet = (sluttTid.getTime() - startTid.getTime());
     int varighetTimer = (int)Math.ceil(varighet/ 3600000);

     return varighetTimer;
   }

   /* Metoden skal registrere innleveringstidpunktet (som vil  være det samme
	 som tidspunktet for når denne metoden blir kalt). Videre skal leietiden
	 beregnes. Hvis den lovlige leietiden er overskredet, skal det settes en
	 merknad på personen. Denne skal inneholde innleveringstidspunktet og det
	 antall timer leietiden er overskredet med. Uansett skal det registreres
	 at personen ikke lenger leier sykkelen. */

    public void leverInn()
	   {
	    Date innTid = new Date();

	    if(leietid(innTid) > Sykkel.MAXTID)
	    {
			if(leietid(innTid) - sykkel.MAXTID == 1)
			{
				setMerknad(innTid, "Sykkel ble levert" + (leietid(innTid) - sykkel.MAXTID) + " time for seint");
			}
			else
			{
				setMerknad(innTid, "Sykkel ble levert " + (leietid(innTid) - sykkel.MAXTID) + "timer for seint");
		    }
	     }
	     sykkel = null;
	   }


   public String toString()
   {
     String utskrift = navn + " ID nummer: " + medlemsnummer + "\n";

     if ( sykkel != null)
     {
		 utskrift += "Sykkel id: " + /*sykkel.getMedlemsnummer() + */"\n"; //added later
	 }

	 if (!merknad.equals(""))
	 {
		 utskrift += merknad;
	 }

	 return utskrift;
   }
}
// end of class Person
