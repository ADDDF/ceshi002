package cn.bdqn.mapper;

import cn.bdqn.entity.Attence;

import java.util.List;

/**
 * @Package: cn.bdqn.mapper
 * @Description:
 * @Author 杰
 * @Create 2021年04月30日 09时44分54秒
 */
public interface AttenceMapper {
    /**
     * @Author: jie
     * @Date:  09时47分57秒
     * @Description: 查詢

     * @return java.util.List<cn.bdqn.entity.Attence>
     **/
    List<Attence> getAttenceList();
    /**
     * @Author: jie
     * @Date:  09时48分06秒
     * @Description: 添加
     * @param attence
     * @return java.lang.Integer
     **/
    Integer addAttence(Attence attence);
}
