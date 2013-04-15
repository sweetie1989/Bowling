import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 13-4-15
 * Time: 下午8:12
 * To change this template use File | Settings | File Templates.
 */
public class RoundTest {
    @Test
    public void should_be_show_2_after_giving_4_and_5 () {
        //given
        RoundsManager roundsManager = new RoundsManager();
        roundsManager.roundsHitNumList =  new ArrayList<Integer[]>();
        //when
        Integer[] firstHitNum = {1, 4};
        Integer[] secondHitNum = {4, 5};
        roundsManager.roundsHitNumList.add(firstHitNum);
        roundsManager.roundsHitNumList.add(secondHitNum);
        int result = roundsManager.getRoundNum();
        //then
        assertThat(result,is(2));
    }

}
