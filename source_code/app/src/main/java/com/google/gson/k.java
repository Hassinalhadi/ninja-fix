package com.google.gson;

/* loaded from: classes2.dex */
public final class k {
    public static final k delta = new k("", "", false);
    public final String alpha;
    public final String bravo;
    public final boolean charlie;

    static {
        new k("\n", "  ", true);
    }

    public k(String str, String str2, boolean z2) {
        if (str.matches("[\r\n]*")) {
            if (str2.matches("[ \t]*")) {
                this.alpha = str;
                this.bravo = str2;
                this.charlie = z2;
                return;
            }
            throw new IllegalArgumentException("Only combinations of spaces and tabs are allowed in indent.");
        }
        throw new IllegalArgumentException("Only combinations of \\n and \\r are allowed in newline.");
    }
}
