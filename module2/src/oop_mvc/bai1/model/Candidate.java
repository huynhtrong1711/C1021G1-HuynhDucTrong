package oop_mvc.bai1.model;

public class Candidate {
    private String code;
    private String name;
    private String dateOb;
    private double pointMath;
    private double pointLiterature;
    private double pointEnglish;

    public Candidate(String code, String name, String dateOb, double pointMath, double pointLiterature, double pointEnglish) {
        this.code = code;
        this.name = name;
        this.dateOb = dateOb;
        this.pointMath = pointMath;
        this.pointLiterature = pointLiterature;
        this.pointEnglish = pointEnglish;
    }

    public Candidate() {
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateOb() {
        return dateOb;
    }

    public void setDateOfBirth(String dateOb) {
        this.dateOb = dateOb;
    }

    public double getPointMath() {
        return pointMath;
    }

    public void setPointMath(double pointMath) {
        this.pointMath = pointMath;
    }

    public double getPointLiterature() {
        return pointLiterature;
    }

    public void setPointLiterature(double pointLiterature) {
        this.pointLiterature = pointLiterature;
    }

    public double getPointEnglish() {
        return pointEnglish;
    }

    public void setPointEnglish(double pointEnglish) {
        this.pointEnglish = pointEnglish;
    }

    @Override
    public String toString() {
        return "Candidate{" +
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", dateOb='" + dateOb + '\'' +
                ", pointMath=" + pointMath +
                ", pointLiterature=" + pointLiterature +
                ", pointEnglish=" + pointEnglish +
                '}';
    }
}
