package cn.bdqn.service;

import cn.bdqn.entity.Attence;

import java.util.List;

/**
 * @Package: cn.bdqn.service
 * @Description:
 * @Author 杰
 * @Create 2021年04月30日 09时48分32秒
 */
public interface IAttenceService {
    List<Attence> getAttenceList();

    Integer addAttence(Attence attence);
}
