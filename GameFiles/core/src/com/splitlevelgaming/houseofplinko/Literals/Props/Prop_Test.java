package com.splitlevelgaming.houseofplinko;

import com.badlogic.gdx.graphics.Texture;

public class Prop_Test extends Prop{
  Prop_Test(Stage stage, double x, double y, ToolBox toolBox){
    super(stage, x, y, 3, 3, "img_badlogic", toolBox);
  }

  @Override
  protected void update(){

  }

  @Override
  protected void checkCollisions(){

  }

  @Override
  protected void updateSprite(){

  }

  @Override
  protected void render(){
    drawMeReversed();
  }

}
