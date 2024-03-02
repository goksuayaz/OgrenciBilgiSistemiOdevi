public class Student {

    Course c1;
    Course c2;
    Course c3;
    String name;
    String stuNo;
    String classes;
    double avarage;
    boolean isPass;



    double not1Ortalama;
    double not2Ortalama;
    double not3Ortalama;

    Student(String name, String stuNo, String classes, Course c1, Course c2, Course c3){
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.avarage = 0.0;
        this.isPass = false;


    }
    public void addBulkExamNote(int note1, int note2, int note3){

        if(note1 >= 0 && note1 <= 100){
        this.c1.note = note1;
    }
        if(note2 >= 0 && note2 <= 100){
            this.c2.note = note2;
        }
        if(note3 >= 0 && note3 <= 100){
            this.c3.note = note3;
        }

}

    public void sozluNot(int sozluNot1, int sozluNot2, int sozluNot3){

        if(sozluNot1 >= 0 && sozluNot1 <= 100){
            this.c1.sozluNott = sozluNot1;
        }
        if(sozluNot2 >= 0 && sozluNot2 <= 100){
            this.c2.sozluNott = sozluNot2;
        }
        if(sozluNot3 >= 0 && sozluNot3 <= 100){
            this.c3.sozluNott = sozluNot3 ;
        }








    }


     public void isPass(){
         System.out.println("=========================");
         this.not1Ortalama = ((this.c1.sozluNot1 * 0.30) + (this.c1.note * 0.70));
         this.not2Ortalama = ((this.c2.sozluNot2 * 0.20) + (this.c2.note * 0.80));
         this.not3Ortalama = ((this.c2.sozluNot3 * 0.10) + (this.c3.note * 0.90));
         this.avarage = ((this.not1Ortalama + this.not2Ortalama + this.not3Ortalama) / 3);
        if(this.avarage > 55){
            System.out.println("Sınıfı başarılı bir şekilde geçtiniz. ");
            this.isPass = true;
        }else{
            System.out.println("Sınıfta kaldınız. ");
            this.isPass = false;
        }
         printNote();
     }


void printNote(){
    System.out.println(this.c1.name + " Notu:" + this.c1.note);
    System.out.println(this.c2.name + " Notu:" + this.c2.note);
    System.out.println(this.c3.name + " Notu:" + this.c3.note);
    System.out.println(this.c1.name + " Sözlü Notu:" + this.c1.sozluNot1);
    System.out.println(this.c2.name + " Sözlü Notu:" + this.c2.sozluNot2);
    System.out.println(this.c3.name + " Sözlü Notu:" + this.c3.sozluNot3);
    System.out.println("Ortalamanız : " + this.avarage);


}
}
