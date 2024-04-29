
class TwoSum:
    def twoSum(self, nums, target):
        hashmap = {}
        for i in range(len(nums)):
            num = target - nums[i]
            if num in hashmap:
                return [nums[i], nums[hashmap[num]]]
            hashmap[nums[i]] = i
