//217. Contains Duplicate
//Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
//Method 1: HashMap
//Time Complexity: O(n), Space Complexity: O(n)
class Solution1 {
    public boolean containsDuplicate(int[] nums) {
        HashMap <Integer, Integer> map = new HashMap();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i]))
                return true;
            else
                map.put(nums[i],i);
        }
        return false;
    }
}

//Method 2: HashSet
//Time Complexity: O(n), Space Complexity: O(n)
class Solution2 {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> hashSet = new HashSet<>(nums.length);
        for (int i = 0; i < nums.length; i++) {
            if (!hashSet.add(nums[i])) {
                return true;
            }
        }
        return false;
    }
}

//Method 3: HashSet (without initial capacity)
//Time Complexity: O(n), Space Complexity: O(n)
class Solution3 {
    public boolean containsDuplicate(int[] nums) {
        HashSet <Integer> Set = new HashSet(); // new HashSet((int)(nums.length / 0.75f) + 1);
        for(int num : nums) {
            if (!Set.add(num))
                return true;
        }
        return false;
    }
}

//Method 4: Sorting
//Time Complexity: O(n log n), Space Complexity: O(1)
class Solution4 {
    public boolean containsDuplicate(int[] nums) {
        for(int i=0; i < nums.length; i++) {
            int key = nums[i];
            int j = i - 1;
            while(j >= 0 && nums[j] > key){
                nums[j + 1] = nums[j];
                j--;
            }
            if(j >= 0 && nums[j] == key)
                return true;
            nums[j + 1]=key;
        }
        return false;
    }    
}