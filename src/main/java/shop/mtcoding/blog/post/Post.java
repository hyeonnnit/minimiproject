package shop.mtcoding.blog.post;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Table(name = "post_tb")
@Data
@Entity // 테이블 생성하기 위해 필요한 어노테이션
public class Post { // 공고테이블
    @Id // PK 설정
    @GeneratedValue(strategy = GenerationType.IDENTITY) // auto_increment 전략
    private Integer id;

}