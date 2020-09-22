class Student {
    String name;
    int roll_no;
    public Student(String s,int r){
        name = s;
        roll_no = r;
    }
    public Student() {
        name = "Unknown";

    }
}

class Ans{
    public static void main(String[] args){
        Student s = new Student("Rita",20);
        Student a = new Student();
        System.out.println(s.name+" "+s.roll_no);
        System.out.println(a.name);
    }
}
