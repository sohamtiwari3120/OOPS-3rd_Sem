import java.util.Scanner;
import com.course.structure.Building;
import com.course.structure.House;
import com.course.structure.School;
class BuildingDemo{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Building b = new Building();
		House h = new House();
		School s= new School();

		System.out.println("Enter sqf and sto for house1: ");
		b.setSqFoot(sc.nextFloat());
		b.setStories(sc.nextInt());

		System.out.println("Stories: " + b.getStories() + "\nSQ Foot: " + b.getSqFoot());
	
		System.out.println("Enter sqf, stories, bedno, bathno");
		h.setSqFoot(sc.nextFloat());
		h.setStories(sc.nextInt());	
		h.setBedNo(sc.nextInt());
		h.setBathNo(sc.nextInt());
		System.out.println("Stories: " + h.getStories() + "\nSQ Foot: " + h.getSqFoot() + 
			"\nBedNo: " + h.getBedNo() + "\nBathNo: " + h.getBathNo());

		System.out.println("Enter sqf, stories,ClassNo, GradeLevel: ");
		s.setSqFoot(sc.nextFloat());
		s.setStories(sc.nextInt());	
		s.setClassNo(sc.nextInt());
		s.setGradeLevel(sc.nextInt());
		System.out.println("Stories: " + s.getStories() + "\nSQ Foot: " + s.getSqFoot() + 
			"\nClassNo: " + s.getClassNo() + "\nGradeLevel: " + s.getGradeLevel());

	}
}