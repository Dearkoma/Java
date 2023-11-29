package HouseRent.service;

import HouseRent.domain.House;
public class HouseService {
    private House[] houses;
    private int houseNums = 1;
    private int idcounter = 1;
    public HouseService(int size) {
        houses = new House[size];
        houses[0] = new House(1, "Alice", "112", "华盛顿", 2000, "未出租");

    }

    public House[] list() {
        return houses;
    }

    public boolean add(House newHouse) {
        //判断是否还能扩容;
        if (houseNums >= houses.length) {
            System.out.println("已满,无法入住");
            return false;
        }
        //把newHouse对象加入队列,并且++
        houses[houseNums++] = newHouse;
        //设计ID自增
        newHouse.setId(++idcounter);
        return true;
    }

    public boolean del(int delID) {
        int index = -1;
        for (int i = 0; i < houses.length; i++) {
            if (delID == houses[i].getId()) {
                index = i;
            }
        }
        if (index == -1) {
            return false;
        }
        for (int i = index; i < houseNums - 1; i++) {//因为是houses[i]=houses[i+1]所以要-1
            houses[i] = houses[i + 1];
        }
        houses[--houseNums] = null;
        return true;
    }

    public House findHouse(int id) {
        for (int i = 0; i < houseNums; i++) {
            if (id == houses[i].getId()) {
                return houses[i];
            }
        }
        return null;
    }

    public House changHouse(House h, int X) {
        if (X != -1) {
            houses[X - 1] = h;
            return houses[X - 1];
        }
        return null;
    }
    //public 
}
