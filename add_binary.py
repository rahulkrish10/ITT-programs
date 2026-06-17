class Solution:
    def addBinary(self, a: str, b: str) -> str:
        c=int(a,2) + int(b,2)
        g=bin(c)[2:]
        return g
        
