package Final_Dsa_Prep_For_OA;

import java.util.*;

public class RpgPractice1 {
    public static void main(String[] args){
            //==========  Input Taken  =============
            Scanner scan = new Scanner(System.in);
            int noOfMonsters = scan.nextInt();
            int initialExperience = scan.nextInt();

            int[] powerArray = new int[noOfMonsters];
            int[] bonusArray = new int[noOfMonsters];

            for(int i = 0; i < noOfMonsters; i++)
            {
                powerArray[i] = scan.nextInt();
            }
            for(int i = 0; i< noOfMonsters; i++)
            {
                bonusArray[i] = scan.nextInt();
            }

            List<Monsters> monstersArrayList = new ArrayList<>();
            for(int i = 0; i < noOfMonsters ; i ++)
            {
                monstersArrayList.add(new Monsters(powerArray[i], bonusArray[i]));
            }

            Collections.sort(monstersArrayList, (a, b) -> a.power - b.power);

            int defeatedMonsterCount = 0;

            for(Monsters m: monstersArrayList)
            {
                if(m.power <= initialExperience)
                {
                    initialExperience += m.bonus;
                    defeatedMonsterCount++;
                }
                else{
                    break;
                }
            }
            System.out.println(defeatedMonsterCount);
    }
}

class Monsters{
    int power;
    int bonus;

    Monsters(int power,int bonus){
        this.power = power;
        this.bonus = bonus;
    }
}
