package UniversiteYonetimSistemi;
  import java.util.ArrayList;

class University {
}

class Classroom {
}

class Office {
}

class Department {
    private Office office;

    public void setOffice(Office office2) {
    }
}

class Employee {
    private Office office;
}

class Professor extends Employee {

  public void setOffice(Office office) {
  }
}

class Clerk extends Employee {

  public void setOffice(Office office) {
  }
}

public class Main {
    public static void main(String[] args) {
        University university = new University();

        Classroom classroom = new Classroom();

        Office office = new Office();

        Department department = new Department();
        department.setOffice(office);

        Professor professor = new Professor();
        professor.setOffice(office);

        Clerk clerk = new Clerk();
        clerk.setOffice(office);

        // İlgili nesnelerin oluşturulduğu ve ilişkilendirmelerin yapıldığı kısımlar.
    }
}

  

