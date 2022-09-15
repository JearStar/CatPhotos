package io.javabrains.courseapidata.cat;

import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

@RestController
public class CatController {
    @Autowired
    CatService catService;

    @GetMapping(
            value = "/cats",
            produces = MediaType.IMAGE_JPEG_VALUE
    )
    public @ResponseBody byte[] getPhoto() throws IOException {
        File fi = new File("./images/dogbowl.jpg");
        byte[] fileContent = Files.readAllBytes(fi.toPath());
        return fileContent;
    }
}
