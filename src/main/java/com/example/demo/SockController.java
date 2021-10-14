package com.example.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/socks")
public class SockController {

    private final SockService sockService;

    @Autowired
    public SockController(SockService sockService) {
        this.sockService = sockService;
    }

    @GetMapping
    public List<Sock> getSocks() {
        return sockService.getSocks();

    }

    @GetMapping("/x")
    public Integer getColorCottonPartOperation(
            @RequestParam(name = "color") String color,
            @RequestParam(name = "operation") String operation,
            @RequestParam(name = "cottonPart") Integer cottonPart) {
        return sockService.getColorCottonPartOperation(color, operation, cottonPart);
    }


    @PostMapping("/income")
    public void registerNewSock(@RequestBody Sock Sock) {
        sockService.addNewSock(Sock);
    }


}
