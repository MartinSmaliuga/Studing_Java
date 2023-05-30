import java.lang.annotation.Repeatable;

public class RepeatableAnnotations {
	public @interface ChangesHistoryContainer {
		ChangesHistory[] value();
	}
	
	public @Repeatable(ChangesHistoryContainer.class)
	@interface ChangesHistory {
		String author() default "unknown";
		String date() default "unassigned";
		String description() default "no description";
		
	}
}
