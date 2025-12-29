class Solution {
    int missingNum(int arr[]) {
        int n = arr.length + 1;   // FIX: define n
        
        int xor1 = 0;
        int xor2 = 0;

        // XOR of numbers from 1 to n
        for (int i = 1; i <= n; i++) {
            xor1 ^= i;
        }

        // XOR of array elements
        for (int num : arr) {
            xor2 ^= num;
        }

        // Missing number
        return xor1 ^ xor2;
    }
}
