package com.spring.test.service;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.spring.test.model.dto.Color;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Service;

import java.io.*;
import java.util.List;

@Service
public class ColorService {

    public List<Color> getColors(){
        Gson gson = new Gson();
        try {
            ClassPathResource resource = new ClassPathResource("color.json");
            Reader reader = new BufferedReader(new InputStreamReader(resource.getInputStream()));
            List<Color> colorList = gson.fromJson(reader, new TypeToken<List<Color>>(){});
            return colorList;
        } catch (IOException e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
}
