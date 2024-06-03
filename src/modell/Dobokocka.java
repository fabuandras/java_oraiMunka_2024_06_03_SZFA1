package modell;

public class Dobokocka {
    private int oldal;
    private int ertek;
    private Szinek szin;
    private Anyagok anyag;
    
    public void DoboKocka(){
            
    }
        
    public void DoboKocka(int oldal){
            
    }
        
    public void DoboKocka(int oldal, int ertek){
            
    }
    
    public void DoboKocka(int oldal, int ertek, Szinek szin){
        
    }
       
    public void DoboKocka(int oldal, int ertek, Szinek szin, Anyagok anyag){
            
    }
    
    public void dobas(){
        ertek = (int)(Math.random() * oldal) + 1;
    }
    
    public String felsoLapKepe(){
        switch (this.ertek) {
            case 1:
                return  "+-----+\n" +
                        "|     |\n" +
                        "|  *  |\n" +
                        "|     |\n" +
                        "+-----+";
            case 2:
                return  "+-----+\n" +
                        "|*    |\n" +
                        "|     |\n" +
                        "|    *|\n" +
                        "+-----+";
            case 3:
                return  "+-----+\n" +
                        "|*    |\n" +
                        "|  *  |\n" +
                        "|    *|\n" +
                        "+-----+";
            case 4:
                return  "+-----+\n" +
                        "|*   *|\n" +
                        "|     |\n" +
                        "|*   *|\n" +
                        "+-----+";
            case 5:
                return  "+-----+\n" +
                        "|*   *|\n" +
                        "|  *  |\n" +
                        "|*   *|\n" +
                        "+-----+";
            case 6:
                return  "+-----+\n" +
                        "|*   *|\n" +
                        "|*   *|\n" +
                        "|*   *|\n" +
                        "+-----+";
            default:
                return "Érvénytelen érték";
        }
    }
    
    public int getOldal(){
        return this.oldal;
    }
    
    public int getErtek(){
        return this.ertek;
    }
    
    public Szinek getSzin(){
         return this.szin;
    }
    
    public Anyagok getAnyag(){
        return this.anyag;
    }
    
    @Override
    public String toString(){
        return "Dobokocka [oldal=" + oldal + ", ertek=" + ertek + ", szin=" + szin + ", anyag=" + anyag + "]";
    }
}