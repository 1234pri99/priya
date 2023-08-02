package com.priya.App;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Repos extends JpaRepository<PrimaryData2, Integer> {

}
