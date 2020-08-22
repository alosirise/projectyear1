import java.util.Scanner;
public class projectATM7{
	static String []idad1 ={"sompotlnw007","bewza23114"};
	static String []pwad1 ={"0869484897","6030212031"};
	static String []idus1 = new String[999];
	static String []pwus1 = new String[999];
	static int    []sumSC = new int   [999]; //string calculate	
	static double []money = new double[999];		
	static double []xds   = new double[999]; //deposit 		
	static double []xwd   = new double[999]; //math wd1 
	static double []xwd1  = new double[999]; //all withdrow1
	static double []wd    = new double[999]; //enter withdrow2
	static double []xwd2  = new double[999]; //all & math  wd2	 
	static String sc4,sc5,sc6,qu,stri;//sc4&5=id&passUser,sc6=Account toTransfer
	static int r,r1,n,t,tf; //tf=all transfer
	
	public static int stringcal(String qu,String sc1SC){
		Scanner sc = new Scanner(System.in);
		String check="true";
	    int sumSC=0;
		do{
     	    int xSC=0;
     	    int dSC=1;
			check="true";
            sumSC=0;			
     	    for(int i2SC=0;i2SC<sc1SC.length()-1;i2SC++){
     		    dSC=dSC*10;
     	    }for(int iSC=0;iSC<sc1SC.length()&&check.equals("true");iSC++){
     	   	    switch(sc1SC.charAt(iSC)){
					case '0':xSC=0;break;
					case '1':xSC=1;break;
					case '2':xSC=2;break;
					case '3':xSC=3;break;
					case '4':xSC=4;break;
					case '5':xSC=5;break;
					case '6':xSC=6;break;
					case '7':xSC=7;break;
					case '8':xSC=8;break;
					case '9':xSC=9;break;					
					default :check="false";
					System.out.println("--------------Please Enter number--------------");break;
				}
				if(check.equals("true")){
     	        	xSC=xSC*dSC; dSC=dSC/10; sumSC=sumSC+xSC;					
     	        }
			}if(check.equals("false")){
				 System.out.print(qu);sc1SC=sc.nextLine();
			 }
        }while(check.equals("false"));
		 return sumSC;
	}
		
	public static void registerUser(){
		Scanner sc = new Scanner(System.in);
		System.out.println("================ Register User ================\n");
		System.out.print("ENTER NEW ID\n>");
	    String sc1 =sc.nextLine();			    				    	
	    System.out.print("ENTER NEW PASSWORD\n>");
		String sc2 =sc.nextLine();
												
		System.out.print("ENTER ID AGAIN \n>");
		String sc3 =sc.nextLine();			    					    	
		System.out.print("ENTER PASSWORD AGAIN\n>");
		String sc4 =sc.nextLine();					
						
		r1=r;
		if(sc1.equals(sc3)&&sc2.equals(sc4)){					
			while(r1>=0){
				if(sc1.equals(idus1[r1])){									
					System.out.println("--------------Already Account--------------");	
					System.out.println("----------Please Register again--------------");
					registerUser();
				}
			r1--;
			}							
			idus1[r]=sc1;
			pwus1[r]=sc2;														
			System.out.println("--------------Register Success--------------");
			press();								
		}else{
			 System.out.println("\n--------------Register Fail--------------");	
			 System.out.println("----ID or Password Wrong!--Please Register again----");
			 press();
		 }								
	}
	
    public static void login(){
		Scanner sc = new Scanner(System.in);
		System.out.println("=============== Admin Login ===============\n");						
		System.out.print("ENTER ADMIN ID\n>");
		String sc1 =sc.nextLine();			    				    	
		System.out.print("ENTER ADMIN PASSWORD\n>");
	    String sc2 =sc.nextLine();
				    	
	    if(sc1.equals(idad1[0])&&sc2.equals(pwad1[0])||sc1.equals(idad1[1])
		    &&sc2.equals(pwad1[1])){
		    System.out.println("\n--------------Login Success--------------");
            System.out.println("  Admin : "+sc1);			
			press();
		}else{
			 System.out.println("\n--------------Login Fail--------------");
	         System.out.println("ID or Password Wrong!  Please login  again\n");
			 login();			 
		 }		 
	}
																
    public static void press(){
        xds[n]=0;
		xwd1[n]=0;
		xwd2[n]=0;
		tf=0;		
		Scanner sc = new Scanner(System.in);
		System.out.println("---------------------------------------------");
		System.out.println("PRESS 1 TO LOGIN USER	PRESS 2 TO REGISTER \nPRESS 3 TO BACK");
		System.out.println("---------------------------------------------");
		String press =sc.nextLine();
										
		switch(press){
			case "1" :user();break;								
			case "2" :r++;registerUser();break;						
			case "3" :login();break;						
			default  :System.out.println("\nEnter only 1-3 number\n----Please Select again----\n"); 
					  press();break;						
		}
	}
								
	public static void user(){
		Scanner sc = new Scanner(System.in);
		n=r;
		xds[n]=0;
		xwd1[n]=0;
		xwd2[n]=0;
		tf=0;
		System.out.println("================ User Login ================");											
	    System.out.print("Enter Username\n>");
		sc4 =sc.nextLine();			    					    	
		System.out.print("Enter Password\n>");
		sc5 =sc.nextLine();
				    					    	 					
		while(n>0){
			if(sc4.equals(idus1[n])&&sc5.equals(pwus1[n])){				
				System.out.println("\n--------------Login Success--------------");
                System.out.println("  User : "+sc4);				
				press1234();
			}
			n--;
		}									
		while(n==0){
			if(sc4.equals(idus1[n])&&sc5.equals(pwus1[n])){									
				System.out.println("\n--------------Login Success--------------");
				System.out.println("  User : "+sc4);
				press1234();
			}else{
				System.out.println("\n--------------Login Fail--------------");	
				System.out.println("ID or Password Wrong!  Please login  again\n");																														
				press();
			}
		}																												
	}
										
	public static void press1234(){
		Scanner sc=new Scanner(System.in);
		System.out.println("---------------- MAINMENU ----------------");
		System.out.println("Your Balance = "+money[n]+"\n");
		System.out.println(">>PRESS 1 to Deposit\n>>PRESS 2 to Withdrawal");
		System.out.print(">>PRESS 3 to Transferring\n>>PRESS 4 to Back\n>>PRESS 5 to Get the receipt.\n>");	
		String atm = sc.nextLine();
		switch(atm){
			case "1" :deposit();break;						
			case "2" :withdrawal();break;						
			case "3" :Transferring();break;					
			case "4" :press();break;					
			case "5" :receipt();break;					
			default  :System.out.println("\nEnter between 1-5\n--------------Please Select again--------------\n");
					  press1234();break;
		}
	}
														
	public static void deposit(){	
		Scanner sc = new Scanner(System.in);
		System.out.println("\n================ Deposit ================");		
		if(sc4.equals(idus1[n])&&sc5.equals(pwus1[n])){
			System.out.println("Your Balance = "+money[n]);
				
			System.out.println("\n>>ENTER A: Deposit 1000 Baht\n>>ENTER B: Deposit 500 Baht");
			System.out.print(">>ENTER C: Deposit 100 Baht\n>>ENTER D: Deposit 50 Baht\n>>ENTER E: Return to Mainmenu\n>");
			String sc6 = sc.nextLine();
		    switch(sc6){
				case "A" :System.out.println("\nYour Balance = "+(money[n] =money[n]+1000)+"\n");
						  xds[n]=xds[n]+1000;depositAgain();break;								
							  
				case "B" :System.out.println("\nYour Balance = "+(money[n] =money[n]+500)+"\n");
						  xds[n]=xds[n]+500;depositAgain();break;		
									
				case "C" :System.out.println("\nYour Balance = "+(money[n] =money[n]+100)+"\n");
						  xds[n]=xds[n]+100;depositAgain();break;	
									
				case "D" :System.out.println("\nYour Balance = "+(money[n]=money[n]+50)+"\n");
						  xds[n]=xds[n]+50;depositAgain();break;	
									
				case "E" :press1234();break;						
				default  :System.out.println("\nEnter between A-E\n--------------Please Select again--------------\n");
						  deposit();break;
			}
		}	
	}
						
	public static void depositAgain(){
		Scanner sc = new Scanner(System.in);
		System.out.print("-Enter 1 to Select another list	  -Enter 2 to Deposit again\n-Enter 3 to Get the receipt.\n>");
		String sc7 =sc.nextLine();
		switch(sc7){
			case "1" :press1234();break;						
			case "2" :deposit();break;							
			case "3" :receipt();break;			
			default :System.out.println("--------------Please Select 1-3 again--------------");depositAgain();break;	
		}
	}
		
	public static void withdrawal(){
		Scanner sc = new Scanner(System.in);
	    System.out.println("\n================ Withdrawal ================\n");			
		System.out.println("-Press A to Choose Bill  -Press B to Enter Money for Withdrawal  -Press C Return to MainMenu.");
		String sc10 = sc.nextLine();						
			
		int a1,a2,a3,a4;				
		switch(sc10){
			 case "A" :if(sc4.equals(idus1[n])&&sc5.equals(pwus1[n])){									
						    System.out.println("Your Balance = "+money[n]+"\n");
						    System.out.println("-Enter 1 - 1000 Baht bill   -Enter 2 - 500 Baht bill   -Enter 3 - 100 Baht bill");
							System.out.print("-Enter 4 - 50 Baht bill     -Enter 5 to Back\n>");						  
						    String sc11 = sc.nextLine();
							switch(sc11){
									case "1" :System.out.print("1000 Baht bill-----> ");
									          stri=sc.nextLine();
										      qu="1000 Baht bill -----> ";
										      a1=stringcal(qu,stri);

											  a1  = a1*1000;
											  xwd[n] =xwd[n]+a1;																									 
								    case "2" :System.out.print("500  Baht bill-----> ");
											  stri=sc.nextLine();
										      qu="500  Baht bill -----> ";
										      a2=stringcal(qu,stri);
													 
											  a2 = a2*500;
											  xwd[n] =xwd[n]+a2;
									case "3" :System.out.print("100  Baht bill-----> ");
											  stri=sc.nextLine();
										      qu="100  Baht bill -----> ";
										      a3=stringcal(qu,stri);
													 
											  a3 = a3*100;
											  xwd[n] =xwd[n]+a3;
									case "4" :System.out.print("50   Baht bill-----> ");
											  stri=sc.nextLine();
										      qu="50   Baht bill -----> ";
										      a4=stringcal(qu,stri);
													 
											  a4 = a4*50;
											  xwd[n] =xwd[n]+a4;												  
											  if(money[n]>=xwd[n]){	
											     money[n]=money[n]-xwd[n];
											     System.out.println("\nYour Balance = "+money[n]+"\n");		
											     xwd1[n]=xwd1[n]+xwd[n];
												 xwd [n]=0;													
												 withdrawalAgain();
											  }else{													 
											     System.out.println("\n-----Not Enough Money--Please Select Again!-----");	
											     System.out.println("Your Balance = "+money[n]);
											     xwd[n]=0;															 
											     withdrawal();}break;												 
									case "5" :withdrawal();break;										
									default:System.out.println("\n--------------Please Select 1-5 again--------------");withdrawal();break;
						    }
					    }								
			 case "B" :if(sc4.equals(idus1[n])&&sc5.equals(pwus1[n])){
						   System.out.println("\nYour Balance = "+money[n]+"\n");						
						   System.out.print("Enter Money to Withdrawal \n>");
							
						   stri=sc.nextLine();
						   qu="Enter Money to Withdrawal :\n>";
						   wd[n]=stringcal(qu,stri);
			
						   if(wd[n]>money[n]){
							   System.out.println("\n-----Not Enough Money--Please Select Again!-----");
							   System.out.println("Your Balance = "+money[n]);
							   withdrawal();
						   }										
						xwd2[n]=xwd2[n]+wd[n];
						money[n]=money[n]-wd[n];
								
						System.out.println("\nYour Withdrawal = "+wd[n]+" Baht");	
						System.out.println("Your Balance    = "+money[n]+" Baht\n");						
						withdrawalAgain();}break;									
			 case "C" :press1234();break;						
			 default  :System.out.println("\nEnter between A-C\n----Please Select again----\n");
					   withdrawal();break;										
		}
	}
			
	public static void withdrawalAgain(){
		Scanner sc = new Scanner(System.in);		
		System.out.print("-Enter 1 to Select another list		-Enter 2 to Withdrawal again\n-Enter 3 to Get the receipt.\n>");
		String sc9 =sc.nextLine();
		switch(sc9){
			case "1" :press1234();break;						
			case "2" :withdrawal();break;						
			case "3" :receipt();break;						
			default :System.out.println("--------------Select 1 - 3 again--------------");withdrawalAgain();break;								
		}
	}
				
	public static void Transferring(){ 
		t=r;	
		int tt;
		System.out.println("================ Transferring ================");
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Account to transfer \n>");
		String sc8 =sc.nextLine();
		System.out.println("\nYour Balance = "+money[n]+"\n");		
		System.out.print("Enter Money transfer\n>");
		//tt =sc.nextInt();
		
		stri=sc.nextLine();
		qu="Enter Money transfer\n>";
		tt=stringcal(qu,stri);
			
		while(t>0){			
			if(sc8.equals(idus1[t])){								
				if(tt>money[n]){
					System.out.println("-----Not enough money--Please transfer again-----");
					Transferring();
				}else if(sc8.equals(idus1[n])){
				    System.out.println("\n-----You can not Transfer to your Account-----\n");
				    press1234();
			     }											
				money[n]= money[n]-tt;
				money[t]= money[t]+tt;
								
				tf =tf+tt;								
				System.out.println("\n--------------Transfer Success--------------\n");  	
				System.out.println("You Transfer to Account"+"("+sc8+")"+" : "+tt+".0 Baht\n");		
				press1234();
			}
			t--;
		}								
		while(t==0){
			if(sc8.equals(idus1[t])){									
				if(tt>money[n]){
					System.out.println("-----Not enough money--Please transfer again-----");
					Transferring();
				}else if(sc8.equals(idus1[n])){
				    System.out.println("\n-----You can not Transfer to your Account-----\n");
				    press1234();
			     }											
			    money[n]= money[n]-tt;
			    money[t]= money[t]+tt;
									
			    tf =tf+tt;								
			    System.out.println("--------------Transfer Success--------------\n");  	
			    System.out.println("You Transfer to Account"+"("+sc8+")"+" : "+tt+".0 Baht\n");											
				press1234();
			}else{
			    System.out.println("\n--------------Account Fail--------------");	
				System.out.println("-----Account Wrong!--Please transfer again-----\n");																														
				press1234();
			 }
		}							
	}		
	
	public static void receipt(){
		System.out.println("\n\n\n-----------------------------------------");
		System.out.println("--------------  RECEIPT  ----------------");
		System.out.println("-----------------------------------------\n");			
		if(sc4.equals(idus1[n])&&sc5.equals(pwus1[n])){				
			System.out.println("-----> All  Deposit    : "+xds[n]+" Baht");
			System.out.println("-----> All  Withdrawal : "+(xwd1[n]+xwd2[n])+" Baht");
			System.out.println("-----> All  Transfer   : "+tf+".0 Baht");
			System.out.println("-----> Your Balance    = "+money[n]+" Baht");
		}
		System.out.println("\n\n\n-----------------------------------------");
		System.out.println("-----------------------------------------");		
		System.out.println("-----------------------------------------\n");
		press(); 
	}
				
	public static void main (String[] args){
		idus1[0] = "test";
		pwus1[0] = "test";			
		System.out.println ("\n============= Welcome to ATM ================");
		login();	  
    }	
}

