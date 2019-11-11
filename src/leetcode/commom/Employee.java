package leetcode.commom;

import java.util.List;

/**
 * @author gcg
 * @create 2019-11-11 15:06
 **/
public class Employee {
    // It's the unique id of each node;
    // unique id of this employee
    public int id;
    // the importance value of this employee
    public int importance;
    // the id of direct subordinates
    public List<Integer> subordinates;
}
