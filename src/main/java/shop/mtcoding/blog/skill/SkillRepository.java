package shop.mtcoding.blog.skill;

import jakarta.persistence.EntityManager;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;


@Repository
@RequiredArgsConstructor
public class SkillRepository {
    private final EntityManager em;

}