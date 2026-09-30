package E;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import delivery.samurai.android.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class i extends ViewGroup {
    public final int alpha;
    public final ArrayList purple;
    public final ArrayList red;
    public final w.o silver;
    public int teal;

    public i(Context context) {
        super(context);
        this.alpha = 5;
        ArrayList arrayList = new ArrayList();
        this.purple = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.red = arrayList2;
        this.silver = new w.o(5);
        setClipChildren(false);
        View view = new View(context);
        addView(view);
        arrayList.add(view);
        arrayList2.add(view);
        this.teal = 1;
        setTag(R.id.hide_in_inspector_tag, Boolean.TRUE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final k alpha(j jVar) {
        Object remove;
        View view;
        w.o oVar = this.silver;
        k kVar = (k) ((LinkedHashMap) oVar.purple).get(jVar);
        if (kVar != null) {
            return kVar;
        }
        ArrayList arrayList = this.red;
        Intrinsics.echo(arrayList, "<this>");
        if (arrayList.isEmpty()) {
            remove = null;
        } else {
            remove = arrayList.remove(0);
        }
        k kVar2 = (k) remove;
        LinkedHashMap linkedHashMap = (LinkedHashMap) oVar.purple;
        LinkedHashMap linkedHashMap2 = (LinkedHashMap) oVar.red;
        k kVar3 = kVar2;
        if (kVar2 == null) {
            int i4 = this.teal;
            ArrayList arrayList2 = this.purple;
            if (i4 > CollectionsKt.ivory(arrayList2)) {
                View view2 = new View(getContext());
                addView(view2);
                arrayList2.add(view2);
                view = view2;
            } else {
                k kVar4 = (k) arrayList2.get(this.teal);
                j jVar2 = (j) linkedHashMap2.get(kVar4);
                view = kVar4;
                if (jVar2 != null) {
                    jVar2.amber();
                    k kVar5 = (k) linkedHashMap.get(jVar2);
                    if (kVar5 != null) {
                    }
                    linkedHashMap.remove(jVar2);
                    kVar4.charlie();
                    view = kVar4;
                }
            }
            int i5 = this.teal;
            if (i5 < this.alpha - 1) {
                this.teal = i5 + 1;
                kVar3 = view;
            } else {
                this.teal = 0;
                kVar3 = view;
            }
        }
        linkedHashMap.put(jVar, kVar3);
        linkedHashMap2.put(kVar3, jVar);
        return kVar3;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i4, int i5, int i10, int i11) {
    }

    @Override // android.view.View
    public final void onMeasure(int i4, int i5) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
    }
}
