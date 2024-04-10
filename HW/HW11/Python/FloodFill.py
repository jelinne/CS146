from collections import deque


class FloodFill:
    def floodFill(self, image, sr, sc, color):
        directions = [(-1, 0), (1, 0), (0, -1), (0, 1)]
        start = image[sr][sc]
        if start == color:
            return image
        queue = deque([(sr, sc)])
        while queue:
            x,y = queue.popleft()
            image[x][y] = color

            for dirx, diry in directions:
                newx = x + dirx
                newy = y + diry
                if len(image) > newx >= 0 and len(image[0]) > newy >= 0 and image[newx][newy] == start:
                    queue.append((newx, newy))
        return image
