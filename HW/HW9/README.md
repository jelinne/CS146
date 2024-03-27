What I did to solve this problem of finding the least common ancestor given two nodes in a BST was to use recursion. 
If both p and q are less than the root, you know that the lowest common ancestor is on the left side of the root, so 
you would recursively go to the left side. If the both values are greater than the root, you know that the lca is on 
the right side of the root, so you would recursively go to the right side. However, if the value of the current root 
is in the middle of those values, that means it's at the lowest common ancestor so you will return the current root. 
