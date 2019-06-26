package pers.mario.responsibility.chain;

/**
 * @Project: design
 * @PackageName: pers.mario.responsibility.chain
 * @FileName: Grade.java
 * @Description: The Grade is...
 * @Author: mario
 * @Time: 2019-06-06 11:51:03
 * @Version:V1.0.0
 */
public abstract class Grade {
    private Grade grade;
    private String gradeName;
    private Integer score;

    public Grade getGrade() {
        return grade;
    }

    public void setGrade(Grade grade) {
        this.grade = grade;
    }

    public String getGradeName() {
        return gradeName;
    }

    public void setGradeName(String gradeName) {
        this.gradeName = gradeName;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public void upgrade() {
        System.out.println("上" + this.getGradeName());

        if (score < 60) {

            System.out.println("考试没通过，留级");
        } else {
            if (grade == null) {
                System.out.println("考试通过，毕业");
            } else {
                System.out.println("考试通过，升级");
                grade.upgrade();
            }

        }

    }
}
