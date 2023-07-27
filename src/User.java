class User {
    private String uname;
    private String upwd;

    public void setUname(String name) {
        uname = name;
    }

    public void setUpwd(String pwd) {
        upwd = pwd;
    }

    public String getUname() {
        return uname;
    }

    public String getUpwd() {
        return upwd;
    }
}

class Method{
    public static void main(String[] args) {
        User u = new User();
        u.setUname("abc");
        u.setUpwd("def");
        System.out.println(u.getUname());
        System.out.println(u.getUpwd());
    }
}