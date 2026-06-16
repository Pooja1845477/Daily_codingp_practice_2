import java.util.*;

class Solution {
    public ArrayList<Integer> constructList(int[][] queries) {

        ArrayList<Integer> list = new ArrayList<>();
        int xor = 0;

        for (int i = queries.length - 1; i >= 0; i--) {

            if (queries[i][0] == 1) {
                xor ^= queries[i][1];
            } else {
                list.add(queries[i][1] ^ xor);
            }
        }

        list.add(xor); // initial 0 after all XOR operations

        Collections.sort(list);

        return list;
    }
}
