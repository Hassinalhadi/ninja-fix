package kd;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes2.dex */
public final class ae implements g {
    public final int alpha = 4000;
    public final int purple = 3000;
    public final g red;

    public ae(g gVar) {
        this.red = gVar;
    }

    @Override // kd.g
    public final void log(String message) {
        Intrinsics.echo(message, "message");
        while (true) {
            int length = message.length();
            g gVar = this.red;
            int i4 = this.alpha;
            if (length > i4) {
                String substring = message.substring(0, i4);
                Intrinsics.delta(substring, "substring(...)");
                int ivory = StringsKt.ivory(substring, '\n', 0, 6);
                if (ivory >= this.purple) {
                    substring = substring.substring(0, ivory);
                    Intrinsics.delta(substring, "substring(...)");
                    i4 = ivory + 1;
                }
                gVar.log(substring);
                message = message.substring(i4);
                Intrinsics.delta(message, "substring(...)");
            } else {
                gVar.log(message);
                return;
            }
        }
    }
}
