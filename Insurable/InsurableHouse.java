public class InsurableHouse implements Insurable{
  private int yearBuilt;
  private int numRooms;
  // other fields related to houses..
  private String riskKind;

  public InsurableHouse(int yearBuilt,int numRooms){
    this.yearBuilt = yearBuilt;
    this.numRooms = numRooms;
    riskKind = null;
  }
  // end of InsurableHouse()

  public String toString(){
    return "HOUSE: " + numRooms + ", "+ yearBuilt;
  }
  // other methods related to houses...
  public void setRisk(String risk){
    if(riskKind == null)
      riskKind = risk;
    else
      riskKind = riskKind + " / " + risk;
  }
  // end of setRisk
  public String getRisk(){
    return riskKind;
  }
}

// end of InsurableGouse Class
