package notes;

public class Horse {
    private String horseNoise;
    private String horseColor;

    public Horse(String initHorseNoise, String initHorseColor)
    {
        horseNoise = initHorseNoise;
        horseColor = initHorseColor;
    }

    public String getHorseNoise()
    {
        return horseNoise;
    }
    public String getHorseColor()
    {
        return horseColor;
    }
}
