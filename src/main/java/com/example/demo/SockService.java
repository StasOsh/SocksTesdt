package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SockService {
    private final SockRepository sockRepository;

    private final String MORE_THAN = "moreThan";
    private final String LESS_THAN = "lessThan";
    private final String EQUALS = "equals";

    @Autowired
    public SockService(SockRepository sockRepository) {
        this.sockRepository = sockRepository;
    }

    public List<Sock> getSocks() {
        return sockRepository.findAll();

    }

    public Integer getColorCottonPartOperation(String color, String operation, Integer cottonPart) {
        if (operation.equals(MORE_THAN)) {
            return sockRepository.findAllByColorAndCottonPartMoreThan(color, cottonPart);
        } else if (operation.equals(LESS_THAN)) {
            return sockRepository.findAllByColorAndCottonPartLessThan(color, cottonPart);
        } else if (operation.equals(EQUALS)) {
            return sockRepository.findAllByColorAndCottonPartEquals(color, cottonPart);
        }

        return null;
    }


    public void addNewSock(Sock sock) {
        sockRepository.save(sock);
    }


}
