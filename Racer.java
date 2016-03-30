/**
 *
 * @author falc0n
 */
public class Racer implements Runnable {
    public static String winner;
    public void race(){
        for(int distance = 1; distance<=100; distance++){
        System.out.println("Is running "+Thread.currentThread().getName()+" at: "+distance+" meters");
    }
    }

 
    public void running(){
        try{
            for(int i =0; i<=10; i++){
                System.out.println("running up to:"+i);
                Thread.sleep(1000^10);
            }
        }catch(InterruptedException e){
            System.out.println("there was an interruption");
        }
         
    }
    public void run(){
        this.race();
        this.running();
       // this.isRaceWon();
        
    }
    private boolean isRaceWon(int totalDistanceCovered){
        boolean isRaceWon = false;
        if((Racer.winner==null)&& (totalDistanceCovered ==100)){
        String winnerName = Thread.currentThread().getName();
        Racer.winner = winnerName;//setting winnerName
        System.out.println("Winner is:"+Racer.winner);
        isRaceWon = true;
        
    }else if(Racer.winner==null){
        isRaceWon=false;
    }else if(Racer.winner!=null){
        isRaceWon=true;
    }
    return isRaceWon;
 }
}
    