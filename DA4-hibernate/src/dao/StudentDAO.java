package dao;

import hibernate.Student;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.query.Query;
import utils.HibernateUtil;


import java.util.List;

public class StudentDAO {
    public static List<Student> getAllStudent() {
        Session session = HibernateUtil.getSessionFactory().openSession();

        List<Student> students = null;

        try {
            final String hql = "select st from Student st";
            Query query = (Query) session.createQuery(hql);

            students = query.list();

        } catch (HibernateException e) {
            System.err.println(e);
        } finally {
            session.close();
        }

        return students;
    }
}
