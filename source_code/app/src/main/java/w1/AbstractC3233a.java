package w1;

import android.database.Cursor;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import androidx.appcompat.widget.C0460i0;
import androidx.appcompat.widget.R0;
import ao.ad;
import com.clevertap.android.sdk.db.Column;
import com.google.android.gms.internal.measurement.U0;

/* renamed from: w1.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC3233a extends BaseAdapter implements Filterable {
    public boolean alpha;
    public boolean purple;
    public Cursor red;
    public int silver;
    public U0 teal;
    public C0460i0 white;
    public C3234b yellow;

    public abstract void alpha(View view, Cursor cursor);

    public void bravo(Cursor cursor) {
        Cursor cursor2 = this.red;
        if (cursor == cursor2) {
            cursor2 = null;
        } else {
            if (cursor2 != null) {
                U0 u02 = this.teal;
                if (u02 != null) {
                    cursor2.unregisterContentObserver(u02);
                }
                C0460i0 c0460i0 = this.white;
                if (c0460i0 != null) {
                    cursor2.unregisterDataSetObserver(c0460i0);
                }
            }
            this.red = cursor;
            if (cursor != null) {
                U0 u03 = this.teal;
                if (u03 != null) {
                    cursor.registerContentObserver(u03);
                }
                C0460i0 c0460i02 = this.white;
                if (c0460i02 != null) {
                    cursor.registerDataSetObserver(c0460i02);
                }
                this.silver = cursor.getColumnIndexOrThrow(Column.ID);
                this.alpha = true;
                notifyDataSetChanged();
            } else {
                this.silver = -1;
                this.alpha = false;
                notifyDataSetInvalidated();
            }
        }
        if (cursor2 != null) {
            cursor2.close();
        }
    }

    public abstract String charlie(Cursor cursor);

    public abstract View delta(ViewGroup viewGroup);

    @Override // android.widget.Adapter
    public final int getCount() {
        Cursor cursor;
        if (this.alpha && (cursor = this.red) != null) {
            return cursor.getCount();
        }
        return 0;
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i4, View view, ViewGroup viewGroup) {
        if (this.alpha) {
            this.red.moveToPosition(i4);
            if (view == null) {
                R0 r02 = (R0) this;
                view = r02.f2811c.inflate(r02.f2810b, viewGroup, false);
            }
            alpha(view, this.red);
            return view;
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [w1.b, android.widget.Filter] */
    @Override // android.widget.Filterable
    public final Filter getFilter() {
        if (this.yellow == null) {
            ?? filter = new Filter();
            filter.alpha = this;
            this.yellow = filter;
        }
        return this.yellow;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i4) {
        Cursor cursor;
        if (this.alpha && (cursor = this.red) != null) {
            cursor.moveToPosition(i4);
            return this.red;
        }
        return null;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i4) {
        Cursor cursor;
        if (!this.alpha || (cursor = this.red) == null || !cursor.moveToPosition(i4)) {
            return 0L;
        }
        return this.red.getLong(this.silver);
    }

    @Override // android.widget.Adapter
    public View getView(int i4, View view, ViewGroup viewGroup) {
        if (this.alpha) {
            if (this.red.moveToPosition(i4)) {
                if (view == null) {
                    view = delta(viewGroup);
                }
                alpha(view, this.red);
                return view;
            }
            throw new IllegalStateException(ad.zulu(i4, "couldn't move cursor to position "));
        }
        throw new IllegalStateException("this should only be called when the cursor is valid");
    }
}
