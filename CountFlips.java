public class CountFlips {
  public static void main(String[] args) {
    // coin object creation
    Coin coinflip = new Coin();


    // variables
    int headsflipped = 0;
    int tailsflipped = 0;


    // flip coin
    for(int i = 0; i < 100; i++){
      coinflip.flip();

      if(coinflip.isHeads()){
        headsflipped++;
      }
      else{
      tailsflipped++;
      }
    }

    
    // print results
    System.out.println("Number of Heads: " + headsflipped);
    System.out.println("Number of Tails: " + tailsflipped);
  }
}
