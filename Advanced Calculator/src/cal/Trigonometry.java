package cal;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;

import javax.swing.*;

public class Trigonometry extends Cal{
		
	JPanel ptrg;
	JButton[] tb = new JButton[6];
	String n="";
	char[] t = new char[2];
	double tg;
	JLabel demo;
	
	public Trigonometry() {
		
		f.setSize(600,550);
		pbasic.setVisible(false);
		formula.setBounds(320,440,220,60);
		clr.setSize(247,50);
		ptrg = new JPanel();
		ptrg.setBounds(320,210,220,300);
		ptrg.setLayout(new GridLayout(4,4,14,14));
		ImageIcon img = new ImageIcon("triangle.png");
		demo = new JLabel("",img,JLabel.CENTER);
		demo.setBounds(360,20,210,120);
		sum.setVisible(false);
		diff.setVisible(false);
		product.setVisible(false);
		quotient.setVisible(false);
		
		
		tb[0] = new JButton("Sin");
		tb[1] = new JButton("Cos");
		tb[2] = new JButton("Tan");
		tb[3] = new JButton("aSin");
		tb[4] = new JButton("aCos");
		tb[5] = new JButton("aTan");
		
		for(int i=0 ; i<6 ; i++) {
			
			tb[i].addActionListener(this);
			tb[i].setFont(font);
			tb[i].setFocusable(false);
		}
		
		ptrg.add(tb[0]);
		ptrg.add(tb[3]);
		ptrg.add(tb[1]);
		ptrg.add(tb[4]);
		ptrg.add(tb[2]);
		ptrg.add(tb[5]);
		
		f.add(ptrg);
		f.add(demo);
		
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		String s = e.getActionCommand();
		for(int i=0;i<10;i++) {
			if(e.getSource() == b[i]) {
				tf.setText(tf.getText().concat(String.valueOf(i)));
			}
			
			if (s.charAt(0)>='0'&&s.charAt(0)<='9') {
				
				n+=s;
			}
		}
		
		if(e.getSource()==tb[0]) {
			
			tf.setText("Sin");
			t[0] = 's';
			t[1] = 'i';
		}else if(e.getSource()==tb[1]) {
			
			tf.setText("Cos");
			t[0] = 'c';
			t[1] = 'o';
		}else if(e.getSource()==tb[2]) {
			
			tf.setText("Tan");
			t[0] = 't';
			t[1] = 'a';
		}else if(e.getSource()==tb[3]) {
			
			tf.setText("aSin");
			t[0] = 'a';
			t[1] = 's';
		}else if(e.getSource()==tb[4]) {
			
			tf.setText("aCos");
			t[0] = 'a';
			t[1] = 'c';
		}else if(e.getSource()==tb[5]) {
			
			tf.setText("aTan");
			t[0] = 'a';
			t[1] = 't';
		}else if(e.getSource()==equal) {
			
			tg = Double.parseDouble(n);
			
			if(t[0]=='s'&&t[1]=='i') {
				
				tf.setText(Double.toString(Math.sin(tg)));
			}else if(t[0]=='c'&&t[1]=='o') {
				
				tf.setText(Double.toString(Math.cos(tg)));
			}else if(t[0]=='t'&&t[1]=='a') {
				
				tf.setText(Double.toString(Math.tan(tg)));
			}else if(t[0]=='a'&&t[1]=='s') {
				
				tf.setText(Double.toString(Math.asin(tg)));
			}else if(t[0]=='a'&&t[1]=='c') {
				
				tf.setText(Double.toString(Math.acos(tg)));
			}else if(t[0]=='a'&&t[1]=='t') {
				
				tf.setText(Double.toString(Math.atan(tg)));
			}
		}else if(e.getSource()==clr) {
			
			n="";
			tf.setText(null);
		}else if(e.getSource()==basic) {
			
			f.setSize(450,550);
			pbasic.setVisible(true);
			ptrg.setVisible(false);
			f.setVisible(false);
			Cal x = new Cal();
			
		}
else if(e.getSource()==eqn) {
			
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

}
}

