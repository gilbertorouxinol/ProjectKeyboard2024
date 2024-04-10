package keyboard;

public class MainKeyboard {
    public static void main(String[] args) {

        System.out.println("Write string");
        String str = Keyboard.readString();
        System.out.println("Read:" + str);

        System.out.println("Write byte");
        byte byt = Keyboard.readByte();
        System.out.println("Read:" + byt);

        System.out.println("Write short");
        short sht = Keyboard.readShort();
        System.out.println("Read:" + sht);

        System.out.println("Write int");
        int itg = Keyboard.readInteger();
        System.out.println("Read:" + itg);

        System.out.println("Write long");
        long lng = Keyboard.readLong();
        System.out.println("Read:" + lng);

        System.out.println("Write float");
        float flt = Keyboard.readFloat();
        System.out.println("Read:" + flt);

        System.out.println("Write double");
        double dbl = Keyboard.readDouble();
        System.out.println("Read:" + dbl);

        System.out.println("Write boolean");
        boolean bln = Keyboard.readBoolean();
        System.out.println("Read:" + bln);

        System.out.println("Write char");
        char chr = Keyboard.readChar();
        System.out.println("Read:" + chr);
        System.out.println("Read:" + (short) chr);
    }
}
