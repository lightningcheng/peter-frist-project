package test2;

import java.util.Random;

public class Role {
    private String name;
    private int blood;
    private char gender;
    private String face;//长相是随机的

    String[] boyfaces = {"nice","handsome","angular","beareded","mild","bad_tempered","humble"};
    String[] girlfaces = {"attractive","lovely","pretty","charming","sexy","hot","comely"};


    //attack 攻击描述
    String[] attacks_desc={
            "%s use the black bar setting %s",
            "%s use the fire firing %s",
            "%s use the skin %s"
    };

    String[] injured_desc={
            " %s don't have any injure",
            "%s backup and still here ",
            " %s everything is ok"
    };

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getFace() {
        return face;
    }



    public Role(){
    }
    public Role(String name,int blood,char gender){
        this.name = name;
        this.blood = blood;
        this.gender = gender;
        //随机长相
        setFace(gender);
    }

    public void setFace(char gender) {
        //长相是随机的
        Random r = new  Random();
        if(gender == '男'){
            //从boyfaces里面随机长相
            int index = r.nextInt(boyfaces.length);
            this.face = boyfaces[index];
        }else if(gender == '女'){
            //从girlfaces里面随机长相
            int index = r.nextInt(girlfaces.length);
            this.face = girlfaces[index];
        }else{
            this.face = "general";
        }
        this.face = face;
    }

    public String getName(){return name;}

    public  void setNmae(String name){ this.name = name;}
    public int getBlood() {return blood;}
    public void setBlood(int blood){ this.blood = blood;    }

    //定义一个方法用于攻击别人
    //思考：谁攻击谁？
    //Role r1 = new Role();
    //Role r2 = new Role();
    //r1 攻击(r2);

    //方法调用者去攻击参数
    public void attack(Role role){

        Random r = new Random();
        int index = r.nextInt(attacks_desc.length);
        String KungFU = attacks_desc[index];
        //输出一个攻击的效果
        System.out.printf(KungFU,this.getName(),role.getName());

        //计算造成的伤害1~20

        int hurt = r.nextInt(20)+1;

        //剩余血量
        int remainBoold = role.getBlood() - hurt;
        //对剩余血量做一个验证,如果为负数了,就修改为0
        remainBoold = remainBoold < 0 ? 0: remainBoold;
        //修改一下挨揍的人的血量
        role.setBlood(remainBoold);

        //受伤的描述
        //血量 >90  0索引的描述
        //80~90 1索引
        //0~80  2索引
        //因为比较懒就写了三个索引

        if(remainBoold > 90){
            System.out.printf(injured_desc[0],getName());
        } else if (80< remainBoold &&remainBoold<90) {
            System.out.printf(injured_desc[1],getName());
        } else if (remainBoold<80) {
            System.out.printf(injured_desc[2],getName());
        }
        System.out.println();

        //this表示方法的调用者
        System.out.println(this.getName()+"举起拳头, 打了 "+role.getName()+"一下,"+"造成了"+hurt+"点伤害,"+role.getName()+"还剩下了"
        +remainBoold+"点血");
    }


    public void showRoleInfo() {
        System.out.println("姓名为:"+getName());
        System.out.println("血量为:"+getBlood());
        System.out.println("性别为:"+getGender());
        System.out.println("长相为:"+getFace());
    }




}
