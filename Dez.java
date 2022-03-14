import javax.swing.JOptionPane;

class Dez{
    public static void main(String args[]){
        JOptionPane jop = new JOptionPane();

        int Nm = Integer.parseInt(jop.showInputDialog(null, "Digite seu número"));

        if ( Nm <= 10 ){

            if (Nm == 10){
                jop.showMessageDialog(null, "É o número 10!!!");
            }

            else{
                jop.showMessageDialog(null, " É menor que 10!!!");
            }

        }

        else{
            jop.showMessageDialog(null, "É maior que 10!!");
        }

    }
}