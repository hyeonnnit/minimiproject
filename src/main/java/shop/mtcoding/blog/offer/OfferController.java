package shop.mtcoding.blog.offer;

import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;



@Controller
@RequiredArgsConstructor
public class OfferController {
    private final HttpSession session;
    private final OfferService offerService;

    // 제안한 이력서 상세보기
    @GetMapping("/person/offer/post/detail/{id}")
    public String personOfferDetail(@PathVariable int id) {
        return "person/offer-post-detail";
    }

    // person의 offers 관리
    @GetMapping("/person/offers")
    public String personOffers() {
        return "person/offers";
    }


    // company의 offers 관리
    @GetMapping("/company/offers")
    public String personPost() {
        return "company/offers";
    }

    @GetMapping("/company/offer/{id}/detail")
    public String companyOfferDetail() {

        return "company/offer-resume-detail";
    }

    // 제안한 이력서 DELETE (취소)
    @PostMapping("/company/offer/{id}/detail/delete")
    public String companyOfferDetailDelete(@PathVariable int id) {
        return "redirect:/company/offers";
    }


//    @GetMapping("/company/update-info-form")
//    public String noFinded() {
//        return "company/update-info-form";
//    }
//
//    @GetMapping("/company/offer-form/")
//    public String noFinded2() {
//        return "company/offer-form";
//    }
//

}