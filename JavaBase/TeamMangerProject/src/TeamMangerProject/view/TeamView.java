package TeamMangerProject.view;

import TeamMangerProject.domain.Employee;
import TeamMangerProject.domain.Programmer;
import TeamMangerProject.service.NameListService;
import TeamMangerProject.service.TeamException;
import TeamMangerProject.service.TeamService;

/**
 * @description: TODO
 * @author: Year21
 * @date: 2022/2/9 15:45
 * @version 1.0
 */
public class TeamView {
    //属性
    private NameListService listSvc = new NameListService();
    private TeamService teamSvc= new TeamService();

    public void enterMainMenu(){
        boolean isEsc = true;
        int choose = 0;
        while(isEsc){
            if (choose != '1'){
                listAllEmployee();
            }
            String details = "1-团队列表  2-添加团队成员  3-删除团队成员 4-退出   请选择(1-4)：";
            System.out.print(details);
            choose = TSUtility.readMenuSelection();
            switch(choose){
                case '1':
                    getTeam();
                    break;
                case '2':
                    addMember();
                    break;
                case '3':
                    deleteMember();
                    break;
                case '4':
                    System.out.println();
                    System.out.print("确认是否退出(Y/N)：");
                    int enter = TSUtility.readConfirmSelection();
                    if (enter == 'Y'){
                        isEsc = false;
                        break;
                    }
            }
        }

    }
    public void listAllEmployee(){
        System.out.println("-------------------------------开发团队调度软件--------------------------------\n");
        System.out.println("ID\t姓名\t年龄\t工资\t职位\t状态\t奖金\t股票\t领用设备");
        //getAllEmployees()返回的是一个数组的地址值
        Employee[] endArray = listSvc.getAllEmployees();
        for (int i = 0; i < endArray.length; i++) {
            System.out.println(endArray[i]);
        }
        System.out.println("-------------------------------------------------------------------------------");
    }

    public void getTeam(){
        System.out.println("--------------------团队成员列表---------------------");
        Programmer[] otherTeam = teamSvc.getTeam();//多态的调用
        //在一般情况有可能在在一开始在方法里面赋值了null，此处因getTeam有数据所以不会产生null的情况
        if (otherTeam.length == 0){
            System.out.println("开发团队目前没有成员！");
        }else{
            System.out.println("TID/ID\t姓名\t年龄\t工资\t职位\t奖金\t股票");
            for (int i = 0; i < otherTeam.length; i++) {
                System.out.println(otherTeam[i].getDetails());
            }
        }
        System.out.println("-----------------------------------------------------");
    }

    public void addMember(){
        System.out.println("---------------------添加成员---------------------");
        System.out.print("请输入要添加的员工ID：");
        int num = TSUtility.readInt();
        try{
            //getEmployee方法从employee此数组返回了一个数组对象
            //addMember方法将此对象添加进Programmer数组
            teamSvc.addMember(listSvc.getEmployee(num));
            System.out.println("添加成功");
        }catch (TeamException e){
            System.out.println("添加失败，原因是：" + e.getMessage());
        }
        TSUtility.readReturn();
    }

    public void deleteMember(){
        System.out.println("---------------------删除成员---------------------");
        System.out.print("请输入要删除员工的TID：");
        int tid = TSUtility.readInt();
        try{
            teamSvc.removeMember(tid);
            System.out.println("删除成功");
        }catch (TeamException e){
            System.out.println("删除失败，原因是：" + e.getMessage());
        }
        TSUtility.readReturn();
    }

    public static void main(String[] args) {
        TeamView teamView = new TeamView();
        teamView.enterMainMenu();
    }
}
