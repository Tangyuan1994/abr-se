package abr;

import java.util.ArrayList;


public class ABR {
	

	public class Node {  
		 public Integer value =null;  
		 public Node leftchild=null;  
		 public Node rightchild =null;  
		 public Node parent=null;  
		 public int nbelement=0;
		   
		}

	private static  int nbelement ;  
		  	
		  
		 private Node root = null;  
		 
		 
			boolean contains(int value) {
		        return contains(value);
		    }
			
			
			
			  public boolean isEmpty(){  
		          return this.nbelement == 0;  
		      }                      // is the set empty?   
		        
		      public int nbelement(){  
		          return this.nbelement;  
		      }       
		      
		      
		   
		 public void insert(Integer val) {  
		  Node p = new Node();  
		  p.value = val;  
		  
		
		  if (isEmpty()) {  
		   this.root = p;  
		  }   
		  
		  else {  
		   Node q = this.root;  
		   while (true) {  
		  
		    if (val < q.value) {  
		     if (q.leftchild == null) {  
		  
		      q.leftchild = p;  
		      p.parent=q;  
		      break;  
		     }   
		     else {  
		      q = q.leftchild;  
		     }  
		    }  
		    else if (val > q.value) {  
		     if (q.rightchild == null) {  
		  
		     //Ë«ÏòÖ¸Ïò  
		      q.rightchild = p;  
		      p.parent=q;  
		      break;  
		     }  
		     else {  
		      q = q.rightchild;  
		     }  
		  
		    }   
		    else {  
		     System.out.println("already exist");  
		    }  
		   }  
		  }  
		 }  
		 
		 
		 public void toList(java.util.List<java.lang.Integer> l)
		 {
			 ArrayList<int[]> list =new ArrayList<int[]>();
			 for(int i=0;i<nbelement;i++){
				 int[] d = new int[nbelement];
			     d[i]=data[i];
			     list.add(d);
			 }
		 }
		 
		 
}	