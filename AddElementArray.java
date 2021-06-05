	float[] f = {10f,20f,30f,40f,50f}; 
		float sum = 0;
		
		for(float element:f) {
			sum = sum + element;
		}
		System.out.println(sum);
		
		for(int i = 0;i<f.length;i++) {
			sum =  (sum + f[i]);
		}
		System.out.println(sum);
