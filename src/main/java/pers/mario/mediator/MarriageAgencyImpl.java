package pers.mario.mediator;

import java.util.ArrayList;
import java.util.List;

/**
 * @Project: design
 * @PackageName: pers.mario.mediator
 * @FileName: MarriageAgencyImpl.java
 * @Description: The MarriageAgencyImpl is...
 * @Author: mario
 * @Time: 2019-06-27 17:21:55
 * @Version:V1.0.0
 */
public class MarriageAgencyImpl implements MarriageAgency {
    private List<Man> manList = new ArrayList<>();
    private List<Woman> womenList = new ArrayList<>();

    @Override
    public void pair(AbstractPerson person) {
        if (person.getSex().equals(Sex.MALE)) {
            match(womenList, person);
        } else if (person.getSex() == Sex.FEMALE) {
            match(manList, person);
        }
    }

    private <T extends AbstractPerson> void match(List<T> list, AbstractPerson person) {

        for (AbstractPerson item : list) {
            if (person.getRequestAge().equals(item.getAge())) {
                System.out.println(person.getName() + "和" + item.getName() + "匹配成功");
                return;
            }
        }

        /*
         * 这里如果使用lambda表达式，return不能结束该方法返回，只能结束lambda表达式所在的forEach循环
         */
//        list.forEach(item->{
//            if(person.getRequestAge().equals(item.getAge())){
//                System.out.println(person.getName()+"和"+item.getName()+"匹配成功");
//                return;
//            }
//        });

        System.out.println(person.getName() + "没有匹配到");
    }

    @Override
    public void register(AbstractPerson person) {
        if (person.getSex() == Sex.MALE) {
            manList.add((Man) person);
        } else if (person.getSex().equals(Sex.FEMALE)) {
            womenList.add((Woman) person);
        }

    }
}
