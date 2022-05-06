public class EnemyFactory {
    public Enemy createEnemy(int levelOfEnemy){
        if(levelOfEnemy==1){
            return new Hunter();
        }else if(levelOfEnemy==2){
            return new Nemesis();
        }else if (levelOfEnemy==3){
            return new Tyrant();
        }else return null;
    }
}
