package L1;

import K1.k;
import android.text.InputFilter;
import android.text.Spanned;
import android.widget.TextView;

/* loaded from: classes3.dex */
public final class d implements InputFilter {
    public final TextView alpha;
    public c bravo;

    public d(TextView textView) {
        this.alpha = textView;
    }

    @Override // android.text.InputFilter
    public final CharSequence filter(CharSequence charSequence, int i4, int i5, Spanned spanned, int i10, int i11) {
        TextView textView = this.alpha;
        if (!textView.isInEditMode()) {
            int charlie = k.alpha().charlie();
            if (charlie != 0) {
                if (charlie != 1) {
                    if (charlie != 3) {
                        return charSequence;
                    }
                } else {
                    if ((i11 != 0 || i10 != 0 || spanned.length() != 0 || charSequence != textView.getText()) && charSequence != null) {
                        if (i4 != 0 || i5 != charSequence.length()) {
                            charSequence = charSequence.subSequence(i4, i5);
                        }
                        return k.alpha().golf(0, charSequence.length(), 0, charSequence);
                    }
                    return charSequence;
                }
            }
            k alpha = k.alpha();
            if (this.bravo == null) {
                this.bravo = new c(textView, this);
            }
            alpha.hotel(this.bravo);
            return charSequence;
        }
        return charSequence;
    }
}
