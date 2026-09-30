package F;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* renamed from: F.x, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0172x extends Lambda implements Function1 {
    public final /* synthetic */ int alpha;
    public static final C0172x purple = new C0172x(1, 0);
    public static final C0172x red = new C0172x(1, 1);
    public static final C0172x silver = new C0172x(1, 2);
    public static final C0172x teal = new C0172x(1, 3);
    public static final C0172x white = new C0172x(1, 4);
    public static final C0172x yellow = new C0172x(1, 5);

    /* renamed from: c, reason: collision with root package name */
    public static final C0172x f1250c = new C0172x(1, 6);

    /* renamed from: d, reason: collision with root package name */
    public static final C0172x f1251d = new C0172x(1, 7);
    public static final C0172x e = new C0172x(1, 8);

    /* renamed from: f, reason: collision with root package name */
    public static final C0172x f1252f = new C0172x(1, 9);

    /* renamed from: g, reason: collision with root package name */
    public static final C0172x f1253g = new C0172x(1, 10);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0172x(int i4, int i5) {
        super(i4);
        this.alpha = i5;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.alpha) {
            case 0:
                return Unit.INSTANCE;
            case 1:
                A0.aa.echo((A0.ad) obj, 0);
                return Unit.INSTANCE;
            case 2:
                A0.aa.echo((A0.ad) obj, 1);
                return Unit.INSTANCE;
            case 3:
                A0.aa.foxtrot((A0.ad) obj);
                return Unit.INSTANCE;
            case 4:
                ge.v[] vVarArr = A0.aa.alpha;
                A0.ac acVar = A0.x.whiskey;
                Unit unit = Unit.INSTANCE;
                ((A0.k) ((A0.ad) obj)).hotel(acVar, unit);
                return unit;
            case 5:
                return Unit.INSTANCE;
            case 6:
                bz.al alVar = (bz.al) obj;
                alVar.alpha = 1332;
                alVar.alpha(0, Float.valueOf(0.0f)).bravo = G1.charlie;
                alVar.alpha(666, Float.valueOf(290.0f));
                return Unit.INSTANCE;
            case 7:
                bz.al alVar2 = (bz.al) obj;
                alVar2.alpha = 1332;
                alVar2.alpha(666, Float.valueOf(0.0f)).bravo = G1.charlie;
                alVar2.alpha(alVar2.alpha, Float.valueOf(290.0f));
                return Unit.INSTANCE;
            case 8:
                return Unit.INSTANCE;
            case 9:
                ge.v[] vVarArr2 = A0.aa.alpha;
                A0.ac acVar2 = A0.x.lima;
                ge.v vVar = A0.aa.alpha[5];
                acVar2.alpha((A0.ad) obj, Boolean.TRUE);
                return Unit.INSTANCE;
            default:
                List list = (List) obj;
                return new R2(((Number) list.get(0)).floatValue(), ((Number) list.get(1)).floatValue(), ((Number) list.get(2)).floatValue());
        }
    }
}
