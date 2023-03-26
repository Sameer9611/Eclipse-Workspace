
public class Test {
	public static void main(String[] args) {
		ClientData user1 = new ClientData();//parent object// gets access of>> name,city,mob no>>values of parent
		Clientdata2 user2 = new Clientdata2();//child object// gets access of>> name,city,mob no,pan card>> values of parent
		//Clientdata2 user3 = new ClientData();	(not allowed,error)
		ClientData user4 = new Clientdata2();
	}

}
/* 1)final class cannot be extended
   2)we cannot assign parent class 0bject to the child class reference.(line 6 not pssible)
     ClientData user1 = new ClientData();
     left side(reference)=(object)right side
   3) but vice versa can be done(line 7)
   
   note>>>>
   ClientData >>>> parent class
   Clientdata2 >>>> child class
   
   line 7: object of cliendata2(child) is stored in ClientData(parent)
 */
