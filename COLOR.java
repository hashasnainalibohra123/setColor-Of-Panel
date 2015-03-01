import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class COLOR implements ActionListener
{

JTextField jtx1,jtx2,jtx3;
JPanel panel;
JButton j;
	public static void main(String ae[])
	{
		SwingUtilities.invokeLater(new Runnable(){
		public  void run()
		{
			COLOR c=new COLOR();
			c.create();
		
		}
		
		
		});	
	}
	public void create()
	{
		String  s="ad";
		JFrame jfrm=new JFrame("COLOR SET");
		jfrm.setVisible(true);
		jfrm.setLayout(null);
		//jfrm.setUndecoreted(true);
		jfrm.setDefaultCloseOperation(jfrm.EXIT_ON_CLOSE);
		jfrm.setSize(500,500);
		jtx1=new JTextField();
		jtx2=new JTextField();
		jtx3=new JTextField();
	jtx1.setBounds(50,50,150,30);
	jtx2.setBounds(150,150,150,30);
	jtx3.setBounds(250,250,150,30);
	j=new JButton("ENTER");
	panel=new JPanel();
	panel.setBounds(20,20,450,450);

panel.setLayout(null);
	j.addActionListener(this);
	j.setBounds(300,300,150,30);
	
	jfrm.add(panel);
	panel.add(jtx1);
	panel.add(jtx2);
	panel.add(jtx3);
	panel.add(j);
	}
public void actionPerformed(ActionEvent r)
{	int i=Integer.parseInt(jtx1.getText());
	int j=Integer.parseInt(jtx2.getText());
	int k=Integer.parseInt(jtx3.getText());

	Color c=new Color(i,j,k);
	panel.setBackground(c);
	System.out.println(panel.getBackground());
//Color c1=panel.getBackground();
//System.out.println(c1);
//int i[]=c1.Red;
}
}