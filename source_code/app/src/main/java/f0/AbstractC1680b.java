package f0;

import Be.e;
import Q0.n;
import Z.c;
import a0.AbstractC0367u;
import a0.InterfaceC0364r;
import a0.ak;
import a0.ao;
import av.ah;
import bx.C0769g;
import c0.d;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import t6.I2;

/* renamed from: f0.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC1680b {

    @Nullable
    private AbstractC0367u colorFilter;

    @Nullable
    private ak layerPaint;
    private boolean useLayer;
    private float alpha = 1.0f;

    @NotNull
    private n layoutDirection = n.alpha;

    @NotNull
    private final Function1<d, Unit> drawLambda = new C0769g(8, this);

    /* renamed from: draw-x_KDEd0$default, reason: not valid java name */
    public static /* synthetic */ void m204drawx_KDEd0$default(AbstractC1680b abstractC1680b, d dVar, long j5, float f5, AbstractC0367u abstractC0367u, int i4, Object obj) {
        if (obj == null) {
            if ((i4 & 2) != 0) {
                f5 = 1.0f;
            }
            float f10 = f5;
            if ((i4 & 4) != 0) {
                abstractC0367u = null;
            }
            abstractC1680b.m205drawx_KDEd0(dVar, j5, f10, abstractC0367u);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: draw-x_KDEd0");
    }

    public boolean applyAlpha(float f5) {
        return false;
    }

    public boolean applyColorFilter(@Nullable AbstractC0367u abstractC0367u) {
        return false;
    }

    public boolean applyLayoutDirection(@NotNull n nVar) {
        return false;
    }

    /* renamed from: draw-x_KDEd0, reason: not valid java name */
    public final void m205drawx_KDEd0(@NotNull d dVar, long j5, float f5, @Nullable AbstractC0367u abstractC0367u) {
        if (this.alpha != f5) {
            if (!applyAlpha(f5)) {
                if (f5 == 1.0f) {
                    ak akVar = this.layerPaint;
                    if (akVar != null) {
                        ((e) akVar).mike(f5);
                    }
                    this.useLayer = false;
                } else {
                    ak akVar2 = this.layerPaint;
                    if (akVar2 == null) {
                        akVar2 = ao.golf();
                        this.layerPaint = akVar2;
                    }
                    ((e) akVar2).mike(f5);
                    this.useLayer = true;
                }
            }
            this.alpha = f5;
        }
        if (!Intrinsics.areEqual(this.colorFilter, abstractC0367u)) {
            if (!applyColorFilter(abstractC0367u)) {
                if (abstractC0367u == null) {
                    ak akVar3 = this.layerPaint;
                    if (akVar3 != null) {
                        ((e) akVar3).papa(null);
                    }
                    this.useLayer = false;
                } else {
                    ak akVar4 = this.layerPaint;
                    if (akVar4 == null) {
                        akVar4 = ao.golf();
                        this.layerPaint = akVar4;
                    }
                    ((e) akVar4).papa(abstractC0367u);
                    this.useLayer = true;
                }
            }
            this.colorFilter = abstractC0367u;
        }
        n layoutDirection = dVar.getLayoutDirection();
        if (this.layoutDirection != layoutDirection) {
            applyLayoutDirection(layoutDirection);
            this.layoutDirection = layoutDirection;
        }
        int i4 = (int) (j5 >> 32);
        float intBitsToFloat = Float.intBitsToFloat((int) (dVar.bravo() >> 32)) - Float.intBitsToFloat(i4);
        int i5 = (int) (j5 & 4294967295L);
        float intBitsToFloat2 = Float.intBitsToFloat((int) (dVar.bravo() & 4294967295L)) - Float.intBitsToFloat(i5);
        ((ah) dVar.lime().alpha).navy(0.0f, 0.0f, intBitsToFloat, intBitsToFloat2);
        if (f5 > 0.0f) {
            try {
                if (Float.intBitsToFloat(i4) > 0.0f && Float.intBitsToFloat(i5) > 0.0f) {
                    if (this.useLayer) {
                        float intBitsToFloat3 = Float.intBitsToFloat(i4);
                        float intBitsToFloat4 = Float.intBitsToFloat(i5);
                        c alpha = I2.alpha(0L, (Float.floatToRawIntBits(intBitsToFloat4) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat3) << 32));
                        InterfaceC0364r mike = dVar.lime().mike();
                        ak akVar5 = this.layerPaint;
                        if (akVar5 == null) {
                            akVar5 = ao.golf();
                            this.layerPaint = akVar5;
                        }
                        try {
                            mike.quebec(alpha, akVar5);
                            onDraw(dVar);
                            mike.november();
                        } catch (Throwable th) {
                            mike.november();
                            throw th;
                        }
                    } else {
                        onDraw(dVar);
                    }
                }
            } catch (Throwable th2) {
                ((ah) dVar.lime().alpha).navy(-0.0f, -0.0f, -intBitsToFloat, -intBitsToFloat2);
                throw th2;
            }
        }
        ((ah) dVar.lime().alpha).navy(-0.0f, -0.0f, -intBitsToFloat, -intBitsToFloat2);
    }

    /* renamed from: getIntrinsicSize-NH-jbRc */
    public abstract long mo1getIntrinsicSizeNHjbRc();

    public abstract void onDraw(d dVar);
}
