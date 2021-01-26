/**
 * @author Ri
 *
 */
package Week1;
import java.util.Scanner;

public class Week1 {
	
	public static void main(String[] args) {
	
	//PART ONE//
		Scanner input = new Scanner(System.in);
		/*
		 * Use the following data values to populate your simple array 
		 * as part of the declaration and initialization of the array. 
		 * Note, this data is a list of 50 unique integer values.
		 */
		
		int[] myNum = {39,46,10,37,33,4,30,26,14,19,29,6,43,8,35,50,13,25,17,48,28,3,41,34,36,38,49,16,45,2,40,15,24,7,5,9,20,1,42,44,21,47,12,22,18,31,11,32,27,23};
		boolean valid = false;
		
		//Prompting the user for an integer between 1 and 50.
		
				System.out.println("Enter an integer between 1 and 50!");
				System.out.print("Your integer: ");
				int userNum = input.nextInt();
				
				while (userNum > 50 || userNum < 0) {
					
					System.out.println("Your integer is not between 1 and 50, please enter a valid integer!");
					System.out.print("Your integer: ");
					userNum = input.nextInt();
				}
				
				// checks if user's value is in the array
				
				System.out.println("Checking if your value is in our array ...");
				
				for (int i = 0; i < myNum.length; i++){ 
		            if (userNum == myNum[i]){
		            	valid = true;
		            }
				}
				
				if (valid == true) {
					
					for (int i = 0; i < myNum.length; i++){ 
				            if (userNum == myNum[i]){
				            	System.out.printf("The index position of %d is %d%n",userNum, i);
				            }
				    }
				}
				System.out.println("Exiting Part One...");
				
	//PART TWO AND THREE//
		int menuNav = 0;
		int accSearch;
		int i;
		int j;
		String rating = "Good";
		int accStanding = 0;
		// Create a one-dimensional array of type String, call it customers.
				String[] customers = {
						/*0*/"Amy Garrison",
						/*1*/"Braydon Beil",
						/*2*/"Bluebell Nguyen",
						/*3*/"Konrad Sears",
						/*4*/"Cheryl Salas",
						/*5*/"Rosanna Meyer",
						/*6*/"Karis Haley",
						/*7*/"Enzo Donaldson",
						/*8*/"Catrina Griffiths",
						/*9*/"Gregor Payne",
						/*10*/"Jermaine Jordan",
						/*11*/"Zakariya Goulding",
						/*12*/"Mehdi Vickers",
						/*13*/"Zarah Lozano",
						/*14*/"Mattie Watkins",
						/*15*/"Hudson Sheridan",
						/*16*/"Rahul Tate",
						/*17*/"Bruno Jefferson",
						/*18*/"Shaunie Mccallum",
						/*19*/"Mica Hendrix",
						/*20*/"Coco Houston",
						/*21*/"Kayla Stanton",
						/*22*/"Noel Cooper",
						/*23*/"Tommie Leonard",
						/*24*/"Naima Bray",
						/*25*/"Harley Neville",
						/*26*/"Sabah Rosas",
						/*27*/"Kade Mccartney",
						/*28*/"Bruce Valenzuela",
						/*29*/"Elif Ireland",
						/*30*/"Nansi Joseph",
						/*31*/"KeirBetts",
						/*32*/"Harvie Barnard",
						/*33*/"Kady Whitworth",
						/*34*/"Sadiyah Levine",
						/*35*/"Sakina Cresswell",
						/*36*/"Chantel Wu",
						/*37*/"Harriette Booth",
						/*38*/"Isla-Mae Edge",
						/*39*/"Daniela Shepherd",
						/*40*/"Cosmo Lam",
						/*41*/"Myron Archer",
						/*42*/"Caspian Bradford",
						/*43*/"Elyse Fletcher",
						/*45*/"Halima Devlin",
						/*46*/"Humzah Madden",
						/*47*/"Bevan Donnelly",
						/*48*/"Piotr Rice",
						/*49*/"Malikah Mejia",
						/**/"Mujtaba Bassett"
					};
					
				//Create a two-dimensional array of type double, call it payments.
				
				double [][] payments = 
							{
							/*Index*/		
							/*0*/{1032,47,43,38,61,69,99,47,36,30,99,59,17},
							/*1*/{1043,93,48,18,57,52,14,55,87,22,52,56,77},
							/*2*/{1005,71,27,52,41,18,86,43,43,95,21,86,43},
							/*3*/{1030,13,12,27,81,29,86,31,86,10,54,71,81},
							/*4*/{1045,40,91,0,27,21,50,89,28,49,87,23,16},
							/*5*/{1040,25,15,63,88,68,60,77,25,63,73,13,10},
							/*6*/{1007,24,89,72,49,17,30,96,22,64,56,69,15},
							/*7*/{1008,45,42,54,27,65,22,75,51,42,43,97,97},
							/*8*/{1049,15,45,26,81,43,38,70,32,30,78,53,77},
							/*9*/{1035,21,47,15,28,54,61,15,85,60,95,39,62},
							/*10*/{1046,42,93,97,13,19,15,67,100,21,64,28,35},
							/*11*/{1029,90,42,61,75,96,25,12,65,66,39,20,52},
							/*12*/{1034,75,69,60,78,79,92,38,71,44,41,43,99},
							/*13*/{1027,60,59,89,22,86,55,83,67,70,24,70,39},
							/*14*/{1024,54,76,55,33,78,91,24,43,61,58,83,78},
							/*15*/{1001,94,56,48,30,32,0,0,52,41,46,37,60},
							/*16*/{1023,53,24,36,54,79,54,37,61,46,65,34,40},
							/*17*/{1022,21,41,49,74,44,91,82,100,12,26,12,23},
							/*18*/{1050,94,48,22,19,56,16,72,39,53,11,32,16},
							/*19*/{1033,82,21,97,69,50,86,16,55,93,72,70,47},
							/*20*/{1044,49,0,14,28,23,84,0,88,0,88,0,93},
							/*21*/{1026,26,22,34,63,99,99,50,36,75,64,86,33},
							/*22*/{1010,47,43,38,64,80,71,23,80,85,31,13,66},
							/*23*/{1003,36,97,15,25,41,77,44,54,72,20,12,85},
							/*24*/{1006,86,46,80,63,90,23,91,18,12,83,11,66},
							/*25*/{1047,80,73,48,28,11,49,76,14,85,67,65,51},
							/*26*/{1002,27,11,100,39,55,26,29,41,90,48,34,81},
							/*27*/{1021,94,94,50,16,37,48,56,90,96,25,93,70},
							/*28*/{1028,13,55,0,69,67,60,35,45,79,71,67,21},
							/*29*/{1042,80,69,29,47,70,22,42,83,26,54,95,70},
							/*30*/{1038,30,40,100,90,88,10,39,10,87,14,63,17},
							/*31*/{1004,30,84,56,28,13,92,51,52,61,91,68,53},
							/*32*/{1041,62,10,24,95,27,49,27,57,97,71,70,99},
							/*33*/{1000,10,69,43,91,93,24,74,52,20,76,27,86},
							/*34*/{1018,100,51,96,23,76,64,28,49,35,72,51,48},
							/*35*/{1019,22,82,37,26,39,81,81,94,50,80,78,88},
							/*36*/{1016,88,44,10,78,86,76,0,11,17,49,50,13},
							/*37*/{1012,57,67,47,41,43,100,66,23,29,18,55,75},
							/*38*/{1014,21,55,55,66,55,92,51,92,86,43,61,51},
							/*39*/{1036,42,19,97,27,68,24,69,85,80,43,87,58},
							/*40*/{1009,20,34,59,49,13,79,13,11,89,33,49,94},
							/*41*/{1013,36,30,50,77,93,30,97,100,68,41,93,21},
							/*42*/{1037,90,67,61,88,73,67,11,49,92,75,67,47},
							/*43*/{1017,32,73,82,30,55,39,48,79,87,31,99,41},
							/*44*/{1039,41,74,74,90,56,18,84,64,58,88,93,83},
							/*45*/{1025,32,91,0,0,0,19,87,74,83,64,26,44},
							/*46*/{1011,99,11,81,74,91,78,92,85,79,59,19,86},
							/*47*/{1020,35,84,81,73,30,90,95,30,68,51,12,83},
							/*48*/{1048,57,32,12,75,29,46,71,53,28,65,72,28},
							/*49*/{1015,16,86,61,44,63,80,48,25,15,30,45,36}
							};
				
				while(menuNav != 4) {
					System.out.printf("-------------------------------------------------------------");
					System.out.printf("%nCustomer Menu");
					System.out.printf("%n-------------------------------------------------------------");
					System.out.printf("%n1. Find customer by account number.");
					System.out.printf("%n2. Report customers with any missed payments.");
					System.out.printf("%n3. Report customers with \"Closed\" status.");
					System.out.printf("%n4. Exit");
					System.out.printf("%n-------------------------------------------------------------");
					System.out.printf("%nEnter 1, 2, 3, or 4 here: ");
					menuNav = input.nextInt();
					//placeHolder();
					
					if(menuNav == 1) {
						System.out.printf("-------------------------------------------------------------");
						System.out.printf("%nACCOUNT LOOKUP");
						System.out.printf("%n-------------------------------------------------------------");
							System.out.printf("%nEnter account number here: ");
							accSearch = input.nextInt();
							boolean myLoop = true;
							
								for (i = 0; i < payments.length; i++){
									for (j = 0; j < payments[i].length; j++){
										
										if (payments[i][j] == accSearch){
											for (int k = 0; k < payments[i].length; k++){
												if(payments[i][k] == 0) {
													accStanding += 1;
												}
											}
											
											if (accStanding == 0) {
												rating = "Good";
											}
											
											if (accStanding == 1) {
												rating = "Fair";
											}
											
											if (accStanding == 2) {
												rating = "Poor";
											}
											if (accStanding >= 3) {
												rating = "Closed";
											}
											if (myLoop==true){
											System.out.println("Account Found!");
											System.out.println("Printing Account Information...");
											System.out.printf("-------------------------------------------------------------");
											System.out.printf("%nCustomer Payment History");
											System.out.printf("%n-------------------------------------------------------------");
											System.out.printf("%nName: [%s] Account: [%.0f] 1: [%.0f] 2: [%.0f] 3: [%.0f] 4: [%.0f] 5:[%.0f] 6: [%.0f] 7: [%.0f] 8: [%.0f] 9:[%.0f] 10: [%.0f] 11:[%.0f] 12:[%.0f] Standing: [%s]",
															 customers[i], payments[i][0], payments[i][1], payments[i][2], payments[i][3], payments[i][4], payments[i][5], payments[i][6],
															 			   				   payments[i][7], payments[i][8], payments[i][9], payments[i][10], payments[i][11], payments[i][12],rating);
											System.out.printf("%n-------------------------------------------------------------");
											myLoop=false;
											}//if (myLoop==true)
										}//if (payments[i][j] == accSearch)
								}//for (j = 0; j < payments[i].length; j++)	
							}//i = 0; i < payments.length; i++
			}//if(menuNav == 1) 
			
			if(menuNav == 2) {
				System.out.printf("-------------------------------------------------------------");
				System.out.printf("%nACCOUNTS WITH MISSED PAYMENTS");
				boolean missedPay = false;
				for (i = 0; i < payments.length; i++){
					missedPay = false;
					for (j = 0; j < payments[i].length; j++){
						if (payments[i][j] == 0){
							missedPay=true;
							accStanding = 0;
							for (int k = 0; k < payments[i].length; k++){
								if(payments[i][k] == 0) {
									accStanding += 1;
								}
							}
							
							if (accStanding == 0) {
								rating = "Good";
							}
							
							if (accStanding == 1) {
								rating = "Fair";
							}
							
							if (accStanding == 2) {
								rating = "Poor";
							}
							if (accStanding >= 3) {
								rating = "Closed";
							}	
							
							}
						}
					if (missedPay==true){
					System.out.printf("%n-------------------------------------------------------------");	
					System.out.printf("%nCustomer Payment History");
					System.out.printf("%n-------------------------------------------------------------");
					System.out.printf("%nName: [%s] Account: [%.0f] 1: [%.0f] 2: [%.0f] 3: [%.0f] 4: [%.0f] 5:[%.0f] 6: [%.0f] 7: [%.0f] 8: [%.0f] 9:[%.0f] 10: [%.0f] 11:[%.0f] 12:[%.0f] Standing: [%s]",
									 customers[i], payments[i][0], payments[i][1], payments[i][2], payments[i][3], payments[i][4], payments[i][5], payments[i][6],
									 			   				   payments[i][7], payments[i][8], payments[i][9], payments[i][10], payments[i][11], payments[i][12],rating);
					System.out.printf("%n-------------------------------------------------------------");
					}
				}
				
			}//if(menuNav == 2)
			
			if(menuNav == 3) {
				System.out.printf("-------------------------------------------------------------");
				System.out.printf("%nACCOUNTS THAT ARE CLOSED");
				boolean missedPay = false;
				for (i = 0; i < payments.length; i++){
					missedPay = false;
					for (j = 0; j < payments[i].length; j++){
						if (payments[i][j] == 0){
							missedPay=true;
							accStanding = 0;
							for (int k = 0; k < payments[i].length; k++){
								if(payments[i][k] == 0) {
									accStanding += 1;
								}
							}
							
							if (accStanding == 0) {
								rating = "Good";
							}
							
							if (accStanding == 1) {
								rating = "Fair";
							}
							
							if (accStanding == 2) {
								rating = "Poor";
							}
							if (accStanding >= 3) {
								rating = "Closed";
							}	
							
							}
						}
					if (missedPay==true && rating == "Closed"){
					System.out.printf("%n-------------------------------------------------------------");	
					System.out.printf("%nCustomer Payment History");
					System.out.printf("%n-------------------------------------------------------------");
					System.out.printf("%nName: [%s] Account: [%.0f] 1: [%.0f] 2: [%.0f] 3: [%.0f] 4: [%.0f] 5:[%.0f] 6: [%.0f] 7: [%.0f] 8: [%.0f] 9:[%.0f] 10: [%.0f] 11:[%.0f] 12:[%.0f] Standing: [%s]",
									 customers[i], payments[i][0], payments[i][1], payments[i][2], payments[i][3], payments[i][4], payments[i][5], payments[i][6],
									 			   				   payments[i][7], payments[i][8], payments[i][9], payments[i][10], payments[i][11], payments[i][12],rating);
					System.out.printf("%n-------------------------------------------------------------");
					}
				}
				
			}//if(menuNav == 3)	
			
		}//while(menuNav != 4)
		System.out.printf("%n-------------------------------------------------------------");	
		System.out.printf("%nExiting Part Two And Three!");	
		System.out.printf("%n-------------------------------------------------------------");
	}	
}