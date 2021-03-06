package begyyal.shogi.def.common;

public enum KihuOpt {
    Nari("t", "ζ"),
    Narazu("u", "δΈζ"),
    Utu("v", "ζ");

    public final String key;
    public final String desc;

    private KihuOpt(String key, String desc) {
	this.key = key;
	this.desc = desc;
    }

    public static KihuOpt of(boolean nari) {
	return nari ? KihuOpt.Nari : KihuOpt.Narazu;
    }
}
