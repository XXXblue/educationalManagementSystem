package serviceImpl;

import mapper.KslxsjzdMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import po.Kslxsjzd;
import po.KslxsjzdExample;
import service.KxlxmcService;

import java.util.List;

/**
 * @Author: XBlue
 * @Date: Create in 2017/12/1318:15
 * @Description:
 * @Modified By:
 */
@Service
public class KxlxmcServiceImpl implements KxlxmcService {
    @Autowired
    private KslxsjzdMapper kslxsjzdMapper;
    public List<Kslxsjzd> ajaxSelQuery() {
        KslxsjzdExample kslxsjzdExample=new KslxsjzdExample();
        return kslxsjzdMapper.selectByExample(kslxsjzdExample);
    }
}
