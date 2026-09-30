package s0;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import t0.C2946x;

/* renamed from: s0.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2546f extends Lambda implements Function1 {
    public final /* synthetic */ int alpha;
    public static final C2546f purple = new C2546f(1, 0);
    public static final C2546f red = new C2546f(1, 1);
    public static final C2546f silver = new C2546f(1, 2);
    public static final C2546f teal = new C2546f(1, 3);
    public static final C2546f white = new C2546f(1, 4);
    public static final C2546f yellow = new C2546f(1, 5);

    /* renamed from: c, reason: collision with root package name */
    public static final C2546f f13337c = new C2546f(1, 6);

    /* renamed from: d, reason: collision with root package name */
    public static final C2546f f13338d = new C2546f(1, 7);
    public static final C2546f e = new C2546f(1, 8);

    /* renamed from: f, reason: collision with root package name */
    public static final C2546f f13339f = new C2546f(1, 9);

    /* renamed from: g, reason: collision with root package name */
    public static final C2546f f13340g = new C2546f(1, 10);

    /* renamed from: h, reason: collision with root package name */
    public static final C2546f f13341h = new C2546f(1, 11);

    /* renamed from: i, reason: collision with root package name */
    public static final C2546f f13342i = new C2546f(1, 12);

    /* renamed from: j, reason: collision with root package name */
    public static final C2546f f13343j = new C2546f(1, 13);

    /* renamed from: k, reason: collision with root package name */
    public static final C2546f f13344k = new C2546f(1, 14);

    /* renamed from: l, reason: collision with root package name */
    public static final C2546f f13345l = new C2546f(1, 15);

    /* renamed from: m, reason: collision with root package name */
    public static final C2546f f13346m = new C2546f(1, 16);

    /* renamed from: n, reason: collision with root package name */
    public static final C2546f f13347n = new C2546f(1, 17);

    /* renamed from: o, reason: collision with root package name */
    public static final C2546f f13348o = new C2546f(1, 18);

    /* renamed from: p, reason: collision with root package name */
    public static final C2546f f13349p = new C2546f(1, 19);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2546f(int i4, int i5) {
        super(i4);
        this.alpha = i5;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.alpha) {
            case 0:
                C2544d c2544d = (C2544d) obj;
                c2544d.getClass();
                AbstractC2557q.india(c2544d);
                return Unit.INSTANCE;
            case 1:
                ((C2544d) obj).d();
                return Unit.INSTANCE;
            case 2:
                a0 a0Var = (a0) obj;
                if (a0Var.november()) {
                    at atVar = a0Var.purple;
                    if (!atVar.f13312d) {
                        Function1 echo = a0Var.alpha.echo();
                        bv.al alVar = atVar.f13314g;
                        if (echo == null) {
                            if (alVar != null) {
                                Object[] objArr = alVar.charlie;
                                long[] jArr = alVar.alpha;
                                int length = jArr.length - 2;
                                if (length >= 0) {
                                    int i4 = 0;
                                    while (true) {
                                        long j5 = jArr[i4];
                                        if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i5 = 8 - ((~(i4 - length)) >>> 31);
                                            for (int i10 = 0; i10 < i5; i10++) {
                                                if ((255 & j5) < 128) {
                                                    atVar.n((bv.am) objArr[(i4 << 3) + i10]);
                                                }
                                                j5 >>= 8;
                                            }
                                            if (i5 != 8) {
                                            }
                                        }
                                        if (i4 != length) {
                                            i4++;
                                        }
                                    }
                                }
                                alVar.alpha();
                            }
                        } else {
                            atVar.d(a0Var, 9223372034707292159L, 0L);
                            atVar.yellow = echo;
                        }
                    }
                }
                return Unit.INSTANCE;
            case 3:
                ((InterfaceC2542b) obj).charlie().delta = false;
                return Unit.INSTANCE;
            case 4:
                InterfaceC2542b interfaceC2542b = (InterfaceC2542b) obj;
                interfaceC2542b.charlie().echo = interfaceC2542b.charlie().delta;
                return Unit.INSTANCE;
            case 5:
                ((InterfaceC2542b) obj).charlie().charlie = false;
                return Unit.INSTANCE;
            case 6:
                ((InterfaceC2542b) obj).charlie().delta = false;
                return Unit.INSTANCE;
            case 7:
                InterfaceC2542b interfaceC2542b2 = (InterfaceC2542b) obj;
                interfaceC2542b2.charlie().echo = interfaceC2542b2.charlie().delta;
                return Unit.INSTANCE;
            case 8:
                ((InterfaceC2542b) obj).charlie().charlie = false;
                return Unit.INSTANCE;
            case 9:
                U u4 = ((L) obj).C;
                if (u4 != null) {
                    u4.invalidate();
                }
                return Unit.INSTANCE;
            case 10:
                L l10 = (L) obj;
                if (l10.november() && l10.Y(true)) {
                    al alVar2 = l10.f13251i;
                    ap apVar = alVar2.f13306y;
                    if (apVar.lima > 0) {
                        if (apVar.kilo || apVar.juliet) {
                            alVar2.ochre(false);
                        }
                        apVar.papa.e();
                    }
                    alVar2.bronze();
                    C2946x c2946x = (C2946x) ao.alpha(alVar2);
                    c2946x.getRectManager().echo(alVar2);
                    if (alVar2.f13281H > 0) {
                        com.google.android.play.core.integrity.c cVar = c2946x.f13860H.echo;
                        cVar.getClass();
                        if (alVar2.f13281H > 0) {
                            ((J.e) cVar.purple).bravo(alVar2);
                            alVar2.f13280G = true;
                        }
                        c2946x.beige(null);
                    }
                }
                return Unit.INSTANCE;
            case 11:
                Q q4 = (Q) obj;
                if (q4.november()) {
                    q4.alpha.magenta();
                }
                return Unit.INSTANCE;
            case 12:
                Intrinsics.charlie(obj, "null cannot be cast to non-null type androidx.compose.ui.node.OwnerScope");
                return Boolean.valueOf(!((X) obj).november());
            case 13:
                al alVar3 = (al) obj;
                if (alVar3.cyan()) {
                    alVar3.ochre(false);
                }
                return Unit.INSTANCE;
            case 14:
                al alVar4 = (al) obj;
                if (alVar4.cyan()) {
                    alVar4.ochre(false);
                }
                return Unit.INSTANCE;
            case 15:
                al alVar5 = (al) obj;
                if (alVar5.cyan()) {
                    alVar5.maroon(false);
                }
                return Unit.INSTANCE;
            case 16:
                al alVar6 = (al) obj;
                if (alVar6.cyan()) {
                    alVar6.maroon(false);
                }
                return Unit.INSTANCE;
            case 17:
                al alVar7 = (al) obj;
                if (alVar7.cyan()) {
                    al.navy(alVar7, false, 7);
                }
                return Unit.INSTANCE;
            case 18:
                al alVar8 = (al) obj;
                if (alVar8.cyan()) {
                    al.olive(alVar8, false, 7);
                }
                return Unit.INSTANCE;
            default:
                al alVar9 = (al) obj;
                if (alVar9.cyan()) {
                    alVar9.coral();
                }
                return Unit.INSTANCE;
        }
    }
}
