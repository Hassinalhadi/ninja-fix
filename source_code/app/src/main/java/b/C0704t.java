package b;

import android.content.Context;
import android.os.Build;
import android.widget.EdgeEffect;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.t0;
import androidx.recyclerview.widget.RecyclerView;
import d.C1544m0;
import kotlin.ResultKt;
import kotlin.Unit;
import s0.AbstractC2556p;
import s6.AbstractC2645e7;
import t6.M2;
import t6.V3;

/* renamed from: b.t, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0704t {
    public final Q0.d alpha;
    public long bravo = 9205357640488583168L;
    public final ao charlie;
    public final androidx.compose.runtime.ax delta;
    public final boolean echo;
    public boolean foxtrot;
    public long golf;
    public long hotel;
    public final AbstractC2556p india;

    public C0704t(Context context, Q0.d dVar, long j5, androidx.compose.foundation.layout.M m4) {
        au auVar;
        this.alpha = dVar;
        ao aoVar = new ao(context, a0.ao.beige(j5));
        this.charlie = aoVar;
        this.delta = C0564b.yankee(Unit.INSTANCE, androidx.compose.runtime.as.red);
        this.echo = true;
        this.golf = 0L;
        this.hotel = -1L;
        C0703s c0703s = new C0703s(0, this);
        m0.k kVar = m0.ab.alpha;
        m0.ah ahVar = new m0.ah(null, null, c0703s);
        if (Build.VERSION.SDK_INT >= 31) {
            auVar = new au(ahVar, this, aoVar);
        } else {
            auVar = new au(ahVar, this, aoVar, m4);
        }
        this.india = auVar;
    }

    public final void alpha() {
        boolean z2;
        ao aoVar = this.charlie;
        EdgeEffect edgeEffect = aoVar.delta;
        boolean z10 = true;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z2 = !edgeEffect.isFinished();
        } else {
            z2 = false;
        }
        EdgeEffect edgeEffect2 = aoVar.echo;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            if (edgeEffect2.isFinished() && !z2) {
                z2 = false;
            } else {
                z2 = true;
            }
        }
        EdgeEffect edgeEffect3 = aoVar.foxtrot;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            if (edgeEffect3.isFinished() && !z2) {
                z2 = false;
            } else {
                z2 = true;
            }
        }
        EdgeEffect edgeEffect4 = aoVar.golf;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            if (edgeEffect4.isFinished() && !z2) {
                z10 = false;
            }
            z2 = z10;
        }
        if (z2) {
            delta();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x0063, code lost:
    
        if (r4.invokeSuspend(kotlin.Unit.INSTANCE) == r6) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x013a, code lost:
    
        if (r4 == r6) goto L51;
     */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object bravo(long j5, C1544m0 c1544m0, Pd.c cVar) {
        C0702q c0702q;
        int i4;
        float f5;
        float f10;
        long delta;
        if (cVar instanceof C0702q) {
            c0702q = (C0702q) cVar;
            int i5 = c0702q.silver;
            if ((i5 & RecyclerView.UNDEFINED_DURATION) != 0) {
                c0702q.silver = i5 - RecyclerView.UNDEFINED_DURATION;
                Object obj = c0702q.purple;
                Od.a aVar = Od.a.alpha;
                i4 = c0702q.silver;
                ao aoVar = this.charlie;
                if (i4 == 0) {
                    if (i4 != 1) {
                        if (i4 == 2) {
                            delta = c0702q.alpha;
                            ResultKt.alpha(obj);
                            long delta2 = Q0.r.delta(delta, ((Q0.r) obj).alpha);
                            this.foxtrot = false;
                            if (Q0.r.bravo(delta2) > 0.0f) {
                                EdgeEffect charlie = aoVar.charlie();
                                int delta3 = Zd.a.delta(Q0.r.bravo(delta2));
                                if (Build.VERSION.SDK_INT >= 31) {
                                    charlie.onAbsorb(delta3);
                                } else if (charlie.isFinished()) {
                                    charlie.onAbsorb(delta3);
                                }
                            } else if (Q0.r.bravo(delta2) < 0.0f) {
                                EdgeEffect delta4 = aoVar.delta();
                                int i10 = -Zd.a.delta(Q0.r.bravo(delta2));
                                if (Build.VERSION.SDK_INT >= 31) {
                                    delta4.onAbsorb(i10);
                                } else if (delta4.isFinished()) {
                                    delta4.onAbsorb(i10);
                                }
                            }
                            if (Q0.r.charlie(delta2) > 0.0f) {
                                EdgeEffect echo = aoVar.echo();
                                int delta5 = Zd.a.delta(Q0.r.charlie(delta2));
                                if (Build.VERSION.SDK_INT >= 31) {
                                    echo.onAbsorb(delta5);
                                } else if (echo.isFinished()) {
                                    echo.onAbsorb(delta5);
                                }
                            } else if (Q0.r.charlie(delta2) < 0.0f) {
                                EdgeEffect bravo = aoVar.bravo();
                                int i11 = -Zd.a.delta(Q0.r.charlie(delta2));
                                if (Build.VERSION.SDK_INT >= 31) {
                                    bravo.onAbsorb(i11);
                                } else if (bravo.isFinished()) {
                                    bravo.onAbsorb(i11);
                                }
                            }
                            alpha();
                            return Unit.INSTANCE;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.alpha(obj);
                    return Unit.INSTANCE;
                }
                ResultKt.alpha(obj);
                if (Z.e.echo(this.golf)) {
                    c0702q.silver = 1;
                    c1544m0.getClass();
                    C1544m0 c1544m02 = new C1544m0(c1544m0.silver, c0702q);
                    c1544m02.red = j5;
                } else {
                    boolean golf = ao.golf(aoVar.foxtrot);
                    Q0.d dVar = this.alpha;
                    if (golf && Q0.r.bravo(j5) < 0.0f) {
                        f5 = V3.bravo(aoVar.charlie(), Q0.r.bravo(j5), Float.intBitsToFloat((int) (this.golf >> 32)), dVar);
                    } else if (ao.golf(aoVar.golf) && Q0.r.bravo(j5) > 0.0f) {
                        f5 = -V3.bravo(aoVar.delta(), -Q0.r.bravo(j5), Float.intBitsToFloat((int) (this.golf >> 32)), dVar);
                    } else {
                        f5 = 0.0f;
                    }
                    if (ao.golf(aoVar.delta) && Q0.r.charlie(j5) < 0.0f) {
                        f10 = V3.bravo(aoVar.echo(), Q0.r.charlie(j5), Float.intBitsToFloat((int) (this.golf & 4294967295L)), dVar);
                    } else if (ao.golf(aoVar.echo) && Q0.r.charlie(j5) > 0.0f) {
                        f10 = -V3.bravo(aoVar.bravo(), -Q0.r.charlie(j5), Float.intBitsToFloat((int) (this.golf & 4294967295L)), dVar);
                    } else {
                        f10 = 0.0f;
                    }
                    long alpha = AbstractC2645e7.alpha(f5, f10);
                    if (alpha != 0) {
                        delta();
                    }
                    delta = Q0.r.delta(j5, alpha);
                    c0702q.alpha = delta;
                    c0702q.silver = 2;
                    c1544m0.getClass();
                    C1544m0 c1544m03 = new C1544m0(c1544m0.silver, c0702q);
                    c1544m03.red = delta;
                    obj = c1544m03.invokeSuspend(Unit.INSTANCE);
                }
                return aVar;
            }
        }
        c0702q = new C0702q(this, cVar);
        Object obj2 = c0702q.purple;
        Od.a aVar2 = Od.a.alpha;
        i4 = c0702q.silver;
        ao aoVar2 = this.charlie;
        if (i4 == 0) {
        }
    }

    public final long charlie() {
        long j5 = this.bravo;
        if ((9223372034707292159L & j5) == 9205357640488583168L) {
            j5 = M2.charlie(this.golf);
        }
        float intBitsToFloat = Float.intBitsToFloat((int) (j5 >> 32)) / Float.intBitsToFloat((int) (this.golf >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j5 & 4294967295L)) / Float.intBitsToFloat((int) (this.golf & 4294967295L));
        return (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32);
    }

    public final void delta() {
        if (this.echo) {
            ((t0) this.delta).setValue(Unit.INSTANCE);
        }
    }

    public final float echo(long j5) {
        float f5;
        float intBitsToFloat = Float.intBitsToFloat((int) (charlie() >> 32));
        int i4 = (int) (j5 & 4294967295L);
        float intBitsToFloat2 = Float.intBitsToFloat(i4) / Float.intBitsToFloat((int) (this.golf & 4294967295L));
        EdgeEffect bravo = this.charlie.bravo();
        float f10 = -intBitsToFloat2;
        float f11 = 1 - intBitsToFloat;
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 31) {
            f10 = E2.f.echo(bravo, f10, f11);
        } else {
            bravo.onPull(f10, f11);
        }
        float intBitsToFloat3 = Float.intBitsToFloat((int) (4294967295L & this.golf)) * (-f10);
        if (i5 >= 31) {
            f5 = E2.f.bravo(bravo);
        } else {
            f5 = 0.0f;
        }
        if (f5 == 0.0f) {
            return intBitsToFloat3;
        }
        return Float.intBitsToFloat(i4);
    }

    public final float foxtrot(long j5) {
        float f5;
        float intBitsToFloat = Float.intBitsToFloat((int) (charlie() & 4294967295L));
        int i4 = (int) (j5 >> 32);
        float intBitsToFloat2 = Float.intBitsToFloat(i4) / Float.intBitsToFloat((int) (this.golf >> 32));
        EdgeEffect charlie = this.charlie.charlie();
        float f10 = 1 - intBitsToFloat;
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 31) {
            intBitsToFloat2 = E2.f.echo(charlie, intBitsToFloat2, f10);
        } else {
            charlie.onPull(intBitsToFloat2, f10);
        }
        float intBitsToFloat3 = Float.intBitsToFloat((int) (this.golf >> 32)) * intBitsToFloat2;
        if (i5 >= 31) {
            f5 = E2.f.bravo(charlie);
        } else {
            f5 = 0.0f;
        }
        if (f5 == 0.0f) {
            return intBitsToFloat3;
        }
        return Float.intBitsToFloat(i4);
    }

    public final float golf(long j5) {
        float f5;
        float intBitsToFloat = Float.intBitsToFloat((int) (charlie() & 4294967295L));
        int i4 = (int) (j5 >> 32);
        float intBitsToFloat2 = Float.intBitsToFloat(i4) / Float.intBitsToFloat((int) (this.golf >> 32));
        EdgeEffect delta = this.charlie.delta();
        float f10 = -intBitsToFloat2;
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 31) {
            f10 = E2.f.echo(delta, f10, intBitsToFloat);
        } else {
            delta.onPull(f10, intBitsToFloat);
        }
        float intBitsToFloat3 = Float.intBitsToFloat((int) (this.golf >> 32)) * (-f10);
        if (i5 >= 31) {
            f5 = E2.f.bravo(delta);
        } else {
            f5 = 0.0f;
        }
        if (f5 == 0.0f) {
            return intBitsToFloat3;
        }
        return Float.intBitsToFloat(i4);
    }

    public final float hotel(long j5) {
        float f5;
        float intBitsToFloat = Float.intBitsToFloat((int) (charlie() >> 32));
        int i4 = (int) (j5 & 4294967295L);
        float intBitsToFloat2 = Float.intBitsToFloat(i4) / Float.intBitsToFloat((int) (this.golf & 4294967295L));
        EdgeEffect echo = this.charlie.echo();
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 31) {
            intBitsToFloat2 = E2.f.echo(echo, intBitsToFloat2, intBitsToFloat);
        } else {
            echo.onPull(intBitsToFloat2, intBitsToFloat);
        }
        float intBitsToFloat3 = Float.intBitsToFloat((int) (4294967295L & this.golf)) * intBitsToFloat2;
        if (i5 >= 31) {
            f5 = E2.f.bravo(echo);
        } else {
            f5 = 0.0f;
        }
        if (f5 == 0.0f) {
            return intBitsToFloat3;
        }
        return Float.intBitsToFloat(i4);
    }

    public final void india(long j5) {
        boolean alpha = Z.e.alpha(this.golf, 0L);
        boolean alpha2 = Z.e.alpha(j5, this.golf);
        this.golf = j5;
        if (!alpha2) {
            long delta = (Zd.a.delta(Float.intBitsToFloat((int) (j5 & 4294967295L))) & 4294967295L) | (Zd.a.delta(Float.intBitsToFloat((int) (j5 >> 32))) << 32);
            ao aoVar = this.charlie;
            aoVar.charlie = delta;
            EdgeEffect edgeEffect = aoVar.delta;
            if (edgeEffect != null) {
                edgeEffect.setSize((int) (delta >> 32), (int) (delta & 4294967295L));
            }
            EdgeEffect edgeEffect2 = aoVar.echo;
            if (edgeEffect2 != null) {
                edgeEffect2.setSize((int) (delta >> 32), (int) (delta & 4294967295L));
            }
            EdgeEffect edgeEffect3 = aoVar.foxtrot;
            if (edgeEffect3 != null) {
                edgeEffect3.setSize((int) (delta & 4294967295L), (int) (delta >> 32));
            }
            EdgeEffect edgeEffect4 = aoVar.golf;
            if (edgeEffect4 != null) {
                edgeEffect4.setSize((int) (delta & 4294967295L), (int) (delta >> 32));
            }
            EdgeEffect edgeEffect5 = aoVar.hotel;
            if (edgeEffect5 != null) {
                edgeEffect5.setSize((int) (delta >> 32), (int) (delta & 4294967295L));
            }
            EdgeEffect edgeEffect6 = aoVar.india;
            if (edgeEffect6 != null) {
                edgeEffect6.setSize((int) (delta >> 32), (int) (delta & 4294967295L));
            }
            EdgeEffect edgeEffect7 = aoVar.juliet;
            if (edgeEffect7 != null) {
                edgeEffect7.setSize((int) (delta & 4294967295L), (int) (delta >> 32));
            }
            EdgeEffect edgeEffect8 = aoVar.kilo;
            if (edgeEffect8 != null) {
                edgeEffect8.setSize((int) (4294967295L & delta), (int) (delta >> 32));
            }
        }
        if (!alpha && !alpha2) {
            alpha();
        }
    }
}
