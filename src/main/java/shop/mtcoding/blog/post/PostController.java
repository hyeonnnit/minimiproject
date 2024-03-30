package shop.mtcoding.blog.post;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
@RequiredArgsConstructor
public class PostController {
    private final HttpSession session;
    private final PostService postService;

    //회사 공고 관리
    @GetMapping("/company/posts")
    public String companyPosts(HttpServletRequest request) {
        return "company/posts";
    }

    // 공고 상세보기
    @GetMapping("/company/posts/{id}")
    public String companyPostDetailForm(@PathVariable Integer id) {

        return "company/post-detail";
    }

    @GetMapping("/company/posts/save-form")
    public String companyPostForm() {
        return "company/post-save-form";
    }

    @PostMapping("/company/posts/save")
    public String companySavePost() {

        return "redirect:/company/posts";
    }

    @GetMapping("/company/posts/{id}/update-form")
    public String companyUpdatePostForm(@PathVariable int id) {
        return "company/post-update-form";
    }

    @PostMapping("/company/posts/{id}/update")
    public String companyUpdatePost(@PathVariable int id) {
        return "redirect:/company/posts/" + id;
    }

    @PostMapping("/company/posts/{id}/delete")
    public String companyDeletePost(@PathVariable int id) {
        return "redirect:/company/posts";
    }
}