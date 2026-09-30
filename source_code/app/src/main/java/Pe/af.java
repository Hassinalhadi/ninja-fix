package Pe;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class af extends ah {
    public af() {
        super("HTML", 1);
    }

    @Override // Pe.ah
    public final String alpha(String string) {
        Intrinsics.echo(string, "string");
        return kotlin.text.r.oscar(kotlin.text.r.oscar(string, "<", "&lt;"), ">", "&gt;");
    }
}
