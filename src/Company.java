package src;

public class Company {


        //zmienne
       public String PersonName;
        public String PersonSurname;

  public Company(String PersonName, String PersonSurname) {
            this.PersonName = PersonName;
            this.PersonSurname = PersonSurname;
        }


        //metody
        public void money() {
            System.out.println("I work for money!");
            System.out.println(PersonName);
            System.out.println(PersonSurname);
        }
        public void hobby() {
            System.out.println("I like my current job position!");
        }

    }

