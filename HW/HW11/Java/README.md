Base case is if the starting pixel is the same value as the new color being filled. If so, 
nothing changes as the flood fill is already fulfilled. This implementation’s main operation 
uses BFS. I created a queue to process the set of directions(up, down, left, and right of 
pixel) and started with adding the starting pixel to the queue. I then dequeued it and 
changed its value to be the new color. Then I checked if the different directions of the 
starting pixel are the same color as it. If they are, I add them to the queue then I keep 
doing this with every pixel added to the queue, until the queue is empty and there are no 
more neighboring pixels that are the same color as the starting pixel.
