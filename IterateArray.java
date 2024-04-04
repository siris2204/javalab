class IterateArray{
                public static void main(String[] ar){
			int[] arr={1,2,3,4,5,6,7};
			ComArray co=new ComArray();
			for(int l:co.arr3){
				System.out.println(l);
			}

			ComArray.main(null);
			System.out.println("Elements are");
			for(int i=0;i<arr.length;i++){
				System.out.println(arr[i]);
			}
	  }
}