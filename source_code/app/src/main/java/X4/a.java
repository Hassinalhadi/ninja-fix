package X4;

import T.s;
import Wf.e;
import Xd.l;
import androidx.compose.runtime.InterfaceC0581m;
import com.checkout.components.kmp.rememberme.shared.model.customization.DesignTokens;
import com.checkout.components.kmp.rememberme.shared.model.customization.Font;
import com.checkout.components.kmp.rememberme.view.challenge.ChallengeButtonViewKt;
import com.checkout.components.kmp.rememberme.view.ui.TextButtonViewKt;
import com.checkout.components.wallet.ui.PayButtonViewKt;
import kotlin.jvm.functions.Function0;
import yf.L;

/* loaded from: classes3.dex */
public final /* synthetic */ class a implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f2239a;
    public final /* synthetic */ int alpha = 1;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2240b;
    public final /* synthetic */ String purple;
    public final /* synthetic */ Function0 red;
    public final /* synthetic */ long silver;
    public final /* synthetic */ Object teal;
    public final /* synthetic */ int white;
    public final /* synthetic */ int yellow;

    public /* synthetic */ a(e eVar, DesignTokens designTokens, String str, Function0 function0, long j5, s sVar, int i4, int i5) {
        this.f2239a = eVar;
        this.f2240b = designTokens;
        this.purple = str;
        this.red = function0;
        this.silver = j5;
        this.teal = sVar;
        this.white = i4;
        this.yellow = i5;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        switch (this.alpha) {
            case 0:
                InterfaceC0581m interfaceC0581m = (InterfaceC0581m) obj;
                int intValue = ((Integer) obj2).intValue();
                return TextButtonViewKt.alpha(this.purple, (Font) this.f2239a, this.silver, (O0.l) this.f2240b, (s) this.teal, this.red, this.white, this.yellow, interfaceC0581m, intValue);
            case 1:
                InterfaceC0581m interfaceC0581m2 = (InterfaceC0581m) obj;
                int intValue2 = ((Integer) obj2).intValue();
                return ChallengeButtonViewKt.alpha((e) this.f2239a, (DesignTokens) this.f2240b, this.purple, this.red, this.silver, (s) this.teal, this.white, this.yellow, interfaceC0581m2, intValue2);
            default:
                InterfaceC0581m interfaceC0581m3 = (InterfaceC0581m) obj;
                int intValue3 = ((Integer) obj2).intValue();
                return PayButtonViewKt.alpha(this.purple, (L) this.f2239a, this.silver, this.red, (Z8.a) this.f2240b, (Z8.b) this.teal, this.white, this.yellow, interfaceC0581m3, intValue3);
        }
    }

    public /* synthetic */ a(String str, Font font, long j5, O0.l lVar, s sVar, Function0 function0, int i4, int i5) {
        this.purple = str;
        this.f2239a = font;
        this.silver = j5;
        this.f2240b = lVar;
        this.teal = sVar;
        this.red = function0;
        this.white = i4;
        this.yellow = i5;
    }

    public /* synthetic */ a(String str, L l10, long j5, Function0 function0, Z8.a aVar, Z8.b bVar, int i4, int i5) {
        this.purple = str;
        this.f2239a = l10;
        this.silver = j5;
        this.red = function0;
        this.f2240b = aVar;
        this.teal = bVar;
        this.white = i4;
        this.yellow = i5;
    }
}
