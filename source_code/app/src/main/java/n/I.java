package n;

import android.R;
import android.os.Build;
import s6.AbstractC2708l7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes3.dex */
public final class I {
    public static final I silver;
    public static final /* synthetic */ I[] teal;
    public final Object alpha;
    public final int purple;
    public final int red;

    static {
        int i4;
        I i5 = new I("Cut", 0, R.string.cut, R.attr.actionModeCutDrawable, q.e.alpha);
        I i10 = new I("Copy", 1, R.string.copy, R.attr.actionModeCopyDrawable, q.e.bravo);
        I i11 = new I("Paste", 2, R.string.paste, R.attr.actionModePasteDrawable, q.e.charlie);
        I i12 = new I("SelectAll", 3, R.string.selectAll, R.attr.actionModeSelectAllDrawable, q.e.delta);
        Object obj = q.e.echo;
        if (Build.VERSION.SDK_INT <= 26) {
            i4 = delivery.samurai.android.R.string.autofill;
        } else {
            i4 = R.string.autofill;
        }
        I i13 = new I("Autofill", 4, i4, 0, obj);
        silver = i13;
        I[] iArr = {i5, i10, i11, i12, i13};
        teal = iArr;
        AbstractC2708l7.bravo(iArr);
    }

    public I(String str, int i4, int i5, int i10, Object obj) {
        this.alpha = obj;
        this.purple = i5;
        this.red = i10;
    }

    public static I valueOf(String str) {
        return (I) Enum.valueOf(I.class, str);
    }

    public static I[] values() {
        return (I[]) teal.clone();
    }
}
