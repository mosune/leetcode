package leetcode.commom;

/**
 * @author gcg
 * @create 2019-10-12 11:25
 **/
public class FourNode {

    public boolean val;
    public boolean isLeaf;
    public FourNode topLeft;
    public FourNode topRight;
    public FourNode bottomLeft;
    public FourNode bottomRight;

    public FourNode() {}

    public FourNode(boolean _val,boolean _isLeaf,FourNode _topLeft,FourNode _topRight,FourNode _bottomLeft,FourNode _bottomRight) {
        val = _val;
        isLeaf = _isLeaf;
        topLeft = _topLeft;
        topRight = _topRight;
        bottomLeft = _bottomLeft;
        bottomRight = _bottomRight;
    }

}
