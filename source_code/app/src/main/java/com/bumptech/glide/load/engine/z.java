package com.bumptech.glide.load.engine;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.animation.ValueAnimator;
import android.os.Handler;
import android.os.Message;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import com.google.android.material.snackbar.BaseTransientBottomBar$Behavior;
import g.C1718a;
import i7.AbstractC1899e;
import i7.AbstractC1900f;
import i7.C1895a;
import i7.C1896b;
import java.util.List;

/* loaded from: classes3.dex */
public final class z implements Handler.Callback {
    public final /* synthetic */ int alpha;

    public /* synthetic */ z(int i4) {
        this.alpha = i4;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList;
        switch (this.alpha) {
            case 0:
                if (message.what != 1) {
                    return false;
                }
                ((w) message.obj).bravo();
                return true;
            default:
                int i4 = message.what;
                if (i4 != 0) {
                    if (i4 != 1) {
                        return false;
                    }
                    AbstractC1900f abstractC1900f = (AbstractC1900f) message.obj;
                    int i5 = message.arg1;
                    AccessibilityManager accessibilityManager = abstractC1900f.sierra;
                    if (accessibilityManager == null || ((enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(1)) != null && enabledAccessibilityServiceList.isEmpty())) {
                        AbstractC1899e abstractC1899e = abstractC1900f.india;
                        if (abstractC1899e.getVisibility() == 0) {
                            if (abstractC1899e.getAnimationMode() == 1) {
                                ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
                                ofFloat.setInterpolator(abstractC1900f.delta);
                                ofFloat.addUpdateListener(new C1896b(abstractC1900f, 0));
                                ofFloat.setDuration(abstractC1900f.bravo);
                                ofFloat.addListener(new C1895a(abstractC1900f, i5, 0));
                                ofFloat.start();
                                return true;
                            }
                            ValueAnimator valueAnimator = new ValueAnimator();
                            int height = abstractC1899e.getHeight();
                            ViewGroup.LayoutParams layoutParams = abstractC1899e.getLayoutParams();
                            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                                height += ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
                            }
                            valueAnimator.setIntValues(0, height);
                            valueAnimator.setInterpolator(abstractC1900f.echo);
                            valueAnimator.setDuration(abstractC1900f.charlie);
                            valueAnimator.addListener(new C1895a(abstractC1900f, i5, 2));
                            valueAnimator.addUpdateListener(new C1896b(abstractC1900f, 3));
                            valueAnimator.start();
                            return true;
                        }
                    }
                    abstractC1900f.charlie();
                    return true;
                }
                AbstractC1900f abstractC1900f2 = (AbstractC1900f) message.obj;
                AbstractC1899e abstractC1899e2 = abstractC1900f2.india;
                if (abstractC1899e2.getParent() == null) {
                    ViewGroup.LayoutParams layoutParams2 = abstractC1899e2.getLayoutParams();
                    if (layoutParams2 instanceof androidx.coordinatorlayout.widget.f) {
                        androidx.coordinatorlayout.widget.f fVar = (androidx.coordinatorlayout.widget.f) layoutParams2;
                        BaseTransientBottomBar$Behavior baseTransientBottomBar$Behavior = new BaseTransientBottomBar$Behavior();
                        com.google.android.material.internal.s sVar = baseTransientBottomBar$Behavior.f8119b;
                        sVar.getClass();
                        sVar.purple = abstractC1900f2.tango;
                        baseTransientBottomBar$Behavior.purple = new C1718a(5, abstractC1900f2);
                        fVar.bravo(baseTransientBottomBar$Behavior);
                        fVar.golf = 80;
                    }
                    abstractC1899e2.f12766d = true;
                    abstractC1900f2.golf.addView(abstractC1899e2);
                    abstractC1899e2.f12766d = false;
                    abstractC1900f2.foxtrot();
                    abstractC1899e2.setVisibility(4);
                }
                if (abstractC1899e2.isLaidOut()) {
                    abstractC1900f2.echo();
                    return true;
                }
                abstractC1900f2.romeo = true;
                return true;
        }
    }
}
