import java.util.*;

public class Main {
    public static void main(String[] args){
        Comparator<Ticket> comparator = new Comparator<Ticket>() {
            @Override
            public int compare(Ticket o1, Ticket o2) {
                if (o1.getCost() < o2.getCost()){
                    return 1;
                }
                if (o1.getCost() > o2.getCost()){
                    return -1;
                }
                return 0;
            }
        };

        PriorityQueue<Ticket> tickets = new PriorityQueue<>(comparator);

        tickets.add(new Ticket(20,false));
        tickets.add(new Ticket(50,false));
        tickets.add(new Ticket(15,false));
        tickets.add(new Ticket(18,false));
        tickets.add(new Ticket(65,false));
        tickets.add(new Ticket(25,false));
        tickets.add(new Ticket(30,false));

        PriorityQueue<Ticket> tickets2 = new PriorityQueue<>(comparator);

        tickets2.add(new Ticket(20,true));
        tickets2.add(new Ticket(50,true));
        tickets2.add(new Ticket(15,true));
        tickets2.add(new Ticket(18,true));
        tickets2.add(new Ticket(65,true));
        tickets2.add(new Ticket(25,true));
        tickets2.add(new Ticket(30,true));


        while (!tickets.isEmpty()){
            System.out.println(tickets.poll());
        }

        System.out.println("-----------------------");

        while (!tickets2.isEmpty()){
            System.out.println(tickets2.poll());
        }
    }
}
