import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/*<applet code="traffic" width="100" height="100"></applet>*/
public class traffic extends Applet implements ItemListener
 {
 CheckboxGroup cbg;
 Checkbox c1,c2,c3;
 public void init()
 {
 cbg=new CheckboxGroup();
 c1=new Checkbox("Green",cbg,false);
 c2=new Checkbox("Yellow",cbg,false);
 c3=new Checkbox("Red",cbg,false);
 add(c1);
 add(c2);
 add(c3);
 c1.addItemListener(this);
 c2.addItemListener(this);
 c3.addItemListener(this);
 }
 public void itemStateChanged(ItemEvent e)
 {
  repaint();
 }
 public void paint(Graphics g)
 {
 g.fillRoundRect(75,35,150,350,40,40);
 g.fillRect(135,350,25,100);
 if(cbg.getSelectedCheckbox().getLabel()=="Green")
  {
 g.drawString("Go",300,200);
 g.setColor(Color.green);
 g.fillOval(100,65,100,100);
  }
  if(cbg.getSelectedCheckbox().getLabel()=="Yellow")
  {
 g.drawString("Slow",300,200);
 g.setColor(Color.yellow);
 g.fillOval(100,100,100,100);
  }
  if(cbg.getSelectedCheckbox().getLabel()=="Red")
  {
 g.drawString("Stop",300,200);
 g.setColor(Color.red);
 g.fillOval(100,130,100,100);
  }

 }
 }