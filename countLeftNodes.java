public class countLeftNodes {
    public int countLeftNodes() {
            return countLeftNodes(overallRoot);   
        }
        
    private int countLeftNodes(IntTreeNode node) {
        if (node == null) {
            return 0;
        } else if (node.left == null) {
            return countLeftNodes(node.right);
        } else {
            return 1 + countLeftNodes(node.left) + countLeftNodes(node.right);
        }
    }
}
