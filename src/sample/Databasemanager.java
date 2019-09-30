//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package sample;

import javafx.scene.control.SingleSelectionModel;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Databasemanager extends Main {
    String NameF;
    int result;
    private Connection con = null;

    public Databasemanager() throws SQLException {
        this.con = DriverManager.getConnection("jdbc:h2:C:\\Users\\shafi\\IdeaProjects\\issue1\\libs\\productDB");
    }

    public void insertProd(String iQuery, String[] insertValues) throws SQLException {
        PreparedStatement pstmt = this.con.prepareStatement(iQuery);
        pstmt.setInt(1, Integer.parseInt(insertValues[0]));
        pstmt.setString(2, insertValues[1]);
        pstmt.executeUpdate();
    }

    public void selectAll(String uidx) {
        ResultSet rs = null;

        try {
            Statement stmt = this.con.createStatement();

            int result;
            for(rs = stmt.executeQuery(String.format("SELECT * FROM employee where uid = %s ;", uidx.trim())); rs.next(); this.result = result) {
                result = rs.getInt("uid");
                String NameF = rs.getString("name");
                this.NameF = NameF;
            }
        } catch (SQLException var6) {
            this.sqlExceptionHandler(var6);
        }

    }
    public void selectAll1(String nameF, int uidx) throws SQLException {
        Statement stmt = con.createStatement();
        stmt.executeUpdate(String.format("INSERT INTO product (notid, nameF) VALUES ('%s' ,' %s ')" , uidx, nameF));
        System.out.println("The uid is " + uidx);

    }

   /* public void selectAll1(String nameF, int uidx) throws SQLException {
        Statement stmt = con.createStatement();
        stmt.executeUpdate(String.format("INSERT INTO product (uid) VALUES ('2')"));
        System.out.println("The uid is ");

    }*/
    public String getNameF() {
        return this.NameF;
    }

    public int getResult() {
        return this.result;
    }

    public void closeCon() {
        try {
            this.con.close();
        } catch (SQLException var2) {
            this.sqlExceptionHandler(var2);
        }

    }

    public void sqlExceptionHandler(SQLException error) {
        System.out.println("Standard Failure: " + error.getMessage());
    }
}
