package ru.mirea.java.practice21.practice22.factory;

import ru.mirea.java.practice21.practice22.document.IDocument;

public interface ICreateDocument {
    IDocument CreateNew();
    IDocument CreateOpen();
}
