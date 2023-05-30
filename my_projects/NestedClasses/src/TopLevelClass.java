
class TopLevelClass {
	void accessMembers(OuterClass outer) {
		System.out.println("outer.outreField: " + outer.outerField);
		System.out.println("outer.staticOuterField: " + outer.staticOuterField);
		System.out.println("OuterClass.staticOuterField: " + OuterClass.staticOuterField);
		
	}
	
}
