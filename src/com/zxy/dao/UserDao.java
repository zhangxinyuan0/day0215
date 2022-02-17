package com.zxy.dao;

import com.zxy.entity.UserBean;
import com.zxy.utils.Page;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.util.StringUtils;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author 张新远
 * @date 2022/2/15 11:48
 * @Version 1.0
 */
public class UserDao {
    private SessionFactory sessionFactory;
    public Session getSession(){
        return sessionFactory.getCurrentSession();
    }
    public List<UserBean> findAll(){
        return getSession().createQuery("from UserBean").list();
    }
    public UserBean findOneUser(Integer id){
        UserBean o = (UserBean)this.getSession().get(UserBean.class, id);
        return o;
    }
    /////////////////////////////

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public void deleteUser(UserBean userBean) {
        UserBean rs = (UserBean)this.getSession().get(UserBean.class, userBean.getId());
        this.getSession().delete(rs);
    }

    public Map<String, Object> findPage(String yema) {
        String pageNum = "1";
        if (!StringUtils.isEmpty(yema)){
            pageNum = yema;
        }

        String pageSize = "3";
        String mohu = "a";
        String chql = "select count(*) from UserBean where 1=1 ";
        if (!StringUtils.isEmpty(mohu)){
            chql += " and uname like '%"+mohu+"%'";
        }
        Long count = (Long) this.getSession().createQuery(chql).uniqueResult();
        Page page = new Page(pageNum, count.intValue(), pageSize);

        String ihql = "from UserBean where 1=1 ";
        if (!StringUtils.isEmpty(mohu)){
            ihql += " and uname like '%"+mohu+"%'";
        }
        List list = this.getSession().createQuery(ihql)
                .setFirstResult(page.getStartRecord() - 1)
                .setMaxResults(page.getPageSize())
                .list();
        HashMap<String, Object> map = new HashMap<>();
        map.put("page",page);
        map.put("list",list);
        return map;
    }

    public void updateUser(UserBean userBean) {
        UserBean o = (UserBean)this.getSession().get(UserBean.class, userBean.getId());
        //BeanUtils.copyProperties(userBean,o);
        userBean.setGb(o.getGb());
        userBean.setCourses(o.getCourses());
        this.getSession().merge(userBean);
    }

    public void updateCourse(UserBean userBean, int[] courseshu) {
        if (userBean!=null){
            this.getSession().createSQLQuery("delete from tb_user_course where id = "+userBean.getId()).executeUpdate();
        }
        for (int i = 0; i < courseshu.length; i++) {
            this.getSession().createSQLQuery("insert into tb_user_course value("+userBean.getId()+","+courseshu[i]+")").executeUpdate();
        }
    }
}

