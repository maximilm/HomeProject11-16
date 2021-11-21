package ru.mirea.java.practice27.practice28;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;

public class MyThread extends Thread{
    private int num; // номер файла в images, с которого нужно начинать
    MyThread(int num){
        this.num = num;
    }
    @Override
    public void run(){
        String dstFolder = "src/ru/mirea/java/practice27/practice28/dst";
        String srcFolder = "src/ru/mirea/java/practice27/practice28/images";
        File srcDir = new File(srcFolder);
        File[] files = srcDir.listFiles();
        try
        {
            if (!Files.exists(Paths.get(dstFolder)))
            {
                Files.createDirectories(Paths.get(dstFolder));
            }

            for(int i = num; i < num + 3;i++)
            {
                BufferedImage image = ImageIO.read(files[i]);
                if(image == null) {
                    continue;
                }

                int newWidth = image.getWidth() / 2;
                int newHeight = (int) Math.round(
                        image.getHeight() / (image.getWidth() / (double) newWidth)
                );
                BufferedImage newImage = new BufferedImage(
                        newWidth, newHeight, BufferedImage.TYPE_INT_RGB
                );

                int widthStep = image.getWidth() / newWidth;
                int heightStep = image.getHeight() / newHeight;

                for (int x = 0; x < newWidth; x++)
                {
                    for (int y = 0; y < newHeight; y++) {
                        int rgb = image.getRGB(x * widthStep, y * heightStep);
                        newImage.setRGB(x, y, rgb);
                    }
                }

                File newFile = new File(dstFolder + "/" + files[i].getName());
                ImageIO.write(newImage, "jpg", newFile);
            }

        }
        catch (Exception ex) {
            ex.printStackTrace();
        }

    }
}
