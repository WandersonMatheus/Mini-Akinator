import java.util.Scanner;

    public class ArvoreDecisao {
        private TreeNode raiz;
    private TreeNode construiArvore(){ 
        raiz = new TreeNode("Seu animal é terrestre?",null, null, null);
        raiz.setYesNode(new TreeNode("Seu animal é carnívoro?",null,null,null));
        raiz.setNoNode(new TreeNode("Seu animal é aquatico", null, null, null));
        raiz.getYesNode().setYesNode(new TreeNode("é domesticavel?",null,null,null));
        raiz.getYesNode().getYesNode().//ia colocar o cachorro aqui
        return raiz;
    }

    public TreeNode getNos() {
        return raiz;
    }

    public void setNos(TreeNode nos) {
        this.raiz = raiz;
    }

    public ArvoreDecisao(TreeNode nos) {
        this.raiz = raiz;
    }
    

}
