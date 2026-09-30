package a5;

import F.C0103e2;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.InterfaceC0581m;
import com.checkout.components.rememberme.I;
import com.checkout.components.ui.model.TextLabelViewItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import p3.EnumC2270b;
import sb.AbstractC2845d;
import vb.AbstractC3185a;

/* renamed from: a5.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C0405a implements Xd.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f2619a;
    public final /* synthetic */ int alpha = 0;
    public final /* synthetic */ Function0 purple;
    public final /* synthetic */ boolean red;
    public final /* synthetic */ int silver;
    public final /* synthetic */ int teal;
    public final /* synthetic */ Object white;
    public final /* synthetic */ Object yellow;

    public /* synthetic */ C0405a(TextLabelViewItem textLabelViewItem, boolean z2, Function0 function0, Function0 function02, T.s sVar, int i4, int i5) {
        this.white = textLabelViewItem;
        this.red = z2;
        this.purple = function0;
        this.yellow = function02;
        this.f2619a = sVar;
        this.silver = i4;
        this.teal = i5;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        switch (this.alpha) {
            case 0:
                return I.a((TextLabelViewItem) this.white, this.red, this.purple, (Function0) this.yellow, (T.s) this.f2619a, this.silver, this.teal, (InterfaceC0581m) obj, ((Integer) obj2).intValue());
            case 1:
                ((Integer) obj2).getClass();
                int cyan = C0564b.cyan(this.silver | 1);
                P.d dVar = (P.d) this.f2619a;
                AbstractC2845d.bravo(this.purple, (C0103e2) this.white, (String) this.yellow, this.red, dVar, (InterfaceC0581m) obj, cyan, this.teal);
                return Unit.INSTANCE;
            default:
                ((Integer) obj2).getClass();
                int cyan2 = C0564b.cyan(this.silver | 1);
                boolean z2 = this.red;
                AbstractC3185a.bravo((EnumC2270b) this.white, (String) this.yellow, (T.s) this.f2619a, this.purple, z2, (InterfaceC0581m) obj, cyan2, this.teal);
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ C0405a(Function0 function0, C0103e2 c0103e2, String str, boolean z2, P.d dVar, int i4, int i5) {
        this.purple = function0;
        this.white = c0103e2;
        this.yellow = str;
        this.red = z2;
        this.f2619a = dVar;
        this.silver = i4;
        this.teal = i5;
    }

    public /* synthetic */ C0405a(EnumC2270b enumC2270b, String str, T.s sVar, Function0 function0, boolean z2, int i4, int i5) {
        this.white = enumC2270b;
        this.yellow = str;
        this.f2619a = sVar;
        this.purple = function0;
        this.red = z2;
        this.silver = i4;
        this.teal = i5;
    }
}
