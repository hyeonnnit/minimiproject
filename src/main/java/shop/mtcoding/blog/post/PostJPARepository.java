package shop.mtcoding.blog.post;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PostJPARepository extends JpaRepository<Post, Integer> {
}
