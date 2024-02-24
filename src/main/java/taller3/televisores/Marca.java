package televisores;

public class TV {
  Marca marca;
  int canal=1;
  int precio=500;
  boolean estado;
  int volumen=1;
  Control control;
  static int numTV;
  
  public TV(Marca x, boolean y){
    marca=x;
    estado=y;
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
  
  public void setCanal(int x){
    canal=x;
  }
  
  public int getPrecio(){
    return precio; 
  }
  
  public void setPrecio(int y){
    precio=y;
  }
  
  public int getVolumen(){
    return volumen; 
  }
  
  public void setVolumen(int a){
    volumen=a;
  }
  
  public Control getControl(){
    return control; 
  }
  
  public void setControl(Control b){
    control=b;
  }

  public int getNumTV(){
    return numTV;
  }
  
  public void setNumTV(int r){
    numTV=r;
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
     if (canal!=120){
      canal+=1;
    } 
    }
  }
  
  public void canalDown(){
    if (estado==true){
     if (canal!=1){
      canal-=1;
    } 
    }
  }
  
  public void volumenUp(){
    if (estado==true){
     if (volumen!=7){
      volumen+=1;
    } 
    }
  }
  
  public void volumenDown(){
    if (estado==true){
     if (volumen!=0){
      volumen-=1;
    } 
    }
  }
}