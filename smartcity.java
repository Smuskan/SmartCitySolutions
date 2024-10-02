import java.util.*;
class basic_data
{
    public int time;
	public long mono;
	public String custm_name;
}
class all_function extends basic_data
{
    Scanner sc= new Scanner(System.in);
public void hotels()
	{

		int option;
		System.out.println("*** Welcome to SmartCity Hotels ***");
		System.out.println("1. 5 Star\n2. 3 Star\n3. Local Hotels");
		System.out.println("\n In which hotel Standard do you want choice: ");
		option=sc.nextInt();
		switch(option)
		{
			case 1:	int choice1;
					System.out.println("---------------------------");
					System.out.println("\n1. Hadpsar\n2. Katraj\n3. Hinjawadi");
					System.out.println("5 Star\n Choose Location of Hotel:");

					choice1=sc.nextInt();
					switch(choice1)
					{
						case 1:System.out.println("Welcome to the Conard 5 Star Hotel(Hadpsar) \nBook Your Table Now(Press any key to continue)");
							   System.out.println("Enter Your Name:");
							   custm_name= sc.next();
							   System.out.println("Enter your Mobile Number: ");
							   mono=sc.nextInt();
							   System.out.println("Enter timing for meeting Our Hotel");
							   time= sc.nextInt();
							   System.out.println("---------------------------");
							   System.out.println("Thanks for Submitting Form...1!\nYour Table Number is (--TI2094--)");
							   System.out.println("Meet Will Soon...");
							   break;
						case 2:System.out.println("Welcome to the Hyatt Place 5 Star Hotel(Katraj) \nBook Your Table Now(Press any key to continue)");
							   System.out.println("Enter Your Name:");
							   String custm_name= sc.next();
							   System.out.println("Enter your Mobile Number: ");
							   long mono=sc.nextInt();
							   System.out.println("Enter timing for meeting Our Hotel");
							   int time= sc.nextInt();
							   System.out.println("---------------------------");
							   System.out.println("Thanks for Submitting Form...1!\nYour Table Number is (--WR7694--)");
							   System.out.println("Meet Will Soon...");
							break;
						case 3:
							   System.out.println("Welcome to the Sahara 5 Star Hotel(Hinjawadi) \nBook Your Table Now(Press any key to continue)");
							   System.out.println("Enter Your Name:");
							   custm_name= sc.next();
							   System.out.println("Enter your Mobile Number: ");
							   mono=sc.nextInt();
							   System.out.println("Enter timing for meeting Our Hotel");
							   time= sc.nextInt();
							   System.out.println("---------------------------");
							   System.out.println("Thanks for Submitting Form...1!\nYour Table Number is (--TI2094--)");
							   System.out.println("Meet Will Soon...");
							break;
							default:System.out.println("Plase Select valid option");break;
					}
					break;
			case 2: System.out.println("3 Star\n Choose Location of Hotel");
					int choice2;
					System.out.println("---------------------------");
					System.out.println("\n1. ShivajiNagar\n2. Bhosari\n3. Chakan");
					System.out.println("----------------------");
					System.out.println("5 Star\n Choose Location of Hotel");
					choice2=sc.nextInt();
					switch(choice2)
					{
						case 1:System.out.println("Welcome to the Vintage 3 Star Hotel(ShivajiNagar) \nBook Your Table Now");
							   System.out.println("Enter Your Name:");
							   custm_name= sc.next();
							   System.out.println("Enter your Mobile Number: ");
							   mono=sc.nextInt();
							   System.out.println("Enter timing for meeting Our Hotel");
							   time= sc.nextInt();
							   System.out.println("---------------------------");
							   System.out.println("Thanks for Submitting Form...1!\nYour Table Number is (--HE3028--)");
							   System.out.println("Meet Will Soon...");
							break;
						case 2:System.out.println("Welcome to the J W Marriot 3 Star Hotel(Bhosari) \nBook Your Table Now");
							   System.out.println("Enter Your Name:");
							   custm_name= sc.next();
							   System.out.println("Enter your Mobile Number: ");
							   mono=sc.nextInt();
							   System.out.println("Enter timing for meeting Our Hotel");
							   time= sc.nextInt();
							   System.out.println("---------------------------");
							   System.out.println("Thanks for Submitting Form...1!\nYour Table Number is (--WR7694--)");
							   System.out.println("Meet Will Soon...");
							break;
						case 3:
							   System.out.println("Welcome to the Vitar 3 Star Hotel(Chakan) \nBook Your Table Now");
							   System.out.println("Enter Your Name:");
							   custm_name= sc.next();
							   System.out.println("Enter your Mobile Number: ");
							   mono=sc.nextInt();
							   System.out.println("Enter timing for meeting Our Hotel");
							   time= sc.nextInt();
							   System.out.println("---------------------------");
							   System.out.println("Thanks for Submitting Form...1!\nYour Table Number is (--TI2094--)");
							   System.out.println("Meet Will Soon...");
							break;
					}
					break;
			case 3: System.out.println("Local Hotels\n Choose Location of Hotel");
					break;
	}
}

	public void tourism()
	{
	    int choice;
		System.out.println("What Kind of tourist spot do you like");
		System.out.println(" 1.Nature\n 2.Historic Places \n 3.Mountains\n 4.Forts");
		System.out.println("Hit your choice: ");
		choice=sc.nextInt();
		switch(choice)
		{
        case 1:
                    System.out.println("  Locations\n ->Matheran\n ->Mahableshwar\n ->Manali");
                    break;
        case 2:
                    System.out.println("   Locations\n ->Bhandar Ghar\n ->Junnar ->Hadpsar");
                    break;
        case 3:
                    System.out.println("  Locations\n  ->Himalaya\n ->Sahyadri\n ->Kalsubai");
                    break;
        case 4:
                    System.out.println("  Locations\n ->Shivneri\n ->Raygad\n ->Sinhagad\n ->Chavand Fort");
                    break;
		}
	}
	public void education()
	{
	    int option;
	    System.out.println("Welcome to Smart City Education System");
	    System.out.println(" 1.Junior Education\n 2.Primary Education\n 3.Secondary Education\n 4.College Education\n 5.Post Graduation");
		System.out.println("\n Select Your Education choice:");
        option=sc.nextInt();

                switch(option)
                {
                    case 1:
                    System.out.println("** Classes Available **\n ->Nursery\n ->Junior K G\n-> Senior K G");
                    break;
                    case 2:
                        System.out.println("** Classes Available **\n ->1st Standard\n ->2st Standard\n ->3st Standard\n ->4st Standard");
                        System.out.println("");
                    break;

                    case 3:
                    System.out.println("** Classes Available ** \n ->class (5th)Fifth To (10th)Tenth");
                    break;
                    case 4:
                      System.out.println("** Classes Available ** ");
                      System.out.println("* Science\tCommerce\tArts:-\n\t ->11th\n\t ->12th");
                    break;
                    case 5:
                      System.out.println("** Classes Available ** ");
                      System.out.println(" ->BSC\n ->BCom\n ->Pharmacy\n ->BCS");
                      break;
                        case 6:
                      System.out.println("** Classes Available ** ");
                      System.out.println(" ->MSC\n ->MCom\n ->D Pharmacy\n ->MCS\n ->M Tech");break;
                      default:System.out.println("----Please Select Above Choice:");

                }
	}
	public void travel()
	{
	    String medium;int km;
        System.out.println("\n Book Your ticket now......");
        System.out.println(" <--Flight-->\n <--Cab-->\n <--Train-->\n <--bus-->");
        System.out.println("\n Select your travel medium: ");
        medium=sc.next ();

        switch(medium)
        {
        case "Flight": System.out.println("--->Flight\n  (---Fair:-  29 Rs per Km)\n Enter how many kilometer do you want to travel:");
        km=sc.nextInt();
        System.out.println("So Your Total Fair is <--"+(29*km)+"-->");
        break;
        case "Cab":    System.out.println("--->Cab\n  (---Fair:-  14 Rs per Km)\n Enter how many kilometer do you want to travel:");
         km=sc.nextInt();
         System.out.println("So Your Total Fair is <--"+(14*km)+"-->");
        break;
        case "Train":System.out.println("--->Train\n  (---Fair:-  7 Rs per Km)\n Enter how many kilometer do you want to travel:");
         km=sc.nextInt();
         System.out.println("So Your Total Fair is <--"+(7*km)+"-->");
        break;
        case "Bus":System.out.println("--->Bus\n  (---Fair:-  11 Rs per Km)");
        System.out.println("Enter how many kilometer do you want to travel:");
         km=sc.nextInt();
         System.out.println("So Your Total Fair is <--"+(11*km)+"-->");
        break;
        default:  System.out.println("Please Select Your Travel medium...!");break;
        }
	}
	public void contact_police()
	{
	    System.out.println("Welcome to Smart City 24*7 Police Service\n Contact Number of Police: 100");
	    System.out.println(" Location wise contact number\n ->Katraj: 459390\n ->VidyaNagar:345925");
	    System.out.println("->Savedi: 732932\n ->Awasari: 882042");

	}
}                                                                                                                                                       // Here is END of the all_function

// Starting of the main function class
public class smartcity extends  all_function
{
    	public static void main(String[] args)
	{
		smartcity s1 =new smartcity();
		Scanner sc= new Scanner(System.in);
		int choice;


		System.out.println("*** FEATURES***");
		System.out.println("1.Hotels\n2.Tourism\n3.Education\n4.Travel\n5.Contact With Police");
		System.out.println("\nEnter your Choice as Above: ");
		choice=sc.nextInt();

		switch(choice)
		{
			case 1:	s1.hotels();


					break;
			case 2: s1.tourism();
					break;
			case 3: s1.education();
					break;
			case 4: s1.travel();
					break;
			case 5:
                    s1.contact_police();
					break;

				default:
						System.out.println("Please Select Valid Choice...!");
				break;
		}
	}
}
