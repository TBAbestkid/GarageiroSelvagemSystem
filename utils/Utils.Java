package utils;

public class Utils {
    public static <T> Integer validarTipo(T input)
    {
        if(input instanceof String)
        {
            return 0;
        } else if (input instanceof Integer) {
            return 1;
        } else {
            return 2;
        }
    }
}