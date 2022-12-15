public class BillTokoBangunan {
  private TokoBangunan tokoBangunan;
  
  public void setTokoBangunan(TokoBangunan tokoBangunan){
    this.tokoBangunan = tokoBangunan;
  }

  public TokoBangunan gettTokoBangunan(){
    return tokoBangunan;
  }

  public int getWeight(int weight){
    return tokoBangunan.getWeight(weight);
  }
}
