
// Who Are All using this class they should handle the errors created by the calling class(here Division).
// If I Use throws Exception - Called : Checked Exception Error.
// If I Not Use throws Exception - Called : UnChecked Exception Error.

class Division {
    int VP;

    void Div() throws Exception {
        VP = 10 / 0;
    }
}

class ThrowsKeyword {
    public static void main(String[] args) {
        System.out.println("Throws Keyword");
        Division obj1 = new Division();
        try {
            obj1.Div();
        } catch (Exception e) {
            System.out.println("Error : " + e);
        }
    }
}