import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.table.DefaultTableModel;
public class itemReoprt extends JFrame
{
	int i=0;
	public itemReoprt()
	{
		try
		{
			Container c=getContentPane();
			final String []colhead={"itmid","itmname","itmtype","price","staname","stadetail","statyp","itmqty"};
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			Connection con=DriverManager.getConnection("jdbc:odbc:Vehicle1");		
			Statement stmt=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);	
			ResultSet rs=stmt.executeQuery("select * from Items");
			rs.last();
			int n=rs.getRow();
			Object [][]data=new Object[n][8];
			rs.first();
			data[i][0]=rs.getInt(1);
			data[i][1]=rs.getString(2);
			data[i][2]=rs.getString(3);
			data[i][3]=rs.getInt(4);
			data[i][4]=rs.getString(5);
			data[i][5]=rs.getString(6);
			data[i][6]=rs.getString(7);
			data[i][7]=rs.getInt(8);
			i++;
			while(rs.next())
			{
				data[i][0]=rs.getInt(1);
			data[i][1]=rs.getString(2);
			data[i][2]=rs.getString(3);
			data[i][3]=rs.getInt(4);
			data[i][4]=rs.getString(5);
			data[i][5]=rs.getString(6);
			data[i][6]=rs.getString(7);
			data[i][7]=rs.getInt(8);
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
		itemReoprt ii=new itemReoprt();
		ii.show();
	}
}

