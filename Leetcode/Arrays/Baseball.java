class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> record = new Stack<>();

        for (int i = 0; i < operations.length; i++) {
            switch (operations[i]) {
                case "+":
                    if (record.size() < 2) break;
                    int temp_1 = record.pop();
                    int temp_2 = record.pop();
                    int new_record = temp_1 + temp_2;
                    record.push(temp_2);
                    record.push(temp_1);
                    record.push(new_record);
                    break;
                case "D":
                    if (record.size() < 1) break;
                    int dbl = 2 * record.peek();
                    record.push(dbl);
                    break;
                case "C":
                    if (!record.isEmpty()) record.pop();
                    break;
                default:
                    int temp = Integer.parseInt(operations[i]);
                    record.push(temp);
                    break;
            }
        }

        int sum = 0;
        while (!record.isEmpty()) {
            sum += record.pop();
        }

        return sum;

    }
}