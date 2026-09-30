package jd;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.r;

/* loaded from: classes2.dex */
public final class j implements sd.f {
    public static final j alpha = new Object();

    @Override // sd.f
    public final boolean tango(sd.e contentType) {
        Intrinsics.echo(contentType, "contentType");
        if (!contentType.zulu(sd.b.alpha)) {
            if (!((List) contentType.red).isEmpty()) {
                contentType = new sd.e(contentType.silver, contentType.teal);
            }
            String contentType2 = contentType.toString();
            Intrinsics.echo(contentType2, "contentType");
            if (!StringsKt.olive(contentType2, "application/", true) || !r.golf(contentType2, "+json", true)) {
                return false;
            }
        }
        return true;
    }
}
