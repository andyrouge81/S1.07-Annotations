package level2.exercise1.management;

import com.fasterxml.jackson.databind.ObjectMapper;
import level2.exercise1.annotation.AddingPath;
import level2.exercise1.model.Dog;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class JsonManagement {

	public static void saveJson(List<Dog> dogs){

		ObjectMapper mapper = new ObjectMapper();


		if(Dog.class.isAnnotationPresent(AddingPath.class)){

			AddingPath annotation = Dog.class.getAnnotation(AddingPath.class);
			String outPutPath = annotation.directoryPath();



			try {
				mapper.writerWithDefaultPrettyPrinter().writeValue(new File(outPutPath), dogs);

				System.out.println("Filed has been created at: "+ outPutPath);

			} catch (IOException e) {

				throw new RuntimeException("Error writing Json file."+e.getMessage());
			}
		}

	}
}
