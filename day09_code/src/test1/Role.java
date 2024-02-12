package test1;

import java.util.Random;

public class Role {
    private String name;
    private int blood;

    public Role(String name, int blood){
        this.name = name;
        this.blood = blood;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBlood() {
        return blood;
    }

    public void setBlood(int blood) {
        this.blood = blood;
    }

    //定义一个方法用于攻击别人
    //思考:谁攻击谁?
    //Role r1 = new Role();
    //Role r2 = new Role();
    //r1.攻击(r2)
    //方法调用者去攻击参数
    public void attack(Role role){
        //计算造成的伤害1~20
        Random r = new Random();
        int hurt = r.nextInt(20)+1;

        //修改一下挨揍的人的血量
        //剩余血量
        int remainBlood = role.getBlood() - hurt;
        //对剩余血量做一个判断如果为负则修改为0
        remainBlood = remainBlood < 0 ? 0: remainBlood;
        //修改一下血量
        role.setBlood(remainBlood);


        //this表示方法的调用者
        System.out.println(this.getName()+" attack "+role.getName()+" over and hurt "+hurt+" hurt number "+role.getName()+" still have "+remainBlood+" blood " );

    }
}
