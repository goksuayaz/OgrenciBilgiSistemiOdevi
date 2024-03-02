public class Course {
    Teacher teacher;
    String name;
    String code;
    String prefix;


    int note;
    int sozluNott;

    int sozluNot1;
    int sozluNot2;
    int sozluNot3;


    Course(String name, String code, String prefix){
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.note = 0;
        this.sozluNot1 = 0;
        this.sozluNot2 = 0;
        this.sozluNot3 = 0;
        this.sozluNott = 0;






    }

    void addTeacher(Teacher teacher) {
        if (teacher.branch.equals(this.prefix)) {
            this.teacher = teacher;
            printTeacher();

        } else {
            System.out.println("Öğretmen ve Ders Bölümleri Uyuşmuyor! ");
        }
    }

    void printTeacher() {
        if (this.teacher != null) {
            System.out.println(this.name + " dersinin Öğretmeni : " + this.teacher.name);
        } else {
            System.out.println(this.name + " dersine Öğretmen atanmamıştır.");
        }

    }

}
