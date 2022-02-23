package TeamMangerProject.service;

import TeamMangerProject.domain.Architect;
import TeamMangerProject.domain.Designer;
import TeamMangerProject.domain.Employee;
import TeamMangerProject.domain.Programmer;

/**
 * @author hcxs1986
 * @version 1.0
 * @description: TODO
 * @date 2022/2/8 14:52
 */
public class TeamService {
    //属性
    private int counter = 1;
    private final int MAX_MEMBER = 5;
    private Programmer[] team = new Programmer[MAX_MEMBER];
    private int total = 0;

    //构造器
    public TeamService(){

    }

    public Programmer[] getTeam(){
        //new一个新数组存放数组中已有的元素，
        //否则直接返回team后面null的也会输出，导致空指针异常
        Programmer[] newTeam = new Programmer[total];
        for (int i = 0; i < total; i++) {
            newTeam[i] = team[i];
        }
        return newTeam;
    }

    public void addMember(Employee e) throws TeamException{
                if (total > MAX_MEMBER){
                    throw new TeamException("成员已满，无法添加");
                }

                //!(e instanceof Programmer)表示取反，表示e不属于Programmer这个类及其父类
                if (!(e instanceof Programmer)){
                    throw new TeamException("该成员不是开发人员，无法添加");
                }


                Programmer p = (Programmer)e;
                //该员工已在本开发团队中
               if (isExit(e)){
                   throw new TeamException("该员工已在本开发团队中");
               }

                //该员工已是某团队成员
                //该员正在休假，无法添加
                //能来到此处说明一定是程序员及其子类，非普通成员，实行强转才能调用
                //p.getStatus().getNAME().equals("BUSY")这样的比较方式前面的p.有可能导致空指针异常的出现
               if ("BUSY".equals(p.getStatus().getName())){
                    throw new TeamException("该员工已是某团队成员");
                }
               if ("VOCATION".equals(p.getStatus().getName())){
                    throw new TeamException("该员正在休假，无法添加");
                }
               int Pro = 0 ,Des = 0 ,Arc = 0;
               for (int i = 0; i < total; i++) {
                   if (team[i] instanceof Architect){
                        Arc++;
                   }else if (team[i] instanceof Designer){
                       Des++;
                   }else if (team[i] instanceof Programmer){
                       Pro++;
                   }
                }

               //由最小的到最大范围，因最小的是最后才有机会执行
               if (p instanceof  Architect){
                   if (Arc >=1){
                       throw new TeamException("团队中至多只能有一名架构师");
                   }
               }else if (p instanceof  Designer){
                   if (Des >=2){
                       throw new TeamException("团队中至多只能有两名设计师");
                   }
               }else if (p instanceof Programmer){
                   if (Pro >=3){
                       throw new TeamException("团队中至多只能有三名程序员");
                   }
               }
               //如果以上都不抛异常，则将e加入现有的team数组
               team[total] = p;
               //p的属性
               //将p的状态修改为BUSY，默认初始化定义的是FREE，通过Status类调用定义好的三个对象属性
               p.setStatus(Status.BUSY);
               p.setMemberId(counter++);
               total++;//团队的实际人数

    }

    public void removeMember(int member) throws TeamException{
                int i = 0;
                for (; i < total; i++) {
                    if (team[i].getMemberId() == member){
                        team[i].setStatus(Status.FREE);//先将要删除的id成员状态从BUSY改成FREE
                        break;
                    }
                }
                //未找到索引目标，抛出异常
                if (i == total){
                    throw new TeamException("找不到指定memberId的员工");
                }
                for (int j = i; j < total - 1; j++ ){
                    team[j] = team[j+1];
                }
                team[total-1] = null;//将数组最后一位赋空值
                total--;

    }


    //判断此成员是否在团队中存在
    //id相同则在团队中存在
    public boolean isExit(Employee e){
                for (int i = 0; i < total; i++) {
                    if (team[i].getId() == e.getId()){
                        return true;
                    }
                }
                return false;
            }
}
