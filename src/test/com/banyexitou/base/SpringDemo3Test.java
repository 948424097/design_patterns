//package banyexitou.base;
//
//
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.ContextConfiguration;
//
//import javax.annotation.Resource;
//import java.util.List;
//
//import static org.hamcrest.Matchers.is;
//import static org.junit.Assert.assertThat;
//
//
//@ContextConfiguration
//@SpringBootTest
//public class SpringDemo3Test implements InstanceTestClassListener{
//
//    @Resource
//    private List<String> myList;
//
//    @Test
//    public void testMyListInjection() {
//        System.out.println("这是方法");
//        assertThat(myList.size(), is(2));
//    }
//
//    @Override
//    public void beforeClassSetup() {
//        System.out.println("这是开始");
//        System.out.println("这是开始");
//        System.out.println("这是开始");
//        assertThat((String)myList.get(0), is("one"));
//    }
//
//    @Override
//    public void afterClassSetup() {
//        System.out.println("这是结束");
//        System.out.println("这是结束");
//        System.out.println("这是结束");
//        assertThat((String)myList.get(1), is("two"));
//    }
//}
