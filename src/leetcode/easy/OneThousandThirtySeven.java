package leetcode.easy;

/**
 * 1037. 有效的回旋镖
 *
 * 回旋镖定义为一组三个点，这些点各不相同且不在一条直线上。
 *
 * 给出平面上三个点组成的列表，判断这些点是否可以构成回旋镖。
 *
 *  
 *
 * 示例 1：
 *
 * 输入：[[1,1],[2,3],[3,2]]
 * 输出：true
 * 示例 2：
 *
 * 输入：[[1,1],[2,2],[3,3]]
 * 输出：false
 *  
 *
 * 提示：
 *
 * points.length == 3
 * points[i].length == 2
 * 0 <= points[i][j] <= 100
 *
 * @author gcg
 * @create 2020-02-24 12:16
 **/
public class OneThousandThirtySeven {

    public boolean isBoomerang(int[][] points) {
        // S=(1/2)*(x1y2+x2y3+x3y1-x1y3-x2y1-x3y2)，三个点求三角形面积
        return points[0][0] * points[1][1] + points[1][0] * points[2][1] + points[2][0] * points[0][1] - points[0][0] * points[2][1] - points[1][0] * points[0][1] - points[2][0] * points[1][1] != 0;
    }

}
