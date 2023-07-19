package OgrenciBilgiSistemi;
public class Main {
    public static void main(String[] args) {

        Teacher t1 = new Teacher("Mahmut Hoca" , "555", "TRH");
        Teacher t2 = new Teacher("Emre Hoca" , "349594", "FZK");
        Teacher t3 = new Teacher("Zeynep Hoca", "1245", "MAT");

        Course Tarih = new Course("Tarih", "101", "TRH", t1);


        Course Fizik = new Course("Fizik", "102", "FZK", t2);


        Course Matematik = new Course("Matematik" , "103", "MAT",t3);

        Student s1 = new Student("Mert","345", "6", Tarih, Fizik, Matematik, Tarih, Fizik, Matematik);
        s1.addBulkExamNote(70,90,100, 80, 73,88);
        s1.isPass();


    }
}
