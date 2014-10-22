/*Når syklene ikke er utleid er de plassert i stativer på forskjellige steder i byen.
Hvert stativ er representert ved et objekt av klassen Stativ som du ser en skisse av under.
Din oppgave er å erstatte all pseudokode med java-instruksjoner.*/

public class Stativ
{
   private Sykkel[] stativ;
   private int nesteStativID = 0;
   private int maksSykler = 0;


   public Stativ( int antallSykler)
   {

   }

//Her skal du opprette konkrete Sykkel-objekter og sette dem inn
  //     i arrayen. Et passende antall vil være halvparten av hva det er plass til. >
   public void fyllStativet()
   {

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
       // public String leiUt(Person s)
       // {

  	   //}
 	/* Metoden skal sørge for at sykkelen som personen, representert ved
       parameteren s,leier blir "satt tilbake i stativet", under forutsetning
       av at det er plass i stativet. Videre må det registreres at personen nå
       ikke lenger leier sykkelen. Hvis det er plass skal metoden returnere en
       tekst som angir hvor sykkelen skal plasseres, for eksempel:
       "Sett sykkelen på plass 12".I motsatt fall skal det returneres en tekst
       som ber syklisten levere sykkelen et annet sted. */
   		// public String leverInn(Person s)
   		// {

  		//}
}
// end of class Sykkel
