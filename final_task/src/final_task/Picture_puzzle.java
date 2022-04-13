package final_task;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;


public class Picture_puzzle extends JFrame implements ActionListener{
JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,sample,starB;
	
	Icon pow_icon;
	Icon pow_1=new ImageIcon("src/photo/p8.jpg");
	Icon pow_2=new ImageIcon("src/photo/p13.jpg");
	Icon pow_3=new ImageIcon("src/photo/p21.jpg");
	
	Icon sample_img1=new ImageIcon("src/photo/puzzle_1.jpg");
	Icon sample_img2=new ImageIcon("src/photo/puzzle_2.jpg");
	Icon sample_img3=new ImageIcon("src/photo/puzzle_3.jpg");
	
	Icon ic1=new ImageIcon("src/photo/p7.jpg");
	Icon ic2=new ImageIcon("src/photo/p3.jpg");
	Icon ic3=new ImageIcon("src/photo/p6.jpg");
	Icon ic4=new ImageIcon("src/photo/p2.jpg");
	Icon ic5=new ImageIcon("src/photo/p4.jpg");
	Icon ic6=new ImageIcon("src/photo/p9.jpg");
	Icon ic7=new ImageIcon("src/photo/p1.jpg");
	Icon ic8=new ImageIcon("src/photo/p5.jpg");
	Icon ic9=new ImageIcon("src/photo/p8.jpg");

	Icon ic11=new ImageIcon("src/photo/p13.jpg");
	Icon ic12=new ImageIcon("src/photo/p18.jpg");
	Icon ic13=new ImageIcon("src/photo/p12.jpg");
	Icon ic14=new ImageIcon("src/photo/p15.jpg");
	Icon ic15=new ImageIcon("src/photo/p16.jpg");
	Icon ic16=new ImageIcon("src/photo/p19.jpg");
	Icon ic17=new ImageIcon("src/photo/p11.jpg");
	Icon ic18=new ImageIcon("src/photo/p14.jpg");
	Icon ic19=new ImageIcon("src/photo/p17.jpg");

	Icon ic21=new ImageIcon("src/photo/p25.jpg");
	Icon ic22=new ImageIcon("src/photo/p27.jpg");
	Icon ic23=new ImageIcon("src/photo/p22.jpg");
	Icon ic24=new ImageIcon("src/photo/p29.jpg");
	Icon ic25=new ImageIcon("src/photo/p21.jpg");
	Icon ic26=new ImageIcon("src/photo/p24.jpg");
	Icon ic27=new ImageIcon("src/photo/p28.jpg");
	Icon ic28=new ImageIcon("src/photo/p23.jpg");
	Icon ic29=new ImageIcon("src/photo/p26.jpg");
	
	Picture_puzzle(){

		JLabel top=new JLabel("PICTURE PUZZLE");
		top.setBounds(270,10,400,50);
		top.setFont(new Font("Times New Roman", Font.BOLD, 40));
		
		JLabel sample_label=new JLabel("Original Image");  
		sample_label.setBounds(425,100,100,70);  
		top.setFont(new Font("Times New Roman", Font.BOLD, 30));
		
		sample=new JButton(sample_img1);  
		sample.setBounds(365,150,200,200);  

		starB=new JButton(pow_1);
		starB.setBounds(290,380,50,50);
		
		JLabel icon_pow=new JLabel("=> icon only has the power to change the slide.");  
		icon_pow.setBounds(350,380,400,50);
		top.setFont(new Font("Times New Roman", Font.PLAIN, 20));
	
		JLabel puzzle_label=new JLabel("Puzzle Image");  
		puzzle_label.setBounds(435,430,100,70);
		top.setFont(new Font("Times New Roman", Font.BOLD, 30));
		
		b1=new JButton(ic1);
		b1.setBounds(320,480,100,100);
		b2=new JButton(ic2);
		b2.setBounds(420,480,100,100);
		b3=new JButton(ic3);
		b3.setBounds(520,480,100,100);
		b4=new JButton(ic4);
		b4.setBounds(320,580,100,100);
		b5=new JButton(ic5);
		b5.setBounds(420,580,100,100);
		b6=new JButton(ic6);
		b6.setBounds(520,580,100,100);
		b7=new JButton(ic7);
		b7.setBounds(320,680,100,100);
		b8=new JButton(ic8);
		b8.setBounds(420,680,100,100);
		b9=new JButton(ic9);
		b9.setBounds(520,680,100,100);
		
		pow_icon=b9.getIcon();
		
		add(top);
		
		add(sample_label);
		
		add(sample);
		
		add(starB);
		
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
		//while(true) {}
	}

//	public static void main(String args[]){
//		new Picture_puzzle();
//	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==b1){
			Icon s1=b1.getIcon();
			if(b2.getIcon()==pow_icon){
				b2.setIcon(s1);
				b1.setIcon(pow_icon);
			} 
			else if(b4.getIcon()==pow_icon){
                b4.setIcon(s1);
                b1.setIcon(pow_icon);
            }
		}//end of if

		if(e.getSource()==b2){
			Icon s1=b2.getIcon();
			if(b1.getIcon()==pow_icon){
				b1.setIcon(s1);
				b2.setIcon(pow_icon);
			} 
			else if(b5.getIcon()==pow_icon){
                b5.setIcon(s1);
                b2.setIcon(pow_icon);
            }
			else if(b3.getIcon()==pow_icon){
                b3.setIcon(s1);
                b2.setIcon(pow_icon);
            }
		}//end of if

		if(e.getSource()==b3){
			Icon s1=b3.getIcon();
			if(b2.getIcon()==pow_icon){
				b2.setIcon(s1);
				b3.setIcon(pow_icon);
			}
			else if(b6.getIcon()==pow_icon){
                b6.setIcon(s1);
                b3.setIcon(pow_icon);
            }
		}//end of if

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
		}//end of if

		if(e.getSource()==b5){
		    Icon s1=b5.getIcon();
		      if(b2.getIcon()==pow_icon){
		        b2.setIcon(s1);
		        b5.setIcon(pow_icon);
		      } 
		      else if(b4.getIcon()==pow_icon){
		         b4.setIcon(s1);
		         b5.setIcon(pow_icon);
		      }
		      else if(b6.getIcon()==pow_icon){
                 b6.setIcon(s1);
		                    b5.setIcon(pow_icon);
		                   }
		          else if(b8.getIcon()==pow_icon){
		                    b8.setIcon(s1);
		                    b5.setIcon(pow_icon);
		                   }
		  }//end of if

		if(e.getSource()==b6){
		    Icon s1=b6.getIcon();
		      if(b3.getIcon()==pow_icon){
		        b3.setIcon(s1);
		        b6.setIcon(pow_icon);
		      } else if(b5.getIcon()==pow_icon){
		                    b5.setIcon(s1);
		                    b6.setIcon(pow_icon);
		                   }
		         else if(b9.getIcon()==pow_icon){
		                    b9.setIcon(s1);
		                    b6.setIcon(pow_icon);
		                   }
		}//end of if
		
		if(e.getSource()==b7){
		    Icon s1=b7.getIcon();
		      if(b4.getIcon()==pow_icon){
		        b4.setIcon(s1);
		        b7.setIcon(pow_icon);
		      } else if(b8.getIcon()==pow_icon){
		                    b8.setIcon(s1);
		                    b7.setIcon(pow_icon);
		                   }
		 }
		
		 if(e.getSource()==b8)
		   {
		    Icon s1=b8.getIcon();
		      if(b7.getIcon()==pow_icon){
		        b7.setIcon(s1);
		        b8.setIcon(pow_icon);
		      } else if(b5.getIcon()==pow_icon){
		                    b5.setIcon(s1);
		                    b8.setIcon(pow_icon);
		                   }
		         else if(b9.getIcon()==pow_icon){
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
				b1.setIcon(ic1);
				b2.setIcon(ic2);
				b3.setIcon(ic3);
				b4.setIcon(ic4);
				b5.setIcon(ic5);
				b6.setIcon(ic6);
				b7.setIcon(ic7);
				b8.setIcon(ic8);
				b9.setIcon(ic9);
				pow_icon=b9.getIcon();
				starB.setIcon(pow_1);
			}
			else if(s1==sample_img1)
			{
				sample.setIcon(sample_img2);
				b1.setIcon(ic11);
				b2.setIcon(ic12);
				b3.setIcon(ic13);
				b4.setIcon(ic14);
				b5.setIcon(ic15);
				b6.setIcon(ic16);
				b7.setIcon(ic17);
				b8.setIcon(ic18);
				b9.setIcon(ic19);
				pow_icon=b1.getIcon();
				starB.setIcon(pow_2);
			}
			else
			{
				sample.setIcon(sample_img3);
				b1.setIcon(ic21);
				b2.setIcon(ic22);
				b3.setIcon(ic23);
				b4.setIcon(ic24);
				b5.setIcon(ic25);
				b6.setIcon(ic26);
				b7.setIcon(ic27);
				b8.setIcon(ic28);
				b9.setIcon(ic29);
				pow_icon=b5.getIcon();
				starB.setIcon(pow_3);
			}

		}
	}
}
