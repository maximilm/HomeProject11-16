package ru.mirea.java.practice21.practice22.factory;

import ru.mirea.java.practice21.practice22.document.IDocument;
import ru.mirea.java.practice21.practice22.document.ImageDocument;

public class CreateImageDocument implements ICreateDocument{
    private ImageDocument image;
    @Override
    public IDocument CreateNew() {
        image = new ImageDocument();
        return image;
    }

    @Override
    public IDocument CreateOpen() {
        return image;
    }
}
