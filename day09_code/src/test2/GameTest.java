package test2;

public class GameTest {
    public static void main(String[] args) {
        //创建第一个角色
        Role r1 = new Role("jack",100,'男');
        //创建第二个角色
        Role r2 = new Role("jease",100,'女');

        //展示一下角色的信息
        r1.showRoleInfo();
        System.out.println();
        r2.showRoleInfo();

        //开始格斗 回合制游戏
        while(true){
            //r1开始攻击r2
            r1.attack(r2);
            //判断r2
            if(r2.getBlood() == 0){
                System.out.println(r1.getName()+"  K. O. "+ r2.getName());
                break;
            }
            //r2开始攻击r1
            r2.attack(r1);
            if(r1.getBlood() == 0){
                System.out.println(r2.getName()+" K. O."+r1.getName() );
                break;
            }
        }
    }
}
