package hibernate_test2.entity;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Detail.class)
                .buildSessionFactory();


//        try {
//            Session session = factory.getCurrentSession();
//            Employee employee = new Employee("Egor", "Poltarakov"
//                    , "IT", 500);
//            Detail detail = new Detail("SPB", "123456789", "egorpoltarakov@gmail.com");
//
//            employee.setEmpDetail(detail);
//            session.beginTransaction();
//
//            session.save(employee);
//
//            session.getTransaction().commit();
//            System.out.println("Done!");
//
//        }
//        finally {
//            factory.close();
//        }


//        try {
//            Session session = factory.getCurrentSession();
//            Employee employee = new Employee("Oleg", "Smirnov"
//                    , "Sales", 700);
//            Detail detail = new Detail("Moscow", "987456123", "olejka@gmail.com");
//
//            employee.setEmpDetail(detail);
//            session.beginTransaction();
//
//            session.save(employee);
//
//            session.getTransaction().commit();
//            System.out.println("Done!");
//
//        }
//        finally {
//            factory.close();
//        }

//        Session session = null;
//        try {
//            session = factory.getCurrentSession();
//            session.beginTransaction();
//
//            Employee emp = session.get(Employee.class, 10);
//            System.out.println(emp.getEmpDetail());
//
//            session.getTransaction().commit();
//            System.out.println("Done!");
//
//        }
//        finally {
//            session.close();
//            factory.close();
//        }

        Session session = null;
        try {
            session = factory.getCurrentSession();
            session.beginTransaction();

            Employee emp = session.get(Employee.class, 2);
            session.delete(emp);

            session.getTransaction().commit();
            System.out.println("Done!");

        }
        finally {
            session.close();
            factory.close();
        }
    }
}
