package OgrenciBilgiSistemi;
public class Teacher {

    String name;
    String mpno;
    String branch;

    Teacher(String name, String mpno, String branch){
        this.name = name;
        this. mpno = mpno;
        this.branch = branch;
    }
    void print(){
        System.out.println("Öğretmen Adı : " + this.name);
        System.out.println("Öğretmen Telefon No : " + this.mpno);
        System.out.println("Öğretmenin Bölümü : " + this.branch);
    }
}
