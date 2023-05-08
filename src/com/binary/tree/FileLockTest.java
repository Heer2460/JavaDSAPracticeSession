package com.binary.tree;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.OverlappingFileLockException;


public class FileLockTest {
    public static void main(String[] args) {
        try {
          //  String fileName = "C:\\Users\\admin\\Desktop\\abc.pdf";
            // Get a file channel for the file
            File file = new File("C:\\Users\\admin\\Desktop\\lock.txt");
            FileChannel channel = null;
            FileLock lock = null;
            if (file.exists()){
                Boolean read= file.setReadOnly();
                if (read){
                    System.out.println("file success");
                }
            }
            try {
                channel = new RandomAccessFile(file, "rw").getChannel();
            } catch (FileNotFoundException ex) {
                throw new RuntimeException(ex);
            }

            // Use the file channel to create a lock on the file.
            // This method blocks until it can retrieve the lock.

            try {
                lock = channel.lock();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }

        /*
           use channel.lock OR channel.tryLock();
        */

            // Try acquiring the lock without blocking. This method returns
            // null or throws an exception if the file is already locked.
            try {
                lock = channel.tryLock();
            } catch (OverlappingFileLockException | IOException e) {
                // File is already locked in this thread or virtual machine
            }

            // Release the lock - if it is not null!
//            if (lock != null) {
//                try {
//                    lock.release();
//                } catch (IOException ex) {
//                    throw new RuntimeException(ex);
//                }
//            }

            // Close the file
            try {
                channel.close();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        } catch (RuntimeException e) {
            throw new RuntimeException(e);
        }
    }
    }

