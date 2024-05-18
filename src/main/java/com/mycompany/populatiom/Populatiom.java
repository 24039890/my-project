/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.populatiom;

import java.util.Scanner;

class Populatiom{
public static void main(String [] args){
    
    Scanner population = new Scanner(System.in);
    
  int num_deaths,num_babiesBorn;
long num_previous_population;  
    
  
  System.out.print(" enter the number of death in the country  per day : " );
   num_deaths = population.nextInt();
   
   
   System.out.print(" enter the number of babies born per day : " );
   num_babiesBorn = population.nextInt();
   
   System.out.print(" enter the previous population : " );
   num_previous_population = population.nextInt();
   
   long new_population;
   
   new_population = num_previous_population*num_babiesBorn/num_deaths;
   
   System.out.println(" the new population is aproximately : " + new_population);
    
    
}    
    
    
}


      
