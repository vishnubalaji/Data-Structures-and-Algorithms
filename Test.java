//NotMoreException.java
class NotMoreException extends Exception {
	NotMoreException() {
    	super("No more than 1 object");
	}
}

//Test.java
class Demo {
	static int cnt = 0;
	Demo() throws Exception {
    	if (cnt == 2) {
        	throw new NotMoreException();
    	} else
            cnt++;
	}
}
	//Demo.java
class Test {
	public static void main(String[] args) {
    	try {
        	Demo t1 = new Demo();
        	Demo t2 = new Demo();
        	Demo t3 = new Demo();
    	} catch (Exception ex) {
        	System.out.println(ex);
    	}
	}
}