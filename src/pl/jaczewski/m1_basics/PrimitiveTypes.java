package pl.jaczewski.m1_basics;

public class PrimitiveTypes {
    public static void main(String[] args) {

        int minIntValue = Integer.MIN_VALUE;
        int maxIntValue = Integer.MAX_VALUE;
        System.out.println("Minimalny int to " + minIntValue);
        System.out.println("Maksymalny int to " + maxIntValue);

        //przydatny sposób zapisywania dużych intów - użycie podkreślnika
        int bigInt = 1_256_342_331;

        byte minByteValue = Byte.MIN_VALUE;
        byte maxByteValue = Byte.MAX_VALUE;
        System.out.println("Max byte to " + minByteValue);
        System.out.println("Min byte to " + maxByteValue);

        short minShortValue = Short.MIN_VALUE;
        short maxShortValue = Short.MAX_VALUE;
        System.out.println("Max short to " + minShortValue);
        System.out.println("Max short to " + maxShortValue);

        long minLongValue = Long.MIN_VALUE;
        long maxLongValue = Long.MAX_VALUE;
        System.out.println("Max long to " + minLongValue);
        System.out.println("Max long to " + maxLongValue);

        //typy proste (int, byte, short, long) są w pętli (!), tzn. jeśli dodamy do max wartości +1, to przeskoczymy na początek pętli (do wartości min)

        //casting
        byte newByteValue = (byte) (minByteValue / 2);

        byte newByte = 20;
        short newShort = 1083;
        int newInt = 56234;
        long newLong = 50000 + 10 * (newByte + newShort + newInt);
        System.out.println("Najnowszy long to " + newLong);

        float minFloatValue = Float.MIN_VALUE;
        float maxFloatValue = Float.MAX_VALUE;
        System.out.println("Minimalny float to " + minFloatValue);
        System.out.println("Maksymalny float to " + maxFloatValue);

        double minDoubleValue = Double.MIN_VALUE;
        double maxDoubleValue = Double.MAX_VALUE;
        System.out.println("Minimalny double to " + minDoubleValue);
        System.out.println("Maksymalny double to " + maxDoubleValue);

        //zapis
        int myIntValue = 5;
        float myFloatValue = (float) 5.25;
        //albo zapis = 5.25f;
        double myDoubleValue = 5.25;
        //typ double jest domyślny dla liczb zmiennoprzecinkowych

        int lastIntValue = 5 / 3;
        float lastFloatValue = 5f / 3f;
        double lastDoubleValue = 5d / 3d;
        System.out.println("Wynik dzielenia inta to: " + lastIntValue);
        System.out.println("Wynik dzielenia floata to: " + lastFloatValue);
        System.out.println("Wynik dzielenia double'a to: " + lastDoubleValue);

        //przeliczanie funtów na kilogramy
        double poundWeight = 12.7;
        final double KILO_TO_POUND = 0.45359237;
        double kiloWeight = poundWeight * KILO_TO_POUND;
        System.out.println(poundWeight + " pounds equals to " + kiloWeight + " kilograms");
    }
}
