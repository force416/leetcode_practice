package eric.leetcode;

/**
 * https://leetcode.com/problems/robot-return-to-origin/
 * <p>
 * example 1
 * Input: "UD"
 * Output: true
 * Explanation: The robot moves up once, and then down once. All moves have the same magnitude, so it ended up at the origin where it started. Therefore, we return true.
 * <p>
 * example 2
 * Input: "LL"
 * Output: false
 * Explanation: The robot moves left twice. It ends up two "moves" to the left of the origin. We return false because it is not at the origin at the end of its moves.
 */
public class RobotReturnOrigin {
    public boolean judgeCircle(String moves) {
        int xCount = 0;
        int yCount = 0;

        for (char c : moves.toCharArray()) {
            switch (c) {
                case 'U':
                    yCount++;
                    break;
                case 'D':
                    yCount--;
                    break;
                case 'L':
                    xCount--;
                    break;
                case 'R':
                    xCount++;
                    break;
            }
        }
        return xCount == 0 && yCount == 0;
    }

    public static void main(String[] args) {
        System.out.println(new RobotReturnOrigin().judgeCircle("LL"));
        System.out.println(new RobotReturnOrigin().judgeCircle("UD"));
        System.out.println(new RobotReturnOrigin().judgeCircle("LR"));
        System.out.println(new RobotReturnOrigin().judgeCircle("URDL"));
    }
}
