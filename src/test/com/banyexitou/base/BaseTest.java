package banyexitou.base;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

import java.io.IOException;

@ContextConfiguration
@SpringBootTest
public class BaseTest {

    @Test
    public void test() throws IOException {
        /**
         * 读取resource文件
         *
         * question：resource目录标记是什么用的？
         * 为什么标记了以后就可以找到
         * 测试下载的接口下载的文件最后去了哪里
         *不应该通过类实例访问静态成员????为什么
         *
         *
         *
         * 输出流和输入流的异常处理
         */
        String path = getClass().getResource("/a.txt").getPath();
        System.out.println(path);

    }
}
