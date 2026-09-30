package Wc;

import android.text.InputFilter;
import android.text.Spanned;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;

/* loaded from: classes2.dex */
public final class n implements InputFilter {
    public final Regex alpha = new Regex("^\\d*(?:\\.\\d{0,2})?$");

    @Override // android.text.InputFilter
    public final CharSequence filter(CharSequence source, int i4, int i5, Spanned dest, int i10, int i11) {
        Intrinsics.echo(source, "source");
        Intrinsics.echo(dest, "dest");
        String str = dest.subSequence(0, i10).toString() + source.subSequence(i4, i5).toString() + dest.subSequence(i11, dest.length()).toString();
        if (str.length() == 0 || this.alpha.echo(str)) {
            return null;
        }
        return "";
    }
}
