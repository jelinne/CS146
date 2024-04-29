
class Palindrome:
    def palindrome(self,s):
        reverse = ""
        for i in range(len(s)):
            n = s[i]
            reverse = n + reverse
        if reverse == s:
            return True
        return False
