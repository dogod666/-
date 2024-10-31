package com.example.student2;

public class Student {
    private String studentId;
    private String name;
    private String major;
    private int regularScore;
    private int finalScore;
    private int totalScore;

    public Student(String studentId, String name, String major, int regularScore, int finalScore) {
        this.studentId = studentId;
        this.name = name;
        this.major = major;
        this.regularScore = regularScore;
        this.finalScore = finalScore;
        this.totalScore = (regularScore + finalScore) / 2;
    }

    // 学号 getter 和 setter
    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    // 姓名 getter 和 setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // 专业 getter 和 setter
    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    // 平时成绩 getter 和 setter
    public int getRegularScore() {
        return regularScore;
    }

    public void setRegularScore(int regularScore) {
        this.regularScore = regularScore;
        updateTotalScore();
    }

    // 期末成绩 getter 和 setter
    public int getFinalScore() {
        return finalScore;
    }

    public void setFinalScore(int finalScore) {
        this.finalScore = finalScore;
        updateTotalScore();
    }

    // 总成绩 getter 和 setter
    public int getTotalScore() {
        return totalScore;
    }

    public void setTotalScore(int totalScore) {
        this.totalScore = totalScore;
    }

    // 更新总成绩的方法
    private void updateTotalScore() {
        this.totalScore = (this.regularScore + this.finalScore) / 2;
    }
}

