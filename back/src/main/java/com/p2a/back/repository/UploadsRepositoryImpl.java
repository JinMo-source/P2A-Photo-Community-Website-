package com.p2a.back.repository;

import com.p2a.back.model.Entity.Uploads;
import org.hibernate.sql.Update;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class UploadsRepositoryImpl implements UploadsRepository{
    @Override
    public Optional<Uploads> findByID(Long id) {
        return Optional.empty();
    }

    @Override
    public Optional<List<Uploads>> findByDescription(String description) {
        return Optional.empty();
    }

    @Override
    public Optional<List<Uploads>> findByTitle(String title) {
        return Optional.empty();
    }

    @Override
    public Optional<List<Uploads>> findByNickName(String nickname) {
        return Optional.empty();
    }

    @Override
    public Optional<List<Uploads>> findByHashtag(List<String> hashtag) {
        return Optional.empty();
    }

    @Override
    public List<Uploads> findAll() {
        return null;
    }

    @Override
    public Uploads save(Uploads uploads) {
        return null;
    }

    @Override
    public List<Update> saveAll(List<Uploads> uploads) {
        return null;
    }

    @Override
    public void delete(Uploads entity) {

    }

    @Override
    public void deleteById(Long id) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public long count() {
        return 0;
    }
}
