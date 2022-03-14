import javax.swing.JOptionPane;

class Inteiros{
    public static void main(String args[]){
        JOptionPane jop = new JOptionPane();

        int Nm = Integer.parseInt(jop.showInputDialog(null, "Digite seu número"));

        if ( Nm >= 0){

            if (Nm == 0){
                jop.showMessageDialog(null, "É o número 0!!!");
            }

            else{
                jop.showMessageDialog(null, " É um número positivo!!!");
            }

        }

        else{
            jop.showMessageDialog(null, "É um número negativo!!");
        }

    }
}