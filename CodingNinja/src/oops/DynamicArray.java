package oops;
class DA{
  private int data[];
  private int ni;
  
  public DA(){
	  data =new int[5];
	  ni=0;
	  
  }
  public int size() {
	  return ni;
  }
  
  public void add(int element) {
	  if(ni==data.length)
		  restructure();
	  data[ni]=element;
	  ni++;
  }
private void restructure() {
int temp[]=data;
data=new int[2*data.length];
for(int i=0;i<temp.length;i++)
{
	data[i]=temp[i];
}

public void set(int index , int element)
	
}
  
}
public class DynamicArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
