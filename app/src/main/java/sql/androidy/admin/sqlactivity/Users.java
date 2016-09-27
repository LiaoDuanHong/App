package sql.androidy.admin.sqlactivity;

/**
 * Created by Admin on 2016/8/10.
 */
public class Users {
    private Integer id;
    private String userName,userPwd;
    public Users(String userName,String userPwd){
        this.id=id;
        this.userName=userName;
        this.userPwd=userPwd;
    }

    @Override
    public String toString() {
        return "Users{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", userPwd='" + userPwd + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPwd() {
        return userPwd;
    }

    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd;
    }
}
