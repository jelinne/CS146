from collections import deque
class CanFinishCourses:
    def canFinish(self, numCourses, prerequisites):
        indegree = [0]*numCourses
        for prereq in prerequisites:
            indegree[prereq[0]] += 1
        queue = deque()
        for i in range(numCourses):
            if indegree[i] == 0:
                queue.append(i)
        result = []
        while queue:
            node = queue.popleft()
            result.append(node)
            for prereq in prerequisites:
                if prereq[1] == node:
                    indegree[prereq[0]] -= 1
                    if indegree[prereq[0]] == 0:
                        queue.append(prereq[0])
        if len(result) != numCourses:
            return False
        return True
