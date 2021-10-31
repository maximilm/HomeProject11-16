package ru.mirea.java.practice21.practice22.document;

public class TextDocument implements IDocument {
    @Override
    public void open() {
        System.out.println("Открыт файл типа Text");
    }

    @Override
    public void save() {
        System.out.println("Сохранен файл типа Text");
    }

    @Override
    public void exit() {
        System.out.println("Закрыт файл типа Text");
    }

    @Override
    public void newDocument() {
        System.out.println("Создан файл типа Text");
    }
}
