package assignment2;

public class car {

		public class Car {
			// TODO Auto-generated method stub
			
			int gear = 1 ;
			int location ;
			int speed = 0 ;
			final int destination = 250 ;
			
			
			void reverseGear() {
					gear = -1;
				
			}
		
			void gearUp() {
				 if (gear == 6)
				 {System.out.println("Error");}
				 if (gear < 0)
				 {gear = 1;}
				 gear = gear + 1;
				 
			}
			
			void gearDown() {
				 if (gear == 1)
				 {System.out.println("The gear cannot be decreased anymore");}
				 if (gear < 0)
				 {System.out.println("error");}
				 gear = gear - 1;
				 
			}   
			
			int reportGear() { 
				return gear;
				
			}
			
			int reportLocation() {
				return location;
				
			}
				
			int reportRemaining() {
				return destination-location ; 
				
			}
			
			void moveByTime(int time) {
				if (time <= 0)
					{System.out.println("Time should be positive");}
				else{
					speed = gear*20;
					int delta = speed * time; 
					location = location + delta;
				}
				
				
			}
			
			boolean isArrived() {
				if (location == destination || location > destination){
					return true;
				}
				else {
					return false;
				}
				
			}
			

	}


}
