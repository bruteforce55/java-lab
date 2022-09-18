import java.io.*;
import java.awt.*;
import java.awt.event.*;
public class regform extends Frame
{
    
	Label namel,agel,genl,addrl,mnol;
	TextField namet,aget,gent,mnot;
    Checkbox female,male;
    CheckboxGroup gen;
	TextArea addrt;

	regform()
	{	
       

		namel =new Label("Name");
		namet = new TextField();
		namel.setBounds(20,50,80,20);
        namet.setBounds(120,50,100,20);
		add(namel);
		add(namet);
		
		agel = new Label("Age");
		aget = new TextField();
		agel.setBounds(20,80,80,20);
        aget.setBounds(120,80,100,20);
		add(agel);
		add(aget);

        genl = new Label("Gender");
        genl.setBounds(20,110,100,20);
        
		gen = new CheckboxGroup();
        male = new Checkbox("Male",gen,true);
        male.setBounds(120,110,100,20);
        add(male);

        female = new Checkbox("Female",gen,false);
        female.setBounds(120,130,100,20);
        add(female);

        mnol = new Label("MobileNo");
		mnot = new TextField();
		mnol.setBounds(20,140,80,20);
        mnot.setBounds(120,150,100,20);
		add(mnol);
		add(mnot);

        
        addrl = new Label("Address");
        addrt = new TextArea(10,20);
        addrl.setBounds(20,170,80,20);
        addrt.setBounds(120,180,140,20);
        add(addrl);
        add(addrt);


       	Button b1=new Button("Submit");
        b1.setBounds(20,200,80,20);
        add(b1);
		
		
	}
    
    public static void main(String args[])
    {
       regform r=new regform();
		r.setSize(400,400);
        r.setLayout(null);
        r.setVisible(true);
    }
}