package ru.mirea.java.practice21.practice22.document;

public class ImageDocument implements IDocument {
    @Override
    public void open() {
        System.out.println("Открыт файл типа Image");
    }

    @Override
    public void save() {
        System.out.println("Сохранен файл типа Image");
    }

    @Override
    public void exit() {
        System.out.println("Закрыт файл типа Image");
    }

    @Override
    public void newDocument() {
        System.out.println("Создан файл типа Image");
    }
}
