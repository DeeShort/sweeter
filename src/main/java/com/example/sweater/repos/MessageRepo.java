package com.example.sweater.repos;

import com.example.sweater.domain.Message;
import org.apache.catalina.User;
import org.springframework.data.repository.CrudRepository;

public interface MessageRepo extends CrudRepository<Message, Integer> {
}
