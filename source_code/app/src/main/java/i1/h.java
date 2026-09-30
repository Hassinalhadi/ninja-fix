package i1;

import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;

/* loaded from: classes3.dex */
public final class h {
    public final ColorStateList alpha;
    public final Configuration bravo;
    public final int charlie;

    public h(ColorStateList colorStateList, Configuration configuration, Resources.Theme theme) {
        int hashCode;
        this.alpha = colorStateList;
        this.bravo = configuration;
        if (theme == null) {
            hashCode = 0;
        } else {
            hashCode = theme.hashCode();
        }
        this.charlie = hashCode;
    }
}
