package othermapper;

import QueryVo.StudentInfoQueryVo;
import po.Rolepermission;
import po.Studentinfo;
import poView.StudentInfoView;

import java.util.List;

/**
 * @Author: XBlue
 * @Date: Create in 2017/9/2716:08
 * @Description:
 * @Modified By:
 */
public interface MyStudentInfoMapper {
    public List<StudentInfoView> searchStudentInfoByCondition(StudentInfoQueryVo studentInfoQueryVo );
    public Integer searchStudentInfoCountByCondition(StudentInfoQueryVo studentInfoQueryVo);
    public List<Rolepermission> selPermissionByStudentNum(String studentNum);
    public void updateStudentInfoForSelf(Studentinfo studentinfo);
}
