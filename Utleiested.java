
// Klasse som håndterer Utleiestedene, Vindusklassen og events.
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Utleiested extends JFrame implements ActionListener {

  private Stativ stativet;
  private JTextField personIDFelt, sykkelIDFelt;
  private JTextArea display;
  private JLabel personIDlabel, sykkelIDlabel;
  private JButton ut, inn;
  private PersonRegister personer;

  public Utleiested(String navn, int antall, PersonRegister p) {
    super("BYSYKKEL " + navn);
    personer = p;
    stativet = new Stativ(antall);

    personIDlabel = new JLabel("Person ID");
    personIDFelt = new JTextField(4);
    ut = new JButton("Leie");
    sykkelIDlabel = new JLabel("Sykkel ID");
    sykkelIDFelt = new JTextField(4);
    inn = new JButton("Levere");

    // Lytte etter hendelser.

    ut.addActionListener(this);
    inn.addActionListener(this);
    display = new JTextArea(10, 20);
    display.setEditable(false);
    display.setLineWrap(true);

    JScrollPane content = new JScrollPane(display);
    content.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
    Container c = getContentPane();

    setLayout(new FlowLayout());

    c.add(personIDlabel);
    c.add(personIDFelt);
    c.add(ut);
    c.add(sykkelIDlabel);
    c.add(sykkelIDFelt);
    c.add(inn);
    c.add(content);

    setSize(300, 350);
    setVisible(true);
    setResizable(false);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }

      /* Metoden skal leie ut en sykkel til personen med det id-nummer som er
         skrevet inn i tekstfeltet for dette. Hvis personen er registrert og er
         godkjent for utleie, skal det skrives ut i tekstområdet hvilken sykkel
         vedkommende skal ta. I motsatt fall skal det skrives ut en passende
         feilmelding. Denne skal inneholde årsaken til at peronen ikke fikk leie
         sykkelen. */

    public void leiUt()
    {
		int  idnr = Integer.parseInt(personIDFelt.getText());
		Person p = personer.finnPerson(idnr);

		if(p != null)
		{
			display.setText(stativet.leiUt(p));
		}
		else
		

    }

       /*Metoden skal registrere at en sykkel leveres inn. Hvis sykkelen er
       registrert utleid skal innleveringen registreres på personen som har
       leid sykkelen og det må registreres at sykkelen settes tilbake i stativet.
       I tekstområdet skal det skrives hvor sykkelen skal plasseres. Hvis
       sykkelens id-nummer er ukjent, skal det gis beskjed om det.*/
  public void leverInn()
  {



  }
   //Metoden skal sørge for at leiUt() kalles når det klikkes på knappen
   //  "Leie", og at leverInn() kalles når det klikkes på  knappen "Levere"
  public void actionPerformed(ActionEvent e) {

    if (e.getSource() == ut) {
      leiUt();
    } else if (e.getSource() == inn) {
      leverInn();
    }
  }
}// end of class Utleiested
