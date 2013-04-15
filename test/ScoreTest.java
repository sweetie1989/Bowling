import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 13-4-15
 * Time: 下午3:53
 * To change this template use File | Settings | File Templates.
 */
public class ScoreTest {
    @Test
    public void should_be_9_when_the_score_is_4_and_5(){
        //given
        Round round = new Round();
        //when
        int firstHitNum = 4;
        int secondHitNum = 5;
        round.setHitNum(firstHitNum,secondHitNum);
        int result;
        result = round.getOneRoundScore();
        //then
        assertThat(result,is(9));
    }
}
