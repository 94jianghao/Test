
import AnswerGenerator.AnswerGenerator;
import answer.answer;
import org.junit.Test;

import static org.fest.assertions.api.Assertions.assertThat;

/**
 * Created by jh_pc on 15-2-3.
 */
public class randomnum {
       @Test
       /**
        * 测试类
        */
       public void should_number_Test(){
           //new 一个产生随机数的类
           AnswerGenerator answerGenerator = new AnswerGenerator();
           //new 一个产生比较测试类 返回 一个String类型的结果
           CompareNumber compareNumber = new CompareNumber();
           String result= compareNumber.numTest(answerGenerator.return_randomnum(),-1);
           System.out.println(result);
           assertThat(result).isEqualTo("4A0B");
           assertThat(result).isEqualTo("0A4B");
           assertThat(result).isEqualTo("0A0B");
           assertThat(result).isEqualTo("2A2B");
           assertThat(result).isEqualTo("2A1B");


       }

    public  void should_number_Test1(){
        //new 一个产生随机数的类
        AnswerGenerator answerGenerator = new AnswerGenerator();
        //new 一个比较类
        answer answer = new answer();
        answer.say();

    }

}
