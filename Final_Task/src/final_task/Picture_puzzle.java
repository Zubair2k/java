package final_task;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;


public class Picture_puzzle extends JFrame implements ActionListener
{
	JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,sample,pow_img;		//Declaring Button for the Frame 
	
	/**
	 * fixing the image for the game.
	 */
	
	Icon pow_icon;
	Icon pow_1=new ImageIcon("src/photo/p8.jpg");
	Icon pow_2=new ImageIcon("src/photo/p13.jpg");
	Icon pow_3=new ImageIcon("src/photo/p21.jpg");
	
	Icon sample_img1=new ImageIcon("src/photo/puzzle_1.jpg");
	Icon sample_img2=new ImageIcon("src/photo/puzzle_2.jpg");
	Icon sample_img3=new ImageIcon("src/photo/puzzle_3.jpg");
	
	Icon img_1=new ImageIcon("src/photo/p7.jpg");
	Icon img_2=new ImageIcon("src/photo/p3.jpg");
	Icon img_3=new ImageIcon("src/photo/p6.jpg");
	Icon img_4=new ImageIcon("src/photo/p2.jpg");
	Icon img_5=new ImageIcon("src/photo/p4.jpg");
	Icon img_6=new ImageIcon("src/photo/p9.jpg");
	Icon img_7=new ImageIcon("src/photo/p1.jpg");
	Icon img_8=new ImageIcon("src/photo/p5.jpg");
	Icon img_9=new ImageIcon("src/photo/p8.jpg");

	Icon img_11=new ImageIcon("src/photo/p13.jpg");
	Icon img_12=new ImageIcon("src/photo/p18.jpg");
	Icon img_13=new ImageIcon("src/photo/p12.jpg");
	Icon img_14=new ImageIcon("src/photo/p15.jpg");
	Icon img_15=new ImageIcon("src/photo/p16.jpg");
	Icon img_16=new ImageIcon("src/photo/p19.jpg");
	Icon img_17=new ImageIcon("src/photo/p11.jpg");
	Icon img_18=new ImageIcon("src/photo/p14.jpg");
	Icon img_19=new ImageIcon("src/photo/p17.jpg");

	Icon img_21=new ImageIcon("src/photo/p25.jpg");
	Icon img_22=new ImageIcon("src/photo/p27.jpg");
	Icon img_23=new ImageIcon("src/photo/p22.jpg");
	Icon img_24=new ImageIcon("src/photo/p29.jpg");
	Icon img_25=new ImageIcon("src/photo/p21.jpg");
	Icon img_26=new ImageIcon("src/photo/p24.jpg");
	Icon img_27=new ImageIcon("src/photo/p28.jpg");
	Icon img_28=new ImageIcon("src/photo/p23.jpg");
	Icon img_29=new ImageIcon("src/photo/p26.jpg");
	
	/**
	 * Function for the game to be performed.
	 */
	
	Picture_puzzle(){
		
		JLabel top=new JLabel("PICTURE PUZZLE");
		top.setBounds(270,10,400,50);
		top.setFont(new Font("Times New Roman", Font.BOLD, 40));
		
		JLabel sample_label=new JLabel("Original Image");  
		sample_label.setBounds(425,100,100,70);  
		top.setFont(new Font("Times New Roman", Font.BOLD, 30));
		
		sample=new JButton(sample_img1);  
		sample.setBounds(365,150,200,200);  

		pow_img=new JButton(pow_1);
		pow_img.setBounds(290,380,50,50);
		
		JLabel icon_pow=new JLabel("=> icon only has the power to change the slide.");  
		icon_pow.setBounds(350,380,400,50);
		top.setFont(new Font("Times New Roman", Font.PLAIN, 20));
	
		JLabel puzzle_label=new JLabel("Puzzle Image");  
		puzzle_label.setBounds(435,430,100,70);
		top.setFont(new Font("Times New Roman", Font.BOLD, 30));
		
		/**
		 * Setting Button for the Frame.
		 */
		
		b1=new JButton(img_1);
		b1.setBounds(320,480,100,100);
		b2=new JButton(img_2);
		b2.setBounds(420,480,100,100);
		b3=new JButton(img_3);
		b3.setBounds(520,480,100,100);
		b4=new JButton(img_4);
		b4.setBounds(320,580,100,100);
		b5=new JButton(img_5);
		b5.setBounds(420,580,100,100);
		b6=new JButton(img_6);
		b6.setBounds(520,580,100,100);
		b7=new JButton(img_7);
		b7.setBounds(320,680,100,100);
		b8=new JButton(img_8);
		b8.setBounds(420,680,100,100);
		b9=new JButton(img_9);
		b9.setBounds(520,680,100,100);
		
		pow_icon=b9.getIcon();
		
		/**
		 * Adding the buttons and Label to the Frame.
		 */
		
		add(top);
		
		add(sample_label);
		
		add(sample);
		
		add(pow_img);
		
		add(icon_pow);
		
		add(puzzle_label);
		
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		add(b5);
		add(b6);
		add(b7);
		add(b8);
		add(b9);
		
		/**
		 * Adding ActionListener to all given Button.
		 */

		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		b8.addActionListener(this);
		b9.addActionListener(this); 

		sample.addActionListener(this);
		
		setLayout(null);
		setSize(1000,900);
		setVisible(true);
		getContentPane().setBackground(Color.ORANGE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

	public static void main(String args[]){
		new Picture_puzzle();
	}

	/**
	 * Action to be done when the Button is clicked.
	 */
	
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==b1){
			Icon s1=b1.getIcon();
			if(b2.getIcon()==pow_icon)
			{
				b2.setIcon(s1);
				b1.setIcon(pow_icon);
			} 
			else if(b4.getIcon()==pow_icon)
			{
                b4.setIcon(s1);
                b1.setIcon(pow_icon);
            }
		}

		if(e.getSource()==b2){
			Icon s1=b2.getIcon();
			if(b1.getIcon()==pow_icon)
			{
				b1.setIcon(s1);
				b2.setIcon(pow_icon);
			} 
			else if(b5.getIcon()==pow_icon)
			{
                b5.setIcon(s1);
                b2.setIcon(pow_icon);
            }
			else if(b3.getIcon()==pow_icon)
			{
                b3.setIcon(s1);
                b2.setIcon(pow_icon);
            }
		}

		if(e.getSource()==b3)
		{
			Icon s1=b3.getIcon();
			if(b2.getIcon()==pow_icon)
			{
				b2.setIcon(s1);
				b3.setIcon(pow_icon);
			}
			else if(b6.getIcon()==pow_icon)
			{
                b6.setIcon(s1);
                b3.setIcon(pow_icon);
            }
		}

		if(e.getSource()==b4){
			Icon s1=b4.getIcon();
			if(b1.getIcon()==pow_icon){
				b1.setIcon(s1);
				b4.setIcon(pow_icon);
			}
			else if(b5.getIcon()==pow_icon){
                b5.setIcon(s1);
                b4.setIcon(pow_icon);
            }
			else if(b7.getIcon()==pow_icon){
                b7.setIcon(s1);
                b4.setIcon(pow_icon);
            }
		}

		if(e.getSource()==b5)
		{
		    Icon s1=b5.getIcon();	      
		    if(b2.getIcon()==pow_icon)
		    {
		        b2.setIcon(s1);
		        b5.setIcon(pow_icon);	      
		    } 
		    else if(b4.getIcon()==pow_icon)
		    {	       
		    	b4.setIcon(s1);		      
		    	b5.setIcon(pow_icon);		      
		    }		      
		    else if(b6.getIcon()==pow_icon)
		    {                 
		    	b6.setIcon(s1);		        
		    	b5.setIcon(pow_icon);
		    }		          
		    else if(b8.getIcon()==pow_icon)
		    {		           
		    	b8.setIcon(s1);		          
		    	b5.setIcon(pow_icon);		         
		    }
		  }

		if(e.getSource()==b6)
		{
		    Icon s1=b6.getIcon();		      
		    if(b3.getIcon()==pow_icon)
		    {
		        b3.setIcon(s1);
		        b6.setIcon(pow_icon);		     
		    } 
		    else if(b5.getIcon()==pow_icon)		    
		    {		                
		    	b5.setIcon(s1);		        
		    	b6.setIcon(pow_icon);		         
		    }		        
		    else if(b9.getIcon()==pow_icon){		      
		    	b9.setIcon(s1);		     
		    	b6.setIcon(pow_icon);
		    }
		}
		
		if(e.getSource()==b7)
		{
		    Icon s1=b7.getIcon();
		    if(b4.getIcon()==pow_icon)
		    {   
		    	b4.setIcon(s1);
		        b7.setIcon(pow_icon);
		    }
		    else if(b8.getIcon()==pow_icon)
		    {		                    
		    	b8.setIcon(s1);		                 
		    	b7.setIcon(pow_icon);		                 
		    }
		 }
		
		 if(e.getSource()==b8)
		 {
		    Icon s1=b8.getIcon();
		    if(b7.getIcon()==pow_icon)
		    {
		    	b7.setIcon(s1);
		        b8.setIcon(pow_icon);
		    }
		    else if(b5.getIcon()==pow_icon)
		    {
		                    b5.setIcon(s1);
		                    b8.setIcon(pow_icon);
		    }
	        else if(b9.getIcon()==pow_icon)
	        {
	        	b9.setIcon(s1);    
	        	b8.setIcon(pow_icon);
	        }
		
		  }
		
		 if(e.getSource()==b9)
		 {
		    Icon s1=b9.getIcon();
		    if(b8.getIcon()==pow_icon)
		    {
		    	b8.setIcon(s1);
		        b9.setIcon(pow_icon);
		    } 
		    else if(b6.getIcon()==pow_icon)
		    {
		    	b6.setIcon(s1);
		        b9.setIcon(pow_icon);
            }
		 }
		
		 if(e.getSource()==sample)
		 {
			Icon s1=sample.getIcon();
			if(s1==sample_img3)
			{
				sample.setIcon(sample_img1);
				b1.setIcon(img_1);
				b2.setIcon(img_2);
				b3.setIcon(img_3);
				b4.setIcon(img_4);
				b5.setIcon(img_5);
				b6.setIcon(img_6);
				b7.setIcon(img_7);
				b8.setIcon(img_8);
				b9.setIcon(img_9);
				pow_icon=b9.getIcon();
				pow_img.setIcon(pow_1);
			}
			else if(s1==sample_img1)
			{
				sample.setIcon(sample_img2);
				b1.setIcon(img_11);
				b2.setIcon(img_12);
				b3.setIcon(img_13);
				b4.setIcon(img_14);
				b5.setIcon(img_15);
				b6.setIcon(img_16);
				b7.setIcon(img_17);
				b8.setIcon(img_18);
				b9.setIcon(img_19);
				pow_icon=b1.getIcon();
				pow_img.setIcon(pow_2);
			}
			else
			{
				sample.setIcon(sample_img3);
				b1.setIcon(img_21);
				b2.setIcon(img_22);
				b3.setIcon(img_23);
				b4.setIcon(img_24);
				b5.setIcon(img_25);
				b6.setIcon(img_26);
				b7.setIcon(img_27);
				b8.setIcon(img_28);
				b9.setIcon(img_29);
				pow_icon=b5.getIcon();
				pow_img.setIcon(pow_3);
			}
		}
	}
}
