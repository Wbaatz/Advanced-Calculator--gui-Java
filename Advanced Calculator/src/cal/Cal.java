package cal;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.lang.Math;
public class Cal implements ActionListener {
	
    String n1="",n2="",op="",Output="";
    int operand=0,Res=0 ;
	JFrame f;
	JButton[] b = new JButton[10];
	JButton sum,diff,product,quotient,decimal,equal,clr,exponent,sqrt,percent,fictorial,formula;
	JPanel panel,pbasic;
    JTextField tf;
    JRadioButton basic;
    JRadioButton trg,eqn,drv,cubic;
    ButtonGroup group;
	Font font = new Font("Ink Free",Font.BOLD,25);
	Font fontL = new Font("Ink Free",Font.BOLD,10);
	JPanel ptrg;
	JButton[] tb = new JButton[6];
	JLabel T,F,D,E,C,B;
	private double ax,bx,cx;
	
	public Cal() {
		
		f = new JFrame("Advnaced Calculator");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(450, 550);
		f.setLayout(null);
		
		panel = new JPanel();
		panel.setBounds(50, 210, 250, 300);
		panel.setLayout(new GridLayout(4,3,10,10));
		pbasic = new JPanel();
		pbasic.setBounds(310,210,60,300);
		pbasic.setLayout(new GridLayout(4,3,10,10));
                
        tf = new JTextField();
		tf.setBounds(50, 25, 300, 50);
		tf.setFont(font);
		tf.setEditable(false);
		
		basic = new JRadioButton("Normal");
		basic.setBounds(50,110,16,16);
		basic.addActionListener(this);
		trg = new JRadioButton("Trigonometry");
		trg.setBounds(100,110,16,16);
		trg.addActionListener(this);
		eqn = new JRadioButton("Equation");
		eqn.setBounds(150,110,16,16);
		eqn.addActionListener(this);
		drv = new JRadioButton("Derivation");
		drv.setBounds(200,110,16,16);
		drv.addActionListener(this);
		cubic = new JRadioButton("Cubic");
		cubic.setBounds(250,110,16,16);
		cubic.addActionListener(this);
		group = new ButtonGroup();
		group.add(basic);
		group.add(trg);
		group.add(eqn);
		group.add(drv);
		group.add(cubic);
		
		for(int i=0 ; i<10 ; i++) {
			
			b[i] = new JButton(String.valueOf(i));
			b[i].addActionListener(this);
			b[i].setFont(font);
			b[i].setFocusable(false);
		}
		
		sum = new JButton("+");
		sum.addActionListener(this);
		sum.setFont(font);
		sum.setFocusable(false);
		diff = new JButton("-");
		diff.addActionListener(this);
		diff.setFont(font);
		diff.setFocusable(false);
		product = new JButton("x");
		product.addActionListener(this);
		product.setFont(font);
		product.setFocusable(false);
		quotient = new JButton("/");
		quotient.addActionListener(this);
		quotient.setFont(font);
		quotient.setFocusable(false);
        exponent = new JButton("^");
		exponent.addActionListener(this);
		exponent.setFont(font);
		exponent.setFocusable(false);
        sqrt = new JButton("\u00BD");
		sqrt.addActionListener(this);
		sqrt.setFont(font);
		sqrt.setFocusable(false);
        percent = new JButton("%");
		percent.addActionListener(this);
		percent.setFont(font);
		percent.setFocusable(false);
        fictorial = new JButton("!");
		fictorial.addActionListener(this);
		fictorial.setFont(font);
		fictorial.setFocusable(false);
		decimal = new JButton(".");
		decimal.addActionListener(this);
		decimal.setFont(font);
		decimal.setFocusable(false);
		clr = new JButton("AC");
		clr.addActionListener(this);
		clr.setFont(font);
		clr.setFocusable(false);
		equal = new JButton("=");
		equal.addActionListener(this);
		equal.setFont(font);
		equal.setFocusable(false);
		formula = new JButton("Formula Mode");
		formula.addActionListener(this);
		formula.setFont(font);
		formula.setFocusable(false);
        
		clr.setBounds(50,150,90,50);
		formula.setBounds(145,150,225,50);
		
		B = new JLabel("Base");
		B.setBounds(50,120,40,40);
		B.setFont(fontL);
		
		T = new JLabel("Trg");
		T.setBounds(100,120,40,40);
		T.setFont(fontL);
		
		E = new JLabel("Eqn");
		E.setBounds(150,120,40,40);
		E.setFont(fontL);
		
		D = new JLabel("Drv");
		D.setBounds(200,120,40,40);
		D.setFont(fontL);
		
		C = new JLabel("Cubic");
		C.setBounds(250,120,40,40);
		C.setFont(fontL);
		
		panel.add(b[1]);
		panel.add(b[2]);
		panel.add(b[3]);
		panel.add(sum);
		panel.add(b[4]);
		panel.add(b[5]);
		panel.add(b[6]);
		panel.add(diff);
		panel.add(b[7]);
		panel.add(b[8]);
		panel.add(b[9]);
		panel.add(product);
		panel.add(decimal);
		panel.add(b[0]);
		panel.add(equal);
		panel.add(quotient);
		
		pbasic.add(exponent);
		pbasic.add(sqrt);
		pbasic.add(percent);
		pbasic.add(fictorial);
		
        f.add(panel);
        f.add(pbasic);
		f.add(clr);
        f.add(tf);
        f.add(basic);
        f.add(trg);
        f.add(eqn);
        f.add(drv);
        f.add(cubic);
        f.add(formula);
        f.add(B);
        f.add(T);
        f.add(E);
        f.add(D);
        f.add(C);
		f.setVisible(true);
	}
        
        static public Double get_power(String n1 , String n2){
            
            Double a,b;
            a = Double.parseDouble(n1);
            b = Double.parseDouble(n2);
            Double c = Math.pow(a,b);
            return c;
        }
        
        static public Double get_fictorial(String n1) {
        	
        	Double a = Double.parseDouble(n1);
        	Double f=1.0;
        	for(int i=1 ; a>0 ; i++) {
        		
        		f *= i;
        		a--;
        	}
        	
        	return f;
        }
        
        static public Double get_percent(String n1 , String n2) {
        	
        	Double a = Double.parseDouble(n1);
        	Double b = Double.parseDouble(n2);
        	Double c;
        	c = (a/100)*b;
        	return c;
        }
        
        static public Double get_root(String n1) {
        	
        	Double c = Double.parseDouble(n1);
        	c = Math.sqrt(c);
        	return c;
        }
	
        
	public static void main(String[] args) {
		
		Cal x = new Cal();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==trg) {
			
			pbasic.setVisible(false);
			Trigonometry x = new Trigonometry();
			f.setVisible(false);
		}else if(e.getSource()==eqn) {
			
			pbasic.setVisible(false);
			Equation eq = new Equation();
			f.setVisible(false);
			
		}else if(e.getSource()==drv) {
			
			pbasic.setVisible(false);
			Derivation dr = new Derivation();
			f.setVisible(false);
		}else if(e.getSource()==cubic) {
			
			pbasic.setVisible(false);
			Cubic cb = new Cubic();
			f.setVisible(false);
		}else if(e.getSource()==formula) {
			
			Formula frm = new Formula();
			f.setVisible(false);
		}
		
		String s = e.getActionCommand();
		if (s.charAt(0)>='0'&&s.charAt(0)<='9')
		{
			
		if(op=="")
		{
			n1 += s;
			Output=Output+s;
			tf.setText(Output);
		}
		else
		{
			n2=n2+s;
			Output=Output+s;
			tf.setText(Output);
		}
		}else if(s.charAt(0)=='+' || s.charAt(0)=='-' || s.charAt(0)=='x' || s.charAt(0)=='/' || s.charAt(0)=='^' || s.charAt(0)=='!' || s.charAt(0)=='%' || s.charAt(0)=='\u00BD')
		{
		        operand++;
		
			if (operand==2)
			{
			if (op=="+")
					{
			n1= Integer.toString(Integer.parseInt(n1)+ Integer.parseInt(n2));
	                n2="";
				}
			else if (op=="-")
			{
		        n1= Integer.toString(Integer.parseInt(n1)- Integer.parseInt(n2));
		        n2="";
		}
			else if (op=="x")
			{
			n1= Integer.toString(Integer.parseInt(n1)* Integer.parseInt(n2));
		        n2="";
		}
			else if (op=="/")
			{
			n1= Integer.toString(Integer.parseInt(n1)/ Integer.parseInt(n2));
                        n2="";
		}       else if (op=="^"){
                        Double c; 
                        c = Cal.get_power(n1,n2);                    
                        n1 = Double.toString(c);
                        n2="";
                }else if(op=="!"){
                	
                	Double c;
                	c = Cal.get_fictorial(n1);
                	n1 = Double.toString(c);
                	n2="";
                }else if(op=="%") {
                	
                	Double c;
                	c = Cal.get_percent(n1,n2);
                	n1 = Double.toString(c);
                	n2="";
                }else if(op=="\u00BD") {
                	
                	Double c;
                	c = Cal.get_root(n1);
                	n1 = Double.toString(c);
                	n2="";
                }
			operand--;
			}
			op=s;
			Output=Output+s;
			tf.setText(Output);
		}else if (s=="AC")
		{
			n1=op=n2="";
			Output="";
			tf.setText(null);
		}else if(s=="del") {
			
			s = tf.getText();
			tf.setText("");
			tf.setText(tf.getText()+s.charAt(0));
			
		}
		else if (s.charAt(0)=='=')
		{
				
			if (op=="+")
			{
				Res=Integer.parseInt(n1)+Integer.parseInt(n2);
				tf.setText(Integer.toString(Res));
			//	n1=op=n2="";
			    Output= Output=Integer.toString(Res);;
                                
			}
			else if (op=="-")
			{
				Res=Integer.parseInt(n1)-Integer.parseInt(n2);
				tf.setText(Integer.toString(Res));
             //   n1=op=n2="";
			    Output= Output=Integer.toString(Res);;
			}
			else if (op=="/")
			{
				Res=Integer.parseInt(n1)/Integer.parseInt(n2);
			    tf.setText(Integer.toString(Res));
             //   n1=op=n2="";
			    Output= Output=Integer.toString(Res);;
			}
			else if (op=="x")
			{
				Res=Integer.parseInt(n1)*Integer.parseInt(n2);
				tf.setText(Integer.toString(Res));
             //   n1=op=n2="";
			    Output= Output=Integer.toString(Res);;
	  	}   else if (op=="^"){
                        
                  n1=Double.toString(Cal.get_power(n1, n2));
                  tf.setText(n1);
              //    n1=op=n2="";
			      Output=n1;
        }   else if(op=="!") {
        	
        	n1 = Double.toString(Cal.get_fictorial(n1));
        	tf.setText(n1);
        	//n1=op=n2="";
		    Output=n1;
        }   else if(op=="%") {
        	
        	n1 = Double.toString(Cal.get_percent(n1,n2));
        	tf.setText(n1);
        //	n1=op=n2="";
		    Output=n1;
        }   else if(op=="\u00BD") {
        	
        	n1 = Double.toString(Cal.get_root(n1));
        	tf.setText(n1);
        	//n1=op=n2="";
		    Output=n1;
        }
		}
      }
        
}
class Cal1{
	
	
	
}