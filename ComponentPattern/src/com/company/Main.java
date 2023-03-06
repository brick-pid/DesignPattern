package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        AbstractFile folder = new Folder();
        File f1 = new File(1);
        File f2 = new File(2);
        File f3 = new File(3);
        Folder folder2 = new Folder();
        folder.add(f1);
        folder.add(f2);
        folder.add(folder2);
        folder2.add(f3);
        folder.killVirus();
    }
}

class File implements AbstractFile{
    private int id;

    public File(int id) {this.id = id;};

    @Override
    public void killVirus() {
        System.out.println("kill virus for " +this.id);
    }

    @Override
    public void add(AbstractFile f) {
        System.out.println("error");
    }

    @Override
    public void remove(AbstractFile f) {
        System.out.println("error");
    }

    @Override
    public AbstractFile getChild(int i) {
        return null;
    }
}

class Folder implements AbstractFile {
    private List<AbstractFile> list = new ArrayList<>();

    @Override
    public void killVirus() {
        for(AbstractFile abstractFile : list) {
            abstractFile.killVirus();
        }
    }

    @Override
    public void add(AbstractFile f) {
        list.add(f);
    }

    @Override
    public void remove(AbstractFile f) {
        list.remove(f);
    }

    @Override
    public AbstractFile getChild(int i) {
        return list.get(i);
    }
}