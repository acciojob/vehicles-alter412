package com.driver;

public class F1 extends Car {

    public F1(String name, boolean isManual) {
        //Use arbitrary values for parameters which are not mentioned
        super(name,4,2,6,isManual,"Sports",2);
    }

    public void accelerate(int rate){
        int newSpeed = getCurrentSpeed()+rate; //set the value of new speed by using currentSpeed and rate
        /**
         * speed 0: gear 1
         * speed 1-50: gear 1
         * speed 51-100: gear 2
         * speed 101-150: gear 3
         * speed 151-200: gear 4
         * speed 201-250: gear 5
         * speed more than 250: gear 6
         */

        if(newSpeed == 0) {
            //Stop the car, set gear as 1
            stop();
            changeGear(1);
        }
        //for all other cases, change the gear accordingly

        if(newSpeed > 0) {
            int newGear=1;
            if((newSpeed>=1)&&(newSpeed<=50)){
                newGear=1;
            } else if ((newSpeed>=51)&&(newSpeed<=100)) {
                newGear=2;
            } else if ((newSpeed>=101)&&(newSpeed<=150)) {
                newGear=3;
            } else if ((newSpeed>=151)&&(newSpeed<=200)) {
                newGear=4;
            } else if ((newSpeed>=201)&&(newSpeed<=250)) {
                newGear=5;
            }else {
                newGear=6;
            }
            changeGear(newGear);
            changeSpeed(newSpeed, getCurrentDirection());
        }
    }
}
