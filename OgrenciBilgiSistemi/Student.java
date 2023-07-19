package OgrenciBilgiSistemi;
public class Student {

    Course c1;
    Course c2;
    Course c3;
    Course v1;
    Course v2;
    Course v3;
    String name;
    String stuNo;
    String classes;
    double avarage;
    boolean isPass;

    Student (String name, String stuNo, String classes, Course c1, Course c2, Course c3, Course v1, Course v2, Course v3){
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
        this.avarage = 0.0;
        this.isPass = false;
    }
    void addBulkExamNote(int note1, int note2, int note3, int verbal1, int verbal2, int verbal3){
        if (note1 >= 0 && note1 <= 100){
            this.c1.note = note1;
        }
        if (note2 >= 0 && note2 <= 100){
            this.c2.note = note2;
        }
        if (note3 >= 0 && note3 <= 100){
            this.c3.note = note3;
        }
        if (verbal1 >= 0 && verbal1 <= 100){
            this.v1.verbalNote = verbal1;
        }
        if (verbal1 >= 0 && verbal1 <= 100){
            this.v2.verbalNote = verbal2;
        }
        if (verbal1 >= 0 && verbal1 <= 100){
            this.v3.verbalNote = verbal3;
        }
    }
    void isPass(){
        this.avarage = ((this.c1.note * 0.80 + this.v1.verbalNote * 0.20) + (this.c2.note * 0.80 + this.v2.verbalNote * 0.20)
                + (this.c3.note * 0.80 + this.v3.verbalNote * 0.20)) / 3.0;
        if (this.avarage > 50){
            System.out.println("Tebrikler Sınıfı Geçtiniz");
            this.isPass = true;
        }else{
            System.out.println("Sınıfta Kaldınız");
            this.isPass = false;
        }
        printNote();
    }
    void printNote(){
        System.out.println(this.c1.name + " Notu : " + this.c1.note);
        System.out.println(this.c2.name + " Notu : " + this.c2.note);
        System.out.println(this.c3.name + " Notu : " + this.c3.note);
        System.out.println(this.v1.name + " Sözlü Notu : " + this.v1.verbalNote);
        System.out.println(this.v2.name + " Sözlü Notu : " + this.v2.verbalNote);
        System.out.println(this.v3.name + " Sözlü Notu : " + this.v3.verbalNote);
        System.out.println("Not Ortalamanız : " + this.avarage);
    }
}
