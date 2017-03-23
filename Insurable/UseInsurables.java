import java.awt.Color;
public class UseInsurables{
  public static void main(String[] args){
    Insurable[] ins = new Insurable[3];

    ins[0] = new InsurableCar("toyota corolla", 1999,Color.WHITE);

    ins[1] = new InsurableHouse(1995, 7);
    ins[1].setRisk("Subsidence");
    ins[1].setRisk("Flood");

    ins[2] = new InsurableCar("porsche", 2007, Color.RED);
    ins[2].setRisk("Comprehensive");
    ins[2].setRisk("Any Named Driver");

    for (Insurable in : ins ) {
        System.out.println(in +" (" + in.getRisk()+ ")");
    }
  }
}
