import java.util.Scanner;

public class MemTranslate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		        Scanner in = new Scanner(System.in);

		        System.out.println("Enter a virtual address for query.Page size must be greater than 2^10 or 1,024 bytes and less than 2^14, or 16,384 bytes.");
		        System.out.println("Please enter your page values as powers of 2 starting at 10");

		        int lowerBound = 10;
		        int upperBound = 14;

		        System.out.println();
		        System.out.println("Enter virtual address :");
		        int userAddress = in.nextInt();
		        System.out.println("Enter page size :");
		        int userPageSize = in.nextInt();
		        System.out.println();
		        
		        if(userPageSize > lowerBound && userPageSize < upperBound) 
		        {
		            memMapper(userAddress, userPageSize);
		        }
		        else
		        {
		            System.out.println("ERROR: Values out of bounds.");
		        }
		    }

		    private static void memMapper(int address, int userSize)
		    {
		        int pageNumber;
		        int offset;
		        int size;
		        
		        size = (int) Math.pow(2, userSize);
		        pageNumber = address / size;
		        offset = address % size;

		        System.out.println("The address " + address + " contains: ");
		        System.out.println("Page number: " + pageNumber);
		        System.out.println("Page offset: " + offset);
		    }
		
	}

