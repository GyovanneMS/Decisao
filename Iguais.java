import javax.swing.JOptionPane;

class Iguais{
    public static void main(String args[]){
        JOptionPane jop = new JOptionPane();

        int Nm1 = Integer.parseInt(jop.showInputDialog(null, "Digite um número."));
        int Nm2 = Integer.parseInt(jop.showInputDialog(null, "Digite outro número."));


        if (Nm1 >= Nm2){
            if (Nm1 == Nm2 ){
                jop.showMessageDialog(null, "São iguais!!!");
            }

            else {
                jop.showMessageDialog(null, "O primeiro é maior!!!");
            }
        }

        else {
            jop.showMessageDialog(null, "O segundo é maior!!");
        }

    }
}