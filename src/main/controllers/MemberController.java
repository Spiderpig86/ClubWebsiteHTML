package main.controllers;

import lombok.Getter;
import lombok.Setter;
import main.services.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by me on 10/28/2016.
 */

@Controller
public class MemberController {
    @Getter @Setter @Autowired
    private MemberService memberService;

    public MemberController() {
        this.memberService = new MemberService();
    }

    @RequestMapping(value = "/members")
    public String getMemberListHTML(Model model) {
        //model.addAttribute("memberList", memberService.getMembers());
        return "/members";
    }

    @RequestMapping(value = "/member/{id}")
    public String getMemberHTML(@PathVariable Integer id, Model model) {
        //model.addAttribute("member", memebrService.getMemberById(id));
        return "/member";
    }
}
