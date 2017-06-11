package unit15;

public class Wildcards {

	// Raw argument:
	static void rawArgs(Holder holder, Object arg) {
		//holder.set(arg);
		//holder.set(new Wildcards());
		Object obj = holder.get();
	}
	
	// Similar to rawArgs(), but errors instead of warnings:
	static void unboundedArg(Holder<?> holder, Object arg) {
	}
	
	
}



















