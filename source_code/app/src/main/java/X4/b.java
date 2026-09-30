package X4;

import D0.g;
import T.s;
import Xd.l;
import androidx.compose.runtime.InterfaceC0581m;
import com.checkout.components.kmp.rememberme.shared.model.customization.Font;
import com.checkout.components.kmp.rememberme.view.ui.TextViewKt;

/* loaded from: classes3.dex */
public final /* synthetic */ class b implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2241a;
    public final /* synthetic */ int alpha;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CharSequence f2242b;
    public final /* synthetic */ s purple;
    public final /* synthetic */ long red;
    public final /* synthetic */ Font silver;
    public final /* synthetic */ int teal;
    public final /* synthetic */ O0.l white;
    public final /* synthetic */ int yellow;

    public /* synthetic */ b(s sVar, long j5, Font font, CharSequence charSequence, int i4, O0.l lVar, int i5, int i10, int i11) {
        this.alpha = i11;
        this.purple = sVar;
        this.red = j5;
        this.silver = font;
        this.f2242b = charSequence;
        this.teal = i4;
        this.white = lVar;
        this.yellow = i5;
        this.f2241a = i10;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        switch (this.alpha) {
            case 0:
                InterfaceC0581m interfaceC0581m = (InterfaceC0581m) obj;
                int intValue = ((Integer) obj2).intValue();
                return TextViewKt.bravo(this.purple, this.red, this.silver, (String) this.f2242b, this.teal, this.white, this.yellow, this.f2241a, interfaceC0581m, intValue);
            default:
                InterfaceC0581m interfaceC0581m2 = (InterfaceC0581m) obj;
                int intValue2 = ((Integer) obj2).intValue();
                return TextViewKt.alpha(this.purple, this.red, this.silver, (g) this.f2242b, this.teal, this.white, this.yellow, this.f2241a, interfaceC0581m2, intValue2);
        }
    }
}
