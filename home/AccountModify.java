package home;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AccountModify {

    public static List<Account> findAll() {
        List<Account> Accountlist = new ArrayList<>();
        Connection connection = null;
        Statement statement = null;

        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/accountmanagement", "root", "");
            String sql = "SELECT * FROM account";
            statement = connection.createStatement();
            ResultSet resultset = statement.executeQuery(sql);

            while (resultset.next()) {
                Account ac = new Account(resultset.getInt("no"),
                        resultset.getString("username"),
                        resultset.getString("password"),
                        resultset.getString("url"),
                        resultset.getString("accountname"),
                        resultset.getString("accountcreatedate"));
                Accountlist.add(ac);
            }
        } catch (SQLException ex) {
            Logger.getLogger(AccountModify.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(AccountModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(AccountModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        return Accountlist;
    }

    public static void insert(Account ac) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/accountmanagement", "root", "");
            String sql = "INSERT INTO account (username, password , url, accountname, accountcreatedate) values(?, ? ,? ,?, ?)";

            preparedStatement = connection.prepareCall(sql);

            preparedStatement.setString(1, ac.getUsername());
            preparedStatement.setString(2, ac.getPassword());
            preparedStatement.setString(3, ac.getUrl());
            preparedStatement.setString(4, ac.getAccountname());
            preparedStatement.setString(5, ac.getAccountcreatedate());
            preparedStatement.execute();

        } catch (SQLException ex) {
            Logger.getLogger(AccountModify.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(AccountModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (preparedStatement != null) {
                try {
                    preparedStatement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(AccountModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }

    public static void update(Account ac) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/accountmanagement", "root", "");
            String sql = "UPDATE account SET username = ?, password = ? , url = ?, accountname = ?, accountcreatedate = ?  WHERE no = ? ";

            preparedStatement = connection.prepareCall(sql);
            preparedStatement.setString(1, ac.getUsername());
            preparedStatement.setString(2, ac.getPassword());
            preparedStatement.setString(3, ac.getUrl());
            preparedStatement.setString(4, ac.getAccountname());
            preparedStatement.setString(5, ac.getAccountcreatedate());
            preparedStatement.setInt(6, ac.getNo());
            preparedStatement.execute();

        } catch (SQLException ex) {
            Logger.getLogger(AccountModify.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(AccountModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (preparedStatement != null) {
                try {
                    preparedStatement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(AccountModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }

    public static void delete(int no) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/accountmanagement", "root", "");
            String sql = "DELETE FROM account  WHERE no = ? ";

            preparedStatement = connection.prepareCall(sql);
            preparedStatement.setInt(1, no);
            preparedStatement.execute();

        } catch (SQLException ex) {
            Logger.getLogger(AccountModify.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(AccountModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (preparedStatement != null) {
                try {
                    preparedStatement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(AccountModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }

    public static List<Account> SearchbyUsername(String username) {
        List<Account> Accountlist = new ArrayList<>();
        Connection connection = null;
        PreparedStatement preparedstatement = null;

        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/accountmanagement", "root", "");
            String sql = "SELECT * FROM account WHERE username LIKE ?   ";
            preparedstatement = connection.prepareCall(sql);
            preparedstatement.setString(1, "%" + username + "%");

            ResultSet resultset = preparedstatement.executeQuery();

            while (resultset.next()) {
                Account ac = new Account(resultset.getInt("no"),
                        resultset.getString("username"),
                        resultset.getString("password"),
                        resultset.getString("url"),
                        resultset.getString("accountname"),
                        resultset.getString("accountcreatedate"));
                Accountlist.add(ac);
            }
        } catch (SQLException ex) {
            Logger.getLogger(AccountModify.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(AccountModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (preparedstatement != null) {
                try {
                    preparedstatement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(AccountModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        return Accountlist;
    }

    public static List<Account> SearchbyPassword(String password) {
        List<Account> Accountlist = new ArrayList<>();
        Connection connection = null;
        PreparedStatement preparedstatement = null;

        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/accountmanagement", "root", "");
            String sql = "SELECT * FROM account WHERE password LIKE ? ";
            preparedstatement = connection.prepareCall(sql);
            preparedstatement.setString(1, "%" + password + "%");
            ResultSet resultset = preparedstatement.executeQuery();

            while (resultset.next()) {
                Account ac = new Account(resultset.getInt("no"),
                        resultset.getString("username"),
                        resultset.getString("password"),
                        resultset.getString("url"),
                        resultset.getString("accountname"),
                        resultset.getString("accountcreatedate"));
                Accountlist.add(ac);
            }
        } catch (SQLException ex) {
            Logger.getLogger(AccountModify.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(AccountModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (preparedstatement != null) {
                try {
                    preparedstatement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(AccountModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        return Accountlist;
    }

    public static List<Account> SearchbyURL(String url) {
        List<Account> Accountlist = new ArrayList<>();
        Connection connection = null;
        PreparedStatement preparedstatement = null;

        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/accountmanagement", "root", "");
            String sql = "SELECT * FROM account WHERE url LIKE ? ";
            preparedstatement = connection.prepareCall(sql);
            preparedstatement.setString(1, "%" + url + "%");
            ResultSet resultset = preparedstatement.executeQuery();

            while (resultset.next()) {
                Account ac = new Account(resultset.getInt("no"),
                        resultset.getString("username"),
                        resultset.getString("password"),
                        resultset.getString("url"),
                        resultset.getString("accountname"),
                        resultset.getString("accountcreatedate"));
                Accountlist.add(ac);
            }
        } catch (SQLException ex) {
            Logger.getLogger(AccountModify.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(AccountModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (preparedstatement != null) {
                try {
                    preparedstatement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(AccountModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        return Accountlist;
    }

    public static List<Account> SearchbyName(String name) {
        List<Account> Accountlist = new ArrayList<>();
        Connection connection = null;
        PreparedStatement preparedstatement = null;

        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/accountmanagement", "root", "");
            String sql = "SELECT * FROM account WHERE accountname LIKE ? ";
            preparedstatement = connection.prepareCall(sql);
            preparedstatement.setString(1, "%" + name + "%");
            ResultSet resultset = preparedstatement.executeQuery();

            while (resultset.next()) {
                Account ac = new Account(resultset.getInt("no"),
                        resultset.getString("username"),
                        resultset.getString("password"),
                        resultset.getString("url"),
                        resultset.getString("accountname"),
                        resultset.getString("accountcreatedate"));
                Accountlist.add(ac);
            }
        } catch (SQLException ex) {
            Logger.getLogger(AccountModify.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(AccountModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (preparedstatement != null) {
                try {
                    preparedstatement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(AccountModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        return Accountlist;
    }
    public static List<Account> SearchbyDate(String date) {
        List<Account> Accountlist = new ArrayList<>();
        Connection connection = null;
        PreparedStatement preparedstatement = null;

        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/accountmanagement", "root", "");
            String sql = "SELECT * FROM account WHERE accountcreatedate LIKE ? ";
            preparedstatement = connection.prepareCall(sql);
            preparedstatement.setString(1,"%"+ date +"%");
            ResultSet resultset = preparedstatement.executeQuery();

            while (resultset.next()) {
                Account ac = new Account(resultset.getInt("no"),
                        resultset.getString("username"),
                        resultset.getString("password"),
                        resultset.getString("url"),
                        resultset.getString("accountname"),
                        resultset.getString("accountcreatedate"));
                Accountlist.add(ac);
            }
        } catch (SQLException ex) {
            Logger.getLogger(AccountModify.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(AccountModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (preparedstatement != null) {
                try {
                    preparedstatement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(AccountModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        return Accountlist;
    }
}
