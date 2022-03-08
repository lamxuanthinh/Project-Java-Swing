package login;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class UserModify {

    public static List<Users> findAll() {
        List<Users> dataList = new ArrayList<>();

        Connection connection = null;
        PreparedStatement statement = null;

        try {
            connection = DriverManager.getConnection(config.DB_URL, config.USERNAME, config.PASSWORD);

            String sql = "SELECT * FROM users WHERE role_id != 1 ";
            statement = connection.prepareStatement(sql);

            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                Users us = new Users(
                        resultSet.getString("username"),
                        resultSet.getString("email"),
                        resultSet.getString("password"),
                        resultSet.getInt("role_id"),
                        resultSet.getInt("active")
                );
                dataList.add(us);
            }
        } catch (SQLException ex) {
            Logger.getLogger(UserModify.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(UserModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(UserModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        return dataList;
    }

    public static void insert(Users us) {
        Connection connection = null;
        PreparedStatement preparedstatement = null;
        try {
            connection = DriverManager.getConnection(config.DB_URL, config.USERNAME, config.PASSWORD);
            String sql = "INSERT INTO  users (username , email , password , role_id, active ) VALUES (?, ?, ?, ?, ?)  ";
            preparedstatement = connection.prepareStatement(sql);

            preparedstatement.setString(1, us.getUsername());
            preparedstatement.setString(2, us.getEmail());
            preparedstatement.setString(3, us.getPassword());
            preparedstatement.setInt(4, us.getRole_id());
            preparedstatement.setInt(5, us.getActive());
            preparedstatement.execute();

        } catch (SQLException ex) {
            Logger.getLogger(UserModify.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(UserModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (preparedstatement != null) {
                try {
                    preparedstatement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(UserModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }

    public static Users Login(String username, String password) {
        Users us = null;
        Connection connection = null;
        PreparedStatement preparedstatement = null;
        try {
            connection = DriverManager.getConnection(config.DB_URL, config.USERNAME, config.PASSWORD);
            String sql = "SELECT * FROM users WHERE username = ? AND password = ? ";
            preparedstatement = connection.prepareStatement(sql);
            preparedstatement.setString(1, username);
            preparedstatement.setString(2, password);
            ResultSet resultSet = preparedstatement.executeQuery();

            if (resultSet.next()) {
                us = new Users(resultSet.getString("username"),
                        resultSet.getString("email"),
                        resultSet.getString("password"),
                        resultSet.getInt("role_id"),
                        resultSet.getInt("active"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(UserModify.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(UserModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (preparedstatement != null) {
                try {
                    preparedstatement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(UserModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        return us;
    }

    public static void UpdateActive(String username, int active) {
        Connection connection = null;
        PreparedStatement preparedstatement = null;
        try {
            connection = DriverManager.getConnection(config.DB_URL, config.USERNAME, config.PASSWORD);
            String sql = "UPDATE  users SET  active = ? WHERE username = ? ";
            preparedstatement = connection.prepareStatement(sql);

            preparedstatement.setInt(1, active);
            preparedstatement.setString(2, username);
            preparedstatement.execute();

        } catch (SQLException ex) {
            Logger.getLogger(UserModify.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(UserModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (preparedstatement != null) {
                try {
                    preparedstatement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(UserModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
}