package homework2.task1;

public class ClassExample {
    private char varChar;
    private byte varByte;
    private short varShort;
    private int varInt;
    private long varLong;
    private float varFloat;
    private double varDbl;
    private boolean varBoolean;
    private String varStr;

    public ClassExample() {
        // инициализация для примера
        this.varChar = 'a';
        this.varByte = 0;
        this.varShort = 100;
        this.varInt = 1000;
        this.varLong = 1000000;
        this.varFloat = 100.5f;
        this.varDbl = 100.5;
        this.varBoolean = true;
        this.varStr = "String example";
    }

    public ClassExample(char varChar, byte varByte) {
        this.varChar = varChar;
        this.varByte = varByte;
    }

    public ClassExample(short varShort, int varInt, long varLong) {
        this.varShort = varShort;
        this.varInt = varInt;
        this.varLong = varLong;
    }

    public ClassExample(float varFloat, double varDbl) {
        this.varFloat = varFloat;
        this.varDbl = varDbl;
    }

    public ClassExample(char varChar, byte varByte, short varShort, int varInt, long varLong, float varFloat, double varDbl, boolean varBoolean, String varStr) {
        this.varChar = varChar;
        this.varByte = varByte;
        this.varShort = varShort;
        this.varInt = varInt;
        this.varLong = varLong;
        this.varFloat = varFloat;
        this.varDbl = varDbl;
        this.varBoolean = varBoolean;
        this.varStr = varStr;
    }

    public String getVarStr() {
        return varStr;
    }

    public void setVarStr(String varStr) {
        this.varStr = varStr;
    }

    public char getVarChar() {
        return varChar;
    }

    public void setVarChar(char varChar) {
        this.varChar = varChar;
    }

    public byte getVarByte() {
        return varByte;
    }

    public void setVarByte(byte varByte) {
        this.varByte = varByte;
    }

    public short getVarShort() {
        return varShort;
    }

    public void setVarShort(short varShort) {
        this.varShort = varShort;
    }

    public int getVarInt() {
        return varInt;
    }

    public void setVarInt(int varInt) {
        this.varInt = varInt;
    }

    public long getVarLong() {
        return varLong;
    }

    public void setVarLong(long varLong) {
        this.varLong = varLong;
    }

    public float getVarFloat() {
        return varFloat;
    }

    public void setVarFloat(float varFloat) {
        this.varFloat = varFloat;
    }

    public double getVarDbl() {
        return varDbl;
    }

    public void setVarDbl(double varDbl) {
        this.varDbl = varDbl;
    }

    public boolean isVarBoolean() {
        return varBoolean;
    }

    public void setVarBoolean(boolean varBoolean) {
        this.varBoolean = varBoolean;
    }
}
