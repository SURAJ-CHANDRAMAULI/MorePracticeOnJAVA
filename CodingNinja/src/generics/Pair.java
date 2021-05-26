package generics;

public class Pair<T,S>{
private T first;
private S second;

  public Pair(T first,S second) {
	  this.first=first;
	  this.second = second;
  }
    T getfirst() {
    	return first;
    }
    void setfirst(T first) {
    	this.first=first;
    }
    S getsecond() {
    	return second;
    }
    void setsecond(S second) {
    	this.second=second;
    }

}
