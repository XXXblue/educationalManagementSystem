package poView;

import po.Rolepermission;

import java.util.List;

/**
 * @Author: XBlue
 * @Date: Create in 2017/9/2120:17
 * @Description:
 * @Modified By:
 */
public class ActiveRole {
    private String username;
    private String password;
    private String role;
    private String pic;
    private String usernum;


    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }


    public String getUsernum() {
        return usernum;
    }

    public void setUsernum(String usernum) {
        this.usernum = usernum;
    }
    private List<Rolepermission> list;

    public List<Rolepermission> getList() {
        return list;
    }

    public void setList(List<Rolepermission> list) {
        this.list = list;
    }

    public ActiveRole() {
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

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

}
