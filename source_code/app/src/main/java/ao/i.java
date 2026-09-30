package ao;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class i extends BaseAdapter {
    public final l alpha;
    public int purple = -1;
    public boolean red;
    public final boolean silver;
    public final LayoutInflater teal;
    public final int white;

    public i(l lVar, LayoutInflater layoutInflater, boolean z2, int i4) {
        this.silver = z2;
        this.teal = layoutInflater;
        this.alpha = lVar;
        this.white = i4;
        alpha();
    }

    public final void alpha() {
        l lVar = this.alpha;
        n nVar = lVar.f3216o;
        if (nVar != null) {
            lVar.india();
            ArrayList arrayList = lVar.f3205c;
            int size = arrayList.size();
            for (int i4 = 0; i4 < size; i4++) {
                if (((n) arrayList.get(i4)) == nVar) {
                    this.purple = i4;
                    return;
                }
            }
        }
        this.purple = -1;
    }

    @Override // android.widget.Adapter
    /* renamed from: bravo, reason: merged with bridge method [inline-methods] */
    public final n getItem(int i4) {
        ArrayList lima;
        l lVar = this.alpha;
        if (this.silver) {
            lVar.india();
            lima = lVar.f3205c;
        } else {
            lima = lVar.lima();
        }
        int i5 = this.purple;
        if (i5 >= 0 && i4 >= i5) {
            i4++;
        }
        return (n) lima.get(i4);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        ArrayList lima;
        l lVar = this.alpha;
        if (this.silver) {
            lVar.india();
            lima = lVar.f3205c;
        } else {
            lima = lVar.lima();
        }
        if (this.purple < 0) {
            return lima.size();
        }
        return lima.size() - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i4) {
        return i4;
    }

    @Override // android.widget.Adapter
    public final View getView(int i4, View view, ViewGroup viewGroup) {
        int i5;
        boolean z2 = false;
        if (view == null) {
            view = this.teal.inflate(this.white, viewGroup, false);
        }
        int i10 = getItem(i4).purple;
        int i11 = i4 - 1;
        if (i11 >= 0) {
            i5 = getItem(i11).purple;
        } else {
            i5 = i10;
        }
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        if (this.alpha.mike() && i10 != i5) {
            z2 = true;
        }
        listMenuItemView.setGroupDividerEnabled(z2);
        y yVar = (y) view;
        if (this.red) {
            listMenuItemView.setForceShowIcon(true);
        }
        yVar.charlie(getItem(i4));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        alpha();
        super.notifyDataSetChanged();
    }
}
