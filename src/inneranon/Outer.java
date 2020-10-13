package inneranon;

 public class Outer{
	
	int age= 21;
	
	
	public class Inner {
		 int height = 183;
		 int var1;
		int var2;
	
		
	
		public int getHeight() {
			return this.height;
		}
		
		public int addNumbers(int var1, int var2) {
		
			return var1+var2;
		}
		
		public int multiplyNumbers(int var1, int var2) {
			return var1*var2;
		}

	
	}


public class InnerAnon {

	public void main(String[] arg) {
		
		Outer outer = new Outer();
		Outer.Inner inner = outer.new Inner();
		
		System.out.println("Age: " + outer.age + " " + "Height: " + inner.height);
		
		//using addNumbers method
		System.out.println(inner.addNumbers(1,1));
		
		//using multiplyNumbers method
		System.out.println(inner.multiplyNumbers(2,5));
		
		
		
		//anonymous class
		AbstractClass myImplementation = new AbstractClass() {
			@Override
			void myAbstractMethod() {
				System.out.println("This is inside of an anonymous class");
			}
		};
		myImplementation.myAbstractMethod();
		
		
		

	
	}
	}
 }



