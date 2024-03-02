public class Main {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Ahmet Hoca", "TRH","4835");
        Teacher t2 = new Teacher("Mehmet Hoca","FZK","4664");
        Teacher t3 = new Teacher("Ersin Hoca","BIO","24342");



        Course tarih = new Course("Tarih","101","TRH");
        tarih.addTeacher(t1);

        Course fizik = new Course("Fizik","102","FZK");
        fizik.addTeacher(t2);

        Course bio = new Course("Biyoloji","103","BIO");
        bio.addTeacher(t3);

        Student s1 = new Student("Ali","123","4",tarih,fizik,bio);
        s1.addBulkExamNote(100,100,100);
        s1.sozluNot(80,60,70);
        s1.isPass();

        Student s2 = new Student("Ayse","345","4",tarih,fizik,bio);
        s2.addBulkExamNote(58,92,75);
        s2.sozluNot(90,85,83);
        s2.isPass();








    }
}