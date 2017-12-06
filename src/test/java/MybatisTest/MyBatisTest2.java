package MybatisTest;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import othermapper.MyCourseMapper;
import po.Deptinfo;

import java.util.List;

/**
 * @Author: XBlue
 * @Date: Create in 2017/11/79:46
 * @Description:
 * @Modified By:
 */

@RunWith(SpringJUnit4ClassRunner.class)// 添加spring,mybatis测试方案
@ContextConfiguration("classpath:spring/applicationContext-dao.xml")// 指定spring配置文件位置
public class MyBatisTest2 {
    @Autowired
    private MyCourseMapper myCourseMapper;
    @Test
    public void test(){
        Deptinfo deptinfo=new Deptinfo();
        deptinfo.setDeptname("学院");
        List<Deptinfo> list=myCourseMapper.selectByName(deptinfo);
        if(list!=null){

        }
    }
}
