package level2.exercise1L2.model;


import com.fasterxml.jackson.databind.ObjectMapper;
import level2.exercise1L2.annotation.AddingPath;


import java.io.File;
import java.io.IOException;
import java.util.List;

@AddingPath(directoryPath = "src/main/java/level2/exercise1L2/resources/JsonSerializableFile.json")
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

	public static void saveJson(List<Dog> dogs){
		ObjectMapper mapper = new ObjectMapper();

		if(Dog.class.isAnnotationPresent(AddingPath.class)){
			AddingPath annotation = Dog.class.getAnnotation(AddingPath.class);
			String path = annotation.directoryPath();


			try {

				mapper.writeValue(new File(path), dogs);
				System.out.println("Filed has created at: "+path);

			} catch (IOException e) {
				throw new RuntimeException("Error writing Json file."+e.getMessage());
			}
		}

	}

	@Override
	public String toString() {
		return String.format("Name : %s - Age: %d - Talk!: %s \n",getName(),getAge(),getTalk());
	}
}
