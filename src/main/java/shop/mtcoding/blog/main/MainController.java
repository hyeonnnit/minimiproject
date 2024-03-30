package shop.mtcoding.blog.main;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@RequiredArgsConstructor
public class MainController {

    private final HttpSession session;
    private final MainService mainService;

    //메인 구직 공고
    @GetMapping("/company/main")
    public String resumeForm() {
        return "company/main";
    }

    @GetMapping("/resume/detail/{resumeId}")
    public String resumeDetailForm(@PathVariable("resumeId") Integer resumeId) {
        return "company/resume-detail";
    }

    @PostMapping("/resumes/{id}/offer")
    public String companyResumeOffer(@PathVariable int id) {
        return "redirect:/resumes/" + id;
    }

    @PostMapping("/resumes/{id}/scrap")
    public String companyResumeScrap(@PathVariable int id) {
        return "redirect:/resumes/" + id;
    }

    //메인 채용 공고
    @GetMapping({"/person/main", "/"})
    public String postForm() {
        return "person/main";
    }

    @GetMapping("/posts/{id}")
    public String postDetailForm(@PathVariable int id) {
        return "person/post-detail";
    }

    @PostMapping("/posts/{id}/apply")
    public String personPostApply(@PathVariable int id, Integer resumeChoice) {
        return "redirect:/posts/" + id;
    }

    @PostMapping("/posts/{id}/scrap")
    public String personPostScrap(@PathVariable int id) {
        return "redirect:/posts/" + id;
    }

//
//    @GetMapping("/company/matching")
//    public String matchingResumeForm() {
//        return "company/matching";
//    }
//
//    @PostMapping("/company/match")
//    public String matchingPost(int postChoice) {
//        return "redirect:/company/matching";
//    }
//
//    //맞춤 공고 - 개인이 보는 매칭 공고
//    @GetMapping("/person/matching")
//    public String matchingPostForm() {
//        return "person/matching";
//    }
//
//    @PostMapping("/person/match")
//    public String matchingResume(@RequestParam("resumeChoice") Integer resumeChoice) {
//        return "redirect:/person/matching";
//    }
}



