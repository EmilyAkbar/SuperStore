import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello. Welcome to Java Market. Have fun shopping—but don't forget to watch for you health! "); 
        Store St = new Store();
        St = Store.printitems(); 
       

    }

  
    }

   

class Player {
    int money; 
    int initialhealth; 

    Player (int money, int initialhealth) {
        money = 100; 
        initialhealth = 1000; 
        
    }
       

}

class Store {
    ArrayList<Item> items = new ArrayList<Item>();
    Store() {
        //items.add(new Item (null, null, 0, 0)); 
        items.add(new Item("Dairy", "Milk", 4, 40)); 
        items.add(new Item("Dairy", "Eggs", 8, 50));
        items.add(new Item("Dairy", "Cheese", 8, 30));
        items.add(new Item("Meat", "Chicken", 9, 50));
        items.add(new Item("Meat", "Beef", 15, 50));
        items.add(new Item("Meat", "Fish", 10, 60));
        items.add(new Item("Fruits", "Strawberry", 6, 70));
        items.add(new Item("Fruits","Banana", 3, 70));
        items.add(new Item("Fruits","Orange", 4, 70));
        items.add(new Item("Fruits", "Mango", 4, 70));
        items.add(new Item("Fruits","Broccoli", 4, 70));
        items.add(new Item("Fruits","Tomato", 4, 70));
        items.add(new Item("Fruits","Cucumber", 3, 70));
        items.add(new Item("Fruits","Spinach", 3, 70));
        items.add(new Item("Grains", "Rice", 4, 30));
        items.add(new Item("Grains","Pasta", 4, 30));
        items.add(new Item("Grains","Bread", 3, 40));
        items.add(new Item("Sugary Foods", "Chocolate Bar", 1, -20));
        items.add(new Item("Sugary Foods","Cake", 10, -20));
        items.add(new Item("Sugary Foods", "Soda", 2, -20));
        items.add(new Item("Sugary Foods","Cookie", 2, -20));
        items.add(new Item("Sugary Foods","Donut", 1, -20));
        items.add(new Item("Sugary Foods","Candy", 1, -20));
        items.add(new Item("Sugary Foods","Snackerty Board", 10, -100));
        items.add(new Item("Frozen Foods", "Frozen Pizza",3, -10));
        items.add(new Item("Frozen Foods","Eggos", 3, -10));
        items.add(new Item("Frozen Foods", "Dino Nuggests", 4, -10));
        items.add(new Item("Frozen Foods", "Frozen Mozza Sticks", 4, -10));

       

    }

    
    void printitems () {
        for (Item items: items) {
            System.out.println(items);
            
        }   
        
        

    }

     




    }



    //store the transactions 
    




    

    //items.get(0); 



