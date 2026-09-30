package ao;

import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import androidx.appcompat.view.menu.ExpandedMenuView;

/* loaded from: classes3.dex */
public final class h implements x, AdapterView.OnItemClickListener {
    public Context alpha;
    public LayoutInflater purple;
    public l red;
    public ExpandedMenuView silver;
    public w teal;
    public g white;

    public h(ContextWrapper contextWrapper) {
        this.alpha = contextWrapper;
        this.purple = LayoutInflater.from(contextWrapper);
    }

    @Override // ao.x
    public final void bravo(l lVar, boolean z2) {
        w wVar = this.teal;
        if (wVar != null) {
            wVar.bravo(lVar, z2);
        }
    }

    @Override // ao.x
    public final void charlie(Context context, l lVar) {
        if (this.alpha != null) {
            this.alpha = context;
            if (this.purple == null) {
                this.purple = LayoutInflater.from(context);
            }
        }
        this.red = lVar;
        g gVar = this.white;
        if (gVar != null) {
            gVar.notifyDataSetChanged();
        }
    }

    @Override // ao.x
    public final boolean delta() {
        return false;
    }

    @Override // ao.x
    public final void echo(w wVar) {
        throw null;
    }

    @Override // ao.x
    public final boolean foxtrot(n nVar) {
        return false;
    }

    @Override // ao.x
    public final int getId() {
        return 0;
    }

    @Override // ao.x
    public final void hotel(Parcelable parcelable) {
        SparseArray<Parcelable> sparseParcelableArray = ((Bundle) parcelable).getSparseParcelableArray("android:menu:list");
        if (sparseParcelableArray != null) {
            this.silver.restoreHierarchyState(sparseParcelableArray);
        }
    }

    @Override // ao.x
    public final void india() {
        g gVar = this.white;
        if (gVar != null) {
            gVar.notifyDataSetChanged();
        }
    }

    @Override // ao.x
    public final boolean kilo(n nVar) {
        return false;
    }

    @Override // ao.x
    public final Parcelable lima() {
        if (this.silver == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        ExpandedMenuView expandedMenuView = this.silver;
        if (expandedMenuView != null) {
            expandedMenuView.saveHierarchyState(sparseArray);
        }
        bundle.putSparseParcelableArray("android:menu:list", sparseArray);
        return bundle;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [ao.m, android.content.DialogInterface$OnClickListener, android.content.DialogInterface$OnKeyListener, java.lang.Object, ao.w, android.content.DialogInterface$OnDismissListener] */
    @Override // ao.x
    public final boolean mike(ae aeVar) {
        if (!aeVar.hasVisibleItems()) {
            return false;
        }
        ?? obj = new Object();
        obj.alpha = aeVar;
        Context context = aeVar.alpha;
        Fe.c cVar = new Fe.c(context);
        androidx.appcompat.app.d dVar = (androidx.appcompat.app.d) cVar.red;
        h hVar = new h(dVar.alpha);
        obj.red = hVar;
        hVar.teal = obj;
        aeVar.bravo(hVar, context);
        h hVar2 = obj.red;
        if (hVar2.white == null) {
            hVar2.white = new g(hVar2);
        }
        dVar.quebec = hVar2.white;
        dVar.romeo = obj;
        View view = aeVar.f3209h;
        if (view != null) {
            dVar.echo = view;
        } else {
            dVar.charlie = aeVar.f3208g;
            dVar.delta = aeVar.f3207f;
        }
        dVar.oscar = obj;
        androidx.appcompat.app.g foxtrot = cVar.foxtrot();
        obj.purple = foxtrot;
        foxtrot.setOnDismissListener(obj);
        WindowManager.LayoutParams attributes = obj.purple.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= 131072;
        obj.purple.show();
        w wVar = this.teal;
        if (wVar != null) {
            wVar.echo(aeVar);
            return true;
        }
        return true;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i4, long j5) {
        this.red.quebec(this.white.getItem(i4), this, 0);
    }
}
