package shop.mtcoding.blog.apply;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import shop.mtcoding.blog.post.PostJPARepository;
import shop.mtcoding.blog.resume.ResumeJPARepository;
import shop.mtcoding.blog.skill.SkillRepository;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class ApplyController {
    private final HttpSession session;

    private final SkillRepository skillRepository;
    private final PostJPARepository postJPARepository;
    private final ResumeJPARepository resumeJPARepository;




    private final ApplyService applyService;

    //기업에서 받은 이력서 관리

    @GetMapping("/company/resumes")
    public String companyResume() {
        return "company/applied-resumes";
    }

    @GetMapping("/company/resumes/{id}")
    public String companyResumeDetail(@PathVariable int id) {
        return "company/applied-resume-detail";
    }

    @PostMapping("/company/resumes/{id}/is-pass")
    public String companyPass(@PathVariable int id) {
        return "redirect:/company/resumes/" + id;
    }

    // 개인이 지원한 이력서 목록
    @GetMapping("/person/applies")
    public String personApply() {
        return "person/applies";
    }

    @GetMapping("/person/applies/{id}") // 내가 지원한 공고 디테일
    public String personApply(@PathVariable int id) {
        return "person/post-apply-detail";
    }
    @PostMapping("/person/applies/{id}/delete")
    public String appliedDelete(@PathVariable int id) {
        return "redirect:/person/applies";
    }
}
