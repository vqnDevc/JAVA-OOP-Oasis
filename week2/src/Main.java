//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        StudentManagement sm = new StudentManagement();
        sm.addStudent(new Student("Nguyen Van An", "17020001", "K62CC", "17020001@vnu.edu.vn"));
        sm.addStudent(new Student("Nguyen Van B", "17020002", "K62CC", "17020002@vnu.edu.vn"));
        sm.addStudent(new Student("Nguyen Van C", "17020003", "K62CB", "17020003@vnu.edu.vn"));
        sm.addStudent(new Student("Nguyen Van D", "17020004", "K62CB", "17020004@vnu.edu.vn"));

        System.out.print(sm.studentsByGroup());
    }
}