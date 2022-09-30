
//static keyword


public class Employee {
        String name;//instance variable
            int id;//instance variable
            static String company = "intellect";//static variable


            Employee(String name, int id) {
                this.name = name;
                this.id = id;
            }

            public void display() {
                System.out.println(name + " " + id + " " + company);

            }

            public static void main(String[] args) {

                Employee e1 = new Employee("tej", 101);
                Employee e2 = new Employee("yadav", 102);
                Employee e3 = new Employee("rohit", 104);
                e1.display();
                e2.display();
                e3.display();

            }
        }

