import java.awt.Color;
public class InsurableCar implements Insurable{
  // field
  private String type;
  private int yearMade;
  private Color colour;
  // other fields related to cars ...

  private String riskKind;

  public InsurableCar(String type,int yearMade, Color colour){
    this.type = type;
    this.yearMade = yearMade;
    this.colour = colour;
    riskKind = "Third Party, fire and theft";
  } //end of InsurableCar()

  public String toString(){
    return "CAR: " + colour + ", " + type + ", "+ yearMade;
  }
  public void setRisk(String risk){
    riskKind = risk;
  }
  public String getRisk(){
    return riskKind;
  }

}
