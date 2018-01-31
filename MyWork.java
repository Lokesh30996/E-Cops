import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/*<applet code="MyWork" width=1350 height=650>
   </applet>
*/
public class MyWork extends Applet implements ActionListener
{
	Frame f1;
	List l1;
	Label la1;
	public void init()
	{
		setLayout(null);
		f1=new LoginFrame();
		l1=new List(4,false);
		l1.add("Home");
		l1.add("Login");
		l1.add("Legal");
		l1.add("Contact Us");
		add(l1);
		l1.setBounds(40,150,75,100);
		l1.addActionListener(this);
		
	}
	public void actionPerformed(ActionEvent e)
	{
		repaint();
				
	}
	public void paint(Graphics g)
	{
		String val="E Cops";
		setBackground(Color.lightGray);
		g.setFont(new Font("Old English Text MT",Font.BOLD,55));
		g.drawString(val,575,100);
		String msg=l1.getSelectedItem();
		String value="Our aim by using this project is to develop Ecops. This system is easily accesible by all normal public;the polics department and the administartive department";
		String value2="This system is developed because the normal public is afraid to report a complaint against any crime going around them, so by using this system the normal public";
		String value3="can easily report a complaint against any dangerous criminals to theirs respective police stations";
		String value4="This police station share information with different polics stations,which help them in catching criminals keeping records of all criminals will help police to keep tab";
		String value5="on criminal to perform legal activities";
		String value6="By using this system,the record work is reduced and the data is stored in computer which is more confidential than a paper work.";
		String value7="The other advantages on this system is people can view the enquiry about complaints,status of complaints and other information.";
		String value8="From the whole,this method helps to bring general public and police department close to each other to share views and it also reduces crime.";
		String value9="Caution:";
		String value10="In the process of investigation,if we come to know that the complaint is fake,then";
		String value11="\" Strict Punishments Will Be Assigned \" "; 
		if(msg=="Home")
		{
			g.setFont(new Font("Book Antiqua",Font.BOLD,16));
			g.drawString(value,150,190);
			g.drawString(value2,150,210);
			g.drawString(value3,150,230);
			g.drawString(value4,150,270);
			g.drawString(value5,150,290);
			g.drawString(value6,150,320);
			g.drawString(value7,150,340);
			g.drawString(value8,150,370);
			g.setFont(new Font("Book Antiqua",Font.BOLD,18));
			g.drawString(value9,150,470);
			g.setFont(new Font("Book Antiqua",Font.BOLD,16));
			g.drawString(value10,150,500);
			g.setFont(new Font("Book Antiqua",Font.BOLD,18));
			g.drawString(value11,350,530);
		}
		else if(l1.getSelectedItem()=="Login")
			f1.setVisible(true);
		else if(l1.getSelectedItem()=="Contact Us")
		{
			String val8="If any software malfunctioning inform us.We will try to rectify it.";
			String val1="Contact Numbers";
			String val2="Lokesh";
			String val3="9944907088";
			String val4="Gowtham";
			String val5="9994643072";
			String val6="Manideep";
			String val7="9944094477";
			g.setFont(new Font("Bradley Hand ITC",Font.BOLD,30));
			g.drawString(val8,300,190);
			g.setFont(new Font("Bradley Hand ITC",Font.BOLD,35));
			g.drawString(val1,500,270);
			g.setFont(new Font("Pristina",Font.BOLD,25));
			g.drawString(val2,450,350);
			g.drawString(val3,600,350);
			g.drawString(val4,450,400);
			g.drawString(val5,600,400);
			g.drawString(val6,450,450);
			g.drawString(val7,600,450);
		}
		else if(l1.getSelectedItem()=="Legal")
		{
			String v1="Important";
			String v2="By using this software,you are agreeing to be bounded by the following terms";
			String v3="a)Software License Agreement";
			String v4="b)Notices from software";
			String v5="1. General";
			String v6="This is an agreement where it deals with the software updates. New versions of the developed software will be intimated to the users. The users have to be";
			String v7=" strictly bounded to this license. All the rights have been reserved to this agreement";
			String v8="2. Permitted License users and Restrictions.";
			String v9="Subject to terms and conditions of the license,you are granted a limited non-exclusive license to use the software on a single customer.This license strictly";
			String v10=" avoid the usage of this software code on the third party customer.";
			String v11="You may not allow to enable others to copy,decompile,reverse engineer,disassemble,attempt to derive the source code of,decrypt,modify.";
			String v12="Title and the intellectual property rights in and to any content displayed by,stored on or accessed through this software belong to the respective content of users";
			String v13="3. Transfer";
			String v14="You may not rent,lease,lend,sell,redistribute or sublicense the software. The main objective of this type of agreement is not to sell the license agreement ";
			String v15="to the other third party user";
			String v16="4. Termination";
			String v17="The license is effective untill terminated.Your rights under this license will terminate automatically or ceased by the software developer ,";
			String v18="if you fail to comply/disagree with any terms of this license";
			g.setFont(new Font("Book Antiqua",Font.BOLD,20));
			g.drawString(v1,150,190);
			g.setFont(new Font("Book Antiqua",Font.BOLD,16));
			g.drawString(v2,190,210);
			g.drawString(v3,150,230);
			g.drawString(v4,150,250);
			g.setFont(new Font("Book Antiqua",Font.BOLD,20));
			g.drawString(v5,150,280);
			g.setFont(new Font("Book Antiqua",Font.BOLD,16));
			g.drawString(v6,190,300);
			g.drawString(v7,150,320);
			g.setFont(new Font("Book Antiqua",Font.BOLD,20));
			g.drawString(v8,150,340);
			g.setFont(new Font("Book Antiqua",Font.BOLD,16));
			g.drawString(v9,190,360);
			g.drawString(v10,150,380);
			g.drawString(v11,190,400);
			g.drawString(v12,150,420);
			g.setFont(new Font("Book Antiqua",Font.BOLD,20));
			g.drawString(v13,150,440);
			g.setFont(new Font("Book Antiqua",Font.BOLD,16));
			g.drawString(v14,190,460);
			g.drawString(v15,150,480);
			g.setFont(new Font("Book Antiqua",Font.BOLD,20));
			g.drawString(v16,150,500);
			g.setFont(new Font("Book Antiqua",Font.BOLD,16));
			g.drawString(v17,190,520);
			g.drawString(v18,150,540);
			
		}	
	}
}	
class LoginFrame extends Frame implements ActionListener
{
	Label la2,la3,la4,la5,la6,la9,la10,la11,la12,la13,la14,la15,la16,la17,la18,la19,la20,la21,la22,la23,la24,la25,la26,la27,la28,la29,la30,la31,la32,la33,la34,la35,la36,la37,la38,la39,la40,la41,la42,la43,la44,la45,la46,la47,la48,la49,la50;
	TextField tf1,tf2,tf3,tf4,tf7,tf8,tf9,tf10,tf11,tf12,tf13,tf14,tf15,tf16,tf17,tf18,tf19,tf20,tf21,tf22,tf23;
	Button b2,b4,b5,b6,b7,b8,b11,b12,b13,b14,b15,b16,b17,b20,b21,b22,b24,b25,b26,b27,b28,b29,b30,b31,b32,b33,b35,b36,b37;
	TextArea ta1,ta2,ta3;
	Choice c1,c2,c3;
	static String user[]=new String[50];
	static String userpass[]=new String[50];
	static String policeuser[]=new String[50];
	static String policepass[]=new String[50];
	static String policetown[]=new String[50];
	static String ComplaintIdNum[]=new String[50];
	static String ComplaintSubject[]=new String[50];
	static String ComplaintLocation[]=new String[50];
	static String ComplaintDate[]=new String[50];
	static String ComplaintDescription[]=new String[50];
	static String ComplaintStatus[]=new String[50];
	static String ComplainteeName[]=new String[50];
	String msg1,msg2,msg3="Login Portal",msg4,msg5;
	static int n=0;
	static int k=0;
	int m=0;
	static int userloginid=9;
	static int policeloginid=9;
	static int complaintid=1350;
	LoginFrame()
	{
		setBackground(Color.lightGray);
		setFont(new Font("Comic Sans MS",Font.PLAIN,13));
		setSize(1250,750);
		setLayout(null);
		b2=new Button("Police");
		b4=new Button("User");
		b2.setBounds(600,350,130,40);
		b4.setBounds(600,450,130,40);
		
		//PoliceLogin
		la4=new Label("User Name");
		la4.setBounds(500,260,80,20);
		la5=new Label("Password");
		la5.setBounds(500,310,80,20);
		la6=new Label("Logon To");
		la6.setBounds(500,360,80,20);
		tf3=new TextField();
		tf3.setBounds(580,260,80,20);
		tf4=new TextField();
		tf4.setBounds(580,310,80,20);
		tf4.setEchoChar('*');
		b13=new Button("Register");
		b13.setBounds(500,440,50,20);
		c1=new Choice();
		c1.setBounds(580,360,80,20);
		b7=new Button("Submit");
		b7.setBounds(500,410,50,20);
		b8=new Button("Clear");
		b8.setBounds(580,410,50,20);
		c1.add(" ");
		c1.add("I Town");
		c1.add("II Town");
		c1.add("III Town");
		c1.add("IV Town");
		b24=new Button("Back");
		b24.setBounds(580,440,50,20);
		//Police
		
		//PoliceRegistration
		c3=new Choice();
		b14=new Button("Submit");
		b14.setBounds(550,660,50,20);
		b15=new Button("Clear");
		b15.setBounds(700,660,50,20);
		la16=new Label("Name");
		la16.setBounds(500,200,80,20);
		la17=new Label("Password");
		la17.setBounds(500,240,80,20);
		la18=new Label("Age");
		la18.setBounds(500,280,80,20);
		la19=new Label("Gender");
		la19.setBounds(500,320,80,20);
		la20=new Label("Address");
		la20.setBounds(500,360,80,20);
		la21=new Label("Telephone No.");
		la21.setBounds(500,540,80,20);
		la22=new Label("Email");
		la22.setBounds(500,580,80,20);
		la23=new Label("Trained At");
		la23.setBounds(500,620,80,20);
		ta2=new TextArea(6,20);
		ta2.setBounds(580,360,280,150);
		tf12=new TextField();
		tf12.setBounds(580,200,280,20);
		tf13=new TextField();
		tf13.setEchoChar('*');
		tf13.setBounds(580,240,280,20);
		tf14=new TextField();
		tf14.setBounds(580,280,280,20);
		tf15=new TextField();
		tf15.setBounds(580,540,280,20);
		tf16=new TextField();
		tf16.setBounds(580,580,280,20);
		tf17=new TextField();
		tf17.setBounds(580,620,280,20);
		c3.add("Male");
		c3.add("Female");
		c3.setBounds(580,320,280,20);
		b25=new Button("Back");
		b25.setBounds(500,300,50,20);
		//PoliceR
		
		//Police Logged In
		b32=new Button("View Complaints");
		b37=new Button("Logout");
		//Police Logged In
	
		//Police Logged in View Complaint
		la38=new Label("Complaintee Name");
		la39=new Label("Complaint Id");
		la40=new Label("Subject");
		la41=new Label("Location");
		la42=new Label("Date");
		la43=new Label("Status");
		b33=new Button("Change Status");
		//Police View Complaint
		
		//Change Status of View Complaint Police Logged In
		la50=new Label("Enter Status");
		tf23=new TextField();
		b35=new Button("Submit");
		b36=new Button("Back");
		//Update Status
			
		//UserLogin
		la2=new Label("User Name");
		la2.setBounds(500,300,80,20);
		la3=new Label("Password");
		la3.setBounds(500,350,80,20);
		tf1=new TextField();
		tf1.setBounds(580,300,80,20);
		tf2=new TextField();
		tf2.setBounds(580,350,80,20);
		tf2.setEchoChar('*');
		b5=new Button("Submit");
		b5.setBounds(500,400,50,20);
		b6=new Button("Clear");
		b6.setBounds(580,400,50,20);
		b20=new Button("Register");		
		b20.setBounds(500,450,50,20);
		b22=new Button("Back");
		b22.setBounds(580,450,50,20);
		//User
		
		//UserRegistration
		la9=new Label("Name");
		la9.setBounds(500,200,80,20);
		la10=new Label("Password");
		la10.setBounds(500,240,80,20);
		la11=new Label("Age");
		la11.setBounds(500,280,80,20);
		la12=new Label("Gender");
		la12.setBounds(500,320,80,20);
		la13=new Label("Address");
		la13.setBounds(500,360,80,20);
		la14=new Label("Telephone no.");
		la14.setBounds(500,540,80,20);
		la15=new Label("Email");
		la15.setBounds(500,580,80,20);
		ta1=new TextArea(6,25);
		ta1.setBounds(580,360,280,150);
		c2=new Choice();
		c2.setBounds(580,320,280,20);
		c2.add("Male");
		c2.add("Female");
		tf7=new TextField();
		tf7.setBounds(580,200,280,20);
		tf8=new TextField();
		tf8.setEchoChar('*');
		tf8.setBounds(580,240,280,20);
		tf9=new TextField();
		tf9.setBounds(580,280,280,20);
		tf10=new TextField();
		tf10.setBounds(580,540,280,20);
		tf11=new TextField();
		tf11.setBounds(580,580,280,20);
		b11=new Button("Submit");
		b11.setBounds(550,620,50,20);
		b12=new Button("Clear");
		b12.setBounds(700,620,50,20);
		b21=new Button("Back");
		b21.setBounds(500,300,50,20);
		//UserR
		
		//UserLogged In
		b26=new Button("Complaint");
		b27=new Button("Complaint Status");
		b26.setBounds(550,350,100,20);
		b27.setBounds(550,400,100,20);
		b31=new Button("Logout");
		b31.setBounds(1150,200,50,20);
		//UserLogged In
		
		//UserLogged In Complaint Form
		la24=new Label("Subject");
		la24.setBounds(460,240,80,20);
		la25=new Label("Location");
		la25.setBounds(460,280,80,20);
		la26=new Label("Date");
		la26.setBounds(460,320,80,20);
		la27=new Label("Description");
		la27.setBounds(460,360,80,20);
		tf18=new TextField();
		tf18.setBounds(580,240,280,20);
		tf19=new TextField();
		tf19.setBounds(580,280,280,20);
		tf20=new TextField();
		tf20.setBounds(580,320,280,20);
		ta3=new TextArea(6,25);
		ta3.setBounds(580,360,280,150);
		la37=new Label("Complaintee Name");
		la37.setBounds(460,200,80,20);
		tf22=new TextField();
		tf22.setBounds(580,200,280,20);
		b16=new Button("Submit");
		b16.setBounds(500,560,50,20);
		b17=new Button("Clear");
		b17.setBounds(600,560,50,20);
		b28=new Button("Back");
		b28.setBounds(500,500,50,20);
		//UserLogged In Complaint Form
		
		//UserLoggedin Complaint Status
		la28=new Label("Complaint Id");
		la28.setBounds(600,350,80,20);
		b29=new Button("Check Status");
		b29.setBounds(630,400,80,20);
		b30=new Button("Back");
		b30.setBounds(630,450,80,20);
		tf21=new TextField();
		tf21.setBounds(680,350,80,20);
		la29=new Label("Compalint Id");
		la29.setBounds(500,650,150,20);
		la30=new Label("Complaintee Location");
		la30.setBounds(660,650,150,20);
		la31=new Label("Subject");
		la31.setBounds(820,650,150,20);
		la32=new Label("Status");
		la32.setBounds(980,650,150,20);
		//UserLoggedIn Complaint Status
		
		add(b2);
		add(b4);
		b2.addActionListener(this);
		b4.addActionListener(this);
		
		//PoliceLogin
		b7.addActionListener(this);
		b8.addActionListener(this);
		b13.addActionListener(this);
		b24.addActionListener(this);
		//Police
		
		//Police Registration
		b14.addActionListener(this);
		b15.addActionListener(this);
		b25.addActionListener(this);
		//PoliceR
		
		//Police Logged In
		b32.addActionListener(this);
		b37.addActionListener(this);
		//Police Logged In
		
		//Police View Complaint
		b33.addActionListener(this);
		//Police Complaint
		
		//Update Status
		b35.addActionListener(this);
		b36.addActionListener(this);
		
		//UserLogin
		b5.addActionListener(this);
		b6.addActionListener(this);
		b20.addActionListener(this);
		b22.addActionListener(this);
		//User

		//UserRegistration
		b11.addActionListener(this);
		b12.addActionListener(this);
		b21.addActionListener(this);
		//UserR
		
		//UserLogged In
		b26.addActionListener(this);
		b27.addActionListener(this);
		b31.addActionListener(this);
		//UserL
		
		//UserLogged In Complaint Form
		b16.addActionListener(this);
		b17.addActionListener(this);
		b28.addActionListener(this);
		//UserLogged In C
		
		//UserLogged In Complaint Status
		b29.addActionListener(this);
		b30.addActionListener(this);
		//UserLogged In Complaint Status
		
		//User Login Predefined UserNames and Passwords
		user[0]="user1";userpass[0]="77111";
		user[1]="user2";userpass[1]="77222";
		user[2]="user3";userpass[2]="77333";
		user[3]="user4";userpass[3]="77444";
		user[4]="user5";userpass[4]="77555";
		user[5]="user6";userpass[5]="77666";
		user[6]="user7";userpass[6]="77777";
		user[7]="user8";userpass[7]="77888";
		user[8]="user9";userpass[8]="77999";
		
		//Police Login Predefined UserNames and Passwords
		policeuser[0]="police1";policepass[0]="11111";policetown[0]="I Town";
		policeuser[1]="police2";policepass[0]="22222";policetown[1]="II Town";
		policeuser[2]="police3";policepass[0]="33333";policetown[2]="III Town";
		policeuser[3]="police4";policepass[0]="44444";policetown[3]="IV Town";
		policeuser[4]="police5";policepass[0]="55555";policetown[4]="I Town";
		policeuser[5]="police6";policepass[0]="66666";policetown[5]="II Town";
		policeuser[6]="police7";policepass[0]="77777";policetown[6]="III Town";
		policeuser[7]="police8";policepass[0]="88888";policetown[7]="IV Town";
		policeuser[8]="police9";policepass[0]="99999";policetown[8]="I Town";
		ComplaintStatus[0]="Not Initialized";
		
	}
	public void actionPerformed(ActionEvent e)
	{
		//User in Login Portal
		if(e.getSource()==b4)
		{
			msg3="User Login";
			b2.setBounds(0,0,0,0);
			b4.setBounds(0,0,0,0);
			add(la2);la2.setBounds(500,300,80,20);
			add(tf1);tf1.setBounds(580,300,80,20);
			add(la3);la3.setBounds(500,350,80,20);
			add(tf2);tf2.setBounds(580,350,80,20);
			add(b5);b5.setBounds(500,400,50,20);
			add(b6);b6.setBounds(580,400,50,20);
			add(b20);b20.setBounds(500,450,50,20);
			add(b22);b22.setBounds(580,450,50,20);
			repaint();	
		}
		
		//Police in Login Portal
		if(e.getSource()==b2)
		{
			msg3="Police Login";
			b2.setBounds(0,0,0,0);
			b4.setBounds(0,0,0,0);
			add(la4);la4.setBounds(500,260,80,20);
			add(tf3);tf3.setBounds(580,260,80,20);
			add(la5);la5.setBounds(500,310,80,20);
			add(tf4);tf4.setBounds(580,310,80,20);
			add(la6);la6.setBounds(500,360,80,20);
			add(c1);c1.setBounds(580,360,80,20);
			add(b7);b7.setBounds(500,410,50,20);
			add(b8);b8.setBounds(580,410,50,20);
			add(b13);b13.setBounds(500,440,50,20);
			add(b24);b24.setBounds(580,440,50,20);			
			repaint();
		}
				
		//Clear in Police Login
		if(e.getSource()==b8)
		{
			tf3.setText(" ");
			tf4.setText(" ");
		}
		
		//Register in Police Login
		if(e.getSource()==b13)
		{
			msg3="Police registration";
			la4.setBounds(0,0,0,0);la5.setBounds(0,0,0,0);
			la6.setBounds(0,0,0,0);tf3.setBounds(0,0,0,0);
			tf4.setBounds(0,0,0,0);c1.setBounds(0,0,0,0);
			b7.setBounds(0,0,0,0);b8.setBounds(0,0,0,0);
			b13.setBounds(0,0,0,0);b24.setBounds(0,0,0,0);
			add(la16);la16.setBounds(500,200,80,20);
			add(tf12);tf12.setBounds(580,200,280,20);
			add(la17);la17.setBounds(500,240,80,20);
			add(tf13);tf13.setBounds(580,240,280,20);
			add(la18);la18.setBounds(500,280,80,20);
			add(tf14);tf14.setBounds(580,280,280,20);
			add(la19);la19.setBounds(500,320,80,20);
			add(c3);c3.setBounds(580,320,280,20);
			add(la20);la20.setBounds(500,360,80,20);
			add(ta2);ta2.setBounds(580,360,280,150);
			add(la21);la21.setBounds(500,540,80,20);
			add(tf15);tf15.setBounds(580,540,280,20);
			add(la22);la22.setBounds(500,580,80,20);
			add(tf16);tf16.setBounds(580,580,280,20);
			add(la23);la23.setBounds(500,620,80,20);
			add(tf17);tf17.setBounds(580,620,280,20);
			add(b14);b14.setBounds(550,660,50,20);
			add(b15);b15.setBounds(700,660,50,20);
			repaint();
		}
		
		//Clear in Police Registration	
		if(e.getSource()==b15)
		{
			tf12.setText(" ");
			tf13.setText(" ");
			tf14.setText(" ");
			tf15.setText(" ");
			tf16.setText(" ");
			tf17.setText(" ");
			ta2.setText(" ");
		}
		
		//Clear in User Login
		if(e.getSource()==b6)
		{
			tf1.setText(" ");
			tf2.setText(" ");
		}
		
		//Register in User Login
		if(e.getSource()==b20)
		{
			msg3="User Regestration";
			la2.setBounds(0,0,0,0);la3.setBounds(0,0,0,0);
			tf1.setBounds(0,0,0,0);tf2.setBounds(0,0,0,0);
			b5.setBounds(0,0,0,0);b6.setBounds(0,0,0,0);
			b20.setBounds(0,0,0,0);b22.setBounds(0,0,0,0);
			add(la9);la9.setBounds(500,200,80,20);
			add(tf7);tf7.setBounds(580,200,280,20);
			add(la10);la10.setBounds(500,240,80,20);
			add(tf8);tf8.setBounds(580,240,280,20);
			add(la11);la11.setBounds(500,280,80,20);
			add(tf9);tf9.setBounds(580,280,280,20);
			add(la12);la12.setBounds(500,320,80,20);
			add(c2);c2.setBounds(580,320,280,20);
			add(la13);la13.setBounds(500,360,80,20);
			add(ta1);ta1.setBounds(580,360,280,150);
			add(la14);la14.setBounds(500,540,80,20);
			add(tf10);tf10.setBounds(580,540,280,20);
			add(la15);la15.setBounds(500,580,80,20);
			add(tf11);tf11.setBounds(580,580,280,20);
			add(b11);b11.setBounds(550,620,50,20);
			add(b12);b12.setBounds(700,620,50,20);
			repaint();
		}
		
		//Submit in User Registration
		if(e.getSource()==b11)
		{
			msg4=tf7.getText();
			msg5=tf8.getText();
			user[userloginid]=msg4;
			userpass[userloginid]=msg5;
			la9.setBounds(0,0,0,0);la10.setBounds(0,0,0,0);
			la11.setBounds(0,0,0,0);la12.setBounds(0,0,0,0);
			la13.setBounds(0,0,0,0);la14.setBounds(0,0,0,0);
			la15.setBounds(0,0,0,0);tf7.setBounds(0,0,0,0);
			tf8.setBounds(0,0,0,0);tf9.setBounds(0,0,0,0);
			tf10.setBounds(0,0,0,0);tf11.setBounds(0,0,0,0);
			c2.setBounds(0,0,0,0);ta1.setBounds(0,0,0,0);
			b11.setBounds(0,0,0,0);b12.setBounds(0,0,0,0);
			msg3="Registration is Successful    "+userloginid;
			add(b21);b21.setBounds(500,300,50,20);
			userloginid++;
			repaint();
		}
		
		//Submit in Police Registration
		if(e.getSource()==b14)
		{
			msg4=tf12.getText();
			msg5=tf13.getText();
			policeuser[policeloginid]=msg4;
			policepass[policeloginid]=msg5;
			la16.setBounds(0,0,0,0);la17.setBounds(0,0,0,0);
			la18.setBounds(0,0,0,0);la19.setBounds(0,0,0,0);
			la20.setBounds(0,0,0,0);la21.setBounds(0,0,0,0);
			la22.setBounds(0,0,0,0);la23.setBounds(0,0,0,0);
			tf12.setBounds(0,0,0,0);tf13.setBounds(0,0,0,0);
			tf14.setBounds(0,0,0,0);tf15.setBounds(0,0,0,0);
			tf16.setBounds(0,0,0,0);tf17.setBounds(0,0,0,0);
			ta2.setBounds(0,0,0,0);c3.setBounds(0,0,0,0);
			b14.setBounds(0,0,0,0);b15.setBounds(0,0,0,0);
			msg3="Registration is Successful    "+policeloginid;
			add(b25);	b25.setBounds(500,300,50,20);
			policeloginid++;
			repaint();
		}
		
		//Back in User Registration
		if(e.getSource()==b21)
		{
			msg3="User Login";
			b21.setBounds(0,0,0,0);
			add(la2);la2.setBounds(500,300,80,20);
			add(tf1);tf1.setBounds(580,300,80,20);
			add(la3);la3.setBounds(500,350,80,20);
			add(tf2);tf2.setBounds(580,350,80,20);
			add(b5);b5.setBounds(500,400,50,20);
			add(b6);b6.setBounds(580,400,50,20);
			add(b20);b20.setBounds(500,450,50,20);
			add(b22);b22.setBounds(580,450,50,20);
			repaint();	
		}
		
		//Back in Police registration
		if(e.getSource()==b25)
		{
			msg3="Police Login";
			b25.setBounds(0,0,0,0);
			add(la4);la4.setBounds(500,260,80,20);
			add(tf3);tf3.setBounds(580,260,80,20);
			add(la5);la5.setBounds(500,310,80,20);
			add(tf4);tf4.setBounds(580,310,80,20);
			add(la6);la6.setBounds(500,360,80,20);
			add(c1);c1.setBounds(580,360,80,20);
			add(b7);b7.setBounds(500,410,50,20);
			add(b8);b8.setBounds(580,410,50,20);
			add(b13);b13.setBounds(500,440,50,20);
			add(b24);b24.setBounds(580,440,50,20);	
			repaint();
		}
		
		//Back in User Login
		if(e.getSource()==b22)
		{
			msg3="Login Portal";
			b5.setBounds(0,0,0,0);b6.setBounds(0,0,0,0);
			b20.setBounds(0,0,0,0);b22.setBounds(0,0,0,0);
			tf1.setBounds(0,0,0,0);tf2.setBounds(0,0,0,0);
			la2.setBounds(0,0,0,0);la3.setBounds(0,0,0,0);
			add(b2);b2.setBounds(600,350,130,40);
			add(b4);b4.setBounds(600,450,130,40);
			repaint();
		}
		
		//Back in Police Login
		if(e.getSource()==b24)
		{
			msg3="Login Portal";
			la4.setBounds(0,0,0,0);la5.setBounds(0,0,0,0);
			la6.setBounds(0,0,0,0);tf3.setBounds(0,0,0,0);
			tf4.setBounds(0,0,0,0);b13.setBounds(0,0,0,0);
			b7.setBounds(0,0,0,0);b8.setBounds(0,0,0,0);
			c1.setBounds(0,0,0,0);b24.setBounds(0,0,0,0);
			add(b2);b2.setBounds(600,350,130,40);
			add(b4);b4.setBounds(600,450,130,40);
			repaint();
		}
		
		//Process of User Login
		msg1=tf1.getText();
		msg2=tf2.getText();
				
		//Submit in User Login
		if(e.getSource()==b5)
		{
			for(n=0;n<50;n++)
			{
			if(msg1.equals(user[n]) && msg2.equals(userpass[n]))
			{
				add(b26);b26.setBounds(550,350,100,20);
				add(b27);b27.setBounds(550,400,100,20);
				add(b31);b31.setBounds(1150,200,50,20);
				la2.setBounds(0,0,0,0);la3.setBounds(0,0,0,0);
				tf1.setBounds(0,0,0,0);tf2.setBounds(0,0,0,0);
				b5.setBounds(0,0,0,0);b6.setBounds(0,0,0,0);
				b20.setBounds(0,0,0,0);b22.setBounds(0,0,0,0);
				break;	
			}
			}
		}
		
		//Process in Police Login
		
		//Submit in Police Login
		if(e.getSource()==b7)
		{
			msg1=tf3.getText();
			msg2=tf4.getText();
			msg3="Police Login";
			for(int i=0;i<50;i++)
			{
				if(msg1.equals(policeuser[i]) && msg2.equals(policepass[i]))
				{
					la4.setBounds(0,0,0,0);la5.setBounds(0,0,0,0);
					la6.setBounds(0,0,0,0);tf3.setBounds(0,0,0,0);
					tf4.setBounds(0,0,0,0);b13.setBounds(0,0,0,0);
					b7.setBounds(0,0,0,0);b8.setBounds(0,0,0,0);
					b24.setBounds(0,0,0,0);c1.setBounds(0,0,0,0);
					add(b32);b32.setBounds(550,350,150,20);
					add(b37);b37.setBounds(1150,200,50,20);
					break;
				}
			}
			repaint();
		}
		
		//Complaint in UserLogged In
		if(e.getSource()==b26)
		{
			msg3="Complaint Form";
			b26.setBounds(0,0,0,0);b27.setBounds(0,0,0,0);
			add(la37);la37.setBounds(460,200,80,20);
			add(tf22);tf22.setBounds(580,200,280,20);
			add(la24);la24.setBounds(460,240,80,20);
			add(la25);la25.setBounds(460,280,80,20);
			add(la26);la26.setBounds(460,320,80,20);
			add(la27);la27.setBounds(460,360,80,20);
			add(tf18);tf18.setBounds(580,240,280,20);
			add(tf19);tf19.setBounds(580,280,280,20);
			add(tf20);tf20.setBounds(580,320,280,20);
			add(ta3);ta3.setBounds(580,360,280,150);
			add(b16);b16.setBounds(500,560,50,20);
			add(b17);b17.setBounds(600,560,50,20);
			repaint();
		}
		
		//Submit in Complaint Form
		if(e.getSource()==b16)
		{
			msg3="Complaint Registered  "+complaintid;
			ComplainteeName[k]=tf22.getText();
			ComplaintIdNum[k]=""+complaintid;
			ComplaintSubject[k]=tf18.getText();
			ComplaintLocation[k]=tf19.getText();
			ComplaintDate[k]=tf20.getText();
			ComplaintDescription[k]=ta2.getText();
			la24.setBounds(0,0,0,0);la25.setBounds(0,0,0,0);
			la26.setBounds(0,0,0,0);la27.setBounds(0,0,0,0);
			la37.setBounds(0,0,0,0);tf22.setBounds(0,0,0,0);
			tf18.setBounds(0,0,0,0);tf19.setBounds(0,0,0,0);
			tf20.setBounds(0,0,0,0);ta3.setBounds(0,0,0,0);
			b16.setBounds(0,0,0,0);b17.setBounds(0,0,0,0);
			add(b28);b28.setBounds(500,500,50,20);
			k++;
			repaint();
		}
		
		//Complaint Status in UserLoggedIn
		if(e.getSource()==b27)
		{
			msg3="Complaint Status";
			add(la28);la28.setBounds(600,350,80,20);
			add(b29);b29.setBounds(630,400,80,20);
			add(b30);b30.setBounds(630,450,80,20);
			add(tf21);tf21.setBounds(680,350,80,20);			
			b26.setBounds(0,0,0,0);b27.setBounds(0,0,0,0);		
			repaint();	
		}
		
		//View Status in Complaint Status in UserLoggedIn
		if(e.getSource()==b29)
		{
			msg3="Status Check";
			String s=tf21.getText();
			int i=0;
			for(i=0;i<50;i++)
			{
				if(ComplaintIdNum[i]==""+s)
				m=i;
				break;
			}
			add(la29);la29.setBounds(500,650,150,20);
			add(la30);la30.setBounds(660,650,150,20);
			add(la31);la31.setBounds(820,650,150,20);
			add(la32);la32.setBounds(980,650,150,20);
			if(i<50)
			{
				String s1="",s2="",s3="",s4="";
				s1=""+ComplaintIdNum[m];
				s2=ComplaintLocation[m];
				s3=ComplaintSubject[m];
				s4=ComplaintStatus[m];
				la33=new Label(s1);la33.setBounds(500,680,150,20);
				la34=new Label(s2);	la34.setBounds(660,680,150,20);
				la35=new Label(s3);	la35.setBounds(820,680,150,20);
				la36=new Label(s4);	la36.setBounds(980,680,150,20);
				add(la33);
				add(la34);
				add(la35);
				add(la36);
			}
		}
		
		//View Complaints in Police Logged In
		if(e.getSource()==b32)
		{
			int x=1350;
			for(int i=0;i<50;i++)
			{
				String s=" ";
				s=ComplaintIdNum[i];
				if(s.equals(""+x))
				{
				b32.setBounds(0,0,0,0);
				msg3="Complaint Details";
				String s1=" ",s2=" ",s3=" ",s4=" ",s5=" ",s6=" ";
				add(la38);la38.setBounds(500,240,150,20);
				add(la39);la39.setBounds(500,280,150,20);
				add(la40);la40.setBounds(500,320,150,20);
				add(la41);la41.setBounds(500,360,150,20);
				add(la42);la42.setBounds(500,400,150,20);
				add(la43);la43.setBounds(500,440,150,20);
				add(b37);b37.setBounds(1150,200,50,20);
				s1=ComplainteeName[i];
				s2=ComplaintIdNum[i];
				s3=ComplaintSubject[i];
				s4=ComplaintLocation[i];
				s5=ComplaintDate[i];
				s6=ComplaintStatus[i];
				la44=new Label(s1);
				la45=new Label(s2);
				la46=new Label(s3);
				la47=new Label(s4);
				la48=new Label(s5);
				la49=new Label(s6);
				add(la44);la44.setBounds(650,240,150,20);
				add(la45);la45.setBounds(650,280,150,20);
				add(la46);la46.setBounds(650,320,150,20);
				add(la47);la47.setBounds(650,360,150,20);
				add(la48);la48.setBounds(650,400,150,20);
				add(la49);la49.setBounds(650,440,150,20);
				add(b33);b33.setBounds(500,480,150,20);
				x++;
				}
				repaint();
			}
		}
		
		//Change Status in View Complaint Police Logged In
		if(e.getSource()==b33)
		{
			msg3="Change Status";
			add(la50);la50.setBounds(500,500,100,20);
			add(tf23);tf23.setBounds(650,500,100,20);
			add(b35);b35.setBounds(575,550,75,20);
			add(b37);b37.setBounds(1150,200,50,20);
			la38.setBounds(0,0,0,0);la39.setBounds(0,0,0,0);
			la40.setBounds(0,0,0,0);la41.setBounds(0,0,0,0);
			la42.setBounds(0,0,0,0);la43.setBounds(0,0,0,0);
			la44.setBounds(0,0,0,0);la45.setBounds(0,0,0,0);
			la46.setBounds(0,0,0,0);la47.setBounds(0,0,0,0);
			la48.setBounds(0,0,0,0);la49.setBounds(0,0,0,0);
			b33.setBounds(0,0,0,0);
			ComplaintStatus[0]=tf23.getText();
			repaint();
		}
		
		//Submit in Change Status
		if(e.getSource()==b35)
		{
			msg3="Status Changed Successfully";
			la50.setBounds(0,0,0,0);b35.setBounds(0,0,0,0);
			tf23.setBounds(0,0,0,0);
			add(b36);b36.setBounds(500,350,50,20);
			add(b37);b37.setBounds(1150,200,50,20);
			String s7=tf23.getText();
			ComplaintStatus[0]=s7;
			repaint();
		}
		
		//Back in update Status
		if(e.getSource()==b36)
		{
			msg3="Police Login";
			la50.setBounds(0,0,0,0);tf23.setBounds(0,0,0,0);
			b35.setBounds(0,0,0,0);b36.setBounds(0,0,0,0);
			add(b32);b32.setBounds(550,350,150,20);
			add(b37);b37.setBounds(1150,200,50,20);
			repaint();		
		}
		
		//Back in Complaint
		if(e.getSource()==b28)
		{
			msg3="User Login";
			b28.setBounds(0,0,0,0);
			add(b26);b26.setBounds(550,350,100,20);
			add(b27);b27.setBounds(550,400,100,20);
			repaint();
		} 
		
		//Back in Complaint Status
		if(e.getSource()==b30)
		{
			msg3="User Login";
			add(b26);b26.setBounds(550,350,100,20);
			add(b27);b27.setBounds(550,400,100,20);
			add(b31);b31.setBounds(1150,200,50,20);
			b30.setBounds(0,0,0,0);b29.setBounds(0,0,0,0);
			la28.setBounds(0,0,0,0);la29.setBounds(0,0,0,0);
			la30.setBounds(0,0,0,0);la31.setBounds(0,0,0,0);
			la32.setBounds(0,0,0,0);la33.setBounds(0,0,0,0);
			la34.setBounds(0,0,0,0);la35.setBounds(0,0,0,0);
			la36.setBounds(0,0,0,0);tf21.setBounds(0,0,0,0);
			repaint();
		}
		
		//Clear in Complaint Form
		if(e.getSource()==b17)
		{
			tf18.setText(" ");
			tf19.setText(" ");
			tf20.setText(" ");
			ta3.setText(" ");
		}
		
		//Clear in User Registration
		if(e.getSource()==b12)
		{
			tf7.setText(" ");
			tf8.setText(" ");
			tf9.setText(" ");
			tf10.setText(" ");
			tf11.setText(" ");
			ta1.setText(" ");
		}
		
		//Logout in User Login
		if(e.getSource()==b31)
		{
			msg3="User Login";
			add(la2);la2.setBounds(500,300,80,20);
			add(la3);la3.setBounds(500,350,80,20);
			add(tf1);tf1.setBounds(580,300,80,20);
			add(tf2);tf2.setBounds(580,350,80,20);
			add(b5);b5.setBounds(500,400,50,20);
			add(b6);b6.setBounds(580,400,50,20);
			add(b20);b20.setBounds(500,450,50,20);
			add(b22);b22.setBounds(580,450,50,20);
			tf1.setText("");
			tf2.setText("");
			b26.setBounds(0,0,0,0);b27.setBounds(0,0,0,0);
			b31.setBounds(0,0,0,0);b16.setBounds(0,0,0,0);
			b17.setBounds(0,0,0,0);la37.setBounds(0,0,0,0);
			tf22.setBounds(0,0,0,0);la24.setBounds(0,0,0,0);
			la25.setBounds(0,0,0,0);la26.setBounds(0,0,0,0);
			la27.setBounds(0,0,0,0);la29.setBounds(0,0,0,0);
			tf18.setBounds(0,0,0,0);tf19.setBounds(0,0,0,0);
			tf20.setBounds(0,0,0,0);ta3.setBounds(0,0,0,0);
			b28.setBounds(0,0,0,0);b29.setBounds(0,0,0,0);
			tf21.setBounds(0,0,0,0);b28.setBounds(0,0,0,0);
			b30.setBounds(0,0,0,0);la28.setBounds(0,0,0,0);
			la29.setBounds(0,0,0,0);la30.setBounds(0,0,0,0);
			la31.setBounds(0,0,0,0);la32.setBounds(0,0,0,0);
			la33.setBounds(0,0,0,0);la34.setBounds(0,0,0,0);
			la35.setBounds(0,0,0,0);la36.setBounds(0,0,0,0);
			repaint();
		}
		
		//Logout in Police Login
		if(e.getSource()==b37)
		{
			msg3="Police Login";
			tf3.setText(" ");
			tf4.setText(" ");
			add(la4);la4.setBounds(500,260,80,20);
			add(tf3);tf3.setBounds(580,260,80,20);
			add(la5);la5.setBounds(500,310,80,20);
			add(tf4);tf4.setBounds(580,310,80,20);
			add(la6);la6.setBounds(500,360,80,20);
			add(c1);c1.setBounds(580,360,80,20);
			add(b7);b7.setBounds(500,410,50,20);
			add(b8);b8.setBounds(580,410,50,20);
			add(b13);b13.setBounds(500,440,50,20);
			add(b24);b24.setBounds(580,440,50,20);			
			add(b37);b37.setBounds(1150,200,50,20);
			b37.setBounds(0,0,0,0);b32.setBounds(0,0,0,0);
			la38.setBounds(0,0,0,0);la39.setBounds(0,0,0,0);
			la40.setBounds(0,0,0,0);b36.setBounds(0,0,0,0);
			la41.setBounds(0,0,0,0);la42.setBounds(0,0,0,0);
			la43.setBounds(0,0,0,0);la44.setBounds(0,0,0,0);
			la45.setBounds(0,0,0,0);la46.setBounds(0,0,0,0);
			la47.setBounds(0,0,0,0);la48.setBounds(0,0,0,0);
			la49.setBounds(0,0,0,0);b33.setBounds(0,0,0,0);
			la50.setBounds(0,0,0,0);
			tf23.setBounds(0,0,0,0);b35.setBounds(0,0,0,0);
			repaint();
		}
		
	}
	public void paint(Graphics g)
	{
		g.setFont(new Font("Brush Script MT",Font.BOLD,40));
		g.drawString(msg3,600,150);
	}
}