from lab6.CanFinishCourses import CanFinishCourses

if __name__ == "__main__":
    c = CanFinishCourses()
    numCourses = 2
    prerequisites = [[1,0]]
    print(c.canFinish(numCourses,prerequisites))
    c2 = CanFinishCourses()
    numCourses2 = 2
    prerequisites2 = [[1, 0],[0,1]]
    print(c2.canFinish(numCourses2, prerequisites2))
