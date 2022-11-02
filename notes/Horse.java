package notes;

public class Horse {
    private String horseNoise;
    private Color horseColor;

    public Horse(String initHorseNoise, Color initHorseColor)
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
