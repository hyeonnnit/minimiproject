package shop.mtcoding.blog.scrap;

import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequiredArgsConstructor
public class ScrapController {
    private final HttpSession session;
    private final ScrapRepository scrapRepository;
    private final ScrapService scrapService;

    //개인 채용 공고 스크랩
    @GetMapping("/person/scrap")
    public String personScrapForm() {
        return "person/scrap";
    }
    @GetMapping("/person/scrap/{id}/detail")
    public String personScrapDetailForm(@PathVariable int id) {
        //뷰내용 뿌리기
        //이력서 선택
        return "person/post-scrap-detail";
    }

    @PostMapping("/person/scrap/{id}/detail/delete")
    public String personScrapDelete(@PathVariable int id) {
        return "redirect:/person/scrap";
    }

    @PostMapping("/person/scrap/{id}/detail/apply")
    public String personPostApply(@PathVariable int id) {
        return "redirect:/person/scrap/{id}/detail";
    }
    //기업 이력서 스크랩
    @GetMapping("/company/scrap")
    public String companyScrapForm() {
        return "company/scrap";
    }

    @GetMapping("/company/scrap/{id}/detail")
    public String companyScrapDetailForm(@PathVariable int id) {
        return "company/resume-scrap-detail";
    }

    @PostMapping("/company/scrap/{id}/detail/delete")
    public String companyScrapDelete(@PathVariable Integer id) {
        return "redirect:/company/scrap";
    }

    @PostMapping("/company/scrap/{id}/detail/offer")
    public String companyResumeOffer(@PathVariable Integer id) {
        return "redirect:/company/scrap/{id}/detail";
    }

}