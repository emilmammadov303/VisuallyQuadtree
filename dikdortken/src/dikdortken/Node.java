package dikdortken;

public class Node {
    private int x;
    private int y;
    private String isim;
    private Node node1;
    private Node node2;
    private Node node3;
    private Node node4;
    private Node parent;
    private int x1;
    private int x2;
    private int x3;
    private int x4;
    private int y1;
    private int y2;
    private int y3;
    private int y4;
    
    public Node(String isim,int x,int y)
    {
        this.isim = isim;
        this.x = x;
        this.y = y;
    }

    /**
     * @return the x
     */
    public int getX() {
        return x;
    }

    /**
     * @param x the x to set
     */
    public void setX(int x) {
        this.x = x;
    }

    /**
     * @return the y
     */
    public int getY() {
        return y;
    }

    /**
     * @param y the y to set
     */
    public void setY(int y) {
        this.y = y;
    }

    /**
     * @return the isim
     */
    public String getIsim() {
        return isim;
    }

    /**
     * @param isim the isim to set
     */
    public void setIsim(String isim) {
        this.isim = isim;
    }

    /**
     * @return the node1
     */
    public Node getNode1() {
        return node1;
    }

    /**
     * @param node1 the node1 to set
     */
    public void setNode1(Node node1) {
        this.node1 = node1;
    }

    /**
     * @return the node2
     */
    public Node getNode2() {
        return node2;
    }

    /**
     * @param node2 the node2 to set
     */
    public void setNode2(Node node2) {
        this.node2 = node2;
    }

    /**
     * @return the node3
     */
    public Node getNode3() {
        return node3;
    }

    /**
     * @param node3 the node3 to set
     */
    public void setNode3(Node node3) {
        this.node3 = node3;
    }

    /**
     * @return the node4
     */
    public Node getNode4() {
        return node4;
    }

    /**
     * @param node4 the node4 to set
     */
    public void setNode4(Node node4) {
        this.node4 = node4;
    }

    /**
     * @return the parent
     */
    public Node getParent() {
        return parent;
    }

    /**
     * @param parent the parent to set
     */
    public void setParent(Node parent) {
        this.parent = parent;
    }

    /**
     * @return the x1
     */
    public int getX1() {
        return x1;
    }

    /**
     * @param x1 the x1 to set
     */
    public void setX1(int x1) {
        this.x1 = x1;
    }

    /**
     * @return the x2
     */
    public int getX2() {
        return x2;
    }

    /**
     * @param x2 the x2 to set
     */
    public void setX2(int x2) {
        this.x2 = x2;
    }

    /**
     * @return the x3
     */
    public int getX3() {
        return x3;
    }

    /**
     * @param x3 the x3 to set
     */
    public void setX3(int x3) {
        this.x3 = x3;
    }

    /**
     * @return the x4
     */
    public int getX4() {
        return x4;
    }

    /**
     * @param x4 the x4 to set
     */
    public void setX4(int x4) {
        this.x4 = x4;
    }

    /**
     * @return the y1
     */
    public int getY1() {
        return y1;
    }

    /**
     * @param y1 the y1 to set
     */
    public void setY1(int y1) {
        this.y1 = y1;
    }

    /**
     * @return the y2
     */
    public int getY2() {
        return y2;
    }

    /**
     * @param y2 the y2 to set
     */
    public void setY2(int y2) {
        this.y2 = y2;
    }

    /**
     * @return the y3
     */
    public int getY3() {
        return y3;
    }

    /**
     * @param y3 the y3 to set
     */
    public void setY3(int y3) {
        this.y3 = y3;
    }

    /**
     * @return the y4
     */
    public int getY4() {
        return y4;
    }

    /**
     * @param y4 the y4 to set
     */
    public void setY4(int y4) {
        this.y4 = y4;
    }
    
}
