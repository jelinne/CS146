I used a helper method to check if the current node surpasses the lower and upper limit. 
If so, it returns false. Once it reaches the end of the tree, it'll return true. The 
reason I use min and max integers is to ensure that the root value is within the 
limits for the initial call. The helper recursively checks the left and right subtrees, 
but with the node value as the new upper limit for the left side and the node value as 
the new lower limit for the right subtree. This makes the current node, the upper limit 
of the left side and lower limit of the right side to check if it follows the properties 
of a BST.
