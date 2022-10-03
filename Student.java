package assignment;

public class Student {
    String name;
    String email;
    float poin;

    public Student(String name, String email, String poin) {
        this.name = name;
        this.email = email;
        this.poin = Float.parseFloat(poin);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public float getPoin() {
        return poin;
    }

    public void setPoin(float poin) {
        this.poin = poin;
    }
     public String toString(){
        return(getName() + "-" + getEmail()+"-" +getPoin()+"\n");
     }
}
