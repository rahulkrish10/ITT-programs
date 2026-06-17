class Solution:
    def removeElement(self, nums: List[int], val: int) -> int:
        len =0
        for i in nums:
            if(i!=val):
                nums[len]=i
                len=len+1
        return len        
