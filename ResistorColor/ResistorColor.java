package ResistorColor;

class ResistorColor {
    int colorCode(String color) {
        for(int i = 0; i < colors().length; i ++)
            if (color == colors()[i]) return i;
        return -1;
    }

    private String[] colors() {
        return new String[] {"black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white"};
    }
}