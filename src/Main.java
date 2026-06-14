/*import java.sql.Connection;

public class Main {

    public static void main(String[] args) {

        Connection con = DBConnection.getConnection();

        if (con != null) {
            System.out.println("Connected Successfully");
        } else {
            System.out.println("Connection Failed");
        }
    }
}*/
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ProblemDAO dao = new ProblemDAO();
        System.out.println("===== Coding Tracker =====");
System.out.println("1. Add Problem");
System.out.println("2. View Problems");
System.out.println("3. update status");
System.out.println("4. Exit");
System.out.print("Enter Choice: ");

int choice = sc.nextInt();
switch(choice) {
case 1:

    sc.nextLine();

    System.out.print("Enter Title: ");
    String title = sc.nextLine();

    System.out.print("Enter Platform: ");
    String platform = sc.nextLine();

    System.out.print("Enter Difficulty: ");
    String difficulty = sc.nextLine();

    System.out.print("Enter Status: ");
    String status = sc.nextLine();
    System.out.println(title);
System.out.println(platform);
System.out.println(difficulty);
System.out.println(status);
Problem p  = new Problem(title, platform, difficulty, status);
dao.addProblem(p);
    break;
        case 2:
    dao.viewProblems();
    break;

    case 3:
        System.out.println("enter problem id: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.print("enter new status");
        String newstatus =sc.nextLine();
        System.out.println(id);
System.out.println(newstatus);
        break;
        case 4:
            System.out.println("enter problem id: ");
            int deleteId = sc.nextInt();
            dao.deleteProblem(deleteId);
            break;
            case 5:
                System.out.print("exiting.....");
                break;

    default:
        System.out.println("Invalid Choice");
}
        ProblemDAO DAO = new ProblemDAO();

//dao.addProblem(p); */


    }
}