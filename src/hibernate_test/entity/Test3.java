package hibernate_test.entity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class Test3 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();

//        create Query(HQL) from Employee and search employee by name
        try {
            Session session = factory.getCurrentSession();
            session.beginTransaction();

//            List<Employee> emps = session.createQuery("from Employee")
//                    .getResultList();

            List<Employee> emps = session.createQuery("from Employee " + "where name = 'Oleg' AND salary>1000")
                    .getResultList();

            for (Employee e : emps)
                System.out.println(e);

            session.getTransaction().commit();


            System.out.println("Done!");

        } finally {
            factory.close();
        }
    }
}
