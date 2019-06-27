package pers.mario.test;

import org.junit.Test;
import pers.mario.mediator.*;

/**
 * @Project: design
 * @PackageName: pers.mario.test
 * @FileName: MediatorTest.java
 * @Description: The MediatorTest is...
 * @Author: mario
 * @Time: 2019-06-27 18:19:41
 * @Version:V1.0.0
 */
public class MediatorTest {

    @Test
    public void mediatorTest(){

        MarriageAgency agency = new MarriageAgencyImpl();
        AbstractPerson person1 = new Man("张一",24, Sex.MALE,22,agency);
        AbstractPerson person2 = new Woman("张二",23, Sex.FEMALE,22,agency);
        AbstractPerson person3 = new Woman("张三",22, Sex.FEMALE,22,agency);
        AbstractPerson person4 = new Woman("张四",21, Sex.FEMALE,22,agency);

        person1.findPartner();
        person2.findPartner();
        person3.findPartner();
        person4.findPartner();

    }
}
