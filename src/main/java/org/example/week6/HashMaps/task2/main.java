package src.main.java.org.example.week6.HashMaps.task2;

public class main {
   public static void main(String[] args) {
       PromissoryNote mattisNote = new PromissoryNote();
       mattisNote.setLoan("Arto", 51.5);
       mattisNote.setLoan("Mikael", 30);

       System.out.println(mattisNote.howMuchIsDebt("Arto"));
       System.out.println(mattisNote.howMuchIsDebt("Joel"));
   }
}
