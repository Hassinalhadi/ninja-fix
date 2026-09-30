package s6;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.airbnb.lottie.compose.LottieConstants;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public abstract class R4 {
    /* JADX WARN: Type inference failed for: r1v1, types: [s6.Q4, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v2, types: [s6.Q4, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v3, types: [s6.Q4, java.lang.Object] */
    public static Q4 alpha(int i4) {
        if (i4 != 0) {
            if (i4 != 1) {
                return new Object();
            }
            return new Object();
        }
        return new Object();
    }

    public static final String bravo(CharsetDecoder charsetDecoder, Gf.i input) {
        Intrinsics.echo(charsetDecoder, "<this>");
        Intrinsics.echo(input, "input");
        StringBuilder sb2 = new StringBuilder((int) Math.min(LottieConstants.IterateForever, input.delta().red));
        Charset charset = charsetDecoder.charset();
        Intrinsics.checkNotNull(charset);
        if (Intrinsics.areEqual(charset, kotlin.text.a.alpha)) {
            sb2.append((CharSequence) Gf.j.bravo(input));
        } else {
            Y4.charlie(input);
            byte[] echo = Gf.k.echo(input, -1);
            Charset charset2 = charsetDecoder.charset();
            Intrinsics.checkNotNull(charset2);
            Intrinsics.echo(charset2, "charset");
            sb2.append((CharSequence) new String(echo, charset2));
        }
        return sb2.toString();
    }

    public static void charlie(ViewGroup viewGroup, float f5) {
        Drawable background = viewGroup.getBackground();
        if (background instanceof g7.i) {
            ((g7.i) background).papa(f5);
        }
    }

    public static void delta(View view, g7.i iVar) {
        V6.a aVar = iVar.purple.charlie;
        if (aVar != null && aVar.alpha) {
            float f5 = 0.0f;
            for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                f5 += ((View) parent).getElevation();
            }
            g7.g gVar = iVar.purple;
            if (gVar.mike != f5) {
                gVar.mike = f5;
                iVar.xray();
            }
        }
    }

    public static void echo(ViewGroup viewGroup) {
        Drawable background = viewGroup.getBackground();
        if (background instanceof g7.i) {
            delta(viewGroup, (g7.i) background);
        }
    }
}
