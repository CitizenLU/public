package leetcode;

public class SeatManager {
    // true不可预约，false可预约。下标1到n
    boolean[] seats;
    // 当前可预约的最小编号，0表示都不可预约
    int index;

    public SeatManager(int n) {
        seats = new boolean[n+1];
        index = 1;
    }

    public int reserve() {
        int i = index;
        while (i < seats.length) {
            if (!seats[i]) {
                seats[i] = true;
                break;
            }
            i++;
        }
        int nindex = i;
        while (nindex < seats.length) {
            if (!seats[nindex]) {
                index = nindex;
                break;
            }
            nindex++;
        }
        if (nindex == seats.length) {
            index = -1;
        }
        return i;
    }

    public void unreserve(int seatNumber) {
        seats[seatNumber] = false;
        if (seatNumber < index) {
            index = seatNumber;
        }
    }

    public static void main(String[] args) {
        SeatManager seatManager = new SeatManager(2);
        System.out.println(seatManager.reserve());
        seatManager.unreserve(1);
        System.out.println(seatManager.reserve());
        System.out.println(seatManager.reserve());
        seatManager.unreserve(2);
        System.out.println(seatManager.reserve());
        seatManager.unreserve(1);
        System.out.println(seatManager.reserve());
        seatManager.unreserve(2);
        System.out.println(seatManager.reserve());

    }
}
