public class PracticeProblem {

	public static void main(String args[]) {
	}
	
    public static int find(int[] array, int number) {
        for (int i = 0; i < array.length; i++) {
        if (array[i] == number) {
        return i; 
            }
        }
return -1; 
    }
	
    public static int findLast(String[] array, String string) {
        for (int i = array.length - 1; i >= 0; i--) {
            if (array[i].equals(string)) {
                return i; 
            }
        }
        return -1; 
    }

    	public static int findSecond(char[] array, char character) {
	int count = 0;
	for (int i = 0; i < array.length; i++) {
        if (array[i] == character) {
        count++;
        if (count == 2) {
	return i; 
                }
            }
        }
        if (count == 1) {
	return find(array, character); 
        }
return -1; 
    }

    private static int find(char[] array, char character) {
        for (int i = 0; i < array.length; i++) {
        if (array[i] == character) {
        return i; 
            }
        }
return -1; 
    }

    public static void main(String[] args) {
        
        int[] intArray = {1, 2, 3, 4, 2};
        System.out.println(find(intArray, 2)); // Output: 1

        String[] strArray = {"apple", "banana", "cherry", "banana"};
        System.out.println(findLast(strArray, "banana")); // Output: 3

        char[] charArray = {'a', 'b', 'c', 'a', 'd'};
        System.out.println(findSecond(charArray, 'a')); // Output: 3
    }
}
