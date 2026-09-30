package androidx.compose.ui.graphics;

import A0.p;
import T.r;
import a0.C0359m;
import a0.C0366t;
import a0.C0371y;
import a0.as;
import a0.at;
import a0.aw;
import ao.ad;
import kotlin.Metadata;
import kotlin.collections.o;
import kotlin.jvm.internal.Intrinsics;
import s0.AbstractC2555o;
import s0.F;
import s0.L;
import t0.C2915g0;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/graphics/GraphicsLayerElement;", "Ls0/F;", "La0/at;", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class GraphicsLayerElement extends F {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f3022a;
    public final float alpha;

    /* renamed from: b, reason: collision with root package name */
    public final long f3023b;

    /* renamed from: c, reason: collision with root package name */
    public final long f3024c;

    /* renamed from: d, reason: collision with root package name */
    public final int f3025d;
    public final float purple;
    public final float red;
    public final float silver;
    public final float teal;
    public final long white;
    public final as yellow;

    public GraphicsLayerElement(float f5, float f10, float f11, float f12, float f13, long j5, as asVar, boolean z2, long j6, long j7, int i4) {
        this.alpha = f5;
        this.purple = f10;
        this.red = f11;
        this.silver = f12;
        this.teal = f13;
        this.white = j5;
        this.yellow = asVar;
        this.f3022a = z2;
        this.f3023b = j6;
        this.f3024c = j7;
        this.f3025d = i4;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [T.r, java.lang.Object, a0.at] */
    @Override // s0.F
    public final r create() {
        ?? rVar = new r();
        rVar.alpha = this.alpha;
        rVar.purple = this.purple;
        rVar.red = this.red;
        rVar.silver = this.silver;
        rVar.teal = this.teal;
        rVar.white = 8.0f;
        rVar.yellow = this.white;
        rVar.f2586a = this.yellow;
        rVar.f2587b = this.f3022a;
        rVar.f2588c = this.f3023b;
        rVar.f2589d = this.f3024c;
        rVar.e = this.f3025d;
        rVar.f2590f = 3;
        rVar.f2591g = new p(23, rVar);
        return rVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof GraphicsLayerElement) {
                GraphicsLayerElement graphicsLayerElement = (GraphicsLayerElement) obj;
                if (Float.compare(this.alpha, graphicsLayerElement.alpha) == 0 && Float.compare(this.purple, graphicsLayerElement.purple) == 0 && Float.compare(this.red, graphicsLayerElement.red) == 0 && Float.compare(0.0f, 0.0f) == 0 && Float.compare(0.0f, 0.0f) == 0 && Float.compare(this.silver, graphicsLayerElement.silver) == 0 && Float.compare(0.0f, 0.0f) == 0 && Float.compare(0.0f, 0.0f) == 0 && Float.compare(this.teal, graphicsLayerElement.teal) == 0 && Float.compare(8.0f, 8.0f) == 0 && aw.alpha(this.white, graphicsLayerElement.white) && Intrinsics.areEqual(this.yellow, graphicsLayerElement.yellow) && this.f3022a == graphicsLayerElement.f3022a && Intrinsics.areEqual(null, null) && C0366t.charlie(this.f3023b, graphicsLayerElement.f3023b) && C0366t.charlie(this.f3024c, graphicsLayerElement.f3024c) && this.f3025d == graphicsLayerElement.f3025d && Intrinsics.areEqual(null, null)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i4;
        int sierra = ad.sierra(8.0f, ad.sierra(this.teal, ad.sierra(0.0f, ad.sierra(0.0f, ad.sierra(this.silver, ad.sierra(0.0f, ad.sierra(0.0f, ad.sierra(this.red, ad.sierra(this.purple, Float.floatToIntBits(this.alpha) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31);
        int i5 = aw.charlie;
        long j5 = this.white;
        int hashCode = (this.yellow.hashCode() + ((((int) (j5 ^ (j5 >>> 32))) + sierra) * 31)) * 31;
        if (this.f3022a) {
            i4 = 1231;
        } else {
            i4 = 1237;
        }
        int i10 = (hashCode + i4) * 961;
        int i11 = C0366t.lima;
        return (((ad.whiskey(ad.whiskey(i10, 31, this.f3023b), 31, this.f3024c) + this.f3025d) * 31) + 3) * 31;
    }

    @Override // s0.F
    public final void inspectableProperties(C2915g0 c2915g0) {
        c2915g0.alpha = "graphicsLayer";
        Float valueOf = Float.valueOf(this.alpha);
        o oVar = c2915g0.charlie;
        oVar.bravo(valueOf, "scaleX");
        oVar.bravo(Float.valueOf(this.purple), "scaleY");
        oVar.bravo(Float.valueOf(this.red), "alpha");
        oVar.bravo(Float.valueOf(0.0f), "translationX");
        oVar.bravo(Float.valueOf(0.0f), "translationY");
        oVar.bravo(Float.valueOf(this.silver), "shadowElevation");
        oVar.bravo(Float.valueOf(0.0f), "rotationX");
        oVar.bravo(Float.valueOf(0.0f), "rotationY");
        oVar.bravo(Float.valueOf(this.teal), "rotationZ");
        oVar.bravo(Float.valueOf(8.0f), "cameraDistance");
        oVar.bravo(new aw(this.white), "transformOrigin");
        oVar.bravo(this.yellow, "shape");
        oVar.bravo(Boolean.valueOf(this.f3022a), "clip");
        oVar.bravo(null, "renderEffect");
        oVar.bravo(new C0366t(this.f3023b), "ambientShadowColor");
        oVar.bravo(new C0366t(this.f3024c), "spotShadowColor");
        oVar.bravo(new C0371y(this.f3025d), "compositingStrategy");
        oVar.bravo(new Object(), "blendMode");
        oVar.bravo(null, "colorFilter");
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("GraphicsLayerElement(scaleX=");
        sb2.append(this.alpha);
        sb2.append(", scaleY=");
        sb2.append(this.purple);
        sb2.append(", alpha=");
        sb2.append(this.red);
        sb2.append(", translationX=0.0, translationY=0.0, shadowElevation=");
        sb2.append(this.silver);
        sb2.append(", rotationX=0.0, rotationY=0.0, rotationZ=");
        sb2.append(this.teal);
        sb2.append(", cameraDistance=8.0, transformOrigin=");
        sb2.append((Object) aw.delta(this.white));
        sb2.append(", shape=");
        sb2.append(this.yellow);
        sb2.append(", clip=");
        sb2.append(this.f3022a);
        sb2.append(", renderEffect=null, ambientShadowColor=");
        ad.bronze(this.f3023b, ", spotShadowColor=", sb2);
        ad.bronze(this.f3024c, ", compositingStrategy=", sb2);
        sb2.append((Object) C0371y.alpha(this.f3025d));
        sb2.append(", blendMode=");
        sb2.append((Object) C0359m.alpha(3));
        sb2.append(", colorFilter=null)");
        return sb2.toString();
    }

    @Override // s0.F
    public final void update(r rVar) {
        at atVar = (at) rVar;
        atVar.alpha = this.alpha;
        atVar.purple = this.purple;
        atVar.red = this.red;
        atVar.silver = this.silver;
        atVar.teal = this.teal;
        atVar.white = 8.0f;
        atVar.yellow = this.white;
        atVar.f2586a = this.yellow;
        atVar.f2587b = this.f3022a;
        atVar.f2588c = this.f3023b;
        atVar.f2589d = this.f3024c;
        atVar.e = this.f3025d;
        atVar.f2590f = 3;
        L l10 = AbstractC2555o.echo(atVar, 2).f13252j;
        if (l10 != null) {
            l10.X(atVar.f2591g, true);
        }
    }
}
