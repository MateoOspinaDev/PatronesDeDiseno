public class FactoryPattern {
    public static void main(String[] args) {
        EnemyFactory enemyFactory = new EnemyFactory();
        Enemy easyEnemy = enemyFactory.createEnemy(1);
        easyEnemy.attack();

        Enemy mediumEnemy = enemyFactory.createEnemy(2);
        mediumEnemy.attack();

        Enemy hardEnemy = enemyFactory.createEnemy(3);
        hardEnemy.attack();

    }
}
