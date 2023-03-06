package com.company;

public interface AbstractFile {
    public void killVirus();
    public void add(AbstractFile f);
    public void remove(AbstractFile f);
    public AbstractFile getChild(int i);
}
