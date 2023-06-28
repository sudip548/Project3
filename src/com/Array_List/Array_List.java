package com.Array_List;

public class Array_List {
    private Object[]a= new Object[5];
    private int p=0;
    public void add(Object e){
        if(p>=a.length)increase();
        a[p++]=e;
    }


    public void  add(int index,Object e){
        if(index<=-1||index>=size()){
            throw new IndexOutOfBoundsException();
        }
        if(p>=a.length)increase();
        for(int i=size()-1; i>=index;i--){
            a[i+1]=a[i];
        }
         a[index]=e;
        p++;
    }

    private  void increase(){
        Object []temp= new Object[a.length+3];
        for(int i=0;i<a.length;i++){
            temp[i]=a[i];
        }
        a=temp;
    }


    public int size(){
        return p;
    }
    public Object get(int index){
        if(index<=-1 || index>=size()){
            throw new IndexOutOfBoundsException();
        }
        return a[index];
    }


    public void remove(int index){
        if(index<=-1 || index>=size()){
            throw  new IndexOutOfBoundsException();
        }
        for(int i=index+1;i<size();i++){
            a[i-1]=a[i];
        }
        a[--p]=null;
    }


    public void clear(){
        a= new Object[5];
        p=0;
    }
}
