package begyyal.shogi.def.common;

import java.util.Arrays;

import begyyal.commons.util.function.XStrings;

public enum Player {

    Sente("x", "εζ"),
    Gote("y", "εΎζ");

    public final String key;
    public final String desc;

    private Player(String key, String desc) {
	this.key = key;
	this.desc = desc;
    }

    public static Player of(String id) {
	return Arrays.stream(Player.values())
	    .filter(p -> XStrings.equals(id, p.key))
	    .findFirst()
	    .orElse(null);
    }
}
