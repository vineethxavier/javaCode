import java.util.*;
public class Arraylist{
	public static void main(String[] args) {
		ArrayList al= new ArrayList();
		System.out.println("before inserting size = "+al.size());
		al.add("vineeth-0");
		System.out.println("after inserting vineeth, size =" + al.size());
		al.add("xavier-1");
		System.out.println("after inserting xavier, size =" + al.size());
		al.add("helloo-2");
		System.out.println("after inserting hello, size =" + al.size());
		System.out.println("element at position 1 = " + al.get(1));
		System.out.println("removing element at position 1");
		al.remove(1);
		System.out.println("after al.remove(1) size = " + al.size());
		System.out.println("now element at position 1 (al.get(1))= " + al.get(1));
		System.out.println("after removing xavier, size =" + al.size());
		al.clear();
		System.out.println("size after al.clear() = " + al.size());

		System.out.println("\n--- adding alphabets ABCDE---\n");
		al.add("a");
		al.add("b");
		al.add("c");
		al.add("d");
		al.add("e");
		System.out.println("after inserting a,b,c,d,e size =" + al.size());
		System.out.println("c position is 2\n now inserting C after c at position 4 \n");
		al.add(3, "C");
		System.out.println("after inserting a,b,c,C,d,e size =" + al.size());
		System.out.println("\n --arraylist elements--\n");
		for(int x: ArrayList() al){
			System.out.println(x);
		}


	}
}