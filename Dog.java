public class Dog {
	private String DogName;
	private	String DogBreed;
	private int DogAge;
	
	private void init (String name, String breed, int age){
		DogName = name;
		DogBreed = breed;
		DogAge = age;
	}
  
	public void getName() {
		System.out.println("The dogs name is" + DogName);
	}
  
	public void getBreed() {
		System.out.println("The dogs breed is" + DogBreed);
	}
  
	public int getAge() {
		return DogAge;
	}
  
	public void bark() {
		System.out.println("BARRRRK!");
	}
}
