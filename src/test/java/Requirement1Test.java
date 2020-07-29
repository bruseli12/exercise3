import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.core.Is.is;

public class Requirement1Test {
    @Test
    public  void should_return_110_when_calculatecredit_given_consume_110(){
        //given
        User user=new User("Tom");
        Calculator calculator=new Calculator();
        //when
        int credit=calculator.calculate(110);
        user.setCredit(credit);
        //then


        Assert.assertThat(user.getCredit(),is(110));
    }
}
