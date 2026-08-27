class Solution {
    public String lexGreaterPermutation(String s, String target) {
        int[] f = new int[26];
        for (char c : s.toCharArray())
            f[c - 'a']++;
        StringBuilder p = new StringBuilder();
        for (int i = 0; i < target.length(); i++) {
            int x = target.charAt(i) - 'a';
            if (f[x] > 0) {
                p.append(target.charAt(i));
                f[x]--;
                continue;
            }
            for (int j = x + 1; j < 26; j++) {
                if (f[j] > 0) {
                    StringBuilder ans = new StringBuilder(p);
                    ans.append((char) ('a' + j));
                    f[j]--;
                    for (int k = 0; k < 26; k++)
                        while (f[k]-- > 0)
                            ans.append((char) ('a' + k));

                    return ans.toString();
                }
            }
            for (int j = p.length() - 1; j >= 0; j--) {
                int x2 = p.charAt(j) - 'a';
                f[x2]++;
                for (int k = x2 + 1; k < 26; k++) {
                    if (f[k] > 0) {
                        StringBuilder ans = new StringBuilder(p.substring(0, j));
                        ans.append((char) ('a' + k));
                        f[k]--;

                        for (int z = 0; z < 26; z++)
                            while (f[z]-- > 0)
                                ans.append((char) ('a' + z));

                        return ans.toString();
                    }
                }
            }
            return "";
        }
        for (int j = p.length() - 1; j >= 0; j--) {
            int x = p.charAt(j) - 'a';
            f[x]++;
            for (int k = x + 1; k < 26; k++) {
                if (f[k] > 0) {
                    StringBuilder ans = new StringBuilder(p.substring(0, j));
                    ans.append((char) ('a' + k));
                    f[k]--;
                    for (int z = 0; z < 26; z++)
                        while (f[z]-- > 0)
                            ans.append((char) ('a' + z));
                    return ans.toString();
                }
            }
        }
        return "";
    }
}
