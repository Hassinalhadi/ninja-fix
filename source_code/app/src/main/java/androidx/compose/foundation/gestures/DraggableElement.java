package androidx.compose.foundation.gestures;

import T.r;
import Xd.m;
import com.clevertap.android.sdk.Constants;
import d.K;
import d.aj;
import d.ak;
import d.ap;
import d.aq;
import f.InterfaceC1673j;
import kotlin.Metadata;
import kotlin.collections.o;
import kotlin.jvm.internal.Intrinsics;
import s0.F;
import t0.C2915g0;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/gestures/DraggableElement;", "Ls0/F;", "Ld/ap;", "foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DraggableElement extends F {

    /* renamed from: b, reason: collision with root package name */
    public static final com.clevertap.android.sdk.inapp.images.preload.a f2964b = new com.clevertap.android.sdk.inapp.images.preload.a(5);

    /* renamed from: a, reason: collision with root package name */
    public final boolean f2965a;
    public final aq alpha;
    public final K purple;
    public final boolean red;
    public final InterfaceC1673j silver;
    public final boolean teal;
    public final ak white;
    public final m yellow;

    public DraggableElement(aq aqVar, K k6, boolean z2, InterfaceC1673j interfaceC1673j, boolean z10, ak akVar, m mVar, boolean z11) {
        this.alpha = aqVar;
        this.purple = k6;
        this.red = z2;
        this.silver = interfaceC1673j;
        this.teal = z10;
        this.white = akVar;
        this.yellow = mVar;
        this.f2965a = z11;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [d.ap, T.r, d.aj] */
    @Override // s0.F
    public final r create() {
        com.clevertap.android.sdk.inapp.images.preload.a aVar = f2964b;
        K k6 = this.purple;
        ?? ajVar = new aj(aVar, this.red, this.silver, k6);
        ajVar.e = this.alpha;
        ajVar.f11986f = k6;
        ajVar.f11987g = this.teal;
        ajVar.f11988h = this.white;
        ajVar.f11989i = this.yellow;
        ajVar.f11990j = this.f2965a;
        return ajVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && DraggableElement.class == obj.getClass()) {
                DraggableElement draggableElement = (DraggableElement) obj;
                if (!Intrinsics.areEqual(this.alpha, draggableElement.alpha) || this.purple != draggableElement.purple || this.red != draggableElement.red || !Intrinsics.areEqual(this.silver, draggableElement.silver) || this.teal != draggableElement.teal || !Intrinsics.areEqual(this.white, draggableElement.white) || !Intrinsics.areEqual(this.yellow, draggableElement.yellow) || this.f2965a != draggableElement.f2965a) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i4;
        int i5;
        int i10;
        int hashCode = (this.purple.hashCode() + (this.alpha.hashCode() * 31)) * 31;
        int i11 = 1237;
        if (this.red) {
            i4 = 1231;
        } else {
            i4 = 1237;
        }
        int i12 = (hashCode + i4) * 31;
        InterfaceC1673j interfaceC1673j = this.silver;
        if (interfaceC1673j != null) {
            i5 = interfaceC1673j.hashCode();
        } else {
            i5 = 0;
        }
        int i13 = (i12 + i5) * 31;
        if (this.teal) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        int hashCode2 = (this.yellow.hashCode() + ((this.white.hashCode() + ((i13 + i10) * 31)) * 31)) * 31;
        if (this.f2965a) {
            i11 = 1231;
        }
        return hashCode2 + i11;
    }

    @Override // s0.F
    public final void inspectableProperties(C2915g0 c2915g0) {
        c2915g0.alpha = "draggable";
        K k6 = this.purple;
        o oVar = c2915g0.charlie;
        oVar.bravo(k6, Constants.KEY_ORIENTATION);
        oVar.bravo(Boolean.valueOf(this.red), "enabled");
        oVar.bravo(Boolean.valueOf(this.f2965a), "reverseDirection");
        oVar.bravo(this.silver, "interactionSource");
        oVar.bravo(Boolean.valueOf(this.teal), "startDragImmediately");
        oVar.bravo(this.white, "onDragStarted");
        oVar.bravo(this.yellow, "onDragStopped");
        oVar.bravo(this.alpha, "state");
    }

    @Override // s0.F
    public final void update(r rVar) {
        boolean z2;
        boolean z10;
        ap apVar = (ap) rVar;
        com.clevertap.android.sdk.inapp.images.preload.a aVar = f2964b;
        aq aqVar = apVar.e;
        aq aqVar2 = this.alpha;
        if (!Intrinsics.areEqual(aqVar, aqVar2)) {
            apVar.e = aqVar2;
            z2 = true;
        } else {
            z2 = false;
        }
        K k6 = apVar.f11986f;
        K k10 = this.purple;
        if (k6 != k10) {
            apVar.f11986f = k10;
            z2 = true;
        }
        boolean z11 = apVar.f11990j;
        boolean z12 = this.f2965a;
        if (z11 != z12) {
            apVar.f11990j = z12;
            z10 = true;
        } else {
            z10 = z2;
        }
        apVar.f11988h = this.white;
        apVar.f11989i = this.yellow;
        apVar.f11987g = this.teal;
        apVar.m(aVar, this.red, this.silver, k10, z10);
    }
}
