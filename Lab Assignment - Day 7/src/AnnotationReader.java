import java.lang.reflect.AnnotatedElement;
import java.lang.annotation.*;

public class AnnotationReader {
	
	static void readAnnotation(AnnotatedElement element) {
		Annotation [] annotations = element.getAnnotations();
		for(Annotation each: annotations) {
			if (each instanceof Author) {
				Author a = (Author) each;
				System.out.println("Author: "+a.name());
			}
			else if (each instanceof Version) {
				Version v = (Version) each;
				System.out.println("Version: "+v.number());
			}
				
		}
	}
	
	public static void main(String[] args) {
		try {
			readAnnotation(AnnotatedClass.class.getMethod("annotatedMethod1"));
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		}
	}

}
