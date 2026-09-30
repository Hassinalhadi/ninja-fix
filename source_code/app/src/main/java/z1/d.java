package z1;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.P0;
import androidx.databinding.DataBinderMapperImpl;
import d3.k;
import delivery.samurai.android.R;

/* loaded from: classes3.dex */
public abstract class d {
    public static final DataBinderMapperImpl alpha = new DataBinderMapperImpl();

    public static g alpha(View view) {
        g gVar;
        int i4 = g.f14183b;
        if (view != null) {
            gVar = (g) view.getTag(R.id.dataBinding);
        } else {
            gVar = null;
        }
        if (gVar != null) {
            return gVar;
        }
        Object tag = view.getTag();
        if (tag instanceof String) {
            DataBinderMapperImpl dataBinderMapperImpl = alpha;
            int delta = dataBinderMapperImpl.delta((String) tag);
            if (delta != 0) {
                return dataBinderMapperImpl.bravo(delta, view);
            }
            throw new IllegalArgumentException(P0.bronze(tag, "View is not a binding layout. Tag: "));
        }
        throw new IllegalArgumentException("View is not a binding layout");
    }

    public static g bravo(ViewGroup viewGroup, int i4, int i5) {
        int childCount = viewGroup.getChildCount();
        int i10 = childCount - i4;
        DataBinderMapperImpl dataBinderMapperImpl = alpha;
        if (i10 == 1) {
            return dataBinderMapperImpl.bravo(i5, viewGroup.getChildAt(childCount - 1));
        }
        View[] viewArr = new View[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            viewArr[i11] = viewGroup.getChildAt(i11 + i4);
        }
        return dataBinderMapperImpl.charlie(viewArr, i5);
    }

    public static g charlie(LayoutInflater layoutInflater, int i4, ViewGroup viewGroup, boolean z2) {
        boolean z10;
        int i5 = 0;
        if (viewGroup != null && z2) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            i5 = viewGroup.getChildCount();
        }
        View inflate = layoutInflater.inflate(i4, viewGroup, z2);
        if (z10) {
            return bravo(viewGroup, i5, i4);
        }
        return alpha.bravo(i4, inflate);
    }

    public static g delta(k kVar, int i4) {
        kVar.setContentView(i4);
        return bravo((ViewGroup) kVar.getWindow().getDecorView().findViewById(android.R.id.content), 0, i4);
    }
}
