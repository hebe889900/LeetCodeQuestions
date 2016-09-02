class Solution(object):
    def isValid(self, s):
        """
        :type s: str
        :rtype: bool
        """
        if len(s) < 2 or len(s) % 2 == 1:
            return False
        else:
            stack = []
            for char in s:
                if char in "([{":
                    stack.append(char)
                else:
                    if stack == []:
                        return False
                    else:
                        x = stack.pop()
                        y = ord(char) - ord(x)
                        if y != 1 and y != 2:
                            return False
                        else:
                            continue
            if stack == []:
                return True
            else:
                return False

# ss = "(}[]{}"
# ss = "([])"
# ss = "[({(())}[()])]"
# ss = ")}{({))[{{[}"
# ss = "(("
# a = Solution()
# print a.isValid(ss)