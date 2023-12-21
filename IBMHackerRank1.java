//HackerRank
public class CalculateScoreDifference {
    public int calculateScoreDifference(List<Integer> sequence) {
        int firstScore = 0, secondScore = 0;
        boolean isForward = true; // Direction of traversal
        int start = 0, end = sequence.size() - 1;

        for (int round = 0; round < sequence.size(); round++) {
            int number = isForward ? sequence.get(start++) : sequence.get(end--);

            if (round % 2 == 0) {
                firstScore += number;
            } else {
                secondScore += number;
            }

            if (number % 2 == 0) {
                isForward = !isForward; // Flip the direction
            }
        }

        return firstScore - secondScore;
    }
}

// Time Complexity: Unknown

// Space Complexity: O(1) (guess)