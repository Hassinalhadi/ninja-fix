package kotlin.text;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class g {
    public static final g delta;
    public final boolean alpha;
    public final e bravo;
    public final f charlie;

    static {
        e eVar = e.alpha;
        f fVar = f.bravo;
        delta = new g(false, eVar, fVar);
        new g(true, eVar, fVar);
    }

    public g(boolean z2, e bytes, f number) {
        Intrinsics.echo(bytes, "bytes");
        Intrinsics.echo(number, "number");
        this.alpha = z2;
        this.bravo = bytes;
        this.charlie = number;
    }

    public final String toString() {
        StringBuilder tango = Q0.c.tango("HexFormat(\n    upperCase = ");
        tango.append(this.alpha);
        tango.append(",\n    bytes = BytesHexFormat(\n");
        this.bravo.alpha(tango, "        ");
        tango.append('\n');
        tango.append("    ),");
        tango.append('\n');
        tango.append("    number = NumberHexFormat(");
        tango.append('\n');
        this.charlie.alpha(tango, "        ");
        tango.append('\n');
        tango.append("    )");
        tango.append('\n');
        tango.append(")");
        return tango.toString();
    }
}
