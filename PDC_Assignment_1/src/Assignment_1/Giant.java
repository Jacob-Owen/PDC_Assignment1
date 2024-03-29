/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Assignment_1;

/**
 *
 * @author Jacob
 * Student Id: 20125914
 */
public class Giant extends Enemy
{
    public Giant()
    {
        super.setName("Giant"); //Sets the name
        super.setHp(super.getHp()+10); //Incresses the base HP
        super.setDef(super.getDef() - 1); //Incresses the base Defence
        super.setExpGain(super.getExpGain()+10); //Incresses the EXP gained 
    }

    @Override
    public void magicCry()
    {
        System.out.println("BOOM!\n"); //The Cry when Magic is used
    }
    
    @Override
    public void battleCry()
    {
        System.out.println("WHAM!\n"); //The Cry when Attack is used
    }
}
