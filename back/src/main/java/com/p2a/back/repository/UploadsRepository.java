package com.p2a.back.repository;

import com.p2a.back.model.Uploads;
import org.hibernate.sql.Update;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

public interface UploadsRepository {
    // 단일 엔티티 조회
    Optional<Uploads> findByID(Long id);

    // 설명으로 엔티티 조회
    Optional<List<Uploads>> findByDescription(String description);

    // 제목으로 엔티티 조회
    Optional<List<Uploads>> findByTitle(String title);

    // 닉네임으로 엔티티 조회
    Optional<List<Uploads>> findByNickName(String nickname);

    // 해쉬 태그로 엔티티 조회
    Optional<List<Uploads>> findByHashtag(List<String> hashtag);

    //모든 엔티티 조회
    List<Uploads> findAll();

    // 엔티티 저장
    Uploads save(Uploads uploads);

    // 여러 엔티티 저장
    List<Update> saveAll(List<Uploads> uploads);

    // 엔티티 삭제
    void delete(Uploads entity);

    // 기본 키로 엔티티 삭제
    void deleteById(Long id);

    // 모든 엔티티 삭제
    void deleteAll();

    // 엔티티 개수 조회
    long count();
}
