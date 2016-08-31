class Solution(object):
    def maxArea(self, height):
        area = 0
        if len(height) < 2:
            return 0
        elif len(height) == 2:
            return min(height[0], height[1])
        else:
            i = 0
            j = len(height)-1
            while i < j:
                if height[i] < height[j]:
                    area = max(area, height[i]*(j-i))
                    i += 1
                else:
                    area = max(area, height[j]*(j-i))
                    j -= 1
            return area