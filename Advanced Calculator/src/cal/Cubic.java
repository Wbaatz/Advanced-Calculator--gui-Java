package cal;

import java.awt.Label;
import java.awt.event.ActionEvent;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Cubic extends Equation {
	double d;
	double A3,B3,C3,D3;
	double H3,G3;
	double Discrem;
	double Alpha;
	double S;
	double y12;
	double x12;
	double a12,b12,c12,d12;
	
	



     String n3="";
     int i=0 ;
     boolean a1=true;
     boolean b1=true;
     boolean c1=true;
     boolean dd=true;
     JTextField tf6,tf7;
     Label D,xx3;
     JLabel democ,design;
 public String n4="";


     public Cubic() {

	
		pbasic.setVisible(false);
		formula.setVisible(false);
		
		ImageIcon img = new ImageIcon("cubeeqn.jpg");
		ImageIcon dsg = new ImageIcon("cubegraph.jpg");
		democ = new JLabel("",img,JLabel.CENTER);
		democ.setBounds(320,360,340,370);
		design = new JLabel("",dsg,JLabel.CENTER);
		design.setBounds(460,130,200,200);
		demo.setVisible(false);
	
		A.setText("x^3");
            A.setBounds(170, 70, 30, 30);
            B.setText("x^2");
            B.setBounds(300, 70, 30, 30); 
            C.setText("x^1");
            C.setBounds(430, 70, 30, 30); 
            D=new Label("x^0");
            D.setBounds(570,70,30,30);

            panel.setBounds(50, 430, 250, 300);

		clr.setBounds(50,373,247,50);


            x1.setBounds(30, 140, 100,10);
            x2.setBounds(30, 170, 100, 10);
            txt1.setText("The Cubic Equation");
            txt1.setFont(font);
            txt1.setBounds(30, 5, 400, 50);

            x1.setBounds(30, 220, 100,10);
            x2.setBounds(30, 260, 100, 10);
            tf4.setBounds(140, 210, 300, 30);
            tf5.setBounds(140, 250, 300, 30);
            tf6 = new JTextField();
			tf6.setBounds(470, 70, 100, 30);
			tf6.setFont(font);
			tf6.setEditable(false);
			
			 tf7 = new JTextField();
			 tf7.setBounds(140, 300, 300, 30);
			 tf7.setFont(font);
			 tf7.setEditable(false);
				
				
			
		   xx3=new Label("the value of x3 is :");
		   xx3.setBounds(30, 310, 100, 10);
				
            f.setSize(700,800);
            f.add(D);
            f.add(tf6);
            f.add(tf7);
            f.add(xx3);
            f.add(democ);
            f.add(design);
     }
     public void actionPerformed(ActionEvent e) {
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
		}else if(e.getSource()==drv) {
			
			pbasic.setVisible(false);
			Derivation dr = new Derivation();
			f.setVisible(false);
		}else if(e.getSource()==eqn) {
			
			pbasic.setVisible(false);
			Equation eq = new Equation();
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
			 if (c1==false)
			{
			
				if (dd==true)
				{
					
					n4=n4+s;
					tf6.setText(n4);	
				}
			
			}
			
		}
	if (s=="AC")
	{
		n1=n2=n3=n4="";
		tf.setText("enter num");
		tf2.setText(null);
		tf3.setText(null);
		tf4.setText(null);
		tf5.setText(null);
		tf6.setText(null);
		tf7.setText(null);
		i=0;
		  a1=true;
		     b1=true;
		     c1=true;
		     dd=true;
		
	}
		if (s.charAt(0)=='=')
		{
			double err= Double.parseDouble(tf.getText());
			if(err==0)
			{
				System.out.println("error try again");
				tf.setText("error");
				n1=n2=n3=n4="";
			}
			else
			{
			
			
			a1=false;
			b1=false;
			c1=false;
			dd=false;
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
		tf6.setText("enter num");	
		dd=true;
	}
	else if (i==4)
	{
		a12= Double.parseDouble(tf.getText());
		b12= Double.parseDouble(tf2.getText());
		c12= Double.parseDouble(tf3.getText());	
		d12=Double.parseDouble(tf6.getText());	
		A3=a12;
		
		B3=(double)b12/3;
		
		C3=c12/3;
		
		D3=d12;
		
		H3=A3*C3-B3*B3;
		G3=2*B3*B3*B3-3*A3*B3*C3+A3*A3*D3;

		
		Discrem=G3*G3 + 4*H3*H3*H3;

		if (Discrem>0){
		System.out.printf("\n roots are real and distinct");
		}
		else if (Discrem==0)
		{
			System.out.printf("\n roots are real and equal");
		}
		else if (Discrem<0)
		{
			System.out.printf("\n  real root and roots are complex");	
		}
			
		S=(G3 +Math.sqrt(G3*G3 + 4*H3*H3*H3))/2;	
		
		Alpha=Math.cbrt(S);
		
		y12=-Alpha + H3/Alpha;
		
		x12=(y12-B3)/A3;
		x12=(double)Math.round(x12*100)/100;
		tf4.setText(Double.toString(x12));

		
		a12=1;
		b12=y12;
		c12=3*H3 + y12*b12;

		
		Num1= b12*b12 - 4*a12*c12;
		if (Num1<0)	{
			
		PosNum=	Num1*(-1);
		
		Imagepart=(double)Math.sqrt(PosNum)/(2*a12);
		Num3=(double) -(1*b12)/(2*a12);
		
		Num3=(Num3-B3)/A3;
		
		Imagepart=(Imagepart)/A3;
		Num3=(double)Math.round(Num3*100)/100;
		Imagepart=(double)Math.round(Imagepart*100)/100;
		tf5.setText(Double.toString(Num3)+" -"+Double.toString(Imagepart)+"i");
		tf7.setText(Double.toString(Num3)+"+"+Double.toString(Imagepart)+"i");	

		
		}
		else
			{
		Num11=(double)Math.sqrt(Num1)/(2*a12);
		
		Realx1=(double)-(1*b12)/(2*a12) - Num11;
		
		Realx2=(double)-(1*b12)/(2*a12) + Num11;
		
		Realx1=(Realx1-B3)/A3;
		
		Realx2=(Realx2-B3)/A3;
		
		Realx1=(double)Math.round(Realx1*100)/100;
		Realx2=(double)Math.round(Realx2*100)/100;
		tf5.setText(Double.toString(Realx1));
		tf7.setText(Double.toString(Realx2));	
	}
		
	}
	}
	
		}}
