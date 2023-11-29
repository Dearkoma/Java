package HouseRent.View;

import HouseRent.service.HouseService;
import HouseRent.utils.Utility;
import HouseRent.domain.House;

public class HouseView {
    private boolean loop = true;
    private char key = ' ';//接收用户选择
    private HouseService hs = new HouseService(10);
    
    public void mainMenu() {
        do {
            System.out.println("====House Rent");
            System.out.println("\t1加");
            System.out.println("\t2查");
            System.out.println("\t3删");
            System.out.println("\t4修改");
            System.out.println("\t5房屋列表");
            System.out.println("\t6退出");
            System.out.println("Your Choose");
            key = Utility.readChar(key);
            switch (key) {
                case '1':
                    addHouses();
                    break;
                case '2':
                    findHouse();
                    break;
                case '3':
                    deLHouse();
                    break;
                case '4':
                    updataHouse();
                    //chanageHouse();
                    break;
                case '5':
                    listHouses();
                    break;
                case '6':
                    exit();
                    break;
            }
        } while (loop);
    }

    public void listHouses() {
        System.out.println("=======房屋列表");
        System.out.println("编号等...");
        House[] houses = hs.list();
        for (int i = 0; i < houses.length; i++) {
            if (houses[i] == null) {
                break;
            }
            System.out.println(houses[i]);
        }
        System.out.println("========房屋列表显示完成");
    }

    public void addHouses() {
        System.out.println("添加房屋");
        System.out.println("姓名:");
        String name = Utility.readString(8);
        System.out.println("电话:");
        String phone = Utility.readString(12);
        System.out.println("地址");
        String address = Utility.readString(16);
        System.out.println("月租:");
        double rent = Utility.readDouble();
        System.out.println("状态:");
        String state = Utility.readString(3);
        //id为系统分配
        House newHouse = new House(0, name, phone, address, rent, state);
        if (hs.add(newHouse)) {
            System.out.println("添加成功");
        } else {
            System.out.println("添加失败");
        }
    }

    public void deLHouse() {
        System.out.println("添加房屋信息");
        System.out.println("输入房屋编号(-1)结束");
        int delID = Utility.readInt();
        if (delID == -1) {
            System.out.println("结束");
        }
        //循环判断
        char choice = Utility.readConfirmSelection();
        if (choice == 'Y') {
            if (hs.del(delID)) {
                System.out.println("删除成功");
            } else {
                System.out.println("不存在");
            }
        } else {
            System.out.println("取消");
        }
    }

    public void exit() {
        char c = Utility.readConfirmSelection();
        //System.out.println("退出");
        if (c == 'Y') {
            loop = false;
        }
    }
    public void findHouse() {
        System.out.println("查找房屋");
        System.out.println("输入ID");
        int findId = Utility.readInt();
        House house = hs.findHouse(findId);
        if (house != null) {
            System.out.println(house);
        } else {
            System.out.println("不存在");
        }
    }

    public void chanageHouse() {
        System.out.println("修改房屋信息:");
        System.out.println("输入要更改的ID");
        int X = -1;
        X = Utility.readInt();
        System.out.println("姓名:");
        String name = Utility.readString(8);
        System.out.println("电话:");
        String phone = Utility.readString(12);
        System.out.println("地址");
        String address = Utility.readString(16);
        System.out.println("月租:");
        double rent = Utility.readDouble();
        System.out.println("状态:");
        String state = Utility.readString(3);
        //id为系统分配

        House newHouse = new House(0, name, phone, address, rent, state);
        if (hs.changHouse(newHouse, X) != null) {
            System.out.println("修改成功");
        } else {
            System.out.println("修改失败");
        }
    }

    public void updataHouse() {
        System.out.println("修改房屋");
        System.out.println("输入房屋ID(-1退出)");
        int cid = Utility.readInt();
        if (cid == -1) {
            System.out.println("退出");
            return;
        }
        House house = hs.findHouse(cid);//返回house[i]就是house元素
        if (house == null) {
            System.out.println("修改对象不存在");
            return;
        }
        System.out.println("姓名:" + house.getOwner());
        String name = Utility.readString(8, "");//默认为""
        if (!"".equals(name)) {// 不是空的就修改
            house.setOwner(name);
        }

        System.out.println("电话(" + house.getPhone() + ")");
        String phone = Utility.readString(12,"");//默认为""
        if (!"".equals(phone)) {// 不是空的就修改
            house.setPhone(phone);
        }
        System.out.println("地址:" + house.getAddress());
        String address = Utility.readString(10,"");//默认为""
        if (!"".equals(address)) {// 不是空的就修改
            house.setAddress(address);
        }
        System.out.println("租金:" + house.getRent());
        int rent = Utility.readInt(-1);//默认为""
        if (rent != -1) {// 不是空的就修改
            house.setRent(rent);
        }
        System.out.println("状态:" + house.getStatus());
        String status = Utility.readString(8, "");//默认为""
        if (!"".equals(status)) {// 不是空的就修改
            house.setStatus(status);
        }
        System.out.println("修改成功");
    }
}