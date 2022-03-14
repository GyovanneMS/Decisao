import javax.swing.JOptionPane;

class Metros{
    public static void main(String args[]){
        JOptionPane jop = new JOptionPane();

        double Nm = Integer.parseInt(jop.showInputDialog(null, "Digite seu número"));
        
        double km = Nm * Math.pow(10, 3);
        double hm = Nm * Math.pow(10, 2);
        double dam = Nm * Math.pow(10, 1);
        double m = Nm * Math.pow(10, 0);
        double dm = Nm * Math.pow(10, -1);
        double cm = Nm * Math.pow(10, -2);
        double mm = Nm * Math.pow(10, -3);

        jop.showMessageDialog(null, "O número em quilômetro (km) é: " + km + "\nO número em hectômetro (hm) é: " + hm + "\nO número em decâmetro (dam) é: " + dam + "\nO número em metros é: " + m + "\nO número em decímetro (dm) é: " + dm + "\nO número em centímetro (cm) é: " + cm + "\nO número emmilímetro (mm) é: " + mm);
    }
}