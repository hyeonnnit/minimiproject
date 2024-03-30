package shop.mtcoding.blog.main;

import jakarta.persistence.EntityManager;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;

@Controller
@RequiredArgsConstructor
public class MainRepository {
    private final EntityManager em;

}
