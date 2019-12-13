package leetcode.easy;

/**
 * 812. 最大三角形面积
 *
 * 给定包含多个点的集合，从其中取三个点组成三角形，返回能组成的最大三角形的面积。
 *
 * 示例:
 * 输入: points = [[0,0],[0,1],[1,0],[0,2],[2,0]]
 * 输出: 2
 * 解释:
 * 这五个点如下图所示。组成的橙色三角形是最大的，面积为2。
 *
 * 注意:
 *
 * 3 <= points.length <= 50.
 * 不存在重复的点。
 *  -50 <= points[i][j] <= 50.
 * 结果误差值在 10^-6 以内都认为是正确答案。
 *
 * @author gcg
 * @create 2019-12-13 10:21
 **/
public class EightHundredTwelve {

    public double largestTriangleArea(int[][] points) {
        double a, b, c, p, max = 0;

        for (int i = 0; i < points.length - 2; i++) {
            for (int j = i + 1; j < points.length - 1; j++) {
                for (int k = j + 1; k < points.length; k++) {
                    if ((points[i][0] - points[j][0]) == 0 && (points[k][0] - points[j][0]) == 0) continue;
                    if ((points[i][0] - points[j][0]) != 0 && (points[k][0] - points[j][0]) != 0 &&  ((double) (points[i][1] - points[j][1]) / (double) (points[i][0] - points[j][0])) == ((double) (points[k][1] - points[j][1]) / (double) (points[k][0] - points[j][0]))) continue;
                    a = Math.sqrt(Math.pow(Math.abs(points[i][0] - points[j][0]), 2) + Math.pow(Math.abs(points[i][1] - points[j][1]), 2));
                    b = Math.sqrt(Math.pow(Math.abs(points[i][0] - points[k][0]), 2) + Math.pow(Math.abs(points[i][1] - points[k][1]), 2));
                    c = Math.sqrt(Math.pow(Math.abs(points[j][0] - points[k][0]), 2) + Math.pow(Math.abs(points[j][1] - points[k][1]), 2));
                    p = (a + b + c) / 2;
                    max = Math.max(max, Math.sqrt(p * (p - a) * (p - b) * (p - c)));
                }
            }
        }

        return max;
    }

}
