public class depthSum {
    public int depthSum() {
        return depthSumHelper(overallRoot, 1);
    }
    
    public int depthSumHelper(IntTreeNode node, int n) {
        if (node == null) {
            return 0;
        } else {
            return n * node.data + depthSumHelper(node.left, n + 1) + depthSumHelper(node.right, n + 1);
        } 
    }
}
