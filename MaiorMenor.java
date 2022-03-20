import javax.swing.JOptionPane;

class MaiorMenor{
    public static void main(String args[]){
        JOptionPane jop = new JOptionPane();

        int idade = Integer.parseInt(jop.showInputDialog(null, "Digite sua idade"));

        if(121 > idade && idade > 0){
            if (idade >= 18){
                jop.showMessageDialog(null, "É de maior");
            }
            else{
                jop.showMessageDialog(null, "É de menor");
            }
        }
        else{
            jop.showMessageDialog(null, "É de nada, pare de brincar comigo!");
        }
    }    
}
