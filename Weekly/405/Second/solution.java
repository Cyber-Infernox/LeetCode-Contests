class Solution {
    public List<String> validStrings(int n) {
        List<String> result = new ArrayList<>();
        generateStrings(new StringBuilder(), n, result);
        return result;
    }

    private void generateStrings(StringBuilder current, int n, List<String> result) {
        if (current.length() == n) {
            if (isValid(current.toString())) {
                result.add(current.toString());
            }
            return;
        }

        current.append('0');
        generateStrings(current, n, result);
        current.setLength(current.length() - 1);

        current.append('1');
        generateStrings(current, n, result);
        current.setLength(current.length() - 1);
    }

    private boolean isValid(String binaryStr) {
        for (int i = 0; i < binaryStr.length() - 1; i++) {
            if (binaryStr.charAt(i) == '0' && binaryStr.charAt(i + 1) == '0') {
                return false;
            }
        }
        return true;
    }
}
