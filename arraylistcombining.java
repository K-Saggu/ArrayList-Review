import java.util.*;
public class arraylistcombining{
	public static void main(String[]args){
		//1.
		ArrayList<Integer> list = new ArrayList<Integer>();
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		int rand1 = (int)(Math.random()*10)+1;
		int rand2 = (int)(Math.random()*10)+1;
		for(int i = 0; i < 10; i++){
			rand1 = (int)(Math.random()*10)+1;
			rand2 = (int)(Math.random()*10)+1;
			list.add(rand1);
			list1.add(rand2);
		}
		System.out.println(list+"\n\n");
		System.out.println(list1+"\n\n\n");
		System.out.println(combineLists(list, list1));

		//2.
		System.out.println("\n\n"+list);
		commaList(list);

	}

	public static ArrayList<Integer> combineLists(ArrayList<Integer> list, ArrayList<Integer> list1){
		for(int i = 0; i < list.size(); i++)
			list1.add(list.get(i));

		return list1;
	}

	public static ArrayList<Integer> commaList(ArrayList<Integer> list){
		for(int i = 0; i < list.size(); i++){
			if(i == list.size())
				break;
			System.out.print(list.get(i)+", ");
		}

		return list;
	}


}