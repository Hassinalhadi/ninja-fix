package me;

import java.util.Set;
import kotlin.LazyKt;
import kotlin.collections.ArraysKt;

/* loaded from: classes2.dex */
public enum j {
    BOOLEAN("Boolean"),
    CHAR("Char"),
    BYTE("Byte"),
    SHORT("Short"),
    INT("Int"),
    FLOAT("Float"),
    LONG("Long"),
    DOUBLE("Double");

    public final Ne.f alpha;
    public final Ne.f purple;
    public final Object red;
    public final Object silver;
    public static final Set teal = ArraysKt.g(new j[]{CHAR, BYTE, SHORT, INT, FLOAT, LONG, DOUBLE});

    j(String str) {
        this.alpha = Ne.f.echo(str);
        this.purple = Ne.f.echo(str.concat("Array"));
        kotlin.i iVar = kotlin.i.alpha;
        this.red = LazyKt.alpha(iVar, new i(this, 1));
        this.silver = LazyKt.alpha(iVar, new i(this, 0));
    }
}
