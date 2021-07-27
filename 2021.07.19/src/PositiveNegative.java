
public class PositiveNegative {

	public static void separate(int arr[]) {
		for (int i=0; i<arr.length; i++) {
			if(arr[i]<0) {
				continue;
			}
			else {
				int ip = i, n;
				for (int j=ip+1; j<arr.length; j++) {
					if(arr[j]<0) {
						n = arr[j];
						for (int k=j; k>ip; k--) {
							arr[k] = arr [k-1];
						}
						arr[ip] = n;
						break;
					}
					
				}
			}
		}
	}
	
	public static void printarr(int arr[]) {
		for (int t: arr) {
			System.out.print(t+" ");
		}
	}
	
	public static void main(String[] args) {
		int arr[] = {-3, -5, 4, 9, 8, 20, -51, -4};
		separate(arr);
		printarr(arr);
	}

}
