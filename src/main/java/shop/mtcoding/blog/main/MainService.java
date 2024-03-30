package shop.mtcoding.blog.main;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import shop.mtcoding.blog.apply.ApplyJPARepository;
import shop.mtcoding.blog.offer.OfferJPARepository;
import shop.mtcoding.blog.post.PostJPARepository;
import shop.mtcoding.blog.resume.ResumeJPARepository;
import shop.mtcoding.blog.scrap.ScrapJPARepository;
import shop.mtcoding.blog.skill.SkillJPARepository;

@RequiredArgsConstructor
@Service
public class MainService {
    private final ApplyJPARepository applyJPARepository;
    private final OfferJPARepository offerJPARepository;
    private final ScrapJPARepository scrapJPARepository;
    private final ResumeJPARepository resumeJPARepository;
    private final PostJPARepository postJPARepository;
    private final SkillJPARepository skillJPARepository;
}
