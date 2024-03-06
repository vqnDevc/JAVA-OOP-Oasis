public class StudentManagement {
    private Student[] students;
    private int numberOfStudent;

    /**
     * Constructor default for class StudentManagement.
     */
    public StudentManagement() {
        this.students = new Student[100];
        this.numberOfStudent = 0;
    }

    /**
     * Compare group of two object Student.
     *
     * @param s1 : object Student 1
     * @param s2 : object Student 2
     * @return : boolean value
     */
    public static boolean sameGroup(Student s1, Student s2) {
        return s1.getGroup().equals(s2.getGroup());
    }

    /**
     * Insert new object Student into object array of class StudentManagement.
     *
     * @param newStudent : object Student is inserted
     */
    public void addStudent(Student newStudent) {
        if (numberOfStudent < 100) {
            students[numberOfStudent] = newStudent;
            numberOfStudent++;
        }
    }

    /**
     * Display student info by group.
     *
     * @return : result string
     */
    public String studentsByGroup() {
        if (numberOfStudent == 0) {
            return "";
        }

        int[] flag = new int[100];
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < numberOfStudent; i++) {
            if (flag[i] == 1) {
                continue;
            }

            String currentGroup = students[i].getGroup();
            result.append(currentGroup).append("\n");

            for (int j = i; j < numberOfStudent; j++) {
                if (students[j].getGroup().equals(currentGroup)) {
                    flag[j] = 1;
                    result.append(students[j].getInfo()).append("\n");
                }
            }
        }

        return result.toString();
    }

    /**
     * Remove object in students object array by id field.
     * @param id : id of student is removed
     */
    public void removeStudent(String id) {
        for (int i = 0; i < numberOfStudent; i++) {
            if (students[i].getId().equals(id)) {
                for (int j = i; j < numberOfStudent - 1; j++) {
                    students[j] = students[j + 1];
                }
                students[numberOfStudent - 1] = null;
                numberOfStudent--;
                break;
            }
        }
    }
}