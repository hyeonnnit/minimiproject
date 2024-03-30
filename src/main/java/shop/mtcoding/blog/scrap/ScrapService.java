package shop.mtcoding.blog.scrap;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class ScrapService {
    private final ScrapJPARepository scrapJPARepository;
    private final ScrapQueryRepository scrapQueryRepository;

}
