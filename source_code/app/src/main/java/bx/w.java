package bx;

import a0.C0366t;
import b0.AbstractC0713c;
import bz.AbstractC0779d;
import bz.C0790o;
import bz.C0792q;
import bz.g0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes3.dex */
public final class w extends Lambda implements Function1 {
    public final /* synthetic */ int alpha;
    public static final w purple = new w(1, 0);
    public static final w red = new w(1, 1);
    public static final w silver = new w(1, 2);
    public static final w teal = new w(1, 3);
    public static final w white = new w(1, 4);
    public static final w yellow = new w(1, 5);

    /* renamed from: c, reason: collision with root package name */
    public static final w f3430c = new w(1, 6);

    /* renamed from: d, reason: collision with root package name */
    public static final w f3431d = new w(1, 7);
    public static final w e = new w(1, 8);

    /* renamed from: f, reason: collision with root package name */
    public static final w f3432f = new w(1, 9);

    /* renamed from: g, reason: collision with root package name */
    public static final w f3433g = new w(1, 10);

    /* renamed from: h, reason: collision with root package name */
    public static final w f3434h = new w(1, 11);

    /* renamed from: i, reason: collision with root package name */
    public static final w f3435i = new w(1, 12);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w(int i4, int i5) {
        super(i4);
        this.alpha = i5;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.alpha) {
            case 0:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return bool;
            case 1:
                Boolean bool2 = (Boolean) obj;
                bool2.booleanValue();
                return bool2;
            case 2:
                Boolean bool3 = (Boolean) obj;
                bool3.booleanValue();
                return bool3;
            case 3:
                long alpha = C0366t.alpha(((C0366t) obj).alpha, b0.d.xray);
                return new C0792q(C0366t.delta(alpha), C0366t.hotel(alpha), C0366t.golf(alpha), C0366t.echo(alpha));
            case 4:
                return new g0(teal, new C0769g(1, (AbstractC0713c) obj));
            case 5:
                long j5 = ((a0.aw) obj).alpha;
                return new C0790o(a0.aw.bravo(j5), a0.aw.charlie(j5));
            case 6:
                C0790o c0790o = (C0790o) obj;
                return new a0.aw(a0.ao.hotel(c0790o.alpha, c0790o.bravo));
            case 7:
                return AbstractC0779d.juliet(0.0f, null, 7);
            case 8:
                long j6 = ((Q0.m) obj).alpha;
                long j7 = 0;
                return new Q0.m((j7 & 4294967295L) | (j7 << 32));
            case 9:
                ((Number) obj).intValue();
                return 0;
            case 10:
                long j10 = ((Q0.m) obj).alpha;
                long j11 = 0;
                return new Q0.m((j11 & 4294967295L) | (j11 << 32));
            case 11:
                ((Number) obj).intValue();
                return 0;
            default:
                return ar.charlie;
        }
    }
}
