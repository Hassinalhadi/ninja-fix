package androidx.compose.foundation.layout;

import android.app.RemoteAction;
import android.view.textclassifier.TextClassification;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class ai implements Xd.l {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ Object purple;

    public /* synthetic */ ai(int i4, Object obj) {
        this.alpha = i4;
        this.purple = obj;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        boolean z2;
        boolean z10;
        CharSequence label;
        CharSequence title;
        switch (this.alpha) {
            case 0:
                InterfaceC0581m interfaceC0581m = (InterfaceC0581m) obj;
                int intValue = ((Number) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                C0585q c0585q = (C0585q) interfaceC0581m;
                if (c0585q.magenta(intValue & 1, z2)) {
                    ((P.d) this.purple).invoke(at.alpha, c0585q, 6);
                } else {
                    c0585q.ochre();
                }
                return Unit.INSTANCE;
            case 1:
                InterfaceC0581m interfaceC0581m2 = (InterfaceC0581m) obj;
                int intValue2 = ((Number) obj2).intValue();
                if ((intValue2 & 3) != 2) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                C0585q c0585q2 = (C0585q) interfaceC0581m2;
                if (!c0585q2.magenta(intValue2 & 1, z10)) {
                    c0585q2.ochre();
                    return Unit.INSTANCE;
                }
                throw null;
            case 2:
                ((Number) obj2).intValue();
                C0585q c0585q3 = (C0585q) ((InterfaceC0581m) obj);
                c0585q3.purple(666084174);
                String str = ((q.d) this.purple).bravo;
                c0585q3.quebec(false);
                return str;
            case 3:
                ((Number) obj2).intValue();
                C0585q c0585q4 = (C0585q) ((InterfaceC0581m) obj);
                c0585q4.purple(950061013);
                label = ((TextClassification) this.purple).getLabel();
                String valueOf = String.valueOf(label);
                c0585q4.quebec(false);
                return valueOf;
            default:
                ((Number) obj2).intValue();
                C0585q c0585q5 = (C0585q) ((InterfaceC0581m) obj);
                c0585q5.purple(-1376593684);
                title = ((RemoteAction) this.purple).getTitle();
                String obj3 = title.toString();
                c0585q5.quebec(false);
                return obj3;
        }
    }
}
