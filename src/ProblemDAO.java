import java.sql.Connection;
import java.sql.PreparedStatement; 
import java.sql.ResultSet;
public class ProblemDAO {
    public void addProblem(Problem p){
      try{ 
         Connection con =DBConnection.getConnection();
        String sql =
"INSERT INTO problem(title, platform, difficulty, status) VALUES (?, ?, ?, ?)";
     PreparedStatement ps = con.prepareStatement(sql);
    ps.setString(1, p.getTitle());
ps.setString(2, p.getPlatform());
ps.setString(3, p.getDifficulty());
ps.setString(4, p.getStatus());
int rows = ps.executeUpdate();

System.out.println(rows + " record inserted");
       } catch(Exception e){
        e.printStackTrace();
    }
}
public void viewProblems(){
    try {

    Connection con = DBConnection.getConnection();

    String sql = "SELECT * FROM problem";
    PreparedStatement ps = con.prepareStatement(sql);
    ResultSet rs = ps.executeQuery();
    while(rs.next()){
        System.out.println("ID: " + rs.getInt("id"));
System.out.println("Title: " + rs.getString("title"));
System.out.println("Platform: " + rs.getString("platform"));
System.out.println("Difficulty: " + rs.getString("difficulty"));
System.out.println("Status: " + rs.getString("status"));

System.out.println("----------------");
    }

} catch(Exception e) {
    e.printStackTrace();
}
}

public void updateStatus(int id,String status){
    try{
        Connection con = DBConnection.getConnection();
        String sql = "UPDATE problem SET status= ? WHERE id = ?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, status);
        ps.setInt(2, id);
        int row = ps.executeUpdate();
        System.out.println(row + " record update");
    }catch(Exception e){
        e.printStackTrace();
    }
}
public void  deleteProblem(int id){
    try{
        Connection con =  DBConnection.getConnection();
        String sql = "DELETE FROM problem WHERE id=?";
        PreparedStatement ps =con.prepareStatement(sql);
        ps.setInt(1, id);
        int row = ps.executeUpdate();
        System.out.println(row + " record deleted");
            }catch(Exception e){
        e.printStackTrace();

    }
}
}
