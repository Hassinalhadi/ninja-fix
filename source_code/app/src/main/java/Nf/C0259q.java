package Nf;

import java.lang.ref.SoftReference;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: Nf.q, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0259q extends ClassValue {
    /* JADX WARN: Type inference failed for: r3v1, types: [Nf.as, java.lang.Object] */
    @Override // java.lang.ClassValue
    public final Object computeValue(Class type) {
        Intrinsics.echo(type, "type");
        ?? obj = new Object();
        obj.alpha = new SoftReference(null);
        return obj;
    }
}
