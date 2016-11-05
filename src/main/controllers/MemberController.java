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
    @Getter @Setter
    @Autowired
    private MemberService memberService;

    @RequestMapping(value = "/members")
    public String memberList(Model model) {
        model.addAttribute("memberList", memberService.getMembers());
        return "/members";
    }

    @RequestMapping(value = "/member/{id}")
    public String member(@PathVariable Integer id, Model model) {
        model.addAttribute("member", memberService.getMemberByID(id));
        return "/member";
    }
}
