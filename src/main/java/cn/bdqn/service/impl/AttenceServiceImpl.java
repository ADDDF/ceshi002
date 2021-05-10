package cn.bdqn.service.impl;

import cn.bdqn.entity.Attence;
import cn.bdqn.mapper.AttenceMapper;
import cn.bdqn.service.IAttenceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Package: cn.bdqn.service.impl
 * @Description:
 * @Author 杰
 * @Create 2021年04月30日 09时48分54秒
 */
@Service
public class AttenceServiceImpl implements IAttenceService {
    @Autowired
    AttenceMapper attenceMapper;

    @Override
    public List<Attence> getAttenceList() {
        return attenceMapper.getAttenceList();
    }

    @Override
    public Integer addAttence(Attence attence) {
        return attenceMapper.addAttence(attence);
    }
}
