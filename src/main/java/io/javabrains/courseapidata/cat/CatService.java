package io.javabrains.courseapidata.cat;


import org.springframework.stereotype.Service;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.nio.file.Files;

@Service
public class CatService {
    public byte[] getDogPhoto() throws IOException {
        File fi = new File("./images/dogbowl.jpg");
        return Files.readAllBytes(fi.toPath());
    }

    public byte[] getRandomCat() throws IOException, BadStringException {
        return getImageBytes("https://cataas.com/cat");
    }

    public byte[] getRandomCatWithText(String text) throws IOException, BadStringException {
        return getImageBytes("https://cataas.com/cat/says/" + text);
    }

    public byte[] getImageBytes(String imageUrl) throws IOException {
        URL url = new URL(imageUrl);
        BufferedImage urlImage = ImageIO.read(url);
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ImageIO.write(urlImage, "jpg", baos);
        return baos.toByteArray();
    }
}
