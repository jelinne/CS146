from hw11.FloodFill import FloodFill
from hw11.Grid import grid

if __name__ == "__main__":
    ff = FloodFill()
    image = [
        [1, 1, 1],
        [1, 1, 0],
        [1, 0, 1]]
    sr, sc, new_color = 1, 1, 2
    ff.floodFill(image, sr, sc, new_color)
    grid(image)

    image2 = [
        [1, 1, 1],
        [1, 0, 0]]
    sr2, sc2, new_color2 = 0, 1, 0
    ff.floodFill(image2, sr2, sc2, new_color2)
    grid(image2)
