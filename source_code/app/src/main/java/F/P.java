package F;

import a0.C0366t;
import java.util.UUID;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes3.dex */
public final class P extends Lambda implements Function0 {
    public final /* synthetic */ int alpha;
    public static final P purple = new P(0, 0);
    public static final P red = new P(0, 1);
    public static final P silver = new P(0, 2);
    public static final P teal = new P(0, 3);
    public static final P white = new P(0, 4);
    public static final P yellow = new P(0, 5);

    /* renamed from: c, reason: collision with root package name */
    public static final P f1046c = new P(0, 6);

    /* renamed from: d, reason: collision with root package name */
    public static final P f1047d = new P(0, 7);
    public static final P e = new P(0, 8);

    /* renamed from: f, reason: collision with root package name */
    public static final P f1048f = new P(0, 9);

    /* renamed from: g, reason: collision with root package name */
    public static final P f1049g = new P(0, 10);

    /* renamed from: h, reason: collision with root package name */
    public static final P f1050h = new P(0, 11);

    /* renamed from: i, reason: collision with root package name */
    public static final P f1051i = new P(0, 12);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P(float f5) {
        super(0);
        this.alpha = 13;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.alpha) {
            case 0:
                return Q.echo(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, -1);
            case 1:
                return Boolean.TRUE;
            case 2:
                return new C0366t(C0366t.bravo);
            case 3:
                return Boolean.TRUE;
            case 4:
                return new Q0.g(48);
            case 5:
                return Boolean.FALSE;
            case 6:
                return UUID.randomUUID();
            case 7:
                return new J1();
            case 8:
                return Boolean.FALSE;
            case 9:
                return new Y1(X1.alpha, X1.bravo, X1.charlie, X1.delta, X1.echo);
            case 10:
                return new Q0.g(0);
            case 11:
                return H.ab.alpha;
            case 12:
                return new S2(H.aa.delta, H.aa.echo, H.aa.foxtrot, H.aa.golf, H.aa.hotel, H.aa.india, H.aa.mike, H.aa.november, H.aa.oscar, H.aa.alpha, H.aa.bravo, H.aa.charlie, H.aa.juliet, H.aa.kilo, H.aa.lima);
            case 13:
                return Unit.INSTANCE;
            case 14:
                float f5 = 0.0f;
                if (0.0f > 0.01f) {
                    f5 = 1.0f;
                }
                return Float.valueOf(f5);
            default:
                return new R2(-3.4028235E38f, 0.0f, 0.0f);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ P(int i4, int i5) {
        super(i4);
        this.alpha = i5;
    }
}
