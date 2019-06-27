package pers.mario.mediator;

/**
 * @Project: design
 * @PackageName: pers.mario.mediator
 * @FileName: Woman.java
 * @Description: The Woman is...
 * @Author: mario
 * @Time: 2019-06-27 18:21:56
 * @Version:V1.0.0
 */
public class Woman extends AbstractPerson {
    public Woman(String name, Integer age, Sex sex, Integer requestAge, MarriageAgency agency) {
        super(name, age, sex, requestAge, agency);
    }
}