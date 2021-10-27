package com.bilibili.demo01;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Objects;

public class DemoMain {
    public static void main(String[] args) {

        try {
            method("a.text");
            int[] arr = {1,2,3};
            System.out.println(arr[3]);
        } catch (IOException e) {
            /*System.out.println(e.getMessage());*/
            /*System.out.println(e.toString());*/
            System.out.println(e);
            /*System.out.println("异常");*/
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        } finally {
            System.out.println("异常关闭");
        }
        /*System.out.println("后续代码");*/
    }

    private static void method(String files) throws IOException {


        Objects.requireNonNull(files, "对象为空null");
        /*if(files == null){
            throw new NullPointerException("对象为空!");
        }else */if(!files.endsWith(".text")){
            throw new IOException("文件后缀错误");
        }
    }
}
