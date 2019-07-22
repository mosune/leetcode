package leetcode.easy;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 401. 二进制手表
 *
 * 二进制手表顶部有 4 个 LED 代表小时（0-11），底部的 6 个 LED 代表分钟（0-59）。
 *
 * 每个 LED 代表一个 0 或 1，最低位在右侧。
 *
 *
 *
 * 例如，上面的二进制手表读取 “3:25”。
 *
 * 给定一个非负整数 n 代表当前 LED 亮着的数量，返回所有可能的时间。
 *
 * 案例:
 *
 * 输入: n = 1
 * 返回: ["1:00", "2:00", "4:00", "8:00", "0:01", "0:02", "0:04", "0:08", "0:16", "0:32"]
 *  
 *
 * 注意事项:
 *
 * 输出的顺序没有要求。
 * 小时不会以零开头，比如 “01:00” 是不允许的，应为 “1:00”。
 * 分钟必须由两位数组成，可能会以零开头，比如 “10:2” 是无效的，应为 “10:02”。
 *
 * @author gcg
 * @create 2019-07-22 14:40
 **/
public class FourHundredOne {

    private int[] hourDatas = {1, 2, 4, 8};

    private int[] minuteDatas = {1, 2, 4, 8, 16, 32};

    // 蠢写法
    public List<String> readBinaryWatch(int num) {
        List<String> list = new ArrayList<>();

        for (int i = 0; i <= num; i++) {
            Set<Integer> hours = new HashSet<>();
            getHour(hours, 0, i, 0);
            if (i == 0) {
                Set<Integer> minutes = new HashSet<>();
                getMinute(minutes, 0, num, 0);
                for (Integer m : minutes) {
                    list.add(0 + ":" + (m < 10 ? "0" + m : m));
                }
            } else if (i != num) {
                for (Integer h : hours) {
                    Set<Integer> minutes = new HashSet<>();
                    getMinute(minutes, 0, num - i, 0);
                    for (Integer m : minutes) {
                        list.add(h + ":" + (m < 10 ? "0" + m : m));
                    }
                }
            } else {
                for (Integer h : hours) {
                    list.add(h + ":" + "00");
                }
            }
        }

        return list;
    }

    private void getHour(Set<Integer> hours, int pre, int num, int index) {
        if (num == 0) return;
        for (int i = index; i < hourDatas.length; i++) {
            int m = pre + hourDatas[i];
            getHour(hours, m, num - 1, i + 1);
            if (num == 1 && m < 12) hours.add(m);
        }
    }

    private void getMinute(Set<Integer> minutes, int pre, int num, int index) {
        if (num == 0) return;
        for (int i = index; i < minuteDatas.length; i++) {
            int m = pre + minuteDatas[i];
            getMinute(minutes, m, num - 1, i + 1);
            if (num == 1 && m < 60) minutes.add(m);
        }
    }

}
