import java.util.Scanner;

public class PerimeterArea 
{

	public static void main(String[] args) 
	{
		
		
		System.out.println("Welcome to the Grand Circus Room Detail Generator!");
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Width in feet:");
		Double width = scanner.nextDouble();
		System.out.println("Enter the Length in feet:");
		Double length = scanner.nextDouble();
		System.out.println("Enter the Height in feet: ");
		Double height = scanner.nextDouble();
		
		Double areaRoom = length * width;		
		Double perimeter = (2* length) + (2* width);
		Double volume = length * width * height;
		System.out.println("Area of Room = " + areaRoom + " feet");
		System.out.println("Perimeter of Room = " + perimeter + " feet");
		System.out.println("Volume of Room = " + volume );
		
        
        scanner.close();
		}
		
		
}

