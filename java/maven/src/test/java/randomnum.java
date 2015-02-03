
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
           String result=result();
           assertThat(result).isEqualTo("4A0B");

       }
    @Test
    public void should_number_Test5(){
        String result=result();
           assertThat(result).isEqualTo("0A0B");


    }
    @Test
    public void should_number_Test2(){
        String result=result();

           assertThat(result).isEqualTo("0A0B");



    }
    @Test
    public void should_number_Test3(){
        String result=result();

           assertThat(result).isEqualTo("2A2B");



    }
    @Test
    public void should_number_Test4(){
        String result=result();

           assertThat(result).isEqualTo("2A1B");


    }



    @Test
    public  void should_number_Test1(){
        //new 一个产生随机数的类
        AnswerGenerator answerGenerator = new AnswerGenerator();
        //new 一个比较类
        answer answer  = new answer();
        String result=answer.say();
        String result1=answer.say();
        String result2=answer.say();
        System.out.println("不重复结果1："+result);
        System.out.println("不重复结果2："+result1);
        System.out.println("不重复结果3："+result2);
        assertThat(result == result1 || result == result2 || result2 == result1).isEqualTo(false);


    }

    public  String result(){
        //new 一个产生随机数的类
        AnswerGenerator answerGenerator = new AnswerGenerator();
        //new 一个产生比较测试类 返回 一个String类型的结果
        CompareNumber compareNumber = new CompareNumber();
        String result= compareNumber.numTest(answerGenerator.return_randomnum(),-1);
        System.out.println("产生结果：+++"+result);
        return  result;
    }
}
