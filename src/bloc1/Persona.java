package bloc1;


import java.time.LocalDate;
import java.time.Period;


public class Persona {

    private String nom;
    private String cognom1;
    private String cognom2;
    private String dni;
    private LocalDate data_naixament;

    public Persona() {

    }

    public Persona(String nom, String cognom1, String cognom2, String dni, String data_naixament) {
        this.nom = nom;
        this.cognom1 = cognom1;
        this.cognom2 = cognom2;
        this.dni = dni;
        setData_naixament(data_naixament);
    }

    public String getNom() {
        return nom;
    }

    public String getCognom1() {
        return cognom1;
    }

    public String getCognom2() {
        return cognom2;
    }

    public String getDni() {
        return dni;
    }

    public String getData_naixament() {
        return data_naixament.toString();
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setCognom1(String cognom1) {
        this.cognom1 = cognom1;
    }

    public void setCognom2(String cognom2) {
        this.cognom2 = cognom2;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setData_naixament(String data_naixament) {
        this.data_naixament = LocalDate.of(Integer.parseInt(data_naixament.substring(0,4)),
                Integer.parseInt(data_naixament.substring(5,7)),
                Integer.parseInt(data_naixament.substring(8,10)));
    }

    public int getEdat(){
        return Period.between(data_naixament, LocalDate.now()).getYears();

    }

    @Override
    public String toString() {
        return "Persona{" +
                "nom='" + nom + '\'' +
                ", cognom1='" + cognom1 + '\'' +
                ", cognom2='" + cognom2 + '\'' +
                ", dni='" + dni + '\'' +
                ", data_naixament=" + data_naixament +
                '}';
    }
}
