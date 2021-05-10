package cn.bdqn.controller;

import cn.bdqn.entity.Attence;
import cn.bdqn.service.IAttenceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @Package: cn.bdqn.controller
 * @Description:
 * @Author 杰
 * @Create 2021年04月30日 09时53分08秒
 */
@Controller
public class AttenceController {

    @Autowired
    IAttenceService attenceService;
/**
 * @Author: jie
 * @Date: 2021年04月30日 10时02分53秒
 * @Description: 查詢所有
 * @param model
 * @return java.lang.String
 **/
    @RequestMapping("list")
    public String list(Model model){

        List<Attence> attenceList=attenceService.getAttenceList();
        model.addAttribute("attenceList",attenceList);

        return "index";
    }
    /**
     * @Author: jie
     * @Date: 2021年04月30日 10时03分03秒
     * @Description: 進入添加頁面

     * @return java.lang.String
     **/
    @RequestMapping("toadd")
    public String toadd(){
        return "add";
    }
    /**
     * @Author: jie
     * @Date: 2021年04月30日 10时11分01秒
     * @Description: 添加
     * @param attence
     * @return java.lang.String
     **/
    @RequestMapping("addatt")
    public String addatt(Attence attence){
        attenceService.addAttence(attence);
        return "redirect:list";
    }
}
