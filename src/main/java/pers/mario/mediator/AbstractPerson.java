package pers.mario.mediator;

/**
 * @Project: design
 * @PackageName: pers.mario.mediator
 * @FileName: AbstractPerson.java
 * @Description: The AbstractPerson is...
 * @Author: mario
 * @Time: 2019-06-27 16:28:53
 * @Version:V1.0.0
 */
public abstract class AbstractPerson {
    private String name;
    private Integer age;
    private Sex sex;

    private Integer requestAge;

    private MarriageAgency agency;

    public AbstractPerson(String name, Integer age, Sex sex, Integer requestAge, MarriageAgency agency) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.requestAge = requestAge;
        this.agency = agency;

        agency.register(this);
    }

    public void findPartner() {
        agency.pair(this);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public Integer getRequestAge() {
        return requestAge;
    }

    public void setRequestAge(Integer requestAge) {
        this.requestAge = requestAge;
    }

    public MarriageAgency getAgency() {
        return agency;
    }

    public void setAgency(MarriageAgency agency) {
        this.agency = agency;
    }
}

