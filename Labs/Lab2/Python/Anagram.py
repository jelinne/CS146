
class Anagram:
    def anagram(self, s, t):
        if len(s) != len(t) or s == t:
            return False
        if sorted(s) == sorted(t):
            return True
        return False
