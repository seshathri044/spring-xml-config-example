package org.example;

public class student {
    private int age;
    private Writer writer;

    public student(int age,Writer writer) {// parameterized constructor
        this.age = age;
        this.writer = writer;
    }
    public student(){


    }

    public Writer getWriter() {
        return writer;
    }

    public void setWriter(Writer writer) {
        this.writer = writer;
    }
// to get the Age from Getter and setter
    public int getAge() {
        return age;
    }
    public void setAge(int age) {

        if(age<0)  age=-1;
        else this.age = age;
    }
// writeExam method
    public void writeExam(){
        writer.write();// from here the write() his called
    }
}

