package com.google.android.material.bottomsheet;

import android.app.Dialog;
import android.os.Bundle;
import android.widget.FrameLayout;
import androidx.appcompat.app.ae;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public class m extends ae {

    /* renamed from: j, reason: collision with root package name */
    public boolean f7901j;

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0627w
    public final void juliet() {
        if (!tango(false)) {
            lima(false, false);
        }
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0627w
    public final void kilo() {
        if (!tango(true)) {
            super.kilo();
        }
    }

    @Override // androidx.appcompat.app.ae, androidx.fragment.app.DialogInterfaceOnCancelListenerC0627w
    public final Dialog mike(Bundle bundle) {
        return new l(getContext(), this.white);
    }

    public final void sierra() {
        if (this.f7901j) {
            super.kilo();
        } else {
            lima(false, false);
        }
    }

    public final boolean tango(boolean z2) {
        Dialog dialog = this.e;
        if (dialog instanceof l) {
            l lVar = (l) dialog;
            BottomSheetBehavior<FrameLayout> behavior = lVar.getBehavior();
            if (behavior.B && lVar.getDismissWithAnimation()) {
                this.f7901j = z2;
                if (behavior.f7857G == 5) {
                    sierra();
                    return true;
                }
                Dialog dialog2 = this.e;
                if (dialog2 instanceof l) {
                    ((l) dialog2).removeDefaultCallback();
                }
                j jVar = new j(1, this);
                ArrayList arrayList = behavior.f7867R;
                if (!arrayList.contains(jVar)) {
                    arrayList.add(jVar);
                }
                behavior.sierra(5);
                return true;
            }
            return false;
        }
        return false;
    }
}
