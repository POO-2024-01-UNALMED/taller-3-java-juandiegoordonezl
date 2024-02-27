package taller3.televisores;
public class Control {
	 private TV tv;
	  
	  public void turnOn(){
	     tv.estado=true; 
	    }
	  
	  public void turnOff(){
	    if (tv.estado!=false){
	      tv.estado=false;
	    }
	  }
	  
	  public void canalUp(){
		  tv.canalUp();
	  }
	  
	  public void canalDown(){
		  tv.canalDown();
	  }
	  
	  public void volumenUp(){
	    tv.volumenUp();
	  }
	  
	  public void volumenDown(){
		  tv.volumenDown();
	  }
	  
	  public void enlazar(TV u){
	    tv=u;
	    tv.control=this;
	  }
	  
	  public TV getTv(){
	    return tv;
	    
	  }
	  
	  public void setTv(TV d){
	    tv=d;
	    
	  }
	  
	  public void setVolumen(int a) {
			tv.setVolumen(a);  
	  }
	  
	  public void setCanal(int x){
		    tv.setCanal(x);
		  }
}