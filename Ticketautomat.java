/**
 * * В классе билетной машины моделируются простые билетные машины,
  * Выпуск билетов по цене за единицу.
  * Стоимость билета машины может быть выше конструктора
  * определяется.
  * Билетная машина «наивная» в том, что она сообщает своим пользователям
  Достаточно знакомы, что они забирают достаточно денег, прежде чем получить билет
  * распечатать.
  * Кроме того, он предполагает, что в него вносятся значимые суммы.
 *
 * @author David J. Barnes und Michael Kцlling
 * @version 2006.03.30
 */
public class Ticketautomat 
{
    // Цена билета с этой машины.
    private int preis;
    // Сумма, которая была ранее выбрана пользователем машины.
    private int bisherGezahlt;
    //Сумма денег, которая была ранее сделана этой машиной.
    private int gesamtsumme;
    private int wechselgeld;

    /**
     *Создайте машину с билетами по данной цене
      * (в центах).
      * Примечание: цена должна быть больше нуля
      * Машина не проверяет это

     */
    public Ticketautomat(int ticketpreis)
    {
         preis = ticketpreis;
         this.preis=25;
        bisherGezahlt = 0;
        gesamtsumme = 0;
        wechselgeld=0;
    }
   

    /**
     * Доставить цену билета на этот аппарат (в центах)
     */
    public int gibPreis()
    {
        return preis;
    }

    /**
     * Доставить сумму уже оплаченной суммы за следующий билет
      * был удален.
     */
    public int gibBisherGezahltenBetrag()
    {
        return bisherGezahlt;
    }

    /**
     *Возьмите указанную сумму (в центах) в качестве депозита за
      * следующий билет.
     */
    public void geldEinwerfen(int betrag)
    {
        bisherGezahlt = bisherGezahlt + betrag;
        System.out.println(bisherGezahlt);
    }

    /**
     * Распечатайте билет.
      * Обновить общую сумму и установить сумму, уплаченную
      * Сумма равна нулю.
     */
    public void ticketDrucken()
    {
         // Имитировать распечатку билета.
        System.out.println("##################");
        System.out.println("# Die BlueJ-Linie");
        System.out.println("# Ticket");
        System.out.println("# " + preis + " Cent.");
        System.out.println("##################");
        System.out.println();

        //Обновите общую сумму с депонированной суммой
        gesamtsumme = gesamtsumme + bisherGezahlt;
        //Сброс предыдущего платежа.
        bisherGezahlt = 0;
    }
    /**
     * konsol viydet sotvetstvuyushiy summu
     */
    public void meldung(){
       System.out.println("Пожалуйста опустите соответствующую сумму в автомат"); 
    }
    /**
     * konsol viydet bilet skolko stoit
     */
    public void preisAusgeben(){
    System.out.println("Билет стоит " + preis + " сент."); 
    }
    /**
     * vozvrashaet gesamtsumme
     */
    
    public int gibGesamtsumme(){
    return gesamtsumme;
    }
    /**
     * который обнуляет gesamtsumme
     */
    public void leeren(){
        gesamtsumme=0;
        
    }
    public int preisSetzen(int preis){
        return preis; 
    
    }
    /**
     * sdachi dayet
     */
    public int wechselgeldAuszahlen(){
    int wechselgeld;
    wechselgeld = bisherGezahlt;
    bisherGezahlt=0;
    return wechselgeld;
    }
     /**
      * proveryaet summu otrisat ne prinimaet
      */
     public void gelEinwerfen(int betrag){
        if (betrag>0){
        bisherGezahlt= bisherGezahlt+ betrag;
        }
        else {
        System.out.println("Pojaluysta polozhite vvedeniy summu"+ betrag);
        }
    }

}