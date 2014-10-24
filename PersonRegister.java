//Gruppemedlemmer: Stian Hvidsten (236619), Aleksander Foss Vold (236608) og Thomas Löfstedt (236612).
// Informasjonsteknolgi (Kullklassekode: INFORMATIK14HA).
/*Alle personene (syklistene) er lagret i et personregister.
Nedenfor ser du klassen som representerer dette registeret i programmet.
Din oppgave er å erstatte all pseudokode med java-instruksjoner.*/

public class PersonRegister
{
   private Person[] personer;


   public PersonRegister(int antall)
   {
     personer = new Person[antall];
     opprettPersonregister();
   }

       /*Her skal du opprette konkrete Person-objekter og sette dem inn
       i arrayen, f.eks 10 stykker. Du vil trenge dem for å kunne teste
       ut programmet. */

   public final void opprettPersonregister()
   {
     personer[0] = new Person("Bill Gates");
     personer[1] = new Person("Steve Jobs");
     personer[2] = new Person("Petter Pilgaard");
     personer[3] = new Person("Elias Hansen");
     personer[4] = new Person("Patrick Hanssen");
     personer[5] = new Person("Cicilie Franknes");
     personer[6] = new Person("Benedicte Løkgård");
     personer[7] = new Person("Fridtjof Nansen");
     personer[8] = new Person("Jens Jenssen");
     personer[9] = new Person("Ole Kristiansen");

   }
      /* Metoden skal lete etter en person (et person-objekt) med idNr lik
       parameteren personId. Hvis personen finnes i registeret, skal person-
       objektet returneres fra metoden. I motsatt fall skal metoden returnere
       null. NB! Vi kjenner ikke til antall person-objekter i arrayen og vet
       heller ikke om disse ligger etter hverandre. */

   public Person finnPerson(int personID)
   {
    for( int i = 0; i < personer.length; i++)
    {
		Person person = personer[i];
		if(person != null && person.getMedlemsnummer() == personID)
		{
			return person;
		}
	}
	return null;
   }
     /* Metoden skal lete etter en person (et person-objekt) som leier en sykkel
       med idNr lik parameteren sykkelId. Hvis en slik person finnes i registeret,
       skal person-objektet returneres fra metoden. I motsatt fall skal metoden
       returnere null. NB! Vi kjenner ikke til antall person-objekter i arrayen
       og heller ikke om disse ligger etter hverandre. */

   public Person finnSykkelBruker(int sykkelId)
   {
     for(int i = 0; i < personer.length; i++)
     {
		  Sykkel p = personer[i].getSykkel();
		 if( personer[i] != null && personer[i].getSykkel() != null && p.getSykkelId() == sykkelId)
		 {
		 return personer[i];
	    }
	 }

   return null;
   }
}

// end of class PersonRegister
