package com.example.Lemon;

import org.springframework.data.repository.CrudRepository;
import java.util.List;


// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface SeriescommentRepository extends CrudRepository<Seriescomment, Integer> {
    List<Seriescomment> findBySeriesid(Integer seriesid);
}