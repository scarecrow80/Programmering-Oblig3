import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Utleiested  extends JFrame implements ActionListener
{
   private Stativ stativet;
   private JTextField  personIdFelt, sykkelIdFelt;
   private JTextArea display;
   private JButton ut, inn ;
   private PersonRegister personer;

   public Utleiested(String navn, int antall, PersonRegister p)
   {
     super("BYSYKKEL " + navn);
     personer = p;
     stativet = new Stativ(antall);
     personIDlabel = new JLabel("Person ID");
     personIDFelt = new JTextfield(5);
     ut = new JButton("Leie");
     sykkelIdlabel = new JLabel("Sykkel ID");
     sykkelIDfelt = new JTextField(5);
     inn = new Jbuttton("Levere");
     
     //Knytter knappene til lytteobjektet >
     ut.addActionListener(this);
     inn.addActionListener(this);
     display = new JTextArea(6, 15);
     display = setEditable(false);
     display.setLineWrap(true);
     JScrollPane contet = new JScrollPane(display);
     content.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
     Container c = getContentPane();
     setLayout(new FlowLayout());
     
     //Legger skjermkomponentene ut på vinduet >
     
     c.add(personIDlabel);
     c.add(personIDFelt);
     c.add(ut);
     c.addd(sykkelIdlabel);
     c.add(sykkelIdFelt);
     c.add(inn);
     c.add(content);
     setSize(200, 200);
     setVisible(true);
     setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
   }
      /* Metoden skal leie ut en sykkel til personen med det id-nummer som er
       skrevet inn i tekstfeltet for dette. Hvis personen er registrert og er
       godkjent for utleie, skal det skrives ut i tekstområdet hvilken sykkel
       vedkommende skal ta. I motsatt fall skal det skrives ut en passende
       feilmelding. Denne skal inneholde årsaken til at peronen ikke fikk leie
       sykkelen. */
   public void leiUt()
   {
     
   }
   
      /* Metoden skal registrere at en sykkel leveres inn. Hvis sykkelen er
       registrert utleid skal innleveringen registreres på personen som har
       leid sykkelen og det må registreres at sykkelen settes tilbake i stativet.
       I tekstområdet skal det skrives hvor sykkelen skal plasseres. Hvis
       sykkelens id-nummer er ukjent, skal det gis beskjed om det. */
   public void leverInn()
   {
     
   }
   
   
       /*Metoden skal sørge for at leiUt() kalles når det klikkes på knappen
       "Leie", og at leverInn() kalles når det klikkes på  knappen "Levere" */
   public void actionPerformed(ActionEvent e )
   {
     
   }

}// end of class Utleiested 
