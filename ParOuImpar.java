import javax.swing.JOptionPane;

class ParOuImpar{
    public static void main(String args[]){
        JOptionPane jop = new JOptionPane();

        int Nm = Integer.parseInt(jop.showInputDialog(null, "Digite seu número"));

        if (Nm % 2 == 0){

            jop.showMessageDialog(null, "É par!!!!!");

        }
        else{
            jop.showMessageDialog(null, "É ímpar!!!");
        }
    }
}