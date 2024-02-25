package com.project.imgtag.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@Document
public class Image {
    @Id
    private String id;
    private String image_url;
    private List<String> tags;

    public Image(String image_url, List<String> tags) {
        this.image_url = image_url;
        this.tags = tags;
    }
}

