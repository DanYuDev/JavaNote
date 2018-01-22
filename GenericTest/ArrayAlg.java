public class ArrayAlg{
	public static <T extends Comparable> T min(T[] a){
		T min=a[0];
		for(int i=0;i<a.length;i++){
			if(min.compareTo(a[i])>0)
				min=a[i];
		}
		return min;
	}
}