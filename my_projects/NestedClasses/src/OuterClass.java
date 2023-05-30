
class OuterClass {
	String outerField = "outerField";
	static String staticOuterField = "staticOuterField";
	
	class InnerClass {
		void accessMembers() {
			System.out.println("outreField: " + outerField);
			System.out.println("staticOuterField: " + staticOuterField);
			
		}
		
	}
	
	static class StaticNestedClass {
		void accessMembers(OuterClass outer) {
		  //System.out.println("outreField: " + outerField); Кладёт меня блаженным матом, но как-то так оно и надо
			System.out.println("outer.outerField: " + outer.outerField);
			System.out.println("staticOuterField: " + staticOuterField);
			
		}
		
	}
	
	public static void main(String[] args) {
		
		System.out.println("Inner Class:");
		OuterClass outer = new OuterClass();
		OuterClass.InnerClass inner = outer.new InnerClass();
		inner.accessMembers();
		
		System.out.println();
		
		System.out.println("StaticNestedClass:");
		OuterClass.StaticNestedClass staticNested = new StaticNestedClass();
		staticNested.accessMembers(outer);
		
		System.out.println();
		
		System.out.println("TopLevelClass:");
		TopLevelClass topLevel = new TopLevelClass();
		topLevel.accessMembers(outer);
		
	}

}
