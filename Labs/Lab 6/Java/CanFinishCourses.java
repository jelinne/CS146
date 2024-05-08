package Lab6;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class CanFinishCourses { 
	public boolean canFinish(int numCourses, int[][] prerequisites) {
		int[] indegree = new int[numCourses];
		for(int[] prereq: prerequisites) {
				indegree[prereq[0]]++;
		}
		Queue<Integer> q = new LinkedList<>();
		for(int i = 0; i < numCourses; i++) {
			if(indegree[i] == 0) {
				q.add(i);
			}
		}
		List<Integer> result = new ArrayList<>();
		while(!q.isEmpty()) {
			int node = q.poll();
			result.add(node);
			for (int[] prereq : prerequisites) {
	            if (prereq[1] == node) {
	                indegree[prereq[0]]--;
	                if (indegree[prereq[0]] == 0) {
	                    q.add(prereq[0]);
	                }
	            }
			}
		}
		if (result.size()!= numCourses) {
			return false;
		}
		return true;
	}
	public static void main(String[] args) {
		CanFinishCourses c = new CanFinishCourses();
		int numCourses = 2;
		int[][] prerequisites = {{1,0}};
		System.out.println(c.canFinish(numCourses, prerequisites));
		CanFinishCourses c2 = new CanFinishCourses();
		int numCourses2 = 2;
		int[][] prerequisites2 = {{1,0},{0,1}};
		System.out.println(c2.canFinish(numCourses2, prerequisites2));
	}
}
