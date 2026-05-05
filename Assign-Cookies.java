1class Solution {
2    public int findContentChildren(int[] g, int[] s) {
3        Arrays.sort(g);
4        Arrays.sort(s);
5        int i = 0, j = 0, count = 0;
6        while (i < g.length && j < s.length) {
7            if(g[i] <= s[j]) {
8                count++;
9                i++;
10                j++;
11            } else if (g[i] > s[j]) {
12                j++;
13            } else {
14                i++;
15            }
16        }
17        return count;
18    }
19}