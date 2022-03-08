package home;

public class Account {
    private int no;
    private String username;
    private String password;
    private String url;
    private String accountname;
    private String accountcreatedate;

    public Account() {
    }

    public Account(String username, String password, String url, String accountname, String accountcreatedate) {
        this.username = username;
        this.password = password;
        this.url = url;
        this.accountname = accountname;
        this.accountcreatedate = accountcreatedate;
    }

    public Account(int no, String username, String password, String url, String accountname, String accountcreatedate) {
        this.no = no;
        this.username = username;
        this.password = password;
        this.url = url;
        this.accountname = accountname;
        this.accountcreatedate = accountcreatedate;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getAccountname() {
        return accountname;
    }

    public void setAccountname(String accountname) {
        this.accountname = accountname;
    }

    public String getAccountcreatedate() {
        return accountcreatedate;
    }

    public void setAccountcreatedate(String accountcreatedate) {
        this.accountcreatedate = accountcreatedate;
    }

}
