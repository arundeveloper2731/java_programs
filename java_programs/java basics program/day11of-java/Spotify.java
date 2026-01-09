import java.util.Scanner;

class Spotify{
	public static void main(String[] args){
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("1. A.R.Rahman ");
		System.out.println("2. Anirudh ");
		System.out.println("3. Harish Jeyaraj ");
		System.out.println("4. Illaiyaraja ");
		System.out.println("5. u1 ");
		System.out.print("Choose your Artist : ");
		
		int artist = sc.nextInt();
		
		//Rahman playlist
		
		if(artist==1){
			
			System.out.println("Welcome to A.R. Rahman playlist");
			System.out.println("1. Melody");
			System.out.println("2. Kuthu");
			System.out.println("3. Motivational Songs");
			System.out.println("4. sad");
			System.out.print("choose your play list : ");
			
			int list=sc.nextInt();
			
			if(list == 1){
				
				System.out.println("Welcome to Melody");
				System.out.println("1.Netru illadha Matram");
				System.out.println("2. Enna Solla pogirai");
				System.out.println("3. Ennavale Adi Ennavale");
				System.out.println("4. Malargale Malargale");
				System.out.print("Choose your Song : ");
				
				int song = sc.nextInt();
				
				if(song==1){
					System.out.println("Netru illadha Matram");
				}
				else if(song==2){
					System.out.println("Enna Solla pogirai");
				}
				else if(song==3){
				System.out.println("Ennavale Adi Ennavale");
				}
				else if(song == 4){
				System.out.println("Malargale Malargale");
			}
				
			}
			else if(list == 2){
				
				System.out.println("Welcome to Kuthu Songs");
				System.out.println("1. Thaiya Thaiya");
				System.out.println("2. Mukkala Mukkabala");
				System.out.println("3. Urvashi Urvashi");
				System.out.println("4. Aathichudi");
				System.out.print("Choose your Song : ");
				
				int song = sc.nextInt();
				
				if(song==1){
					System.out.println("Thaiya Thaiya");
				}
				else if(song==2){
					System.out.println("Mukkala Mukkabala");
				}
				else if(song==3){
				System.out.println("Urvashi Urvashi");
				}
				else if(song == 4){
				System.out.println("Aathichudi");
			}
				
			}
			else if(list == 3){
				
				System.out.println("Welcome to Motivational  Songs");
				System.out.println("1. Vande Mataram");
				System.out.println("2. Oruvan Oruvan Mudhali");
				System.out.println("3. Sakthi kodu");
				System.out.println("4. Kappal yeri poyachu");
				System.out.print("Choose your Song : ");
				
				int song = sc.nextInt();
				
				if(song==1){
					System.out.println("Vande mataram");
				}
				else if(song==2){
					System.out.println("Oruvan Oruvan Mudhali");
				}
				else if(song==3){
				System.out.println("Sakthi kodu");
				}
				else if(song == 4){
				System.out.println("Kappal yeri poyachu");
			}
				
			}
			else if(list == 4){
				
				System.out.println("Welcome to Sad  Songs");
				System.out.println("1. Poongatrile");
				System.out.println("2. Marudaani");
				System.out.println("3. Minnalea en vazhvin");
				System.out.println("4. Rasathi");
				System.out.println("5. oru poiyavatu sol");
				System.out.print("Choose your Song : ");
				
				int song = sc.nextInt();
				
				if(song==1){
					System.out.println("Poongatrile");
				}
				else if(song==2){
					System.out.println("Marudaani");
				}
				else if(song==3){
				System.out.println("Minnalea en vazhvin");
				}
				else if(song == 4){
				System.out.println("Rasathi");
				}
				else if(song == 5){
				System.out.println("oru poiyavatu sol");
				}
				
			}
		
		}
		//Anirudh playlist
		
		else if(artist== 2){
			
			System.out.println("Welcome to Anirudh playlist");
			System.out.println("1. Melody");
			System.out.println("2. Kuthu");
			System.out.println("3. Motivational Songs");
			System.out.println("4. sad");
			System.out.print("choose your play list : ");
			
			int list=sc.nextInt();
			
			if(list == 1){
				
				System.out.println("Welcome to Melody");
				System.out.println("1. Neeyum nanum anbe");
				System.out.println("2. Velicha poove");
				System.out.println("3. Po indru Neyaga");
				System.out.println("4. Nee partha vizhigal");
				System.out.print("Choose your Song : ");
				
				int song = sc.nextInt();
				
				if(song==1){
					System.out.println("Neeyum nanum anbe");
				}
				else if(song==2){
					System.out.println("Velicha poove");
				}
				else if(song==3){
				System.out.println("Po indru Neyaga");
				}
				else if(song == 4){
				System.out.println("Nee partha vizhigal");
			}
				
			}
			else if(list == 2){
				
				System.out.println("Welcome to Kuthu Songs");
				System.out.println("1. Vaathi Raid");
				System.out.println("2. Naa Ready");
				System.out.println("3. Badass maa");
				System.out.println("4. Vandha Edam");
				System.out.print("Choose your Song : ");
				
				int song = sc.nextInt();
				
				if(song==1){
					System.out.println("Vaathi Raid");
				}
				else if(song==2){
					System.out.println("Naa Ready");
				}
				else if(song==3){
				System.out.println("Badass maa");
				}
				else if(song == 4){
				System.out.println("Vandha Edam");
			}
				
			}
			else if(list == 3){
				
				System.out.println("Welcome to Motivational  Songs");
				System.out.println("1. Velai Illa pattathari");
				System.out.println("2. Boomi enna suthudhe");
				System.out.println("3. ethir neechal");
				System.out.println("4. Surviva");
				System.out.print("Choose your Song : ");
				
				int song = sc.nextInt();
				
				if(song==1){
					System.out.println("Velai Illa pattathari");
				}
				else if(song==2){
					System.out.println(" Boomi enna suthudhe");
				}
				else if(song==3){
				System.out.println("ethir neechal");
				}
				else if(song == 4){
				System.out.println("Surviva");
			}
				
			}
			else if(list == 4){
				
				System.out.println("Welcome to Sad  Songs");
				System.out.println("1. Porkanda singam");
				System.out.println("2. Kanave kanave");
				System.out.println("3. kannaana kanne");
				System.out.println("4. Jodi nilave");
				System.out.println("5. Salambala salambala");
				System.out.print("Choose your Song : ");
				
				int song = sc.nextInt();
				
				if(song==1){
					System.out.println("Porkanda singam");
				}
				else if(song==2){
					System.out.println("Kanave kanave");
				}
				else if(song==3){
				System.out.println("kannaana kanne");
				}
				else if(song == 4){
				System.out.println("Jodi nilave");
				}
				else if(song == 5){
				System.out.println("Salambala salambala");
				}
				
			}
		
		}
		
		// Harish jeyaraj  
		else if(artist== 3){
			
			System.out.println("Welcome to Harish jeyaraj playlist");
			System.out.println("1. Melody");
			System.out.println("2. Kuthu");
			System.out.println("3. sad");
			System.out.print("choose your play list : ");
			
			int list=sc.nextInt();
			
			if(list == 1){
				
				System.out.println("Welcome to Melody");
				System.out.println("1. Unnale");
				System.out.println("2. Annu maele");
				System.out.println("3. Yedho ondru");
				System.out.println("4. Vaseegara");
				System.out.println("5. paartha mudhal");
				System.out.print("Choose your Song : ");
				
				int song = sc.nextInt();
				
				if(song==1){
					System.out.println("Unnale");
				}
				else if(song==2){
					System.out.println("Annu maele");
				}
				else if(song==3){
				System.out.println("yedho ondru");
				}
				else if(song == 4){
				System.out.println("Vaseegara");
				}
				else if(song == 5){
				System.out.println("paartha mudhal");
				}
				
			}
			else if(list == 2){
				
				System.out.println("Welcome to Kuthu Songs");
				System.out.println("1. Tirunelveli Halwa da");
				System.out.println("2. Aradi kathe");
				System.out.println("3. soda bottle");
				System.out.println("4. Aruva meesai");
				System.out.print("Choose your Song : ");
				
				int song = sc.nextInt();
				
				if(song==1){
					System.out.println("Tirunelveli Halwa da");
				}
				else if(song==2){
					System.out.println("Aradi kathe");
				}
				else if(song==3){
				System.out.println("soda bottle");
				}
				else if(song == 4){
				System.out.println("Aruva mesai");
			}
				
			}
			
			else if(list == 3){
				
				System.out.println("Welcome to Sad  Songs");
				System.out.println("1. Venmathiya");
				System.out.println("2. oh maname");
				System.out.println("3. Yamma Yamma");
				System.out.println("4. othayile");
				System.out.println("5. Irava pagala");
				System.out.print("Choose your Song : ");
				
				int song = sc.nextInt();
				
				if(song==1){
					System.out.println("venmathiye");
				}
				else if(song==2){
					System.out.println("oh maname");
				}
				else if(song==3){
				System.out.println("Yamma Yamma");
				}
				else if(song == 4){
				System.out.println("othayile");
				}
				else if(song == 5){
				System.out.println("Irava pagala");
				}
				
			}
		
		}
		
		// Illayaraja
		else if(artist== 4){
			
			System.out.println("Welcome to Illayaraja playlist");
			System.out.println("1. Melody");
			System.out.println("2. Kuthu");
			System.out.println("3. sad");
			System.out.print("choose your play list : ");
			
			int list=sc.nextInt();
			
			if(list == 1){
				
				System.out.println("Welcome to Melody");
				System.out.println("1. Oru kili uruguthu");
				System.out.println("2. Kuzhaloodhum kannan ukku");
				System.out.println("3. Ennai thottu");
				System.out.println("4. Raja Raja cholan");
				System.out.println("5. Thenral vandhu");
				System.out.print("Choose your Song : ");
				
				int song = sc.nextInt();
				
				if(song==1){
					System.out.println("Oru kili uruguthu");
				}
				else if(song==2){
					System.out.println("Kuzhaloodhum kannan ukku");
				}
				else if(song==3){
				System.out.println("Ennai thottu");
				}
				else if(song == 4){
				System.out.println("Raja Raja cholan");
				}
				else if(song == 5){
				System.out.println(" Thenral vandhu");
				}
				
			}
			else if(list == 2){
				
				System.out.println("Welcome to Kuthu Songs");
				System.out.println("1. ooruvittu ooruvanthu");
				System.out.println("2. Nooru Varusam");
				System.out.println("3. Aasai nooruvagai");
				System.out.println("4. Aasai athigam Vachu");
				System.out.print("Choose your Song : ");
				
				int song = sc.nextInt();
				
				if(song==1){
					System.out.println("ooruvittu ooruvanthu");
				}
				else if(song==2){
					System.out.println("Nooru Varusam");
				}
				else if(song==3){
				System.out.println("Aasai nooruvagai");
				}
				else if(song == 4){
				System.out.println("Aasai athigam Vachu");
				}
				
				}
			
				else if(list == 3){
				
				System.out.println("Welcome to Sad  Songs");
				System.out.println("1. Kanne kalaimane");
				System.out.println("2. Thene thenpaandi neeye");
				System.out.println("3. paadi paranth kiili");
				System.out.println("4. Nilave vaa");
				System.out.print("Choose your Song : ");
				
				int song = sc.nextInt();
				
				if(song==1){
					System.out.println("Kanne kalaimane");
				}
				else if(song==2){
					System.out.println("Thene thenpaandi neeye");
				}
				else if(song==3){
				System.out.println("paadi paranth kiili");
				}
				else if(song == 4){
				System.out.println("Nilave vaa");
				}
				}
		
		}
		
		// U1
		else if(artist== 5){
			
			System.out.println("Welcome to U1 playlist");
			System.out.println("1. Melody");
			System.out.println("2. Kuthu");
			System.out.println("3. Motivatinal");
			System.out.println("4. Sad");
			System.out.print("choose your play list : ");
			
			int list=sc.nextInt();
			
			if(list == 1){
				
				System.out.println("Welcome to Melody");
				System.out.println("1. Aathadi manasudhan");
				System.out.println("2. chinna sirisu");
				System.out.println("3. venmegam");
				System.out.println("4. Iayyayyo");
				System.out.println("5. Sachitalee");
				System.out.print("Choose your Song : ");
				
				int song = sc.nextInt();
				
				if(song==1){
					System.out.println("Aathadi manasudhan");
				}
				else if(song==2){
					System.out.println("chinna sirisu");
				}
				else if(song==3){
				System.out.println("venmegam");
				}
				else if(song == 4){
				System.out.println("Iayyayyo");
				}
				else if(song == 5){
				System.out.println(" Sachitalee");
				}
				
			}
			else if(list == 2){
				
				System.out.println("Welcome to Kuthu Songs");
				System.out.println("1. Machi open the bottle");
				System.out.println("2. Saroja samenni kalo");
				System.out.println("3. no money no honey");
				System.out.println("4. villaiyadu mankatha");
				System.out.print("Choose your Song : ");
				
				int song = sc.nextInt();
				
				if(song==1){
					System.out.println("Machi open the bottle");
				}
				else if(song==2){
					System.out.println("Saroja samenni kalo");
				}
				else if(song==3){
				System.out.println("no money no honey");
				}
				else if(song == 4){
				System.out.println("villaiyadu mankatha");
				}
				
				}
			
			else if(list == 3){
				
				System.out.println("Welcome to Motivational  Songs");
				System.out.println("1. Edhirthu nill");
				System.out.println("2. oru nalil");
				System.out.println("3. nimirnthu nil");
				System.out.println("4. ungakkule mirugam");
				System.out.print("Choose your Song : ");
				
				int song = sc.nextInt();
				
				if(song==1){
					System.out.println("Edhirthu nill");
				}
				else if(song==2){
					System.out.println("oru nalil");
				}
				else if(song==3){
				System.out.println("nimirnthu nil");
				}
				else if(song == 4){
				System.out.println("ungakkule mirugam");
			}
				
			}
				else if(list == 4){
				
				System.out.println("Welcome to Sad  Songs");
				System.out.println("1. Kadhal valarthen");
				System.out.println("2. yedho ondru ennai");
				System.out.println("3. pogadhe");
				System.out.println("4. Ninaithu ninaithu");
				System.out.print("Choose your Song : ");
				
				int song = sc.nextInt();
				
				if(song==1){
					System.out.println("Kadhal valarthen");
				}
				else if(song==2){
					System.out.println("yedho ondru ennai");
				}
				else if(song==3){
				System.out.println(" pogadhe");
				}
				else if(song == 4){
				System.out.println(" Ninaithu ninaithu");
				}
				}
		
		}
		
		else {
			System.out.println("No Artist here");
		}
		
		
		
		
		
	}
}