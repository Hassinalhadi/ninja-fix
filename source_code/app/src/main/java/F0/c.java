package F0;

import java.text.BreakIterator;
import s6.I4;

/* loaded from: classes3.dex */
public final class c extends I4 {
    public final BreakIterator alpha;

    public c(CharSequence charSequence) {
        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(charSequence.toString());
        this.alpha = characterInstance;
    }

    @Override // s6.I4
    public final int alpha(int i4) {
        return this.alpha.following(i4);
    }

    @Override // s6.I4
    public final int bravo(int i4) {
        return this.alpha.preceding(i4);
    }
}
