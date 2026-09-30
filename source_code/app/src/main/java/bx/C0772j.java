package bx;

import bz.AbstractC0779d;
import kotlin.jvm.internal.Lambda;

/* renamed from: bx.j, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0772j extends Lambda implements Xd.l {
    public static final C0772j purple = new C0772j(2, 0);
    public static final C0772j red = new C0772j(2, 1);
    public final /* synthetic */ int alpha;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0772j(int i4, int i5) {
        super(i4);
        this.alpha = i5;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        boolean z2;
        switch (this.alpha) {
            case 0:
                long j5 = ((Q0.m) obj).alpha;
                long j6 = ((Q0.m) obj2).alpha;
                long j7 = 1;
                return AbstractC0779d.juliet(400.0f, new Q0.m((j7 & 4294967295L) | (j7 << 32)), 1);
            default:
                ai aiVar = (ai) obj2;
                if (((ai) obj) == aiVar && aiVar == ai.red) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                return Boolean.valueOf(z2);
        }
    }
}
