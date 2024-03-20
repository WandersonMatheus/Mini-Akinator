public class TreeNode {
    private String question;
    private TreeNode yesNode;
    private TreeNode noNode;
    private Animal resultado;
    
    public TreeNode(String question, TreeNode yesNode, TreeNode noNode, Animal resultado) {
        this.question = question;
        this.yesNode = yesNode;
        this.noNode = noNode;
        this.resultado = resultado;
    }
    public String getQuestion() {
        return question;
    }
    public void setQuestion(String question) {
        this.question = question;
    }
    public TreeNode getYesNode() {
        return yesNode;
    }
    public void setYesNode(TreeNode yesNode) {
        this.yesNode = yesNode;
    }
    public TreeNode getNoNode() {
        return noNode;
    }
    public void setNoNode(TreeNode noNode) {
        this.noNode = noNode;
    }
    public Animal getResultado() {
        return resultado;
    }
    public void setResultado(Animal resultado) {
        this.resultado = resultado;
    }

    
    
}
