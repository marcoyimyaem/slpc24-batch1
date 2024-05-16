import java.sql.*;
import java.util.*;

public class DBSample {
    private static String url= "jdbc:mysql://localhost:3306/students";
    private static String dbuser ="root";
    private static String users="select * from users";
    private static String dbpw ="";
    public static void main(String[] args){
        showAllStudent();
        int menu = 0;
        Scanner selectedMenu = new Scanner(System.in);
        while(menu==0) {
            try{
                System.out.println("Menu\n1-edit\n2-delete\n3-new student\n4-GTFO");
                menu = selectedMenu.nextInt();

            }
            catch (InputMismatchException e){
                System.out.println("Enter a valid menu code");
                System.exit(0);
            }
            switch (menu){
                case 1: edit(); menu =0; break;
                case 2: del(); menu =0; break;
                case 3: newStud(); menu =0;break;
                case 4: System.exit(0);
                default:
                    System.out.println("Menu code not recognized");
                    System.exit(0);
            }
        }
    }
    static void showAllStudent(){
        try{

            Connection con= DriverManager.getConnection(url,dbuser,dbpw);
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery(users);
            while(rs.next())
                System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getString(4));
            con.close();
        }catch(Exception e){ System.out.println(e);}

    }
    private static void newStud() {
        System.out.println("add new student");
        try {
            Connection con = DriverManager.getConnection(url, dbuser, dbpw);
            Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
            ResultSet rs = stmt.executeQuery(users);
            rs.moveToInsertRow(); // moves cursor to the insert row
            String[] insert = new String[3];
            Scanner input = new Scanner(System.in);
            System.out.println("Enter Fname");
            insert[0] = input.nextLine();
            System.out.println("Enter Lname");
            insert[1] = input.nextLine();
            System.out.println("Enter Course");
            insert[2] = input.nextLine();
            rs.updateString(2, insert[0]); // updates the
            rs.updateString(3, insert[1]); // updates the
            rs.updateString(4, insert[2]); // updates the
            rs.insertRow();
            rs.moveToCurrentRow();
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        showAllStudent();
    }

    private static void del() {
        System.out.println("del");
        System.out.println("select id number to delete");
        Scanner id = new Scanner(System.in);
        try {
            Connection con = DriverManager.getConnection(url, dbuser, dbpw);
            Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
            ResultSet rs = stmt.executeQuery(users);
            rs.absolute(id.nextInt());
            rs.deleteRow();
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        showAllStudent();
    }
        private static void edit() {
        System.out.println("select id number to edit");
        Scanner id = new Scanner(System.in);
        try{
            Connection con= DriverManager.getConnection(
                    url,dbuser,dbpw);
//here students is database name, root is username and password
            Statement stmt=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
            ResultSet rs=stmt.executeQuery(users);
            rs.absolute(id.nextInt());
            System.out.println("edit:\n1- Last name: \n2- First name: \n3- Course: ");
            Scanner input = new Scanner(System.in);
            Scanner upinput= new Scanner(System.in);
            int editable = input.nextInt();
            String ColName = switch (editable) {
                case 1 -> "Lname";
                case 2 -> "Fname";
                case 3 -> "Course";
                default -> "";
            };
            System.out.println("input your updated value");
            String updatetxt=upinput.nextLine();
            rs.updateString(ColName, updatetxt);
            rs.updateRow();
            while(rs.next())
                System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getString(4));
            con.close();
        }catch(Exception e){ System.out.println(e);}
            showAllStudent();
    }

    }