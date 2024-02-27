package  televisores;

public class TV {
	  private Marca marca;
	  private int canal=1;
	  private int precio=500;
	  public boolean estado;
	  private int volumen=1;
	  public Control control;
	  private static int numTV;
	  
	  public TV(Marca marca, boolean estado){
	    this.marca=marca;
	    this.estado=estado;
	    numTV+=1;
	  }
	  
	  public Marca getMarca(){
	    return marca;
	  }
	  
	  public void setMarca(Marca z){
	    marca=z; 
	  }
	  
	  public int getCanal(){
	    return canal; 
	  }
	  
	  public void setCanal(int c){
		  if (estado==true) {
			  if (c>=1 && c<=120) {
				  canal=c;  
			  }
		  }
	  }
	  
	  public int getPrecio(){
	    return precio; 
	  }
	  
	  public void setPrecio(int p){
	    precio=p;
	  }
	  
	  public int getVolumen(){
	    return volumen; 
	  }
	  
	  public void setVolumen(int v){
		  if (estado==true) {
			  if (v>=0 && v<=7) {
				  volumen=v;  
			  }
		  }
	  }
	  
	  public Control getControl(){
	    return control; 
	  }
	  
	  public void setControl(Control c){
	    control=c;
	  }

	  static public int getNumTV(){
	    return numTV;
	  }
	  
	  static public void setNumTV(int nu){
	    numTV=nu;
	  }
	  
	  public void turnOn(){
	    if (estado!=true){
	     estado=true; 
	    }
	  }
	  
	  public void turnOff(){
	    if (estado!=false){
	      estado=false;
	    }
	  }
	  
	  public boolean getEstado(){
	    return estado;
	  }
	  
	  public void canalUp(){
	    if (estado==true){
	     if (canal<120){
	      canal+=1;
	    } 
	    }
	  }
	  
	  public void canalDown(){
	    if (estado==true){
	     if (canal>1){
	      canal-=1;
	    } 
	    }
	  }
	  
	  public void volumenUp(){
	    if (estado==true){
	     if (volumen<7){
	      volumen+=1;
	    } 
	    }
	  }
	  
	  public void volumenDown(){
	    if (estado==true){
	     if (volumen>0){
	      volumen-=1;
	    } 
	    }
	 }
    
}