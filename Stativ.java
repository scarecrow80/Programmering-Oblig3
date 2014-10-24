//Gruppemedlemmer: Stian Hvidsten (236619), Aleksander Foss Vold (236608) og Thomas Löfstedt (236612).
// Informasjonsteknolgi (Kullklassekode: INFORMATIK14HA).

/*Når syklene ikke er utleid er de plassert i stativer på forskjellige steder i byen.
Hvert stativ er representert ved et objekt av klassen Stativ som du ser en skisse av under.
Din oppgave er å erstatte all pseudokode med java-instruksjoner.*/

public class Stativ
{
   private Sykkel[] stativ;



   public Stativ( int antallSykler)
   {
     stativ = new Sykkel[antallSykler];
     fyllStativet();
   }

//Her skal du opprette konkrete Sykkel-objekter og sette dem inn
  //     i arrayen. Et passende antall vil være halvparten av hva det er plass til. >
   public void fyllStativet()
   {
     for( int i = 0; i < stativ.length / 2; i++)
     {
		 Sykkel s = new Sykkel();
		 stativ[i] = s;
	 }
   }
		/* Metoden skal registrere at personen representert ved parameteren s
       leier en sykkel under følgende tre forutsetninger:
       - Personen har ingen merknader.
       - Personen leier ingen sykkel fra før.
       - Det er en ledig sykkel i stativet.
       Hvis alle betingelsene er oppfylt, skal sykkelen fjernes fra stativet og
       leie av sykkelen skal registreres på personen. Metoden skal så returnere
       en tekst med informasjon om hvilken sykkel som skal brukes, for eksempel:
       "Ta sykkel på plass 1". Husk at plassene går fra 1 og oppover. Hvis leie
       av sykkel ikke lar seg gjøre skal metoden returnere en tekst med
       informasjon om hva det skyldes. */
        public String leiUt(Person s)
        {
			for(int i = 0; i < stativ.length; i++)
			{
				if(stativ[i] != null)
				{
					if( s.leiSykkel(stativ[i]))
					{
						Sykkel temp = stativ[i];
						stativ[i] = null;
						return "Ta sykkel nr " + temp.getSykkelId() + " på plass"+ ( i + 1);
					}
					return "Du får ikke leie sykkel, siden du kanskje har en merknad.";

				}
			}
			return " Ingen ledige sykler i stativet, eller stativet er tomt.";
		}
 	/* Metoden skal sørge for at sykkelen som personen, representert ved
       parameteren s,leier blir "satt tilbake i stativet", under forutsetning
       av at det er plass i stativet. Videre må det registreres at personen nå
       ikke lenger leier sykkelen. Hvis det er plass skal metoden returnere en
       tekst som angir hvor sykkelen skal plasseres, for eksempel:
       "Sett sykkelen på plass 12".I motsatt fall skal det returneres en tekst
       som ber syklisten levere sykkelen et annet sted. */
 		public String leverInn(Person s)
		{
			for( int i = 0; i < stativ.length; i++)
			{
				if( stativ[i] == null)
				{

					stativ[i] = s.getSykkel();
					s.leverInn();
					return "Sett sykkel på plass nr " + (i + 1);
				}
			}
			return "Det er ingen plasser igjen, prøv et nytt utleiested" ;
		}
}
// end of class Sykkel
