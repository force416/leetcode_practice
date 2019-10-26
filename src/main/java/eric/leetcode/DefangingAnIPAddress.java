package eric.leetcode;

/**
 * https://leetcode.com/problems/defanging-an-ip-address/
 * <p>
 * example1:
 * Input: address = "1.1.1.1"
 * Output: "1[.]1[.]1[.]1"
 * <p>
 * example2:
 * Input: address = "255.100.50.0"
 * Output: "255[.]100[.]50[.]0"
 **/
public class DefangingAnIPAddress {
    public String defangIPaddr(String address) {
        char[] addressArr = address.toCharArray();
        char[] resultArr = new char[addressArr.length + 6];
        for (int i = 0, j = 0; i < addressArr.length;) {
            if (addressArr[i] == '.') {
                resultArr[j] = '[';
                resultArr[j+1] = '.';
                resultArr[j+2] = ']';
                j+=3;
                i++;
            } else {
                resultArr[j] = addressArr[i];
                i++;
                j++;
            }
        }

        return new String(resultArr);
    }

    public static void main(String[] args) {
        DefangingAnIPAddress d = new DefangingAnIPAddress();
        String result = d.defangIPaddr("1.1.1.1");
        System.out.println(result);

        String result2 = d.defangIPaddr("255.100.50.0");
        System.out.println(result2);
    }
}
