package OgrenciBilgiSistemi;
public class Course {

    Teacher teacher;
    String name;
    String code;
    String prefix;
    int note;
    int verbalNote;
    String Teacher;

    Course(String name, String code, String prefix, Teacher teacher){
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.teacher = teacher;
        int note = 0;
        int verbalnote = 0;
    }
    void addTeacher(Teacher teacher){
        if (teacher.branch.equals(this.prefix)){
            this.teacher = teacher;
            printTeacher();
        }else {
            System.out.println("Öğretmen ve Ders Bölümleri Uyuşmuyor");
        }

    }
    void printTeacher (){
        this.teacher.print();
    }
}
