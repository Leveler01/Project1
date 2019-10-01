import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.table.DefaultTableModel;
public class ordReoprt extends JFrame
{
	int i=0;
	public ordReoprt()
	{
		try
		{
			Container c=getContentPane();
			final String []colhead={"book_id","vid","cust_id","orderdate","bk_amt","balance","book_type"};
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			Connection con=DriverManager.getConnection("jdbc:odbc:Vehicle1");		
			Statement stmt=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);	
			ResultSet rs=stmt.executeQuery("select * from Vehbooking");
			rs.last();
			int n=rs.getRow();
			Object [][]data=new Object[n][7];
			rs.first();
			data[i][0]=rs.getInt(1);
			data[i][1]=rs.getInt(2);
			data[i][2]=rs.getInt(3);
			data[i][3]=rs.getString(4);
			data[i][4]=rs.getString(5);
			data[i][5]=rs.getString(6);
			data[i][6]=rs.getString(7);
			
			i++;
			while(rs.next())
			{
				data[i][0]=rs.getInt(1);
			data[i][1]=rs.getInt(2);
			data[i][2]=rs.getInt(3);
			data[i][3]=rs.getString(4);
			data[i][4]=rs.getString(5);
			data[i][5]=rs.getString(6);
			data[i][6]=rs.getString(7);
			
				i++;
			}	
			JTable tabel=new JTable(data,colhead);
			int v=ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED;
			int h=ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED;
			JScrollPane jsp=new JScrollPane(tabel,v,h);
			c.add(jsp,BorderLayout.CENTER);
			pack();
			addWindowListener(new WindowAdapter()
			{
				public void windowClosing(WindowEvent we)
				{
					new MenubarAdmin();
				}
			});
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		Toolkit kit = Toolkit.getDefaultToolkit();
		Dimension screenSize = kit.getScreenSize();	
		setSize(screenSize.width,screenSize.height);
		
		setTitle("Courier Management System[customer report]");
		setVisible(true);
	}
	public static void main(String args[])throws Exception
	{
		new ordReoprt();
	}
}

