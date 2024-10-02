class Solution {
    public boolean isSubsequence(String s, String t) {
        char[] S = s.toCharArray();
        char[] T = t.toCharArray();
        int sIndex = 0;
        int tIndex = 0;

        while (sIndex < S.length && tIndex < T.length) {
            if (S[sIndex] == T[tIndex]) {
                sIndex++;
            }
            tIndex++;
        }

        return sIndex == S.length;
    }
}