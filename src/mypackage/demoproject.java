package mypackage;
import java.io.File;
import java.util.Scanner;
public class demoproject {




	static final int input=0;
	static String DIRECTORY;
	File foldername;
	private static Object file;
	
	
	
	//welcome code
	private static String Welcome_String ="Application Name :Lockers.in" + "\nDevelopers Details :Digeesh V";
	static String Main_menu =
	"\nMain_menu - select the following"+"\n 1 - select the Directory"+"\n 2 - Add,search or Delete"+"\n 3 -exit";
	//
	public static void projectintro() {
          File file=new File("C:\\Users\\91782\\OneDrive\\Desktop\\Sl projects");
          if(!file.exists())
        	  file.mkdirs();
     
          
          System.out.println("DIRECTORY:"+file.getAbsolutePath());
       System.out.println(Welcome_String);  
     
	}
	
		
	public static void case1() {
		File file=new File("C:\\Users\\91782\\OneDrive\\Desktop\\Sl projects");
		System.out.println("List of Files in Directory:");
		File[]Listoffiles=file.listFiles();
		
		for(File s:Listoffiles)
			
			System.out.println("["+ " "+s.getName()+"]");
	}
	 static String Second =
		 "\n select the following"+"\n a - add file"+"\n b - Delete file"+"\n c -search"+"\n d- Go back to main menu\n";
	 static void showmain() {
		 System.out.println(Second);
	 }
	
	 //listed main menu of the project
	 
static void ShowMain() {
	try {
		System.out.println(Main_menu);
		
	}
	catch(Exception e1) {
		
	}
		
	
	
try {
	Scanner sc=new Scanner(System.in);
	int x=sc.nextInt();
	switch(x) {
	case 1: {
		case1();
		while (x!=3) {
			 ShowMain();
		}
		break;
	}
	case 2:{
		showmain();
		Caseproject c=new Caseproject();
		c.phase2();
		
		break;
		
	}
	case 3:{
		System.out.println("My program is completed");
		projectintro();
		
	}
	break;
	}

	
}
catch(Exception e) {
	System.out.println("Oops!Enter a valid number");
	
}
}
			
	static void Second() {
	// TODO Auto-generated method stub
	
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		demoproject project=new demoproject();
		project.projectintro();
		project.ShowMain();

		
		
		
	}

}
