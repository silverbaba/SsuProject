package com.ssu.blog;

import org.springframework.data.jpa.repository.JpaRepository;

public interface HelloDao extends JpaRepository <Hello, Integer> {

}