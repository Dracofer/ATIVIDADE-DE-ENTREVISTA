package application;

public class Program {
	    public static void main(String[] args) {
	        int[] nums = {1,2,3,1,1,3};
	        int quantidadeDePares = pares(nums);
	        
	        System.out.println("Quantidade de pares: " + quantidadeDePares);
	    }

	    public static int pares(int[] nums) {
	        int quantidadeDePares = 0;
	 
	        for (int i = 0; i < nums.length; i++) {
	      
	            for (int j = i + 1; j < nums.length; j++) {
	                if (nums[i] == nums[j]) {
	                    quantidadeDePares++;
	                    System.out.println("Par encontrado: (" + i + ", " + j + ")");
	                }
	            }
	        }
	        
	        return quantidadeDePares;
	    }
	}
