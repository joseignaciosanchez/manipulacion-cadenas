
public class StringManipulatorTest {

	public static void main(String[] args) {
		
		StringManipulator manipulator = new StringManipulator();
		System.out.println(manipulator.trimAndConcat("    Hola     ","     Mundo    "));
				
		System.out.println(manipulator.getIndexOrNull("Coding", 'n'));
		System.out.println(manipulator.getIndexOrNull("Hola Mundo", 'n'));
		System.out.println(manipulator.getIndexOrNull("Saludar", 'n'));
		
		System.out.println(manipulator.getIndexOrNull("Hola", "la"));
		System.out.println(manipulator.getIndexOrNull("Hola", "Mundo"));
		
		System.out.println(manipulator.concatSubstring("Hola", 1, 3, "mundo"));
	}

}
