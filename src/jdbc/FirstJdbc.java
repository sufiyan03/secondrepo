//package jdbc;
//import java.sql.*;
//
//import java.util.*;
//class employee {
//	
//}
//
//public class FirstJdbc {
//	public void insert() {
//		try {
//			Connection con=getConnection();
//			Statement s=con.createStatement();
//			Scanner sc=new Scanner(System.in);
//			int id;
//			double salary;
//			String name,pass;
//			System.out.println("enter the id:");
//			id=sc.nextInt();
//			System.out.println("enter the name:");
//			name=sc.next();
//			System.out.println("enter the salary:");
//			salary=sc.nextDouble();
//			System.out.println("enter the Password:");
//			pass=sc.next();
//			String qry="insert into employee values("+id+",'"+name+"',"+salary+",'"+pass+"');";
//			s.execute(qry);
//			con.close();
//			sc.close();
//			}
//		catch(Exception e) {
//			e.printStackTrace();
//		}
//		}
//	public void update() {
//		try {
//			Connection con=getConnection();
//			Statement s=con.createStatement();
//			Scanner sc=new Scanner(System.in);
//			System.out.println("enter the id where u want to update password:");
//			int id=sc.nextInt();
//			System.out.println("enter the new password:");
//			String newpass=sc.next();
//			String qry1="update employee set password='"+newpass+"' where id="+id+";";
//			s.execute(qry1);
//			con.close();
//			sc.close();
//		}catch(Exception e) {
//			e.printStackTrace();
//		}
//	}
//	public void other() {
//		try {
//			Connection con=getConnection();
//			Statement s=con.createStatement();
//			Scanner sc=new Scanner(System.in);
//			System.out.println("enter the query :");
//			String qry4=sc.nextLine();
//			s.execute(qry4);
//			con.close();
//			sc.close();
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		
//	}
//	public void details() {
//		try {
//			Connection con=getConnection();
//			Statement s=con.createStatement();
//			System.out.println("id   Name    Salary   Password");
//			ResultSet rs=s.executeQuery("select * from employee");
//			while(rs.next()) {
//				System.out.print(rs.getInt(1)+" -- "+
//				rs.getString(2)+" -- "+rs.getString(3)+" -- "+rs.getString(4)+" -- "+"\n");
//			}
//			
//			con.close();
//		}catch(Exception e) {
//			e.printStackTrace();
//		}
//	}
//	public void delete() {
//		try {
//			Connection con=getConnection();
//			Statement s=con.createStatement();
//			Scanner sc=new Scanner(System.in);
//			System.out.println("enter the id you want to delete:");
//			int id=sc.nextInt();
//			String qry2="delete from employee where id="+id+";";
//			s.execute(qry2);
//			con.close();
//			sc.close();
//		}catch(Exception e) {
//			e.printStackTrace();
//		}
//	}
//	public  static Connection getConnection() throws SQLException {
//			Connection conn=null;
//			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/employeedb","root","root");
//			
//		return conn;
//	}
//	public static void main(String[] args) {
//		
//		try {
//			FirstJdbc f1=new FirstJdbc();
//			Class.forName("com.mysql.cj.jdbc.Driver");
//			Connection con=getConnection();
//			Statement s=con.createStatement();
//			
//			Scanner sc =new Scanner(System.in);
//			System.out.println("choose your input:\n1 for Insert---\n2 for update password----\n3 for Delete----\n4 for other queries--- :");
//			int userInput=sc.nextInt();
//			switch(userInput) {
//			case 1:
//				f1.details();
//				f1.insert();
//				System.out.println("----after insertion----");
//				f1.details();
//				break;
//			case 2:
//				f1.details();
//				f1.update();
//				System.out.println("-----after update----");
//				f1.details();
//				break;
//			case 3:
//				f1.details();
//				f1.delete();
//				System.out.println("----after delete----");
//				f1.details();
//				break;
//			case 4:
//				f1.details();
//				f1.other();
//				System.out.println("----after change----");
//				f1.details();
//				break;
//			default:
//				System.out.println("select the correct option");
//			}
//			
//			
//			System.out.println("completed successfully..");
//			
//			s.close();
//			con.close();
//			sc.close();
//		}
//		catch(Exception e) {
//			System.out.println(e);
//		}
//	}
//
//}
