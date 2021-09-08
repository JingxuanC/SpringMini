import con.he.SpringMini.beans.factory.DisposableBean;
import con.he.SpringMini.beans.factory.InitializingBean;

/**
 * @Author tal
 * @Date 2021/9/6 5:16 下午
 * @Version 1.0
 */
public class UserService implements InitializingBean, DisposableBean {
    private String uId;
    private String location;
    private String company;

    private UserDao userDao;

    public UserService(String uId, UserDao userDao) {
        this.uId = uId;
        this.userDao = userDao;
    }
    public UserService(){}
    public String queryUserInfo() {
        return userDao.queryUserName(uId);
    }

    public String getuId() {
        return uId;
    }

    public void setuId(String uId) {
        this.uId = uId;
    }

    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("执行：UserService.destroy");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("执行：UserService.afterPropertiesSet");
    }
}