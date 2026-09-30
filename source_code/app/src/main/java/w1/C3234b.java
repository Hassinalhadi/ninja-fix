package w1;

import android.database.Cursor;
import android.util.Log;
import android.widget.Filter;
import androidx.appcompat.widget.R0;
import androidx.appcompat.widget.SearchView;

/* renamed from: w1.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3234b extends Filter {
    public AbstractC3233a alpha;

    @Override // android.widget.Filter
    public final CharSequence convertResultToString(Object obj) {
        return ((R0) this.alpha).charlie((Cursor) obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0045  */
    @Override // android.widget.Filter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Filter.FilterResults performFiltering(CharSequence charSequence) {
        String charSequence2;
        Cursor cursor;
        R0 r02 = (R0) this.alpha;
        if (charSequence == null) {
            charSequence2 = "";
        } else {
            r02.getClass();
            charSequence2 = charSequence.toString();
        }
        SearchView searchView = r02.f2812d;
        if (searchView.getVisibility() == 0 && searchView.getWindowVisibility() == 0) {
            try {
                cursor = r02.golf(r02.e, charSequence2);
            } catch (RuntimeException e) {
                Log.w("SuggestionsAdapter", "Search suggestions query threw an exception.", e);
            }
            if (cursor != null) {
                cursor.getCount();
                Filter.FilterResults filterResults = new Filter.FilterResults();
                if (cursor == null) {
                    filterResults.count = cursor.getCount();
                    filterResults.values = cursor;
                } else {
                    filterResults.count = 0;
                    filterResults.values = null;
                }
                return filterResults;
            }
        }
        cursor = null;
        Filter.FilterResults filterResults2 = new Filter.FilterResults();
        if (cursor == null) {
        }
        return filterResults2;
    }

    @Override // android.widget.Filter
    public final void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        AbstractC3233a abstractC3233a = this.alpha;
        Cursor cursor = abstractC3233a.red;
        Object obj = filterResults.values;
        if (obj != null && obj != cursor) {
            ((R0) abstractC3233a).bravo((Cursor) obj);
        }
    }
}
