public class ClothBrandsRunner{


public static void main(String args[]){
  ClothBrands cloth= new ClothBrands();
  int length = cloth.getArrayLength();
  System.out.println("array length is :"+ length);
  
  cloth.insertArray("puma");
  cloth.insertArray("nike");
  cloth.insertArray("H & M");
  cloth.insertArray("Peter England");
  cloth.insertArray("zara");

  
  cloth.readArray();
  cloth.searchArray("puma");
  

}
}