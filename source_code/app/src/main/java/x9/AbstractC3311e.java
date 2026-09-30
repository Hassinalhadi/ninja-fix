package x9;

import androidx.recyclerview.widget.az;
import java.util.ArrayList;
import java.util.List;

/* renamed from: x9.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3311e extends az {
    public final ArrayList alpha = new ArrayList();
    public InterfaceC3312f bravo;

    public final void alpha(List list) {
        ArrayList arrayList = this.alpha;
        int size = arrayList.size();
        if (list != null && !list.isEmpty()) {
            arrayList.addAll(list);
            notifyItemRangeInserted(size, list.size());
        }
    }

    public final void bravo(List list) {
        ArrayList arrayList = this.alpha;
        arrayList.clear();
        if (list != null && !list.isEmpty()) {
            arrayList.addAll(list);
        }
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.az
    public int getItemCount() {
        return this.alpha.size();
    }
}
