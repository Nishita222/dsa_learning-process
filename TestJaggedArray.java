// import java.sql.*;

// public class JDBCExample {
//     public static void main(String[] args) {
//         try {
//             // Step 1 & 2: Load driver
//             Class.forName("com.mysql.cj.jdbc.Driver");

//             // Step 3: Establish connection
//             Connection con = DriverManager.getConnection(
//                 "jdbc:mysql://localhost:3306/studentdb",
//                 "root",
//                 "password"
//             );

//             // Step 4: Create statement
//             Statement stmt = con.createStatement();

//             // Step 5: Execute query
//             ResultSet rs = stmt.executeQuery("SELECT * FROM student");

//             // Step 6: Process result
//             while(rs.next()) {
//                 System.out.println(
//                     rs.getInt("id") + " " +
//                     rs.getString("name")
//                 );
//             }

//             // Step 7: Close connections
//             con.close();

//         } catch(Exception e) {
//             System.out.println(e);
//         }
//     }
// }

class TestJaggedArray {
    public static void main(String[] args) {
        
        // Declare and initialize jagged array in one go (most readable way)
        int[][] arr = {
            {0, 1, 2},        // 3 elements
            {3, 4, 5, 6},     // 4 elements
            {7, 8}            // 2 elements
        };
        
        // Or keep your dynamic filling style:
        /*
        int[][] arr = new int[3][];
        arr[0] = new int[3];
        arr[1] = new int[4];
        arr[2] = new int[2];
        
        int count = 0;
        for (int[] row : arr) {
            for (int j = 0; j < row.length; j++) {
                row[j] = count++;
            }
        }
        */
        
        // Print with enhanced for loop (cleaner)
        System.out.println("Jagged Array:");
        for (int[] row : arr) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}