import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Main {
	
	
	public static void Distance(int allLocationsOfRestaurants[][], int numOfRestaurants, int sizeOfGrid) {
		
		double distance = 0;
		DecimalFormat df = new DecimalFormat("#.##");
		double[][] listOfRestaurants = new double[sizeOfGrid][sizeOfGrid];
		List<String> distanceToDesiredRestaurants = new ArrayList<String>();
		
		for(int i = 0;i<sizeOfGrid;i++) {
			for(int j = 0;j<sizeOfGrid;j++) {
				distance = Math.sqrt((i*i) + (j*j));
					listOfRestaurants[i][j] = distance;
					String str = df.format(listOfRestaurants[i][j]);
					int numChars = (int) str.chars().count();
					if (numChars==1) {
						System.out.printf(str+ "     ");
					}else if(numChars == 2) {
						System.out.printf(str + "    ");
					}
					else if(numChars == 3) {
						System.out.printf(str + "   ");
					}
					else if(numChars == 4) {
						System.out.printf(str + "  ");
					}else {
						System.out.printf(str + " ");
					}
					try {
				if(allLocationsOfRestaurants[i][j] == i && allLocationsOfRestaurants[i][j] == j) {
					distanceToDesiredRestaurants.add(str);
				}
					}
			        catch (Exception e) {
			            
			        }
					
			}
			System.out.println("");
		}
		
		System.out.println("");
		
		Collections.sort(distanceToDesiredRestaurants);   
		
		for (int i = 0; i < distanceToDesiredRestaurants.size(); i++) {
			System.out.println(distanceToDesiredRestaurants.get(i));
		}
		
	}

	public static void main(String[] args) {
		
		int numOfRestaurants = 3;
		int sizeOfGrid = 10;
		
		int allLocationsOfRestaurants[][] = {{0,1},{2,1},{1,0}};
		
		Distance(allLocationsOfRestaurants, numOfRestaurants, sizeOfGrid);
		
		
			
	
		
		
	}

}
