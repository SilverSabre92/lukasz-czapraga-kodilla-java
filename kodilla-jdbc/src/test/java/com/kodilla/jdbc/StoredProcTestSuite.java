package com.kodilla.jdbc;

import org.junit.Assert;
import org.junit.Test;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StoredProcTestSuite {
    @Test
    public void testUpdateVipLevels() throws SQLException {
        //Given
        DbManager dbManager = DbManager.getInstance();
        String sqlUpdate = "UPDATE READERS SET VIP_LEVEL=\"Not set\"";
        Statement statement = dbManager.getConnection().createStatement();
        statement.executeUpdate(sqlUpdate);
        //When
        String sqlProcedureCall = "CALL UpdateVipLevels()";
        statement.execute(sqlProcedureCall);
        //Then
        String sqlTableCheck = "SELECT COUNT(*) AS HOW_MANY FROM READERS WHERE VIP_LEVEL =\"Not set\"";
        ResultSet rs = statement.executeQuery(sqlTableCheck);
        int howMany = -1;
        if (rs.next()) {
            howMany = rs.getInt("HOW_MANY");
        }
        Assert.assertEquals(0, howMany);
    }

    @Test
    public void testUpdateBestsellers() throws SQLException {
        //Given
        DbManager dbManager = DbManager.getInstance();
        String sqlUpdate = "UPDATE BOOKS SET BESTSELLER = NULL";
        Statement statement = dbManager.getConnection().createStatement();
        statement.executeUpdate(sqlUpdate);
        //When
        String sqlProcedureCall = "CALL UpdateBestsellers()";
        statement.execute(sqlProcedureCall);
        //Then
        String sqlTableCheck = "SELECT COUNT(*) AS HOW_MANY_NULL FROM BOOKS WHERE BESTSELLER = NULL";
        ResultSet rs = statement.executeQuery(sqlTableCheck);
        int howMany = -1;
        if (rs.next())
            howMany = rs.getInt("HOW_MANY_NULL");
        Assert.assertEquals(0, howMany);
    }
}
