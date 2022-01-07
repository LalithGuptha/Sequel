package Simu;

import java.util.Random;

public class Toss {
    private Team callBy, wonBy, other;

    public Toss(Team callBy, Team wonBy, Team other){
        setCallBy(callBy);
        setWonBy(wonBy);
    }
    public Team getCallBy() {
        return callBy;
    }

    public void setCallBy(Team callBy) {
        this.callBy = callBy;
    }

    public Team getWonBy() {
        return wonBy;
    }

    public void setWonBy(Team wonBy) {
        this.wonBy = wonBy;
    }

    public Team getOther() {
        return other;
    }

    public void setOther(Team other) {
        this.other = other;
    }

    public Team coinFlip(){
        Random r = new Random();
        if(r.nextInt(2)==0){
            setWonBy(callBy);
        }
        else{
            setWonBy(other);
        }
        return getWonBy();

    }
}
