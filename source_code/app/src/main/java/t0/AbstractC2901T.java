package t0;

import F.C0164u0;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import com.google.mlkit.vision.barcode.common.Barcode;

/* renamed from: t0.T, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC2901T {
    public static final androidx.compose.runtime.E0 alpha = new androidx.compose.runtime.N(ao.f13806c);
    public static final androidx.compose.runtime.E0 bravo = new androidx.compose.runtime.N(ao.f13807d);
    public static final androidx.compose.runtime.E0 charlie = new androidx.compose.runtime.N(ao.f13808f);
    public static final androidx.compose.runtime.E0 delta = new androidx.compose.runtime.N(ao.e);
    public static final androidx.compose.runtime.E0 echo = new androidx.compose.runtime.N(ao.f13810h);
    public static final androidx.compose.runtime.E0 foxtrot = new androidx.compose.runtime.N(ao.f13809g);
    public static final androidx.compose.runtime.E0 golf = new androidx.compose.runtime.N(ao.f13816n);
    public static final androidx.compose.runtime.E0 hotel = new androidx.compose.runtime.N(ao.f13812j);
    public static final androidx.compose.runtime.E0 india = new androidx.compose.runtime.N(ao.f13813k);
    public static final androidx.compose.runtime.E0 juliet = new androidx.compose.runtime.N(ao.f13815m);
    public static final androidx.compose.runtime.E0 kilo = new androidx.compose.runtime.N(ao.f13814l);
    public static final androidx.compose.runtime.E0 lima = new androidx.compose.runtime.N(ao.f13817o);
    public static final androidx.compose.runtime.E0 mike = new androidx.compose.runtime.N(ao.f13818p);
    public static final androidx.compose.runtime.E0 november = new androidx.compose.runtime.N(ao.f13819q);
    public static final androidx.compose.runtime.E0 oscar = new androidx.compose.runtime.N(ao.f13823u);
    public static final androidx.compose.runtime.E0 papa = new androidx.compose.runtime.N(ao.f13822t);
    public static final androidx.compose.runtime.E0 quebec = new androidx.compose.runtime.N(ao.f13824v);
    public static final androidx.compose.runtime.E0 romeo = new androidx.compose.runtime.N(ao.f13825w);
    public static final androidx.compose.runtime.E0 sierra = new androidx.compose.runtime.N(ao.f13826x);
    public static final androidx.compose.runtime.E0 tango = new androidx.compose.runtime.N(ao.f13827y);
    public static final androidx.compose.runtime.E0 uniform = new androidx.compose.runtime.N(ao.f13820r);
    public static final androidx.compose.runtime.aa victor = new androidx.compose.runtime.aa(ao.f13821s);
    public static final androidx.compose.runtime.E0 whiskey = new androidx.compose.runtime.N(ao.f13811i);

    public static final void alpha(s0.W w4, C2883A c2883a, P.d dVar, InterfaceC0581m interfaceC0581m, int i4) {
        int i5;
        int i10;
        int i11;
        boolean z2;
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(1925803616);
        if (c0585q.golf(w4)) {
            i5 = 4;
        } else {
            i5 = 2;
        }
        int i12 = i5 | i4;
        if (c0585q.golf(c2883a)) {
            i10 = 32;
        } else {
            i10 = 16;
        }
        int i13 = i12 | i10;
        if (c0585q.india(dVar)) {
            i11 = Barcode.FORMAT_QR_CODE;
        } else {
            i11 = 128;
        }
        int i14 = i13 | i11;
        if ((i14 & 147) != 146) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c0585q.magenta(i14 & 1, z2)) {
            C2946x c2946x = (C2946x) w4;
            androidx.compose.runtime.O alpha2 = alpha.alpha(c2946x.getAccessibilityManager());
            androidx.compose.runtime.O alpha3 = bravo.alpha(c2946x.getAutofill());
            androidx.compose.runtime.O alpha4 = delta.alpha(c2946x.getAutofillManager());
            androidx.compose.runtime.O alpha5 = charlie.alpha(c2946x.getAutofillTree());
            androidx.compose.runtime.O alpha6 = echo.alpha(c2946x.getClipboardManager());
            androidx.compose.runtime.O alpha7 = foxtrot.alpha(c2946x.getClipboard());
            androidx.compose.runtime.O alpha8 = hotel.alpha(c2946x.getDensity());
            androidx.compose.runtime.O alpha9 = india.alpha(c2946x.getFocusOwner());
            androidx.compose.runtime.O alpha10 = juliet.alpha(c2946x.getFontLoader());
            alpha10.foxtrot = false;
            androidx.compose.runtime.O alpha11 = kilo.alpha(c2946x.getFontFamilyResolver());
            alpha11.foxtrot = false;
            C0564b.bravo(new androidx.compose.runtime.O[]{alpha2, alpha3, alpha4, alpha5, alpha6, alpha7, alpha8, alpha9, alpha10, alpha11, lima.alpha(c2946x.getHapticFeedBack()), mike.alpha(c2946x.getInputModeManager()), november.alpha(c2946x.getLayoutDirection()), oscar.alpha(c2946x.getTextInputService()), papa.alpha(c2946x.getSoftwareKeyboardController()), quebec.alpha(c2946x.getTextToolbar()), romeo.alpha(c2883a), sierra.alpha(c2946x.getViewConfiguration()), tango.alpha(c2946x.getWindowInfo()), uniform.alpha(c2946x.getPointerIconService()), golf.alpha(c2946x.getGraphicsContext())}, dVar, c0585q, 8 | ((i14 >> 3) & 112));
        } else {
            c0585q.ochre();
        }
        androidx.compose.runtime.Q uniform2 = c0585q.uniform();
        if (uniform2 != null) {
            uniform2.delta = new C0164u0(w4, c2883a, dVar, i4);
        }
    }

    public static final void bravo(String str) {
        throw new IllegalStateException(("CompositionLocal " + str + " not present").toString());
    }
}
