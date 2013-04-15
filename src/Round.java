/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 13-4-15
 * Time: 下午8:19
 * To change this template use File | Settings | File Templates.
 */
public class Round {
    private int firstHitNum;
    private int secondHitNum;

    public void setHitNum(int firstHit, int secondHit) {
        firstHitNum = firstHit;
        secondHitNum = secondHit;
    }

    public int getOneRoundScore() {
        return firstHitNum + secondHitNum;
    }
}
