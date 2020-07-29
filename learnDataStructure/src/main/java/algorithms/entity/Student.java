package algorithms.entity;

import algorithms.SelectionSort;

public class Student implements Comparable<Student> {

    private String name;
    private Integer score;

    public Student(){}

    public Student(String name, Integer score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    @Override
    public boolean equals(Object anotherStu){
        if (anotherStu == null)
            return false;
        if (anotherStu == this)
            return true;
        if (this.getClass() != anotherStu.getClass())
            return false;
        Student anotherStudent = (Student) anotherStu;
        return this.name.equalsIgnoreCase(anotherStudent.getName())&&this.score==anotherStudent.getScore();
    }

    @Override
    public int compareTo(Student o) {
        //大于零：this.score > o.score;小于零：this.score < o.score;等于零：this.score = o.score
        return o.score - this.score;
    }

    @Override
    public String toString(){
        return String.format("Student(name = %s,score = %d)",this.name,this.score);
    }

    public static void main(String[] args) {
        Student[] students = {new Student("lily",28),
                              new Student("lucy",26),
                              new Student("jack",29),
                              new Student("小红",27)};
        Student[] sortedStudents = SelectionSort.sort(students);
        for (Student stu : sortedStudents){
            System.out.println(stu.toString());
        }
    }
}
