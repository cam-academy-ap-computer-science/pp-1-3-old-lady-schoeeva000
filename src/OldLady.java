
public class OldLady {

	public static void main(String[] args) {
		fly();
		idkWhy();
		thereWas();
		System.out.println("spider,\nThat wriggled and iggled and jiggled inside her.");
		spider();
		thereWas();
		System.out.println("bird,\nHow absurd to swallow a bird.");
		bird();
		thereWas();
		System.out.println("cat,\nImagine that to swallow a cat.");
		cat();
		thereWas();
		System.out.println("dog,\nWhat a hog to swallow a dog.");
		dog();
		thereWas();
		System.out.println("horse,\nShe died of course.");
		

	}
	
	public static void thereWas() {
		System.out.print("There was an old lady who swallowed a ");
	}
	public static void idkWhy() {
		System.out.println("I don't know why she swallowed that fly,");
		System.out.println("Perhaps she'll die.");
		System.out.println();
	}
	
	public static void fly() {
		System.out.println("There was an old lady who swallowed a fly.");
	}
	
	public static void spider() {
		System.out.println("She swallowed the spider to catch the fly,");
		idkWhy();
	}
	
	public static void bird() {
		System.out.println("She swallowed the bird to catch the spider,");
		spider();
	}

	public static void cat() {
		System.out.println("She swallowed the cat to catch the bird,");
		bird();
	}
	
	public static void dog() {
		System.out.println("She swallowed the dog to catch the cat,");
		cat();
	}

}
