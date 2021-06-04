import java.awt.Color;
import java.awt.Font;
import java.awt.Label;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.NumberFormat.Style;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.plaf.basic.BasicInternalFrameTitlePane.SizeAction;



public class Calculator  implements ActionListener {
	
	
	
	JFrame jf;
	JLabel displayLabel;
	JButton sevenButton;
	JButton eightButton;
	JButton clearButton;
	JButton dotButton;
	JButton divisionButton;
	JButton nineButton;
	JButton fourButton;
	JButton fiveButton;
	JButton sixButton;
	JButton oneButton;
	JButton twoButton;
	JButton threeButton;
	JButton plusButton;
	JButton minusButton;
	JButton multiplicationButton;
	JButton zeroButton;
	JButton equaltoButton;
	String oldvalue;
	String oldvalue1;
	String oldvalue2;
	String oldvalue3;
	String newvalue;
	String result;
	int isoperatorclicked=0;
	
	public Calculator() {
	    jf=new JFrame("Calculator");
	    jf.setLayout(null);
		 
		jf.setSize(550,600);
		jf.setLocation(300, 100);
		jf.getContentPane().setBackground(Color.ORANGE);
	    displayLabel=new JLabel();
	    displayLabel.setFont(new Font(displayLabel. getName(), Font. BOLD,50));
	    displayLabel.setBounds(40, 10, 450,60 );
		displayLabel.setBackground(Color.white);
		
		displayLabel.setOpaque(true);
		displayLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		displayLabel.setForeground(Color.black);
		jf.add(displayLabel);
		
	    sevenButton=new JButton("7");
		sevenButton.setBounds(30, 120, 80, 80);
		sevenButton.setFont(new Font("Arial", Font.HANGING_BASELINE, 40));
		jf.add(sevenButton);
		sevenButton.addActionListener(this);
		
	    eightButton=new JButton("8");
		eightButton.setBounds(130, 120, 80, 80);
		eightButton.setFont(new Font("Arial", Font.ITALIC, 40));
		jf.add(eightButton);
		eightButton.addActionListener(this);
		
		
	    nineButton=new JButton("9");
		nineButton.setBounds(230, 120, 80, 80);
		nineButton.setFont(new Font("Arial", Font.BOLD, 40));
		jf.add(nineButton);
		nineButton.addActionListener(this);
		
	    fourButton=new JButton("4");
		fourButton.setBounds(30, 220, 80, 80);
		fourButton.setFont(new Font("Arial", Font.BOLD, 40));
		jf.add(fourButton);
		fourButton.addActionListener(this);
		
	    fiveButton=new JButton("5");
		fiveButton.setBounds(130, 220, 80, 80);
		fiveButton.setFont(new Font("Arial", Font.BOLD, 40));
		jf.add(fiveButton);
		fiveButton.addActionListener(this);
		
		
	    sixButton=new JButton("6");
		sixButton.setBounds(230, 220, 80, 80);
		sixButton.setFont(new Font("Arial", Font.BOLD, 40));
		jf.add(sixButton);
		sixButton.addActionListener(this);
		
	
	    oneButton=new JButton("1");
		oneButton.setBounds(30, 320, 80, 80);
		oneButton.setFont(new Font("Arial", Font.BOLD, 40));
		jf.add(oneButton);
		oneButton.addActionListener(this);
		
	    twoButton=new JButton("2");
		twoButton.setBounds(130, 320, 80, 80);
		twoButton.setFont(new Font("Arial", Font.BOLD, 40));
		jf.add(twoButton);	
		twoButton.addActionListener(this);
		
	    threeButton=new JButton("3");
		threeButton.setBounds(230, 320, 80, 80);
		threeButton.setFont(new Font("Arial", Font.BOLD, 40));
		jf.add(threeButton);
		threeButton.addActionListener(this);
		
			
		
		 dotButton=new JButton(".");
		 dotButton.setBounds(30, 420, 80, 80);
		 dotButton.setFont(new Font("Arial", Font.BOLD, 40));
      	jf.add( dotButton);
      	dotButton.addActionListener(this);
		
	    zeroButton=new JButton("0");
		zeroButton.setBounds(130, 420, 80, 80);
		zeroButton.setFont(new Font("Arial", Font.BOLD, 40));
		jf.add(zeroButton);
		zeroButton.addActionListener(this);
		
	    equaltoButton=new JButton("=");
		equaltoButton.setBounds(230, 420, 80, 80);
		equaltoButton.setFont(new Font("Arial", Font.BOLD, 40));
		jf.add(equaltoButton);
		equaltoButton.addActionListener(this);
		
        divisionButton=new JButton("/");
		divisionButton.setBounds(330, 120, 80, 80);
		divisionButton.setFont(new Font("Arial", Font.BOLD, 40));
		jf.add(divisionButton);
		divisionButton.addActionListener(this);
		
		  
		
        plusButton=new JButton("+");
		plusButton.setBounds(330, 220, 80, 80);
		plusButton.setFont(new Font("Arial", Font.BOLD, 40));
		jf.add(plusButton);
		plusButton.addActionListener(this);
		
		 minusButton=new JButton("-");
		 minusButton.setBounds(330, 320, 80, 80);
		 minusButton.setFont(new Font("Arial", Font.BOLD, 40));
			jf.add( minusButton);
			 minusButton.addActionListener(this);
		
			
			 multiplicationButton=new JButton("x");
			    multiplicationButton.setBounds(330, 420, 80, 80);
			    multiplicationButton.setFont(new Font("Arial", Font.BOLD, 40));
				jf.add(multiplicationButton);
				multiplicationButton.addActionListener(this);
				
				
	    	clearButton=new JButton("C");
		    clearButton.setBounds(430, 120, 80, 80);
			clearButton.setFont(new Font("Arial", Font.PLAIN, 40));
			jf.add(clearButton);
			clearButton.addActionListener(this);
		
		
		
		
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	public static void main(String[] args) {
		new Calculator();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		
	
		
		
		if(e.getSource()==sevenButton) {
			
			displayLabel.setText(displayLabel.getText()+"7");	
			}
		
		if(e.getSource()==eightButton) {
			displayLabel.setText(displayLabel.getText()+"8");
				
			}
		
		if(e.getSource()==nineButton) {
			displayLabel.setText(displayLabel.getText()+"9");
				
			}
		
		if(e.getSource()==sixButton) {
			displayLabel.setText(displayLabel.getText()+"6");
				
			}
		
		if(e.getSource()==fiveButton) {
			displayLabel.setText(displayLabel.getText()+"5");
				
			}
		
		
		if(e.getSource()==oneButton) {
			displayLabel.setText(displayLabel.getText()+"1");
				
			}

		
		if(e.getSource()==fourButton) {
			displayLabel.setText(displayLabel.getText()+"4");
				
			}

		
		if(e.getSource()==twoButton) {
			displayLabel.setText(displayLabel.getText()+"2");
				
			}

		
		if(e.getSource()==threeButton) {
			displayLabel.setText(displayLabel.getText()+"3");
				
			}
		
		
		if(e.getSource()==zeroButton) {
			displayLabel.setText(displayLabel.getText()+"0");
				
			}
		
		if(e.getSource()==clearButton) {
			displayLabel.setText("");
			isoperatorclicked=5;
			operation();
			}
		
		if(e.getSource()==plusButton) {
			isoperatorclicked=1;
			oldvalue1=displayLabel.getText();
			displayLabel.setText("");
			
			
						
			}
		
		if(e.getSource()==divisionButton) {
			oldvalue1=displayLabel.getText();
			isoperatorclicked=2;
			displayLabel.setText("");
						
			}
		
		if(e.getSource()==minusButton) {
			oldvalue1=displayLabel.getText();
			isoperatorclicked=3;
			displayLabel.setText("");
						
			}
		if(e.getSource()==multiplicationButton) {
			oldvalue1=displayLabel.getText();
			isoperatorclicked=4;
			displayLabel.setText("");
						
			}
		
		if(e.getSource()==equaltoButton) {
			newvalue=displayLabel.getText();
			operation();
			//isoperatorclicked=0;
			
		
			}
	}
		public void operation() {

			if(isoperatorclicked==1)
			{
				float oldvalueF=Float.parseFloat(oldvalue1);
				float newvalueF=Float.parseFloat(newvalue);
				
				float result=oldvalueF+newvalueF;
				displayLabel.setText(result+"");
				oldvalue1=displayLabel.getText();
			}
			if(isoperatorclicked==2)
			{
				float oldvalueF=Float.parseFloat(oldvalue1);
				float newvalueF=Float.parseFloat(newvalue);
				
				float result=oldvalueF/newvalueF;
				displayLabel.setText(result+"");
				oldvalue1=displayLabel.getText();
			}
			if(isoperatorclicked==3)
			{
				float oldvalueF=Float.parseFloat(oldvalue1);
				float newvalueF=Float.parseFloat(newvalue);
				
				float result=oldvalueF-newvalueF;
				displayLabel.setText(result+"");
				oldvalue1=displayLabel.getText();
			}
			if(isoperatorclicked==4)
			{
				float oldvalueF=Float.parseFloat(oldvalue1);
				float newvalueF=Float.parseFloat(newvalue);
				
				float result=oldvalueF*newvalueF;
				displayLabel.setText(result+"");
				oldvalue1=displayLabel.getText();
				
			}
			if(isoperatorclicked==5)
			{
				oldvalue1="";
				newvalue="";
				
								
			}
			
						
			
		}
	}


		
				
			

		
		
		
		
	


