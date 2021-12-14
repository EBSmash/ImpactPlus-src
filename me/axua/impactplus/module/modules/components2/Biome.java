package me.axua.impactplus.module.modules.components2;

import java.util.ArrayList;
import me.axua.impactplus.ImpactPlus;
import me.axua.impactplus.gui.settings.Setting;
import me.axua.impactplus.module.Module;

public class Biome extends Module {
  public Setting red;
  
  public Setting green;
  
  public Setting blue;
  
  public Setting rainbow;
  
  public Setting customFont;
  
  public Setting numbercolour;
  
  public Setting right;
  
  public Biome() {
    super("Biome", Module.Category.COMPONENTS2);
    setDrawn(false);
  }
  
  public void setup() {
    ArrayList<String> numbercolours = new ArrayList<>();
    numbercolours.add("None");
    numbercolours.add("White");
    numbercolours.add("Black");
    numbercolours.add("Gray");
    numbercolours.add("Dark Gray");
    numbercolours.add("Aqua");
    numbercolours.add("Dark Aqua");
    numbercolours.add("Blue");
    numbercolours.add("Dark Blue");
    numbercolours.add("Green");
    numbercolours.add("Dark Green");
    numbercolours.add("Light Purple");
    numbercolours.add("Dark Purple");
    numbercolours.add("Red");
    numbercolours.add("Dark Red");
    numbercolours.add("Yellow");
    numbercolours.add("Gold");
    this.red = new Setting("Red", this, 80.0D, 0.0D, 255.0D, true, "BiomeRed");
    this.green = new Setting("Green", this, 80.0D, 0.0D, 255.0D, true, "BiomeGreen");
    this.blue = new Setting("Blue", this, 255.0D, 0.0D, 255.0D, true, "BiomeBlue");
    (ImpactPlus.getInstance()).settingsManager.rSetting(this.red);
    (ImpactPlus.getInstance()).settingsManager.rSetting(this.green);
    (ImpactPlus.getInstance()).settingsManager.rSetting(this.blue);
    (ImpactPlus.getInstance()).settingsManager.rSetting(this.rainbow = new Setting("Rainbow", this, true, "BiomeRainbow"));
    (ImpactPlus.getInstance()).settingsManager.rSetting(this.customFont = new Setting("Custom Font", this, true, "BiomeCustomFont"));
    (ImpactPlus.getInstance()).settingsManager.rSetting(this.right = new Setting("AlignRight", this, false, "BiomeRight"));
    (ImpactPlus.getInstance()).settingsManager.rSetting(this.numbercolour = new Setting("Number Colour", this, "White", numbercolours, "BiomeNumberColour"));
  }
  
  public void onEnable() {
    disable();
  }
}
