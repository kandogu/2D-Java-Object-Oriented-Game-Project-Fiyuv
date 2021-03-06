package org.openjfx.controller.bossSceneControllers.BossBehaviourManager;

import org.openjfx.model.bossEntities.BossMap;
import org.openjfx.model.bossEntities.Boss.Boss;
import org.openjfx.model.commonEntities.Bullet.Bullet;
import org.openjfx.view.gameSceneView.bossSceneView.BossMapView;

public abstract class BossDefaultBehaviour implements BossBehaviourAlgorithm {
    BossMap bossMap;
    double abilityTimer = 0.0;
    private boolean movingDown = true;

    public BossDefaultBehaviour(BossMap bossMap) {
        this.bossMap = bossMap;
    }

    public void moveBoss() {
        Boss boss = bossMap.getBoss();
        double MAX_HEIGHT = BossMap.MAP_HEIGHT; //bossMap.getMAX_HEIGHT();
        if ( movingDown) {
           if ( boss.getLocation().getPositionY() + boss.getHitBoxHeight() >= MAX_HEIGHT)
               movingDown = false;
           else
               boss.moveToDirection( boss.getVelocity(), 0.0, -1.0);
        } else {
            if ( boss.getLocation().getPositionY() <= 0 )
                movingDown = true;
            else
                boss.moveToDirection( boss.getVelocity(), 0.0, 1.0);
        }

    }
    public void shoot ()  {

        if ( Math.random() < bossMap.getBoss().getGunFrequency()) {
            Bullet b = bossMap.getBoss().getFiringBehavior().fireBullet();
            bossMap.addBullet( b);
        }

    }

    public double getAbilityTimer() {
        return abilityTimer;
    }
}
