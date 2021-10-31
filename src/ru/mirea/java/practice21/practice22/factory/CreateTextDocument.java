package ru.mirea.java.practice21.practice22.factory;

import ru.mirea.java.practice21.practice22.document.IDocument;
import ru.mirea.java.practice21.practice22.document.TextDocument;

public class CreateTextDocument implements ICreateDocument{
    private TextDocument text;
    @Override
    public IDocument CreateNew() {
        text = new TextDocument();
        return text;
    }

    @Override
    public IDocument CreateOpen() {
        return text;
    }
}
