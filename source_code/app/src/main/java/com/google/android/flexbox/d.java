package com.google.android.flexbox;

import androidx.appcompat.widget.P0;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes3.dex */
public final class d {
    public int alpha;
    public int bravo;
    public int charlie;
    public int delta = 0;
    public boolean echo;
    public boolean foxtrot;
    public boolean golf;
    public final /* synthetic */ FlexboxLayoutManager hotel;

    public d(FlexboxLayoutManager flexboxLayoutManager) {
        this.hotel = flexboxLayoutManager;
    }

    public static void alpha(d dVar) {
        int kilo;
        int kilo2;
        FlexboxLayoutManager flexboxLayoutManager = dVar.hotel;
        if (!flexboxLayoutManager.S() && flexboxLayoutManager.tango) {
            if (dVar.echo) {
                kilo2 = flexboxLayoutManager.azure.golf();
            } else {
                kilo2 = flexboxLayoutManager.november - flexboxLayoutManager.azure.kilo();
            }
            dVar.charlie = kilo2;
            return;
        }
        if (dVar.echo) {
            kilo = flexboxLayoutManager.azure.golf();
        } else {
            kilo = flexboxLayoutManager.azure.kilo();
        }
        dVar.charlie = kilo;
    }

    public static void bravo(d dVar) {
        dVar.alpha = -1;
        dVar.bravo = -1;
        dVar.charlie = RecyclerView.UNDEFINED_DURATION;
        boolean z2 = false;
        dVar.foxtrot = false;
        dVar.golf = false;
        FlexboxLayoutManager flexboxLayoutManager = dVar.hotel;
        if (flexboxLayoutManager.S()) {
            int i4 = flexboxLayoutManager.quebec;
            if (i4 == 0) {
                if (flexboxLayoutManager.papa == 1) {
                    z2 = true;
                }
                dVar.echo = z2;
                return;
            } else {
                if (i4 == 2) {
                    z2 = true;
                }
                dVar.echo = z2;
                return;
            }
        }
        int i5 = flexboxLayoutManager.quebec;
        if (i5 == 0) {
            if (flexboxLayoutManager.papa == 3) {
                z2 = true;
            }
            dVar.echo = z2;
        } else {
            if (i5 == 2) {
                z2 = true;
            }
            dVar.echo = z2;
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AnchorInfo{mPosition=");
        sb2.append(this.alpha);
        sb2.append(", mFlexLinePosition=");
        sb2.append(this.bravo);
        sb2.append(", mCoordinate=");
        sb2.append(this.charlie);
        sb2.append(", mPerpendicularCoordinate=");
        sb2.append(this.delta);
        sb2.append(", mLayoutFromEnd=");
        sb2.append(this.echo);
        sb2.append(", mValid=");
        sb2.append(this.foxtrot);
        sb2.append(", mAssignedFromSavedState=");
        return P0.gray(sb2, this.golf, '}');
    }
}
