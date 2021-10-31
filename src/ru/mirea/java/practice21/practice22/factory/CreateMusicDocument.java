package ru.mirea.java.practice21.practice22.factory;

import ru.mirea.java.practice21.practice22.document.IDocument;
import ru.mirea.java.practice21.practice22.document.MusicDocument;

public class CreateMusicDocument implements ICreateDocument{
    private MusicDocument music;
    @Override
    public IDocument CreateNew() {
        music =  new MusicDocument();
        return music;
    }

    @Override
    public IDocument CreateOpen() {
        return music;
    }
}
