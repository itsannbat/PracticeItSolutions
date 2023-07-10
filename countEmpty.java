public class countEmpty {
    public int countEmpty() {
            return countEmpty(overallRoot);    
    }
            
    private int countEmpty(IntTreeNode node) {
        if (node == null) {
            return 1;
        } else {
            return countEmpty(node.left) + countEmpty(node.right);
        }
    }
}
