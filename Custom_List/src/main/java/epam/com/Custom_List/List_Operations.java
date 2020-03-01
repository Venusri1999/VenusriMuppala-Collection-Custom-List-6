package epam.com.Custom_List;

import java.util.Arrays;

public class List_Operations<E> {
	 private int size=0;//initial size of list
     @SuppressWarnings("unused")
	private static final int initial_capacity=10;//default size 10
  
     private Object[] list;
     @SuppressWarnings("unused")
     
     public List_Operations() {
  	   list=new Object[initial_capacity];
  	   
  	  
     }
     
     public void add(E value) {
  	   if(size==list.length) {
  		   ensurecapacity();
  	   }
  	   list[size++]=value;
     }
     
     private void ensurecapacity() {
		int newsize=list.length*2;
		list=Arrays.copyOf(list, newsize);// TODO Auto-generated method stub
		
	}

	@SuppressWarnings("unchecked")
	public E get(int index) {
  	   if(index>=size ||index<0) {
  		  throw new IndexOutOfBoundsException("Index error");
  		  
  	   }
  	   return (E) list[index];
     }
	
 public int size() {
	   return size;
 }
 
 @SuppressWarnings("unchecked")
public E remove(int index) {
	   if(index>=size ||index<0) {
		  throw new IndexOutOfBoundsException("Index error");
		  
	   }
	   Object item=list[index];
	   int num=list.length-(index+1);
	   System.arraycopy(list, index+1, list, index, num);
	   size--;
	   return (E) item;
	   
	   
 }
 
 public String toString() 
 {
      StringBuilder sb = new StringBuilder();
      sb.append('[');
      for(int i = 0; i < size ;i++) {
          sb.append(list[i].toString());
          if(i<size-1){
              sb.append(",");
          }
      }
      sb.append(']');
      return sb.toString();
 }

}
