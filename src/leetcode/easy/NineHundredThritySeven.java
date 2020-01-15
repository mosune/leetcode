package leetcode.easy;

import java.util.Arrays;
import java.util.Comparator;

/**
 * 937. 重新排列日志文件
 *
 * 你有一个日志数组 logs。每条日志都是以空格分隔的字串。
 *
 * 对于每条日志，其第一个字为字母数字标识符。然后，要么：
 *
 * 标识符后面的每个字将仅由小写字母组成，或；
 * 标识符后面的每个字将仅由数字组成。
 * 我们将这两种日志分别称为字母日志和数字日志。保证每个日志在其标识符后面至少有一个字。
 *
 * 将日志重新排序，使得所有字母日志都排在数字日志之前。字母日志按内容字母顺序排序，忽略标识符；在内容相同时，按标识符排序。数字日志应该按原来的顺序排列。
 *
 * 返回日志的最终顺序。
 *
 *  
 *
 * 示例 ：
 *
 * 输入：["a1 9 2 3 1","g1 act car","zo4 4 7","ab1 off key dog","a8 act zoo"]
 * 输出：["g1 act car","a8 act zoo","ab1 off key dog","a1 9 2 3 1","zo4 4 7"]
 *  
 *
 * 提示：
 *
 * 0 <= logs.length <= 100
 * 3 <= logs[i].length <= 100
 * logs[i] 保证有一个标识符，并且标识符后面有一个字。
 *
 * @author gcg
 * @create 2020-01-15 16:54
 **/
public class NineHundredThritySeven {

    /**
     * 贼几把复杂
     * @param logs
     * @return
     */
//    public String[] reorderLogFiles(String[] logs) {
//        String[] results = new String[logs.length];
//        String[] nums = new String[logs.length];
//
//        int sIndex = 0, nIndex = 0;
//        String data;
//        for (String s : logs) {
//            data = s.substring(s.indexOf(" ") + 1);
//            if (data.charAt(0) < 65) nums[nIndex++] = s;
//            else results[sIndex++] = s;
//        }
//
//        Arrays.sort(results, (o1, o2) -> {
//            if (o1 == null) return 1;
//            if (o2 == null) return -1;
//            int result = o1.substring(o1.indexOf(" ")).compareTo(o2.substring(o2.indexOf(" ")));
//            if (result == 0) {
//                return o1.substring(0, o1.indexOf(" ")).compareTo(o2.substring(0, o2.indexOf(" ")));
//            }
//            return result;
//        });
//
//        for (int i = 0; i < nIndex; i++) {
//            results[sIndex++] = nums[i];
//        }
//
//        return results;
//    }

    /**
     * 官方简洁写法
     * @param logs
     * @return
     */
    public String[] reorderLogFiles(String[] logs) {
        Arrays.sort(logs, (o1, o2) -> {
            String[] o1s = o1.split(" ", 2);
            String[] o2s = o2.split(" ", 2);
            boolean o1Flag = Character.isDigit(o1s[1].charAt(0));
            boolean o2Flag = Character.isDigit(o2s[1].charAt(0));
            if (!o1Flag && !o2Flag) {
                int result = o1s[1].compareTo(o2s[1]);
                if (result == 0) return o1s[0].compareTo(o2s[0]);
                else return result;
            }
            return o1Flag ? (o2Flag ? 0 : 1) : -1;
        });

        return logs;
    }

}
