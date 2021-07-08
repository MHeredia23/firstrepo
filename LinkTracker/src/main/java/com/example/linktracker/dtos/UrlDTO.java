package com.example.linktracker.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class UrlDTO {

    private Integer linkId;
    private String redirect;
    private String web;
    private Integer metric;
    private String url;
    private boolean valid;
    private String password;

    public UrlDTO(Integer linkId, String redirect, String web, String url) {
        this.linkId = linkId;
        this.redirect = redirect;
        this.web = web;
        this.metric = 0;
        this.url = url;
        this.valid = true;
    }
}
