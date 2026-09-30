package com.app.base;

import android.util.SparseIntArray;
import android.view.View;
import d3.p;
import java.util.ArrayList;
import java.util.List;
import z1.b;
import z1.g;

/* loaded from: classes3.dex */
public class DataBinderMapperImpl extends b {
    public static final SparseIntArray alpha = new SparseIntArray(0);

    @Override // z1.b
    public final List alpha() {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
        return arrayList;
    }

    @Override // z1.b
    public final g bravo(int i4, View view) {
        if (alpha.get(i4) > 0 && view.getTag() == null) {
            throw new RuntimeException("view must have a tag");
        }
        return null;
    }

    @Override // z1.b
    public final g charlie(View[] viewArr, int i4) {
        if (viewArr.length != 0 && alpha.get(i4) > 0 && viewArr[0].getTag() == null) {
            throw new RuntimeException("view must have a tag");
        }
        return null;
    }

    @Override // z1.b
    public final int delta(String str) {
        Integer num;
        if (str == null || (num = (Integer) p.alpha.get(str)) == null) {
            return 0;
        }
        return num.intValue();
    }
}
