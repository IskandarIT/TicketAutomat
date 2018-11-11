/**
 * * � ������ �������� ������ ������������ ������� �������� ������,
� * ������ ������� �� ���� �� �������.
� * ��������� ������ ������ ����� ���� ���� ������������
� * ������������.
� * �������� ������ ��������� � ���, ��� ��� �������� ����� �������������
� ���������� �������, ��� ��� �������� ���������� �����, ������ ��� �������� �����
� * �����������.
� * ����� ����, �� ������������, ��� � ���� �������� �������� �����.
 *
 * @author David J. Barnes und Michael K�lling
 * @version 2006.03.30
 */
public class Ticketautomat 
{
    // ���� ������ � ���� ������.
    private int preis;
    // �����, ������� ���� ����� ������� ������������� ������.
    private int bisherGezahlt;
    //����� �����, ������� ���� ����� ������� ���� �������.
    private int gesamtsumme;
    private int budget;

    /**
     *�������� ������ � �������� �� ������ ����
����� * (� ������).
����� * ����������: ���� ������ ���� ������ ����
����� * ������ �� ��������� ���

     */
    public Ticketautomat(int newpreis, int newpreis2, String ruskiy,String kirgiskiy)
    {if(ruskiy=="�������"){
        System.out.print("�� ������� �������");
    } if(kirgiskiy=="����������"){
      System.out.print("�� ������� ���������� ");  
    }
    
         
        budget =1000;
        if(newpreis>budget){
        preis=budget;
        System.out.println("�� ����� ����������� ���� ������"+budget);
        }else{preis= newpreis;} 
        bisherGezahlt = 0;
        gesamtsumme = 0;
        if(preis <=0){
            preis=500;
        System.out.println("�� ����� ������������ ����,������� ����"+preis);;}
        
    }
    public Ticketautomat(){
    preis=600;
    bisherGezahlt=0;
    gesamtsumme=0;
}
   

    /**
     * ��������� ���� ������ �� ���� ������� (� ������)
     */
    public int gibPreis()
    {
        return preis;
    }

    /**
     * ��������� ����� ��� ���������� ����� �� ��������� �����
����� * ��� ������.
     */
    public int gibBisherGezahltenBetrag()
    {
        return bisherGezahlt;
    }

    /**
     *�������� ��������� ����� (� ������) � �������� �������� ��
����� * ��������� �����.
     */
    public void geldEinwerfen(int betrag)
    {
        
        if(betrag<0){
        betrag=0;
    System.out.println("�� ����� ������������ ����� ���");
    }
        bisherGezahlt = bisherGezahlt + betrag;
  
    }

    /**
     * ������������ �����.
����� * �������� ����� ����� � ���������� �����, ����������
����� * ����� ����� ����.
     */
    public void ticketDrucken()
    {if(bisherGezahlt >=preis){
         // ����������� ���������� ������.
        System.out.println("##################");
        System.out.println("# Die BlueJ-Linie");
        System.out.println("# Ticket");
        System.out.println("# " + preis + " Cent.");
        System.out.println("##################");
        System.out.println();

        //�������� ����� ����� � �������������� ������
        gesamtsumme = gesamtsumme + bisherGezahlt;
        //����� ����������� �������.
        bisherGezahlt = 0;}
        else{
        System.out.println("�� ����� �� �����"+(preis-bisherGezahlt)+" cent");}
    }
    /**
     * konsol viydet sotvetstvuyushiy summu
     */
    public void meldung(){
       System.out.println("���������� �������� ��������������� ����� � �������"); 
    }
    /**
     * konsol viydet bilet skolko stoit
     */
    public void preisAusgeben(){
    System.out.println("����� ����� " + preis + " ����."); 
    }
    /**
     * vozvrashaet gesamtsumme
     */
    
    public int gibGesamtsumme(){
    return gesamtsumme;
    }
    /**
     * ������� �������� gesamtsumme
     */
    public void leeren(){
        gesamtsumme=0;
        
    }
    public void preisSetzen(int newPreis){
        if(newPreis>budget){
        preis=budget;
    System.out.println("�� ����� ����������� ���� ������ ������� ���� ������"+budget);
}
   else{preis=newPreis;}
   if(preis<=0){
    preis =500;
    System.out.println("�� ����� ������������ ����,������� ����"+preis);}    
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