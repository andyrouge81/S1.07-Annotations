package level2.exercise1.model;


import level2.exercise1.annotation.AddingPath;


@AddingPath(directoryPath = "src/main/java/level2/exercise1/resources/JsonSerializableFile.json")
public class Dog {

	private String name;
	private String talk;
	private int age;

	public Dog(String name, String talk, int age){
		this.name = name;
		this.talk = talk;
		this.age = age;

	}

	public String getName() {
		return name;
	}

	public String getTalk() {
		return talk;
	}

	public int getAge() {
		return age;
	}


	@Override
	public String toString() {
		return String.format("Name : %s - Age: %d - Talk!: %s \n",getName(),getAge(),getTalk());
	}
}
