package C1;

import F.C0103e2;
import F.C0130l1;
import F.R2;
import F.X0;
import F.Y0;
import a0.AbstractC0349c;
import a0.InterfaceC0342ab;
import a0.InterfaceC0364r;
import af.C0433d;
import af.C0440k;
import android.graphics.Canvas;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.runtime.t0;
import bz.C0786k;
import bz.T;
import d.K;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import q0.AbstractC2366B;
import q0.AbstractC2367C;
import t0.C2946x;

/* loaded from: classes3.dex */
public final class av extends Lambda implements Function1 {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ Object purple;
    public final /* synthetic */ Object red;
    public final /* synthetic */ Object silver;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public av(Y.aa aaVar, Y.n nVar, Function1 function1) {
        super(1);
        this.alpha = 4;
        this.purple = aaVar;
        this.red = nVar;
        this.silver = (Lambda) function1;
    }

    /* JADX WARN: Type inference failed for: r0v29, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.Lambda] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Unit unit;
        boolean booleanValue;
        float golf;
        float f5;
        float f10;
        float f11;
        long j5;
        a0.aw awVar;
        long j6;
        switch (this.alpha) {
            case 0:
                Throwable th = (Throwable) obj;
                ((A0.p) this.purple).invoke(th);
                J2.i iVar = (J2.i) this.red;
                ((xf.e) iVar.red).juliet(th, false);
                do {
                    Object alpha = xf.l.alpha(((xf.e) iVar.red).alpha());
                    if (alpha != null) {
                        ((al) this.silver).invoke(alpha, th);
                        unit = Unit.INSTANCE;
                    } else {
                        unit = null;
                    }
                } while (unit != null);
                return Unit.INSTANCE;
            case 1:
                C0786k c0786k = (C0786k) obj;
                float floatValue = ((Number) ((t0) c0786k.echo).getValue()).floatValue();
                kotlin.jvm.internal.r rVar = (kotlin.jvm.internal.r) this.purple;
                float f12 = floatValue - rVar.alpha;
                R2 r22 = (R2) this.red;
                float bravo = r22.bravo();
                r22.delta(bravo + f12);
                float abs = Math.abs(bravo - r22.bravo());
                rVar.alpha = ((Number) ((t0) c0786k.echo).getValue()).floatValue();
                ((kotlin.jvm.internal.r) this.silver).alpha = ((Number) c0786k.alpha.bravo.invoke(c0786k.foxtrot)).floatValue();
                if (Math.abs(f12 - abs) > 0.5f) {
                    ((t0) c0786k.india).setValue(Boolean.FALSE);
                    c0786k.delta.invoke();
                }
                return Unit.INSTANCE;
            case 2:
                float floatValue2 = ((Number) obj).floatValue();
                C0103e2 c0103e2 = (C0103e2) this.red;
                vf.ad.zulu((vf.ab) this.purple, null, null, new Y0(c0103e2, floatValue2, null), 3).crimson(new X0(c0103e2, (Function0) this.silver, 1));
                return Unit.INSTANCE;
            case 3:
                InterfaceC0364r mike = ((c0.d) obj).lime().mike();
                T0.t tVar = (T0.t) this.purple;
                if (tVar.getView().getVisibility() != 8) {
                    tVar.f2082q = true;
                    C2946x c2946x = ((s0.al) this.red).f13287f;
                    if (!av.q.kilo(c2946x)) {
                        c2946x = null;
                    }
                    if (c2946x != null) {
                        Canvas alpha2 = AbstractC0349c.alpha(mike);
                        c2946x.getAndroidViewsHandler$ui_release().getClass();
                        ((T0.t) this.silver).draw(alpha2);
                    }
                    tVar.f2082q = false;
                }
                return Unit.INSTANCE;
            case 4:
                Y.aa aaVar = (Y.aa) obj;
                if (Intrinsics.areEqual(aaVar, (Y.aa) this.purple)) {
                    booleanValue = false;
                } else if (!Intrinsics.areEqual(aaVar, ((Y.n) this.red).charlie)) {
                    booleanValue = ((Boolean) ((Lambda) this.silver).invoke(aaVar)).booleanValue();
                } else {
                    throw new IllegalStateException("Focus search landed at the root.");
                }
                return Boolean.valueOf(booleanValue);
            case 5:
                ae.ai aiVar = (ae.ai) this.purple;
                androidx.lifecycle.al alVar = (androidx.lifecycle.al) this.red;
                C0433d c0433d = (C0433d) this.silver;
                aiVar.alpha(alVar, c0433d);
                return new C0130l1(4, c0433d);
            case 6:
                ae.ai aiVar2 = (ae.ai) this.purple;
                androidx.lifecycle.al alVar2 = (androidx.lifecycle.al) this.red;
                C0440k c0440k = (C0440k) this.silver;
                aiVar2.alpha(alVar2, c0440k);
                return new C0130l1(5, c0440k);
            case 7:
                AbstractC2366B abstractC2366B = (AbstractC2366B) obj;
                boolean ivory = ((q0.ar) this.purple).ivory();
                androidx.compose.material3.internal.w wVar = (androidx.compose.material3.internal.w) this.red;
                if (ivory) {
                    golf = wVar.alpha.delta().charlie(((androidx.compose.runtime.ad) wVar.alpha.juliet).getValue());
                } else {
                    golf = wVar.alpha.golf();
                }
                K k6 = wVar.red;
                if (k6 == K.purple) {
                    f5 = golf;
                } else {
                    f5 = 0.0f;
                }
                if (k6 != K.alpha) {
                    golf = 0.0f;
                }
                AbstractC2366B.hotel(abstractC2366B, (AbstractC2367C) this.silver, Zd.a.delta(f5), Zd.a.delta(golf));
                return Unit.INSTANCE;
            case 8:
                return new R.d((SnapshotStateList) this.purple, this.red, (bx.s) this.silver, 2);
            case 9:
                InterfaceC0342ab interfaceC0342ab = (InterfaceC0342ab) obj;
                float f13 = 1.0f;
                T t5 = (T) this.purple;
                if (t5 != null) {
                    f10 = ((Number) t5.getValue()).floatValue();
                } else {
                    f10 = 1.0f;
                }
                a0.ap apVar = (a0.ap) interfaceC0342ab;
                apVar.charlie(f10);
                T t10 = (T) this.red;
                if (t10 != null) {
                    f11 = ((Number) t10.getValue()).floatValue();
                } else {
                    f11 = 1.0f;
                }
                apVar.hotel(f11);
                if (t10 != null) {
                    f13 = ((Number) t10.getValue()).floatValue();
                }
                apVar.india(f13);
                T t11 = (T) this.silver;
                if (t11 != null) {
                    j5 = ((a0.aw) t11.getValue()).alpha;
                } else {
                    j5 = a0.aw.bravo;
                }
                apVar.november(j5);
                return Unit.INSTANCE;
            default:
                int i4 = bx.an.$EnumSwitchMapping$0[((bx.ai) obj).ordinal()];
                if (i4 != 1) {
                    awVar = null;
                    bx.ax axVar = (bx.ax) this.red;
                    bx.az azVar = (bx.az) this.silver;
                    if (i4 != 2) {
                        if (i4 == 3) {
                            bx.E e = ((bx.A) azVar).charlie.charlie;
                            if (e != null) {
                                awVar = new a0.aw(e.alpha);
                            } else {
                                bx.E e4 = ((bx.ay) axVar).bravo.charlie;
                                if (e4 != null) {
                                    awVar = new a0.aw(e4.alpha);
                                }
                            }
                        } else {
                            throw new NoWhenBranchMatchedException();
                        }
                    } else {
                        bx.E e5 = ((bx.ay) axVar).bravo.charlie;
                        if (e5 != null) {
                            awVar = new a0.aw(e5.alpha);
                        } else {
                            bx.E e10 = ((bx.A) azVar).charlie.charlie;
                            if (e10 != null) {
                                awVar = new a0.aw(e10.alpha);
                            }
                        }
                    }
                } else {
                    awVar = (a0.aw) this.purple;
                }
                if (awVar != null) {
                    j6 = awVar.alpha;
                } else {
                    j6 = a0.aw.bravo;
                }
                return new a0.aw(j6);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ av(Object obj, Object obj2, Object obj3, int i4) {
        super(1);
        this.alpha = i4;
        this.purple = obj;
        this.red = obj2;
        this.silver = obj3;
    }
}
