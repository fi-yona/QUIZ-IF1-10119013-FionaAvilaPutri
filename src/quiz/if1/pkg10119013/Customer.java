/*
 * NAMA  : Fiona Avila Putri
 * NIM   : 10119013
 * KELAS : IF1 2019/2020 (PBO1)
 */



package quiz.if1.pkg10119013;

/**
 *
 * @author Fiona Avila
 */

public class Customer extends ServicePrice{
    
    private String name;
    private String email;
    private boolean member;
    
    public String getName(){
        return name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public String getEmail(){
        return email;
    }
    
    public boolean isiMember(){
        return member;
    }
    
    public void setMember(boolean member){
        this.member = member;
    }
    
    public String currentTime(){
        return (java.util.Date date = new java.util.Date());
    }
}
