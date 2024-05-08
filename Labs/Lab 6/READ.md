I use an array to track the indegree of each course to track the 
number of prerequisites a course has. I then use a queue and add 
courses with an indegree of 0. The head of the queue is added to 
the result and then each course with that prerequisite's indegree 
will decrement. If the number of courses doesn't equal the length 
of the result, then that means there is a cycle and that it is 
not possible to complete the courses given.
