package HW11;

import java.util.LinkedList;
import java.util.Queue;


public class FloodFill {
	public int[][] floodFill(int[][] image, int sr, int sc, int color) {
		int[][] directions = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
		int start = image[sr][sc];
		
		if (start == color) 
			return image; 
		
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{sr, sc});

        while (!queue.isEmpty()) {
            int[] pixel = queue.poll(); 
            int x = pixel[0], y = pixel[1];
            image[x][y] = color;
            
            for (int[] direction : directions) {
                int newX = x + direction[0], newY = y + direction[1];
                if (newX >= 0 && newX < image.length && newY >= 0 && newY < image[0].length && image[newX][newY] == start) {
                    queue.add(new int[]{newX, newY}); 
                }
            }
        }
		return image;
	}
	
	public void grid(int[][] image) {
		System.out.print("[");
		for(int row = 0; row < image.length; row++) {
			System.out.print("[");
			for(int col = 0; col < image[row].length; col++) {
				
				System.out.print(image[row][col]);
				if(col != image[0].length-1) {
					System.out.print(",");
				}
				
			}
			System.out.print("]");
			if (row != image.length-1) {
				System.out.println(",");
			}
		}
		System.out.println("]");
	}
	
	public static void main(String[] args) {
		FloodFill ff = new FloodFill();
		int[][] image = {{1,1,1}, {1,1,0}, {1,0,1}};
		int sr = 1;
		int sc = 1;
		int color = 2;
		ff.floodFill(image, sr, sc, color);
		ff.grid(image);
		FloodFill ff2 = new FloodFill();
		int[][] image2 = {{1,0,1}, {1,0,0}};
		int sr2 = 0;
		int sc2 = 1;
		int color2 = 2;
		ff2.floodFill(image2, sr2, sc2, color2);
		ff2.grid(image2);
	}
}
