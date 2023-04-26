package com.sqli.train;

import java.util.ArrayList;

public class Train {
	String structure;
	public final static String CONNECTION = "::";
	ArrayList<Train> wagons = new ArrayList<>();

	public Train(String structure) {
		this.structure = structure;
	}
	public Train(){
	}

	public ArrayList<Train> makeList(){

		WagonFactory factory = new WagonFactory();
		for(int i = 0; i < structure.length(); i++){
			wagons.add(factory.getWagon(structure.charAt(i)));

		}
		return wagons;


	}
	public String print(){
		String result = "";
		System.out.println(result);
		makeList();
       // System.out.println(makeList());
			for(int i = 0; i< wagons.size(); i++){
				if(wagons.get(i) instanceof Head && i==0 ){
					result += ((Head) wagons.get(i)).addFirst()+ CONNECTION ;
				}else if (wagons.get(i) instanceof Head && i==wagons.size()-1){
					result += ((Head) wagons.get(i)).addLast();
				}
				else if(i != wagons.size()-1 && !(wagons.get(i) instanceof Head)){
					result += wagons.get(i).print();
					result += CONNECTION;}
				else{
					result += wagons.get(i).print();
				}

		}

       wagons.clear();
       return result;
	}

	public void  detachEnd(){
		structure=structure.substring(0, structure.length() - 1);
	}

	public void detachHead(){
		structure=structure.substring(1);

	}

	public boolean fill(){

		if(structure.indexOf("C")==-1){
			return false;
		}
		for(int i=0 ; i<structure.length();i++){
			if(structure.charAt(i)=='C'){
				structure=structure.substring(0,i) +'A'+ structure.substring(i+ 1);
				break;
			}

		}
		return true;
	}
}
