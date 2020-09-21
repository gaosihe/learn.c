package frank.controller;

import frank.model.Member;
import frank.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;

@RestController
@RequestMapping("/member")
public class MemberController {

    @Autowired
    private MemberService memberService;

//    @PostMapping("/add")
//    public Object add(@RequestBody Member member){
//        memberService.add(member);
//        return null;
//    }
    @PostMapping("/add")
    public Object add(@RequestBody Member member, HttpSession session){
        memberService.add(member,session);
        return member.getId();//将自增主键返回给前端
    }
    @PostMapping("/update")
    public Object update(@RequestBody Member member){
        memberService.update(member);
        return null;
    }

    @GetMapping("/delete/{id}")
    public Object delete(@PathVariable Integer id){
        memberService.delete(id);
        return null;
    }
}
