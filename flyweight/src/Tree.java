public class Tree {
    private int x;
    private int y;
    private TreeType type;

    public Tree(int x, int y, TreeType treeType) {
        this.x = x;
        this.y = y;
        this.type = treeType;
    }

    public void draw() {
        type.draw(x, y);
    }
}
