package t0;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import s1.C2569b;
import t1.C2952d;

/* renamed from: t0.o, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2930o extends C2569b {
    public final /* synthetic */ C2946x delta;
    public final /* synthetic */ s0.al echo;
    public final /* synthetic */ C2946x foxtrot;

    public C2930o(C2946x c2946x, s0.al alVar, C2946x c2946x2) {
        this.delta = c2946x;
        this.echo = alVar;
        this.foxtrot = c2946x2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0048, code lost:
    
        if (r4.intValue() == r8.getSemanticsOwner().alpha().golf) goto L19;
     */
    @Override // s1.C2569b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void delta(View view, C2952d c2952d) {
        Integer num;
        View.AccessibilityDelegate accessibilityDelegate = this.alpha;
        AccessibilityNodeInfo accessibilityNodeInfo = c2952d.alpha;
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        C2946x c2946x = this.delta;
        ad adVar = c2946x.f13896l;
        if (adVar.victor()) {
            accessibilityNodeInfo.setVisibleToUser(false);
        }
        s0.al alVar = this.echo;
        s0.al victor = alVar.victor();
        while (true) {
            num = null;
            if (victor != null) {
                if (victor.f13305x.foxtrot(8)) {
                    break;
                } else {
                    victor = victor.victor();
                }
            } else {
                victor = null;
                break;
            }
        }
        if (victor != null) {
            num = Integer.valueOf(victor.purple);
        }
        if (num != null) {
        }
        num = -1;
        int intValue = num.intValue();
        C2946x c2946x2 = this.foxtrot;
        c2952d.bravo = intValue;
        accessibilityNodeInfo.setParent(c2946x2, intValue);
        int i4 = alVar.purple;
        int delta = adVar.blue.delta(i4);
        if (delta != -1) {
            T0.j mike = W.mike(c2946x.getAndroidViewsHandler$ui_release(), delta);
            if (mike != null) {
                accessibilityNodeInfo.setTraversalBefore(mike);
            } else {
                accessibilityNodeInfo.setTraversalBefore(c2946x2, delta);
            }
            C2946x.alpha(c2946x, i4, accessibilityNodeInfo, adVar.coral);
        }
        int delta2 = adVar.bronze.delta(i4);
        if (delta2 != -1) {
            T0.j mike2 = W.mike(c2946x.getAndroidViewsHandler$ui_release(), delta2);
            if (mike2 != null) {
                accessibilityNodeInfo.setTraversalAfter(mike2);
            } else {
                accessibilityNodeInfo.setTraversalAfter(c2946x2, delta2);
            }
            C2946x.alpha(c2946x, i4, accessibilityNodeInfo, adVar.crimson);
        }
    }
}
