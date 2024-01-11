package cal;
import java.awt.Font;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.lang.Math.*;
import static java.lang.Math.pow;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Derivation extends Cal {
	 int i=0;
	String nm1="",nm2="",nm3="",nm4="",nm5="",nm6="",nm7="";
	boolean b1=true,b2=true,b3=true,b4=true,b5=true,b6=true,b7=true;
	JTextField x1,x2,x3,x4,x5,x6,xx,ans;
	Label l1,l2,l3,l4,l5,l6,lx,lans,cf;
	JLabel demo;
	Font font2 = new Font("Ink Free",Font.BOLD,15);
	
	public Derivation() {
		
		pbasic.setVisible(false);
		formula.setVisible(false);
		f.setSize(500,600);
		tf.setVisible(false);
		ImageIcon img = new ImageIcon("drv.png");
		demo = new JLabel("",img,JLabel.CENTER);
		demo.setBounds(315,212,150,295);
		clr.setSize(247,50);
		
		x1 = new JTextField();
		x1.setBounds(50,25,40,30);
		x1.setFont(font);
		x1.setVisible(true);
		x2 = new JTextField();
		x2.setBounds(120,25,40,30);
		x2.setFont(font);
		x2.setVisible(true);
		x3 = new JTextField();
		x3.setBounds(190,25,40,30);
		x3.setFont(font);
		x3.setVisible(true);
		x4 = new JTextField();
		x4.setBounds(260,25,40,30);
		x4.setFont(font);
		x4.setVisible(true);
		x5 = new JTextField();
		x5.setBounds(330,25,40,30);
		x5.setFont(font);
		x5.setVisible(true);
		x6 = new JTextField();
		x6.setBounds(400,25,40,30);
		x6.setFont(font);
		x6.setVisible(true);
		xx = new JTextField();
		xx.setBounds(100,65,80,40);
		xx.setFont(font);
		xx.setVisible(true);
		ans = new JTextField();
		ans.setBounds(270,65,150,40);
		
		l1 = new Label("x^6");
		l1.setBounds(22,22,40,40);
		l1.setFont(font2);
		l2 = new Label("x^5");
		l2.setBounds(90,22,40,40);
		l2.setFont(font2);
		l3 = new Label("x^4");
		l3.setBounds(160,22,40,40);
		l3.setFont(font2);
		l4 = new Label("x^3");
		l4.setBounds(230,22,40,40);
		l4.setFont(font2);
		l5 = new Label("x^2");
		l5.setBounds(300,22,40,40);
		l5.setFont(font2);
		l6 = new Label("x^1");
		l6.setBounds(370,22,40,40);
		l6.setFont(font2);
		lx = new Label("Value of x=");
		lx.setBounds(10,70,100,30);
		lx.setFont(font2);
		lans = new Label("ANS=");
		lans.setBounds(215,70,45,32);
		lans.setFont(font2);
		cf = new Label("Co-Efficients: ");
		cf.setBounds(20,2,100,20);
		cf.setFont(font2);
		
		
		f.add(x1);
		f.add(x2);
		f.add(x3);
		f.add(x4);
		f.add(x5);
		f.add(x6);
		f.add(xx);
		f.add(ans);
		f.add(l1);
		f.add(l2);
		f.add(l3);
		f.add(l4);
		f.add(l5);
		f.add(l6);
		f.add(lx);
		f.add(lans);
		f.add(cf);
		f.add(demo);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		String s = e.getActionCommand();
		if (s.charAt(0)>='0'&&s.charAt(0)<='9'||s.charAt(0)=='+' || s.charAt(0)=='-') {
			
			
			if (b1==true)
			{
				nm1=nm1+s;
				x1.setText(nm1);	
			}
			else if (b1==false)
			{
				
				if (b2==true)
				{
					nm2=nm2+s;
					x2.setText(nm2);
					
				}
			}
			 if (b2==false)
			{
			
				if (b3==true)
				{
					
					nm3=nm3+s;
					x3.setText(nm3);	
				}
			
			}
			 if (b3==false)
				{
				
					if (b4==true)
					{
						
						nm4=nm4+s;
						x4.setText(nm4);	
					}
					 if (b4==false)
						{
						
							if (b5==true)
							{
								
								nm5=nm5+s;
								x5.setText(nm5);	
							}
						
						}
					 if (b5==false)
						{
						
							if (b6==true)
							{
								
								nm6=nm6+s;
								x6.setText(nm6);	
							}
						
						}
					 if (b6==false)
						{
						
							if (b7==true)
							{
								
								nm7=nm7+s;
								xx.setText(nm7);	
							}
						
						}
				}
			
		}
	if (s=="AC")
	{
		nm1=nm2=nm3=nm4=nm5=nm6=nm7="";
		x1.setText("enter num");
		x2.setText(null);
		x3.setText(null);
		x4.setText(null);
		x5.setText(null);
		x6.setText(null);
		xx.setText(null);
		i=0;
		b1=true;
		b2=true;
		b3=true;
		b4=true;
		b5=true;
		b6=true;
		b7=true;
		 
	}
		if (s.charAt(0)=='=')
		{
			b1=false;
			b2=false;
			b3=false;
			b4=false;
			b5=false;
			b6=false;
			b7=false;
			i++;
	if (i==1)
	{
		x2.setText("enter num");
		b2=true;
	}
	else if (i==2)
	{
		
		x3.setText("enter num");	
		b3=true;
	}
	else if (i==3)
	{
		x4.setText("enter num");	
		b4=true;
	}
	else if (i==4)
	{
		x5.setText("enter num");	
		b5=true;
	}
	else if (i==5)
	{
		x6.setText("enter num");	
		b6=true;
	}
	else if (i==6)
	{
		xx.setText("enter num");	
		b7=true;
                
	}
        else if (i==7)
            
        {
            Double dr1 = Double.parseDouble(nm1);
                Double dr2 = Double.parseDouble(nm2);
                Double dr3 = Double.parseDouble(nm3);
                Double dr4 = Double.parseDouble(nm4);
                Double dr5 = Double.parseDouble(nm5);
                Double dr6 = Double.parseDouble(nm6);
                Double xv = Double.parseDouble(nm7);
                
                Double d1 = (6*dr1)*pow(xv,5);
                Double d2 = (5*dr2)*pow(xv,4);
                Double d3 = (4*dr3)*pow(xv,3);
                Double d4 = (3*dr4)*pow(xv,2);
                Double d5 = (2*dr5)*pow(xv,1);
                Double d6 = dr6;
                
                Double gr = d1+d2+d3+d4+d5+d6;
                ans.setText(Double.toString(gr));
        }
	
	
		}
		
if(e.getSource()==trg) {
			
			pbasic.setVisible(false);
			Trigonometry x = new Trigonometry();
			f.setVisible(false);
		}else if(e.getSource()==eqn) {
			
			pbasic.setVisible(false);
			Equation eq = new Equation();
			f.setVisible(false);
			
		}else if(e.getSource()==basic) {
			
			f.setSize(450,550);
			pbasic.setVisible(true);
			x1.setVisible(false);
			x2.setVisible(false);
			x3.setVisible(false);
			x4.setVisible(false);
			x5.setVisible(false);
			x6.setVisible(false);
			xx.setVisible(false);
			ans.setVisible(false);
			f.setVisible(false);
			Cal x = new Cal();
			
		}else if(e.getSource()==cubic) {
			
			pbasic.setVisible(false);
			Cubic cb = new Cubic();
			f.setVisible(false);
		}
	}
	
}