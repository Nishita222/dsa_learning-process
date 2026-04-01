public class CRUDWithJDBC {
    static Connection con = null;
    static {
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/company", "root", "password");
        } catch(Exception e) { e.printStackTrace(); }
    }
    public static void insertEmployee(int id, String name, double salary) throws SQLException {
        String sql = "INSERT INTO employees(id, name, salary) VALUES(?, ?, ?)";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, id);
        ps.setString(2, name);
        ps.setDouble(3, salary);
        ps.executeUpdate();
        System.out.println("Employee inserted.");
    }
    public static void getAllEmployees() throws SQLException {
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT * FROM employees");
        while(rs.next()) {
            System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getDouble(3));
        }
    }
    public static void updateSalary(int id, double newSalary) throws SQLException {
        String sql = "UPDATE employees SET salary = ? WHERE id = ?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setDouble(1, newSalary);
        ps.setInt(2, id);
        int rows = ps.executeUpdate();
        System.out.println(rows + " row(s) updated.");
    }
    public static void deleteEmployee(int id) throws SQLException {
        String sql = "DELETE FROM employees WHERE id = ?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, id);
        int rows = ps.executeUpdate();
        System.out.println(rows + " row(s) deleted.");
    }
    public static void main(String[] args) throws SQLException {
        insertEmployee(101, "Alice", 60000);
        getAllEmployees();
        updateSalary(101, 70000);
        deleteEmployee(101);
    }
}