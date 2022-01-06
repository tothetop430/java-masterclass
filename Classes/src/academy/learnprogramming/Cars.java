package academy.learnprogramming;

import java.util.Locale;

public class Cars {

    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String color;

    public void setModel(String model) {
        String lowerCaseModel = model.toLowerCase();
        if (lowerCaseModel.equals("carrera") || lowerCaseModel.equals("ferrari")) {
            this.model = model;
        }
        else {
            this.model = "Unknown";
        }
    }

    public String getModel() {
        return model;
    }

}
