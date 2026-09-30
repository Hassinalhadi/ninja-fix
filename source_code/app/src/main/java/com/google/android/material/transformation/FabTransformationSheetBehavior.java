package com.google.android.material.transformation;

import M6.e;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.coordinatorlayout.widget.f;
import com.google.android.play.core.integrity.k;
import com.google.mlkit.common.sdkinternal.b;
import delivery.samurai.android.R;
import java.util.HashMap;

@Deprecated
/* loaded from: classes2.dex */
public class FabTransformationSheetBehavior extends FabTransformationBehavior {

    /* renamed from: b, reason: collision with root package name */
    public HashMap f8271b;

    public FabTransformationSheetBehavior() {
    }

    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior, com.google.android.material.transformation.ExpandableBehavior
    public final void echo(View view, View view2, boolean z2, boolean z10) {
        boolean z11;
        ViewParent parent = view2.getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (z2) {
                this.f8271b = new HashMap(childCount);
            }
            for (int i4 = 0; i4 < childCount; i4++) {
                View childAt = coordinatorLayout.getChildAt(i4);
                if ((childAt.getLayoutParams() instanceof f) && (((f) childAt.getLayoutParams()).alpha instanceof FabTransformationScrimBehavior)) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (childAt != view2 && !z11) {
                    if (!z2) {
                        HashMap hashMap = this.f8271b;
                        if (hashMap != null && hashMap.containsKey(childAt)) {
                            childAt.setImportantForAccessibility(((Integer) this.f8271b.get(childAt)).intValue());
                        }
                    } else {
                        this.f8271b.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                        childAt.setImportantForAccessibility(4);
                    }
                }
            }
            if (!z2) {
                this.f8271b = null;
            }
        }
        super.echo(view, view2, z2, z10);
    }

    @Override // com.google.android.material.transformation.FabTransformationBehavior
    public final k lima(Context context, boolean z2) {
        int i4;
        if (z2) {
            i4 = R.animator.mtrl_fab_transformation_sheet_expand_spec;
        } else {
            i4 = R.animator.mtrl_fab_transformation_sheet_collapse_spec;
        }
        k kVar = new k(4, false);
        kVar.purple = e.bravo(i4, context);
        kVar.red = new b(6);
        return kVar;
    }

    public FabTransformationSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
