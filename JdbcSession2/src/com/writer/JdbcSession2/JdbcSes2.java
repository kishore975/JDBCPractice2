package com.writer.JdbcSession2;    
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class JdbcSes2 {

	/*public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
	System.out.println("Session2 Started");
	String sq="select * from student";
	Class.forName("oracle.jdbc.driver.OracleDriver");
	Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "system", "tiger");
	Statement stmt=con.createStatement();
	ResultSet rs=stmt.executeQuery(sq);
	while(rs.next())
	{
		System.out.println(rs.getInt(1)+"   "+rs.getInt(4)+"    "+rs.getString(2)+"   "+rs.getString(3));
	}
	
	}*/
	
	/*
	 * public static void main(String args[]) throws ClassNotFoundException,
	 * SQLException { System.out.println("Session2 Started"); String sql
	 * ="insert into student values(?,?,?,?)";
	 * Class.forName("oracle.jdbc.driver.OracleDriver"); Connection
	 * con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl",
	 * "system", "tiger"); PreparedStatement ps=con.prepareStatement(sql);
	 * ps.setInt(1,205); ps.setInt(4,86); ps.setString(2,"Priya");
	 * ps.setString(3,"C++");
	 * 
	 * int n=ps.executeUpdate(); if(n>0) {
	 * System.out.println("Updated Successfully"); }else {
	 * System.out.println("Issue in Updating the table"); } con.close(); }
	 */
	
	
	
	/*
	 * public static void main(String args[]) throws ClassNotFoundException,
	 * SQLException { System.out.println("Session2 Started");
	 * 
	 * String sql="insert into student values(?,?,?,?)";
	 * Class.forName("oracle.jdbc.driver.OracleDriver"); Connection
	 * con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl",
	 * "system", "tiger"); PreparedStatement ps=con.prepareStatement(sql);
	 * 
	 * ps.setInt(1,206); ps.setInt(4,91); ps.setString(3,"Mulesoft");
	 * ps.setString(2,"Lahari");
	 * 
	 * int n=ps.executeUpdate(); if(n>0) {
	 * System.out.println("Updated Successfully"); }else {
	 * System.out.println("Issue in updating"); } con.close();
	 * 
	 *
	 * }
	 */
	
	
	/*
	 * public static void main(String args[]) throws ClassNotFoundException,
	 * SQLException { System.out.println("Session2 Staretd"); String
	 * sql="update student set studentCourse=? where studentMarks=?";
	 * Class.forName("oracle.jdbc.driver.OracleDriver"); Connection
	 * con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl",
	 * "system", "tiger"); PreparedStatement ps=con.prepareStatement(sql); Scanner
	 * scan=new Scanner(System.in);
	 * System.out.println("Enter the course name you want to change"); String
	 * course=scan.next(); ps.setString(1,course); System.out.
	 * println("Enter the marks of the student,then we will change the course of that student"
	 * ); int marks=scan.nextInt(); ps.setInt(2,marks);
	 * 
	 * int n=ps.executeUpdate(); if(n==1) { System.out.println("One row updated"); }
	 * else if(n>1){ System.out.println("Rows Updated"); }else {
	 * System.out.println("Issue in Updating");
	 * 
	 * } con.close(); }
	 */
	
	
	/*
	 * public static void main(String args[]) throws ClassNotFoundException,
	 * SQLException { System.out.println("Session2 Started"); String
	 * sql="update student set studentName=?, studentCourse=?, studentMarks=? where studentId=?"
	 * ; Class.forName("oracle.jdbc.driver.OracleDriver"); Connection
	 * con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl",
	 * "system", "tiger"); PreparedStatement ps=con.prepareStatement(sql);
	 * 
	 * Scanner scan=new Scanner(System.in);
	 * System.out.println("Enter the Name you to change"); String
	 * name=scan.nextLine(); ps.setString(1,name);
	 * System.out.println("Enter the "+name+"'s"+" course you want to change");
	 * String course=scan.nextLine(); ps.setString(2,course);
	 * System.out.println("Enter the Marks you want to update for "+name); int
	 * marks=scan.nextInt(); ps.setInt(3, marks); System.out.
	 * println("Enter the Id of the student whose values you want to change"); int
	 * id=scan.nextInt(); ps.setInt(4, id);
	 * 
	 * int i=ps.executeUpdate(); if(i>0) {
	 * System.out.println("Row updated Successfully");
	 * 
	 * }else { System.out.println("Failed"); } }
	 */
	
	
//	  public static void main(String args[]) throws ClassNotFoundException,
//	  SQLException { System.out.println("Session2 Staretd"); String
//	  sql="update student set studentName=? where studentMarks=?";
//	  Class.forName("oracle.jdbc.driver.OracleDriver"); Connection
//	  con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl",
//	  "system", "tiger"); PreparedStatement ps=con.prepareStatement(sql); Scanner
//	  scan=new Scanner(System.in);
//	  System.out.println("Enter the name you want to change"); String
//	  name=scan.next(); ps.setString(1,name); System.out.
//	  println("Enter the marks of the student,then we will change the name of that student"
//	  ); int marks=scan.nextInt(); ps.setInt(2,marks);
//	  
//	  int n=ps.executeUpdate(); if(n==1) { System.out.println("One row updated"); }
//	  else if(n>1){ System.out.println("Rows Updated"); }else {
//	  System.out.println("Issue in Updating");
//	  
//	  } con.close(); }

	
//	public static void main(String args[]) throws SQLException, ClassNotFoundException {
//		String sql="select * from student";
//		Class.forName("oracle.jdbc.driver.OracleDriver");
//		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","system","tiger");
//		Statement stmt=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
//		ResultSet rs=stmt.executeQuery(sql);
//		
////		while(rs.next()) {
////			System.out.println(rs.getInt(1)+"	"+rs.getString(2)+"		"+rs.getString(3)+" 	"+rs.getInt(4));
////		}
//		rs.absolute(3);
//		System.out.println(rs.getInt(1)+"	"+rs.getString(2)+"		"+rs.getString(3)+" 	"+rs.getInt(4));
//		con.close();
//	}
	
//	public static void main(String args[]) throws ClassNotFoundException, SQLException {
//		String sql="insert into student values(?,?,?,?)";
//		Class.forName("oracle.jdbc.driver.OracleDriver");
//		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","system","tiger");
//		PreparedStatement ps=con.prepareStatement(sql);
//		ps.setInt(1, 207);
//		ps.setString(2, "Preethi");
//		ps.setInt(4, 83);
//		ps.setString(3, "Aws");
//		
//		int n=ps.executeUpdate();
//		if(n>0) {
//			System.out.println("Updated Successfully");
//		}
//		else {
//			System.out.println("Updation Failed");
//		}
//		con.close();
//		
//	}
	
	
//	public static void main(String args[]) throws SQLException, ClassNotFoundException {
//		String sql="Insert into student values(?,?,?,?)";
//		Class.forName("oracle.jdbc.driver.OracleDriver");
//		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","system","tiger");
//		PreparedStatement ps=con.prepareStatement(sql);
//		Scanner scan=new Scanner(System.in);
//		System.out.println("Enter the studentId");
//		int id=scan.nextInt();
//		ps.setInt(1,id);
//		System.out.println("Enter the studentName");
//		String name=scan.next();
//		ps.setString(2, name);
//		System.out.println("Enter the studentCourse");
//		String course=scan.next();
//		ps.setString(3, course);
//		System.out.println("Enter the studentMarks");
//		int marks=scan.nextInt();
//		ps.setInt(4, marks);
//		
//		int n=ps.executeUpdate();
//		if(n>0) {
//			System.out.println("Successfully Added");
//		}else {
//			System.out.println("Failed");
//		}
//		con.close();
//		
	
	
	public static void main(String args[]) throws ClassNotFoundException, SQLException {
		String sql="delete from student where studentId=?";
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","system","tiger");
		PreparedStatement ps=con.prepareStatement(sql);
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the StudentId you want to delete");
		int id=scan.nextInt();
		ps.setInt(1,id);
		
		int n=ps.executeUpdate();
		if(n>0) {
			System.out.println("Deleted Successfully");
		}
		else {
			System.out.println("Deletion Failed");
		}
		con.close();
		
	}
	
}
