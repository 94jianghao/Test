package answer;

import AnswerGenerator.AnswerGenerator;

/**
 * Created by jh_pc on 15-2-3.
 */
public class answer {
    public void say() {

        AnswerGenerator isgo=new AnswerGenerator();
        int random=isgo.return_randomnum();
        int[] randoms={random/1000,random/100%10,random/10%10,random%10};
        for(int i=0;i<randoms.length;i++)
        {

        }
    }
}
