/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author IantReza
 */
public class Film {
    
    public String filmName;
    public String filmGenre;
    public double filmRating;
    public int filmDuration;

    public void nowPlaying(String Judul,String Genre,double Rating,int Duration){
        System.out.println("Judul Film  : "+Judul);
        System.out.println("Genre Film  : "+Genre);
        System.out.println("Rating Film : "+Rating);
        System.out.println("Duration Film : "+Duration+" menit\n");
    }
    
}
