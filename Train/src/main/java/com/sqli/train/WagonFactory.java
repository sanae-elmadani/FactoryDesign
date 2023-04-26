package com.sqli.train;

public class WagonFactory {

    public Train getWagon(char wagonType){
//        switch (wagonType){
//            case 'H':
//                return new Head();
//            case 'p':
//                System.out.println("now I am in wagonFactory");
//                return new Passenger();
//            case 'R':
//                return new Restaurant();
//            case 'C':
//                return new Cargo();
//
//        }
       if(wagonType=='P') return new Passenger();
       if(wagonType=='H') return new Head();
       if(wagonType=='R') return new Restaurant();
       if(wagonType=='C') return new CargoEmpty();
       if(wagonType=='A') return new CargoLoaded();

        return null;
    }

}
