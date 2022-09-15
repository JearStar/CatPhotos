package io.javabrains.courseapidata.cat;

import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;


import java.io.IOException;

@RestController
public class CatController {
    @Autowired
    CatService catService;

    @RequestMapping("/cataas")
    public String getBasePage() {
        return "this is an API made for getting cat photos! ようこそ！";
    }

    @GetMapping(
            value = "/cataas/dogwater",
            produces = MediaType.IMAGE_JPEG_VALUE
    )
    public @ResponseBody byte[] getDogPhoto() throws IOException {
        return catService.getDogPhoto();
    }

    @GetMapping(
            value = "/cataas/cats",
            produces = MediaType.IMAGE_JPEG_VALUE
    )
    public @ResponseBody byte[] getRandomCat(@RequestParam(value="text", required = false) String text) throws IOException, BadStringException {
        try {
            if (text == null) {
                return catService.getRandomCat();
            }
            return catService.getRandomCatWithText(text);

        } catch (BadStringException e) {
            throw new RuntimeException(e);
        }

    }

}
