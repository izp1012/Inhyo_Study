public class UserVO {

    private String Id;
    private String password;
    private String name;

    public String getId() {
        return Id;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "UserVO{" +
                "Id='" + Id + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                ", JoinDate=" + JoinDate +
                '}';
    }

    public void setId(String id) {
        Id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getJoinDate() {
        return JoinDate;
    }

    public void setJoinDate joinDate) {
        JoinDate = joinDate;
    }

    private Date JoinDate;

    public Userate(DVO createSession(HttpServletRequest request){
        HttpSession session = request.getSession();
        session.setAttribute("userVO",resultUserVO);
    }
}
