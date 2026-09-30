package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;

/* renamed from: androidx.appcompat.widget.p0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0474p0 extends Z {

    /* renamed from: f, reason: collision with root package name */
    public final int f2918f;

    /* renamed from: g, reason: collision with root package name */
    public final int f2919g;

    /* renamed from: h, reason: collision with root package name */
    public InterfaceC0468m0 f2920h;

    /* renamed from: i, reason: collision with root package name */
    public ao.n f2921i;

    public C0474p0(Context context, boolean z2) {
        super(context, z2);
        if (1 == context.getResources().getConfiguration().getLayoutDirection()) {
            this.f2918f = 21;
            this.f2919g = 22;
        } else {
            this.f2918f = 22;
            this.f2919g = 21;
        }
    }

    @Override // androidx.appcompat.widget.Z, android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        ao.i iVar;
        int i4;
        ao.n nVar;
        int pointToPosition;
        int i5;
        if (this.f2920h != null) {
            ListAdapter adapter = getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                i4 = headerViewListAdapter.getHeadersCount();
                iVar = (ao.i) headerViewListAdapter.getWrappedAdapter();
            } else {
                iVar = (ao.i) adapter;
                i4 = 0;
            }
            if (motionEvent.getAction() != 10 && (pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) != -1 && (i5 = pointToPosition - i4) >= 0 && i5 < iVar.getCount()) {
                nVar = iVar.getItem(i5);
            } else {
                nVar = null;
            }
            ao.n nVar2 = this.f2921i;
            if (nVar2 != nVar) {
                ao.l lVar = iVar.alpha;
                if (nVar2 != null) {
                    this.f2920h.quebec(lVar, nVar2);
                }
                this.f2921i = nVar;
                if (nVar != null) {
                    this.f2920h.hotel(lVar, nVar);
                }
            }
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i4, KeyEvent keyEvent) {
        ao.i iVar;
        ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
        if (listMenuItemView != null && i4 == this.f2918f) {
            if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
            }
            return true;
        }
        if (listMenuItemView != null && i4 == this.f2919g) {
            setSelection(-1);
            ListAdapter adapter = getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                iVar = (ao.i) ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            } else {
                iVar = (ao.i) adapter;
            }
            iVar.alpha.charlie(false);
            return true;
        }
        return super.onKeyDown(i4, keyEvent);
    }

    public void setHoverListener(InterfaceC0468m0 interfaceC0468m0) {
        this.f2920h = interfaceC0468m0;
    }

    @Override // androidx.appcompat.widget.Z, android.widget.AbsListView
    public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
        super.setSelector(drawable);
    }
}
