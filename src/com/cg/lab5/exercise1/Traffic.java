package com.cg.lab5.exercise1;

public class Traffic {

	public String  trafficLight(String name)
	  {
	      switch(name)
	      {
	   	case "red" : return "Stop";
		 
        case "yellow" : return "Ready";
		 
         case "green" :return "go";
		
         default : return "Wrong Choice";
	      }
	  }
}
