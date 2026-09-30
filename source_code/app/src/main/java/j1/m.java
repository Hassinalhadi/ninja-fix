package j1;

import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import java.io.IOException;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class m extends l {
    @Override // j1.l
    public final Font lima(p1.h hVar) {
        String str;
        Font delta;
        Uri uri = hVar.alpha;
        if (Objects.equals(uri.getScheme(), "systemfont")) {
            str = uri.getAuthority();
        } else {
            str = null;
        }
        if (str != null) {
            Typeface create = Typeface.create(str, 0);
            Typeface create2 = Typeface.create(Typeface.DEFAULT, 0);
            if (create == null || create.equals(create2)) {
                create = null;
            }
            if (create != null && (delta = AbstractC1933g.delta(create)) != null) {
                String str2 = hVar.echo;
                if (TextUtils.isEmpty(str2)) {
                    return delta;
                }
                try {
                    return new Font.Builder(delta).setFontVariationSettings(str2).build();
                } catch (IOException unused) {
                    Log.e("TypefaceCompatApi31Impl", "Failed to clone Font instance. Fall back to provider font.");
                    return null;
                }
            }
        }
        return null;
    }
}
