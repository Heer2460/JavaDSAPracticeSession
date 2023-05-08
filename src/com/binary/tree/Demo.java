package com.binary.tree;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.OverlappingFileLockException;
import java.util.concurrent.TimeUnit;

/* * Java Program to lock a file before writing into it. */
public class Demo {
    public static void main(String[] args) throws Exception {
        InputStream inputStream = null;
        RandomAccessFile file = new RandomAccessFile(inputStream.toString(), "rw");
        FileChannel channel = file.getChannel();
        FileLock lock = null;
        try {
            file.writeChars("writing before lock");
            lock = channel.lock();
            if (lock.isValid()){
                System.out.println("File locked Successfully!");
            }
        } catch (final OverlappingFileLockException e) {
            file.close();
            channel.close();
        }
//        file.writeChars("writing after lock");
//        lock.release();
//        file.writeChars("writing after lock");
        file.close();
        channel.close();
    }
}


