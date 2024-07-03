public class WaterRunner {
    public static void main(String[] args) {
        Water water = new Water();

        water.waterQuality("Mineral", 8, true);
        water.waterSource("Spring", 1500, true);
        water.waterTemperature("Tap", 5, true);
        water.waterPurity("Aquafina", 95, true);
    }
}
