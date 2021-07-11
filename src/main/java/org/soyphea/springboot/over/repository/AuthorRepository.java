package org.soyphea.springboot.over.repository;

import org.soyphea.springboot.over.entity.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author,Long> {

}
