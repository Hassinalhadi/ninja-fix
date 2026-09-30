package ve;

import java.lang.reflect.Field;
import java.lang.reflect.Member;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class w extends y {
    public final Field alpha;

    public w(Field member) {
        Intrinsics.echo(member, "member");
        this.alpha = member;
    }

    @Override // ve.y
    public final Member bravo() {
        return this.alpha;
    }
}
