package com.google.android.material.snackbar;

import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.google.android.material.internal.s;
import com.google.firebase.messaging.o;
import i7.AbstractC1899e;
import i7.C1898d;

/* loaded from: classes2.dex */
public class BaseTransientBottomBar$Behavior extends SwipeDismissBehavior<View> {

    /* renamed from: b, reason: collision with root package name */
    public final s f8119b;

    public BaseTransientBottomBar$Behavior() {
        s sVar = new s(13, false);
        this.white = Math.min(Math.max(0.0f, 0.1f), 1.0f);
        this.yellow = Math.min(Math.max(0.0f, 0.6f), 1.0f);
        this.teal = 0;
        this.f8119b = sVar;
    }

    @Override // com.google.android.material.behavior.SwipeDismissBehavior
    public final boolean echo(View view) {
        this.f8119b.getClass();
        return view instanceof AbstractC1899e;
    }

    @Override // com.google.android.material.behavior.SwipeDismissBehavior, androidx.coordinatorlayout.widget.c
    public final boolean onInterceptTouchEvent(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        s sVar = this.f8119b;
        sVar.getClass();
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1 || actionMasked == 3) {
                o.lima().romeo((C1898d) sVar.purple);
            }
        } else if (coordinatorLayout.isPointInChildBounds(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
            o.lima().quebec((C1898d) sVar.purple);
        }
        return super.onInterceptTouchEvent(coordinatorLayout, view, motionEvent);
    }
}
