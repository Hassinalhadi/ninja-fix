package ao;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import delivery.samurai.android.R;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class g extends BaseAdapter {
    public int alpha = -1;
    public final /* synthetic */ h purple;

    public g(h hVar) {
        this.purple = hVar;
        alpha();
    }

    public final void alpha() {
        l lVar = this.purple.red;
        n nVar = lVar.f3216o;
        if (nVar != null) {
            lVar.india();
            ArrayList arrayList = lVar.f3205c;
            int size = arrayList.size();
            for (int i4 = 0; i4 < size; i4++) {
                if (((n) arrayList.get(i4)) == nVar) {
                    this.alpha = i4;
                    return;
                }
            }
        }
        this.alpha = -1;
    }

    @Override // android.widget.Adapter
    /* renamed from: bravo, reason: merged with bridge method [inline-methods] */
    public final n getItem(int i4) {
        h hVar = this.purple;
        l lVar = hVar.red;
        lVar.india();
        ArrayList arrayList = lVar.f3205c;
        hVar.getClass();
        int i5 = this.alpha;
        if (i5 >= 0 && i4 >= i5) {
            i4++;
        }
        return (n) arrayList.get(i4);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        h hVar = this.purple;
        l lVar = hVar.red;
        lVar.india();
        int size = lVar.f3205c.size();
        hVar.getClass();
        if (this.alpha < 0) {
            return size;
        }
        return size - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i4) {
        return i4;
    }

    @Override // android.widget.Adapter
    public final View getView(int i4, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.purple.purple.inflate(R.layout.abc_list_menu_item_layout, viewGroup, false);
        }
        ((y) view).charlie(getItem(i4));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        alpha();
        super.notifyDataSetChanged();
    }
}
