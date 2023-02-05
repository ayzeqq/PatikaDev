public class Course {
    Teacher courseTeacher;
    String name;
    String code;
    String prefix;
    int note;
    int sozluNote;

    public Course(String name, String code, String prefix) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.note = 0;
    }

    public void addTeacher(Teacher t) {
        if (this.prefix.equals(t.branch)) {
            this.courseTeacher = t;
            System.out.println("İşlem başarılı");
        } else {
            System.out.println(t.name + " Akademisyeni bu dersi veremez.");
        }
    }

    public void printTeacher() {
        if (courseTeacher != null) {
            System.out.println(this.name + " dersinin Akademisyeni : " + courseTeacher.name);
        } else {
            System.out.println(this.name + " dersine Akademisyen atanmamıştır.");
        }
    }

    public double calcNote () {
        if(this.name.equals("Matematik")){
            return note*0.8+sozluNote*0.2;
        }
        if(this.name.equals("Fizik")){
            return note*0.7+sozluNote*0.3;
        }
        if(this.name.equals("Kimya")){
            return note*0.75+sozluNote*0.25;
        }
        return 0;
    }
}
