package cal;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintStream;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

interface sheet{
	
	public void Algebraic() throws IOException;
	
	public void trigonometry() throws IOException;
	
	public void logarathmic() throws IOException;
}

public class Formula implements sheet , ActionListener{
	
	File F = new File("Formula Sheet.txt");
	
	JFrame f;
	JButton trg,alg,log,base;
	JPanel frp = new JPanel();
	JTextArea ta;
	JLabel design,title;
	Font font = new Font("Ink Free",Font.BOLD,25);
	
	public Formula () {
		
		f = new JFrame("Formula Sheet");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(800,900);
		f.setLayout(null);
		f.setVisible(true);
		
		ImageIcon img = new ImageIcon("frame.jpg");
		ImageIcon t = new ImageIcon("title.jpg");
		design = new JLabel("",img,JLabel.CENTER);
		design.setBounds(10,50,230,800);
		title = new JLabel("",t,JLabel.CENTER);
		title.setBounds(60,5,657,40);
		
		frp = new JPanel();
		frp.setBounds(50, 210, 250, 300);
		frp.setLayout(new GridLayout(4,3,10,10));
		
		ta = new JTextArea();
		ta.setBounds(250,50,500,800);
		ta.setEditable(false);
		
		trg = new JButton("Trigonometry");
		trg.setBounds(20,150,200,70);
		trg.setFocusable(false);
		trg.addActionListener(this);
		trg.setFont(font);
		
		alg = new JButton("Algebraic");
		alg.setBounds(20,300,200,70);
		alg.setFocusable(false);
		alg.addActionListener(this);
		alg.setFont(font);
		
		log = new JButton("Logarathmic");
		log.setBounds(20,450,200,70);
		log.setFocusable(false);
		log.addActionListener(this);
		log.setFont(font);
		
		base = new JButton("Basic Mode");
		base.setBounds(20,600,200,70);
		base.setFocusable(false);
		base.addActionListener(this);
		base.setFont(font);
				
		f.add(ta);
		f.add(trg);
		f.add(alg);
		f.add(log);
		f.add(base);
		f.add(design);
		f.add(title);
		
	}
	
	
	@Override
	public void trigonometry() throws IOException{

		
		FileOutputStream stm = new FileOutputStream(F);
		BufferedWriter fw = new BufferedWriter(new OutputStreamWriter(stm));
		BufferedReader br = new BufferedReader(new FileReader("Formula Sheet.txt"));
		
		fw.write("Pythagorian Identities: ");
		fw.write("\n");
		fw.newLine();
		fw.write("(Sinx)^2 + (Cosx)^2 = 1");
		fw.newLine();
		fw.newLine();
		fw.write("(Secx)^2 = 1 + (Tanx)^2");
		fw.newLine();
		fw.newLine();
		fw.write("(Cosecx)^2 = 1 + (Cotx)^2");
		fw.newLine();
		fw.newLine();
		fw.write("Half-Angel: ");
		fw.newLine();
		fw.newLine();
		fw.write("Cos(x/2) = sqrt(1+Cosx)/2");
		fw.newLine();
		fw.newLine();
		fw.write("Sin(x/2) = sqrt(1-Cosx)/2");
		fw.newLine();
		fw.newLine();
		fw.write("Tan(x/2) = sqrt(1-Cosx)/(1+Cosx)");
		fw.newLine();
		fw.newLine();
		fw.write("Double Angel: ");
		fw.newLine();
		fw.newLine();
		fw.write("Sin2x = 2SinxCosx");
		fw.newLine();
		fw.newLine();
		fw.write("Cos2x = (Cosx)^2 - (sinx)^2");
		fw.newLine();
		fw.newLine();
		fw.write("Tan2x = 2Tanx / 1 - (Tanx)^2");
		fw.newLine();
		fw.newLine();
		fw.write("Triple Angle");
		fw.newLine();
		fw.newLine();
		fw.write("Sin3x = 3Sinx - 4(Sinx)^3");
		fw.newLine();
		fw.newLine();
		fw.write("Cos3x = 4(Cosx)^3 - 3Cosx");
		fw.newLine();
		fw.newLine();
		fw.write("Tan3x = 3Tanx - (Tanx)^3 / 1 - 3(Tanx)^2");
		fw.newLine();
		fw.newLine();
		fw.newLine();
		fw.write("Ptolemy Identities: ");
		fw.newLine();
		fw.newLine();
		fw.write("Sin(x+y) = SinxCosy + CosxSiny");
		fw.newLine();
		fw.newLine();
		fw.write("Sin(x-y) = SinxCosy - CosxSiny");
		fw.newLine();
		fw.newLine();
		fw.write("Cos(x+y) = CosxCosy - SinxSiny");
		fw.newLine();
		fw.newLine();
		fw.write("Cos(x-y) = CosxCosy + SinxSiny");
		fw.newLine();
		fw.newLine();
		fw.write("Tan(x+y) = (Tanx + Tany) / 1 - TanxTany");
		fw.newLine();
		fw.newLine();
		fw.write("Tan(x-y) = (Tanx - Tany) / 1 + TanxTany");
		fw.newLine();
		fw.newLine();
		fw.write("Cot(x+y) = (CotxCoty - 1) / Cotx + Coty");
		fw.newLine();
		fw.newLine();
		fw.write("Cot(x-y) = (CotxCoty + 1) / Coty - Cotx");
		fw.newLine();
		
		fw.close();
		
		int buffer = 0;
		String str = "";
		
		while((buffer = br.read())!=-1) {
			
			str = str + ((char)buffer);
		}
		
		ta.setText(str);
		
	}
	
	@Override
	public void logarathmic() throws IOException{
		
		FileOutputStream stm = new FileOutputStream(F);
		BufferedWriter fw = new BufferedWriter(new OutputStreamWriter(stm));
		BufferedReader br = new BufferedReader(new FileReader("Formula Sheet.txt"));
		
		fw.write("Properties Of Logarithm: ");
		fw.newLine();
		fw.newLine();
		fw.write("log( x . y ) = log x + log y");
		fw.newLine();
		fw.newLine();
		fw.write("log( x / y ) = log x - log y");
		fw.newLine();
		fw.newLine();
		fw.write("log x^n = n log x");
		fw.newLine();
		fw.newLine();
		fw.write("c log x + d log y = log x^c y^d");
		fw.newLine();
		fw.newLine();
		fw.write("log( x + y ) = log x + log(1 + y / x)");
		fw.newLine();
		fw.newLine();
		fw.write("log( x - y ) = log x + log(1 - y / x)");
		fw.newLine();
        fw.close();
		
		int buffer = 0;
		String str = "";
		
		while((buffer = br.read())!=-1) {
			
			str = str + ((char)buffer);
		}
		
		ta.setText(str);
	}
    
	@Override
	public void Algebraic() throws IOException{
		
		FileOutputStream stm = new FileOutputStream(F);
		BufferedWriter fw = new BufferedWriter(new OutputStreamWriter(stm));
		BufferedReader br = new BufferedReader(new FileReader("Formula Sheet.txt"));
		
		fw.write("Algebraic Equations: ");
		fw.newLine();
		fw.newLine();
		fw.newLine();
		fw.write("a^2 - b^2 = (a+b)(a-b)");
		fw.newLine();
		fw.newLine();
		fw.write("a^2 + b^2 = (a-b)^2 + 2ab");
		fw.newLine();
		fw.newLine();
		fw.write("(a+b)^2 = a^2 + 2ab + b^2");
		fw.newLine();
		fw.newLine();
		fw.write("(a-b)^2 = a^2 - 2ab + b^2");
		fw.newLine();
		fw.newLine();
		fw.write("(a+b+c)^2 = a^2 + b^2 + c^2 + 2(ab+bc+ac)");
		fw.newLine();
		fw.newLine();
		fw.write("(a-b-c)^2 = a^2 + b^2 + c^2 + 2(-ab+bc-ac)");
		fw.newLine();
		fw.newLine();
		fw.write("(a+b)^3 = a^3 + 3a^2b + 3ab^2 + b^3");
		fw.newLine();
		fw.newLine();
		fw.write("(a-b)^3 = a^3 - 3a^2b + 3ab^2 - b^3");
		fw.newLine();
		fw.newLine();
		fw.write("a^3 + b^3 = (a+b)(a^2-ab+b^2)");
		fw.newLine();
		fw.newLine();
		fw.write("a^3 - b^3 = (a-b)(a^2+ab+b^2)");
		fw.newLine();
		fw.newLine();
		fw.write("(a+b)^4 = a^4 + 4a^3b + 6a^2b^2 + 4ab^3 + b^4");
		fw.newLine();
		fw.newLine();
		fw.write("(a-b)^4 = a^4 - 4a^3b + 6a^2b^2 - 4ab^3 + b^4");
		fw.newLine();
		fw.newLine();
		fw.write("a^5 - b^5 = (a-b)(a^4 + a^3b + a^2b^2 + ab^3 + b^4)");
		fw.newLine();
		
        fw.close();
		
		int buffer = 0;
		String str = "";
		
		while((buffer = br.read())!=-1) {
			
			str = str + ((char)buffer);
		}
		
		ta.setText(str);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
				
		if(e.getSource()==trg) {
			
			ta.setText(null);
			
           try {
			trigonometry();
		} catch (IOException e1) {
			
			e1.printStackTrace();
		}
		}else if(e.getSource()==alg){
			
			ta.setText(null);
			
			try {
				Algebraic();
			} catch (IOException e1) {
				
				e1.printStackTrace();
			}
			
		}else if(e.getSource()==log) {
			
			try {
				logarathmic();
			} catch (IOException e1) {
				
				e1.printStackTrace();
			}
		}else if(e.getSource()==base) {
			
			Cal x = new Cal();
			f.setVisible(false);
		}
	}

}
