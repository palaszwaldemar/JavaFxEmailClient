package email.view;

public enum FontSize {
    SMALL,
    MEDIUM,
    BIG;

    public static String getCssPath(FontSize fontSize) {
        return switch (fontSize) {
            case BIG -> "css/fontBig.css";
            case SMALL -> "css/fontSmall.css";
            case MEDIUM -> "css/fontMedium.css";
        };
    }
}
