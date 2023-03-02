package javaprogram;

import java.util.ArrayList;
import java.util.Scanner;

public class MenuDrivenEx {

	private static final int Collegenumber = 0;

	public static void main(String[] args) {
		ArrayList<College> al = new ArrayList<College>();
		Scanner sc = new Scanner(System.in);
		int collegeno;
		String collegenm;
		String collegelc;
		int choice;
		while(true) {
			System.out.println("1.Insert");
			System.out.println("2.Display");
			System.out.println("3.Search");
			System.out.println("4.Delete");
			System.out.println("5.Update");
			System.out.println("6.Count");
			System.out.println("6.Exit");
			System.out.println("Enter your choice");
			choice=sc.nextInt();
			switch(choice) {
			case 1:
				System.out.println("Enter your collegeno");
				collegeno=sc.nextInt();
				System.out.println("Enter collegenm");
				collegenm=sc.next();
				System.out.println("Enter collegelc");
				collegelc=sc.next();
				College c= new College();
				c.setCollegeno(collegeno);
				c.setCollegenm(collegenm);
				c.setCollegelc(collegelc);
				al.add(c);
				System.out.println("Record inserted Successfully");
				break;
			case 2:
				System.out.println("*******************************************");
				for(int i=0;i<al.size();i++) {
					System.out.println("College record"+i+1);
					System.out.println("College number:"+al.get(i).getCollegeno());
					System.out.println("College name:"+al.get(i).getCollegenm());
					System.out.println("College Location:"+al.get(i).getCollegelc());
					
					
				}
				System.out.println("*******************************************");
				break;
				case 3:
					System.out.println("Enter College name of search");
					collegenm=sc.next();
					int search=0;
					for(int i=0;i<al.size();i++) {
						if(al.get(i).getCollegenm().contains(collegenm)) {
							System.out.println("College record:"+(++search));
							System.out.println("College number:"+al.get(i).getCollegeno());
							System.out.println("College name:"+al.get(i).getCollegenm());
							System.out.println("College Location:"+al.get(i).getCollegelc());
							
							
						}
					}
					if(search==0) {
						System.out.println("Record not found");
					}
					break;
					
				case 4:
					System.out.println("Enter college name for remove");
					collegenm=sc.next();
					int search1=0;
					for(int i=0;i<al.size();i++) {
						if(al.get(i).getCollegenm().contains(collegenm)) {
							al.remove(i);
							System.out.println("record found:"+(++search1));
							System.out.println("Record Delete Successfully");
							
						}
					}
					System.out.println("Record Found:"+(++search1));
					if(search1==0) {
						System.out.println("Record not found");
					}
					break;
					case 5:
					System.out.println("Enter College for search");
					collegelc =sc.next();
					System.out.println("college locetion change");
					collegelc=sc.next();
					for(int i=0;i<al.size();i++) {
						if(al.get(i).getCollegenm().contains(collegelc)) {
							College c1=al.get(i);
							c1.setCollegelc(collegelc);
							al.set(i, c1);
							System.out.println("data update successfully");
						}
					}
					break;
					case 6:
						System.exit(0);
						default:
							System.out.println("invalide choice");
						
			}
		}

	}

}
