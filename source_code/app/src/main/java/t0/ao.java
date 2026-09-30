package t0;

import android.os.Looper;
import android.view.Choreographer;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import s6.U6;

/* loaded from: classes3.dex */
public final class ao extends Lambda implements Function0 {
    public final /* synthetic */ int alpha;
    public static final ao purple = new ao(0, 0);
    public static final ao red = new ao(0, 1);
    public static final ao silver = new ao(0, 2);
    public static final ao teal = new ao(0, 3);
    public static final ao white = new ao(0, 4);
    public static final ao yellow = new ao(0, 5);

    /* renamed from: c, reason: collision with root package name */
    public static final ao f13806c = new ao(0, 6);

    /* renamed from: d, reason: collision with root package name */
    public static final ao f13807d = new ao(0, 7);
    public static final ao e = new ao(0, 8);

    /* renamed from: f, reason: collision with root package name */
    public static final ao f13808f = new ao(0, 9);

    /* renamed from: g, reason: collision with root package name */
    public static final ao f13809g = new ao(0, 10);

    /* renamed from: h, reason: collision with root package name */
    public static final ao f13810h = new ao(0, 11);

    /* renamed from: i, reason: collision with root package name */
    public static final ao f13811i = new ao(0, 12);

    /* renamed from: j, reason: collision with root package name */
    public static final ao f13812j = new ao(0, 13);

    /* renamed from: k, reason: collision with root package name */
    public static final ao f13813k = new ao(0, 14);

    /* renamed from: l, reason: collision with root package name */
    public static final ao f13814l = new ao(0, 15);

    /* renamed from: m, reason: collision with root package name */
    public static final ao f13815m = new ao(0, 16);

    /* renamed from: n, reason: collision with root package name */
    public static final ao f13816n = new ao(0, 17);

    /* renamed from: o, reason: collision with root package name */
    public static final ao f13817o = new ao(0, 18);

    /* renamed from: p, reason: collision with root package name */
    public static final ao f13818p = new ao(0, 19);

    /* renamed from: q, reason: collision with root package name */
    public static final ao f13819q = new ao(0, 20);

    /* renamed from: r, reason: collision with root package name */
    public static final ao f13820r = new ao(0, 21);

    /* renamed from: s, reason: collision with root package name */
    public static final ao f13821s = new ao(0, 22);

    /* renamed from: t, reason: collision with root package name */
    public static final ao f13822t = new ao(0, 23);

    /* renamed from: u, reason: collision with root package name */
    public static final ao f13823u = new ao(0, 24);

    /* renamed from: v, reason: collision with root package name */
    public static final ao f13824v = new ao(0, 25);

    /* renamed from: w, reason: collision with root package name */
    public static final ao f13825w = new ao(0, 26);

    /* renamed from: x, reason: collision with root package name */
    public static final ao f13826x = new ao(0, 27);

    /* renamed from: y, reason: collision with root package name */
    public static final ao f13827y = new ao(0, 28);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ao(int i4, int i5) {
        super(i4);
        this.alpha = i5;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [Xd.l, Pd.i] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        boolean z2;
        Choreographer choreographer;
        switch (this.alpha) {
            case 0:
                AndroidCompositionLocals_androidKt.bravo("LocalConfiguration");
                throw null;
            case 1:
                AndroidCompositionLocals_androidKt.bravo("LocalContext");
                throw null;
            case 2:
                AndroidCompositionLocals_androidKt.bravo("LocalImageVectorCache");
                throw null;
            case 3:
                AndroidCompositionLocals_androidKt.bravo("LocalResourceIdCache");
                throw null;
            case 4:
                AndroidCompositionLocals_androidKt.bravo("LocalView");
                throw null;
            case 5:
                if (Looper.myLooper() == Looper.getMainLooper()) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    choreographer = Choreographer.getInstance();
                } else {
                    Cf.e eVar = vf.ao.alpha;
                    choreographer = (Choreographer) vf.ad.amber(Af.n.alpha, new Pd.i(2, null));
                }
                ay ayVar = new ay(choreographer, U6.alpha(Looper.getMainLooper()));
                return ayVar.plus(ayVar.f13832d);
            case 6:
            case 7:
                return null;
            case 8:
                AbstractC2901T.bravo("LocalAutofillManager");
                throw null;
            case 9:
                AbstractC2901T.bravo("LocalAutofillTree");
                throw null;
            case 10:
                AbstractC2901T.bravo("LocalClipboard");
                throw null;
            case 11:
                AbstractC2901T.bravo("LocalClipboardManager");
                throw null;
            case 12:
                return Boolean.TRUE;
            case 13:
                AbstractC2901T.bravo("LocalDensity");
                throw null;
            case 14:
                AbstractC2901T.bravo("LocalFocusManager");
                throw null;
            case 15:
                AbstractC2901T.bravo("LocalFontFamilyResolver");
                throw null;
            case 16:
                AbstractC2901T.bravo("LocalFontLoader");
                throw null;
            case 17:
                AbstractC2901T.bravo("LocalGraphicsContext");
                throw null;
            case 18:
                AbstractC2901T.bravo("LocalHapticFeedback");
                throw null;
            case 19:
                AbstractC2901T.bravo("LocalInputManager");
                throw null;
            case 20:
                AbstractC2901T.bravo("LocalLayoutDirection");
                throw null;
            case 21:
                return null;
            case 22:
                return Boolean.FALSE;
            case 23:
            case 24:
                return null;
            case 25:
                AbstractC2901T.bravo("LocalTextToolbar");
                throw null;
            case 26:
                AbstractC2901T.bravo("LocalUriHandler");
                throw null;
            case 27:
                AbstractC2901T.bravo("LocalViewConfiguration");
                throw null;
            default:
                AbstractC2901T.bravo("LocalWindowInfo");
                throw null;
        }
    }
}
