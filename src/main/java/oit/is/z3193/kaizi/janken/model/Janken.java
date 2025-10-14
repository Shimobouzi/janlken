package oit.is.z3193.kaizi.janken.model;

public class Janken {
  String pHand;
  String cHand;
  String result;

  public Janken(String pHand) {
    switch ((pHand)) {
      case "guu":
        this.pHand = "グー";
        break;
      case "paa":
        this.pHand = "パー";
        break;
      case "choki":
        this.pHand = "チョキ";
        break;
      default:
        break;
    }

    this.cHand = "グー";
    result = jankenVS(this.pHand, this.cHand);
  }

  private String jankenVS(String pHand, String cHand) {
    String rt;
    if (pHand == cHand) {
      rt = "あいこ";
    } else if (pHand == "パー") {
      rt = "勝ち";
    } else {
      rt = "負け";
    }
    return rt;
  }

  public String getResult() {
    return ("あなたの手：" + this.pHand + " | 相手の手：" + this.cHand + " | 結果：" + result);
  }
}
