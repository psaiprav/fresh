import java.util.Scanner;
public class Bakas {
	static Scanner sc=new Scanner(System.in);
	static Bakasura1 b=new Bakasura1();
	public static void main(String[] args) {
		boolean f=true;
		while(f)
		{
			System.out.println("---------*Welcome to Aahaha Truptiii *---------\n1.signup\n2.login\n3.Exit\n..........................................");
			switch(sc.nextInt())
			{
			case 2:	{
				System.out.println("enter the Email");
				String email=sc.next();
				System.out.println("enter the password");
				String pwd=sc.next();
				b.login(email,pwd);
			}break;
			case 1:	{
				System.out.println("enter the Name");
				String name=sc.next();
				System.out.println("enter the phone number");
				long phno=sc.nextLong();
				System.out.println("enter the email");
				String email=sc.next();
				System.out.println("enter the password");
				String pwd=sc.next();
				b.signup(name,phno,email,pwd);
			}break;
			case 3:	{
				    f=false;
					System.out.println("than you visit again\n*************");
					}break;
					default :
					{
					System.out.println("inavlid option\n___________");
					}
			}
		}
	}
}

class Bakasura1
{
	static Scanner sc=new Scanner(System.in);
	String name;
	String email;
	String pwd;
	long phno;
	double billamount;
	int dose;
	double vegbiriyani;
	int idlyvada;
	double chickenbiriyani;
	double chickentandoori;
	void signup(String a, long b,String c,String d)
	{
	name=a;
	phno=b;
	email=c;
	pwd=d;
	System.out.println("signup done sucessfully\n*************");
	}
	public void login(String a, String b) {
		boolean f=true;
		if (a.equals(email) && b.equals(pwd)){
			while(f){
				System.out.println("-----------------------------------------------------\nHome Page\n1.Order food\n2.Check bill amount\n3.cancel the order\n4.exit\n.................................................");
				switch(sc.nextInt())
				{
				case 1:	{
					orderfood();
				}break;
				case 2:	{
					checkbillamount();
				}break;
				case 3:	{
					cancelorder();
				}break;
				case 4:	{
					f=false;
					System.out.println("Thank you\n====================================");
				}break;
				default :
				{
					System.out.println("invalid option\n-----------------------------------------------------");
				}
				}
			}
		}
		else{
			System.out.println("invalid email and password\n?????????????????");
		}
	}
	 void cancelorder() {
		 boolean f=true;
	  while(f){
		 System.out.println("cancel order\n1.veg biriyani :	"+vegbiriyani+"\n2.Dose :		"+dose+"\n3.Idly-vada :		"+idlyvada+"\n4.chicken biriyani :	"+chickenbiriyani+"\n5.chicken tandoori :	"+chickentandoori+"\n6.exit\n====================================");
		 switch(sc.nextInt())
		  {
			case 1:  {
				System.out.println("enter the no of plate veg biriyani cancel : "+vegbiriyani);
				double qty1=sc.nextDouble();
				if(qty1<=vegbiriyani){		
				billamount=billamount-(qty1*75);
				vegbiriyani=vegbiriyani-qty1;
				}
				else{			
					System.out.println("invalid option\n-----------------------------------------------------");
				}
			}break;
			case 2:  {
				System.out.println("enter the no of plate Dose cancel : "+dose);
				int qty2=sc.nextInt();
				if(qty2<=dose){
				billamount=billamount-(qty2*30);
				dose=dose-qty2;
				}
				else{
					System.out.println("invalid option\n-----------------------------------------------------");
				}
			}break;
			case 3:  {
				System.out.println("enter the no of plate Idly-vada cancel : "+idlyvada);
				int qty3=sc.nextInt();
				if(qty3<=idlyvada){
				billamount=billamount-(qty3*35);
				idlyvada=idlyvada-qty3;
				}
				else{
					System.out.println("invalid option\n-----------------------------------------------------");
				}
			}break;
			case 4:  {
				System.out.println("enter the no of plate chicken biriyani cancel : "+chickenbiriyani);
				double qty4=sc.nextDouble();
				if(qty4<=chickenbiriyani){
				billamount=billamount-(qty4*155);
				chickenbiriyani=chickenbiriyani-qty4;
				}
				else{
					System.out.println("invalid option\n-----------------------------------------------------");
				}
			}break;
			case 5:  {
				System.out.println("enter the no of plate chicken tandoori cancel : "+chickentandoori);
				double qty5=sc.nextDouble();
				if(qty5<=chickentandoori){
				billamount=billamount-(qty5*175);
				chickentandoori=chickentandoori-qty5;
				}
				else{
					System.out.println("invalid option\n-----------------------------------------------------");
				}
			}break;
			case 6:  {
				f=false;
				System.out.println("thank you for order\n-- -- -- -- -- --");
			}break;
			default :
			  {
				System.out.println("invalid option\n-----------------------------------------------------");
			}
		}
	}
	 }
	 void checkbillamount() {
		System.out.println("-----------------------------------------------------\nTotal bill amount : "+billamount+"\n-----------------------------------------------------");
		System.out.println("Items			Qty		amount");
		if(dose>=1){
		System.out.println("Dose			"+dose+"		"+dose*30);}
		if(vegbiriyani>=1){
		System.out.println("vegbiriyani		"+vegbiriyani+"		"+vegbiriyani*75);}
		if(idlyvada>=1){
		System.out.println("idlyvada		"+idlyvada+"		"+idlyvada*35);}
		if(chickenbiriyani>=1){
		System.out.println("chickenbiriyani		"+chickenbiriyani+"		"+chickenbiriyani*155);}
		if(chickentandoori>=1){
		System.out.println("chickentandoori		"+chickentandoori+"		"+chickentandoori*175);}
	}
	 void orderfood() {
		boolean f=true;
		while(f){
			System.out.println(".................................................\nfood page\n1.veg\n2.non veg\n3.back\n.................................................");
			switch(sc.nextInt())
			{
			case 1:	{
				veg();
			}break;
			case 2:	{
				nonveg();
			}break;
			case 3:	{
				f=false;
				System.out.println("thank you\n****************");
			}
			}
		}
	}
  void nonveg() {	
	  boolean f=true;
	  while(f)
	  {
		System.out.println("Food details");
		System.out.println("1.chicken biriyani		155/plate");
		System.out.println("2.Chicken tandoori		175/plate\n3.back\n............................................");
		switch(sc.nextInt())
		  {
			case 1: {
				System.out.println("enter the no of plate chicken biriyani");
				double qty1=sc.nextDouble();
				chickenbiriyani=chickenbiriyani+qty1;
				billamount=billamount+(chickenbiriyani*155);
			}break;
			case 2:  {
				System.out.println("enter the no of plate chicken tandoori");
				double qty2=sc.nextDouble();
				chickentandoori=chickentandoori+qty2;
				billamount=billamount+(chickentandoori*175);
			}break;
			case 3:  {
				f=false;
				System.out.println("thank you for order\n-- -- -- -- -- --");
			}break;
			default :
			  {
				System.out.println("invalid option\n.................................................");
			}
		}
	  }
	}
 void veg() {
		boolean f=true;
		while(f) {
	 System.out.println("Food details");
	 System.out.println("1.Dose			30/plate");
	 System.out.println("2.veg biriyani		75/plate");
	 System.out.println("3.Idly vada		35/plate\n4.Back\n.................................................");
	 switch(sc.nextInt())
			{
		 case 1:	{
			 System.out.println("enter the dose Qty");
			  int qty3=sc.nextInt();
			  dose=dose+qty3;
			 billamount=billamount+(30*dose);
		 }break;
		 case 2: {
			 System.out.println("enter the veg biriyani Qty");
			 double qty4=sc.nextDouble();
			 vegbiriyani=vegbiriyani+qty4;
			 billamount=billamount+(75*vegbiriyani);
		 }break;
		 case 3: {
			 System.out.println("enter the idly-vada Qty");
			 int qty5=sc.nextInt();
			 idlyvada=idlyvada+qty5;
			 billamount=billamount+(35*idlyvada);
		 }break;
		 case 4:	{
			 f=false;
			 System.out.println("thanks for order");
		 }break;
		 default: {
				System.out.println("invalid option\n.................................................");
		 }	 
	 }
		}
	}	
}