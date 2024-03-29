I used a queue to add each node at the current level to the queue and into a separate array list. 
Those are then added to the level order array list. When you start at the root, the root is added 
to the queue and then is dequeued. It’s added to the array list. If it’s left and right child 
exist then they are added to the queue.The size of the queue is the limitation of the for loop, 
so it knows when it has iterated through all of the nodes at the current level, and has added all 
of their children to the queue for the next level. 
