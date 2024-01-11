package cal;

import java.util.Scanner;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
public class Equation extends Cal {
	
	double a;
	double b2;
	double c2;
    double Num1;
    double Num11;
    double Num2;
    double Num3;
    double Num4;
    double Num5;
    double PosNum;
    double Imagepart;
    double Realx1;
    double Realx2;
    
    String n3="";
    int i=0 ;
    boolean a1=true;
    boolean b1=true;
    boolean c1=true;
    Label A,B,C,txt1,x1,x2;
    JLabel demo;
    JTextField tf2,tf3,tf4,tf5;
    
    Font font2 = new Font("Ink Free",Font.BOLD,15);
	
    public Equation() {
    	pbasic.setVisible(false);
    	formula.setVisible(false);
    	A=new Label("x^2 +");
        A.setBounds(170, 70, 30, 30);
        B=new Label("x^1 +");
        B.setBounds(300, 70, 30, 30); 
      C=new Label("x^0");
        C.setBounds(430, 70, 30, 30);
        ImageIcon img = new ImageIcon("quad.jpg");
        demo = new JLabel("",img,JLabel.CENTER);
        demo.setBounds(355,255,210,255);
        
        basic.setBounds(50,110,16,16);
        
        
        x1=new Label("the value of x1 is :");
        x1.setBounds(30, 180, 100,10);
        x2=new Label("the value of x2 is :");
        x2.setBounds(30, 220, 100, 10);
        txt1=new Label("Solve the Quadratic Equation");
        txt1.setFont(font);
        txt1.setBounds(30, 5, 400, 50);
        
			f.setSize(600, 600);
			
			f.add(A);
			f.add(B);
			f.add(C);
	    	f.add(txt1);
			f.add(x1);
			f.add(x2);
			f.add(demo);
			
			
			panel.setBounds(50, 310, 300, 200);
			panel.setLayout(new GridLayout(4,3,5,5));
	   
	
			tf.setBounds(70, 70, 100, 30);
			tf.setFont(font);
		
			tf.setText("enter num");
			
			tf2 = new JTextField();
			tf2.setBounds(200, 70, 100, 30);
			tf2.setFont(font);
			tf2.setEditable(false);
			f.add(tf2);
			
			tf3 = new JTextField();
			tf3.setBounds(330, 70, 100, 30);
			tf3.setFont(font);
			tf3.setEditable(false);
			f.add(tf3);
			
			tf4 = new JTextField();
			tf4.setBounds(140, 165, 300, 30);
			tf4.setFont(font);
			tf4.setEditable(false);
			f.add(tf4);
		    tf5 = new JTextField();
			tf5.setBounds(140, 210, 300, 30);
			tf5.setFont(font);
			tf5.setEditable(false);
			f.add(tf5);
		
			clr.setBounds(50,250,90,50);
			
    }


 @Override
 
 public void actionPerformed(ActionEvent e)  {
	 if(e.getSource()==trg) {
		 panel.setVisible(true);
			pbasic.setVisible(false);
			A.setVisible(false);
			B.setVisible(false);
			C.setVisible(false);
			x1.setVisible(false);
			x2.setVisible(false);
			txt1.setVisible(false);
			tf2.setVisible(false);
			tf3.setVisible(false);
			tf4.setVisible(false);
			tf5.setVisible(false);
			Trigonometry x = new Trigonometry();
			f.setVisible(false);
		}else if(e.getSource()==basic) {
			f.setSize(450,550);
			panel.setVisible(true);
			pbasic.setVisible(true);
			A.setVisible(false);
			B.setVisible(false);
			C.setVisible(false);
			x1.setVisible(false);
			x2.setVisible(false);
			txt1.setVisible(false);
			tf2.setVisible(false);
			tf3.setVisible(false);
			tf4.setVisible(false);
			tf5.setVisible(false);
			f.setVisible(false);
			Cal x = new Cal();

		}else if(e.getSource()==cubic) {
			
			pbasic.setVisible(false);
			Cubic cb = new Cubic();
			f.setVisible(false);
		}else if(e.getSource()==drv) {
			
			pbasic.setVisible(false);
			Derivation dr = new Derivation();
			f.setVisible(false);
		}
	 String s = e.getActionCommand();
		if (s.charAt(0)>='0'&&s.charAt(0)<='9'||s.charAt(0)=='+' || s.charAt(0)=='-')
		{
			
			if (a1==true)
			{
				n1=n1+s;
	
				tf.setText(n1);	
			}
			else if (a1==false)
			{
				
				if (b1==true)
				{
					n2=n2+s;
					tf2.setText(n2);
					
				}
			}
			 if (b1==false)
			{
			
				if (c1==true)
				{
					
					n3=n3+s;
					tf3.setText(n3);	
				}
			
			}
			
		}
	if (s=="AC")
	{
		n1=n2=n3="";
		tf.setText("enter num");
		tf2.setText(null);
		tf3.setText(null);
		tf4.setText(null);
		tf5.setText(null);
		i=0;
		  a1=true;
		     b1=true;
		     c1=true;
		 
	}
		if (s.charAt(0)=='=')
		{
			double err= Double.parseDouble(tf.getText());
			if(err==0)
			{
				System.out.println("error try again");
				tf.setText("error");
				n1=n2=n3="";
			}
			else
			{
			a1=false;
			b1=false;
			c1=false;
			i++;
			}
	if (i==1)
	{
		tf2.setText("enter num");
		b1=true;
	}
	else if (i==2)
	{
		
		tf3.setText("enter num");	
		c1=true;
	}
	else if (i==3)
	{
		a= Double.parseDouble(tf.getText());
		b2= Double.parseDouble(tf2.getText());
		c2= Double.parseDouble(tf3.getText());
		
		Num1= b2*b2 - 4*a*c2;
		
		if (Num1<0)
		{	
		PosNum=	Num1*(-1);
		
		Imagepart=(double)Math.sqrt(PosNum)/(2*a);
		Imagepart=(double)Math.round(Imagepart*100)/100;
		Num3=(double) -(1*b2)/(2*a);
		Num3=(double)Math.round(Num3*100)/100;
		tf4.setText(Double.toString(Num3)+" -"+Double.toString(Imagepart)+"i");
		tf5.setText(Double.toString(Num3)+"+"+Double.toString(Imagepart)+"i");	
		}
		
		else{
			
		Num11=(double)Math.sqrt(Num1)/(2*a);
		Realx1=(double)-(1*b2)/(2*a) - Num11;
		Realx2=(double)-(1*b2)/(2*a) + Num11;
		Realx1=(double)Math.round(Realx1*100)/100;
		Realx2=(double)Math.round(Realx2*100)/100;
		tf4.setText(Double.toString(Realx1));
		tf5.setText(Double.toString(Realx2));	
		}
		
	
	
	
	
	}

	}

}

}
 