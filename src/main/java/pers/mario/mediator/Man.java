package pers.mario.mediator;

/**
 * @Project: design
 * @PackageName: pers.mario.mediator
 * @FileName: Man.java
 * @Description: The Man is...
 * @Author: mario
 * @Time: 2019-06-27 18:21:23
 * @Version:V1.0.0
 */
public class Man extends AbstractPerson {
    public Man(String name, Integer age, Sex sex, Integer requestAge, MarriageAgency agency) {
        super(name, age, sex, requestAge, agency);
    }
}