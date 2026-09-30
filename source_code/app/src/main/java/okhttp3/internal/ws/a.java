package okhttp3.internal.ws;

import D0.ak;
import D0.am;
import D0.g;
import D0.o;
import Pd.i;
import Q0.k;
import Q0.m;
import android.app.ActivityOptions;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.util.Log;
import android.view.textclassifier.TextClassification;
import androidx.camera.core.impl.I;
import androidx.compose.runtime.t0;
import bo.b;
import com.checkout.components.card.model.DerivedCardInputState;
import com.checkout.components.card.ui.component.base.InputComponentViewKt;
import com.checkout.components.core.common.components.InternalCheckoutComponents;
import com.checkout.components.core.featuregate.guard.CustomTabsEnabledGuard;
import com.checkout.components.interfaces.model.PaymentMethodName;
import com.clevertap.android.sdk.Logger;
import com.clevertap.android.sdk.inapp.images.repo.FileResourcesRepoFactory;
import java.util.ArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;
import n.al;
import n.ax;
import n.e0;
import q.d;
import q0.z;
import s6.AbstractC2609a7;
import s6.J4;
import sd.af;
import u.InterfaceC3132f;
import vf.ab;
import vf.ac;
import vf.ad;
import wc.C3257c;
import y.AbstractC3346F;
import y.C3344D;
import y.C3351K;

/* loaded from: classes3.dex */
public final /* synthetic */ class a implements Function0 {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ Object purple;
    public final /* synthetic */ Object red;

    public /* synthetic */ a(int i4, Object obj, Object obj2) {
        this.alpha = i4;
        this.purple = obj;
        this.red = obj2;
    }

    /* JADX WARN: Type inference failed for: r5v11, types: [Pd.i, kotlin.jvm.functions.Function1] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        String text;
        Intent intent;
        ActivityOptions pendingIntentBackgroundActivityStartMode;
        int xray;
        DerivedCardInputState a6;
        I i4;
        g november;
        int i5;
        char c3;
        long j5;
        e0 delta;
        ax axVar;
        g gVar;
        int i10 = 0;
        Object obj = this.red;
        Object obj2 = this.purple;
        switch (this.alpha) {
            case 0:
                return RealWebSocket.delta((Ref.ObjectRef) obj2, (Ref.ObjectRef) obj);
            case 1:
                ((Ref.ObjectRef) obj2).alpha = ((Function0) obj).invoke();
                return Unit.INSTANCE;
            case 2:
                ((d) obj2).delta.invoke((q.g) obj);
                return Unit.INSTANCE;
            case 3:
                return new k(AbstractC2609a7.charlie(((InterfaceC3132f) obj2).gray((z) ((Function0) obj).invoke())));
            case 4:
                TextClassification textClassification = (TextClassification) obj;
                text = textClassification.getText();
                if (text != null) {
                    i10 = text.hashCode();
                }
                intent = textClassification.getIntent();
                PendingIntent activity = PendingIntent.getActivity((Context) obj2, i10, intent, 201326592);
                if (Build.VERSION.SDK_INT >= 34) {
                    try {
                        pendingIntentBackgroundActivityStartMode = ActivityOptions.makeBasic().setPendingIntentBackgroundActivityStartMode(1);
                        activity.send(pendingIntentBackgroundActivityStartMode.toBundle());
                    } catch (PendingIntent.CanceledException e) {
                        Log.e("TextClassification", "error sending pendingIntent: " + activity + " error: " + e);
                    }
                } else {
                    activity.send();
                }
                return Unit.INSTANCE;
            case 5:
                ((Function0) obj2).invoke();
                ((Function0) obj).invoke();
                return Unit.INSTANCE;
            case 6:
                if (!((ArrayList) obj2).isEmpty()) {
                    af afVar = (af) obj;
                    int emerald = StringsKt.emerald(afVar.teal, '/', afVar.f13702a.alpha.length() + 3, 4);
                    if (emerald != -1) {
                        String str = afVar.teal;
                        xray = StringsKt__StringsKt.xray(str, new char[]{'?', '#'}, emerald, false);
                        if (xray == -1) {
                            String substring = str.substring(emerald);
                            Intrinsics.delta(substring, "substring(...)");
                            return substring;
                        }
                        String substring2 = str.substring(emerald, xray);
                        Intrinsics.delta(substring2, "substring(...)");
                        return substring2;
                    }
                }
                return "";
            case 7:
                a6 = InputComponentViewKt.a((androidx.compose.runtime.ax) obj2, (androidx.compose.runtime.ax) obj);
                return a6;
            case 8:
                return FileResourcesRepoFactory.Companion.alpha((Context) obj2, (Logger) obj);
            case 9:
                ((Function1) obj2).invoke(obj);
                return Unit.INSTANCE;
            case 10:
                C3257c c3257c = (C3257c) obj2;
                boolean z2 = !c3257c.india;
                c3257c.india = z2;
                b bVar = c3257c.hotel;
                if (bVar != null && (i4 = bVar.red.f3380i) != null) {
                    i4.purple(z2);
                }
                ((androidx.compose.runtime.ax) obj).setValue(Boolean.valueOf(c3257c.india));
                return Unit.INSTANCE;
            case 11:
                ad.zulu((ab) obj2, null, ac.silver, new C3351K((i) obj, null), 1);
                return Unit.INSTANCE;
            case 12:
                long j6 = ((m) ((androidx.compose.runtime.ax) obj).getValue()).alpha;
                C3344D c3344d = (C3344D) obj2;
                Z.b kilo = c3344d.kilo();
                long j7 = 9205357640488583168L;
                if (kilo != null && (november = c3344d.november()) != null && november.purple.length() != 0) {
                    al alVar = (al) ((t0) c3344d.romeo).getValue();
                    if (alVar == null) {
                        i5 = -1;
                    } else {
                        i5 = AbstractC3346F.$EnumSwitchMapping$0[alVar.ordinal()];
                    }
                    if (i5 != -1) {
                        if (i5 != 1 && i5 != 2) {
                            if (i5 == 3) {
                                c3 = ' ';
                                long j10 = c3344d.oscar().bravo;
                                int i11 = am.charlie;
                                j5 = j10 & 4294967295L;
                            } else {
                                throw new NoWhenBranchMatchedException();
                            }
                        } else {
                            c3 = ' ';
                            long j11 = c3344d.oscar().bravo;
                            int i12 = am.charlie;
                            j5 = j11 >> 32;
                        }
                        int i13 = (int) j5;
                        ax axVar2 = c3344d.delta;
                        if (axVar2 != null && (delta = axVar2.delta()) != null && (axVar = c3344d.delta) != null && (gVar = axVar.alpha.alpha) != null) {
                            int delta2 = J4.delta(c3344d.bravo.originalToTransformed(i13), 0, gVar.purple.length());
                            float intBitsToFloat = Float.intBitsToFloat((int) (delta.delta(kilo.alpha) >> c3));
                            ak akVar = delta.alpha;
                            o oVar = akVar.bravo;
                            int delta3 = oVar.delta(delta2);
                            float delta4 = akVar.delta(delta3);
                            float echo = akVar.echo(delta3);
                            float charlie = J4.charlie(intBitsToFloat, Math.min(delta4, echo), Math.max(delta4, echo));
                            if (m.alpha(j6, 0L) || Math.abs(intBitsToFloat - charlie) <= ((int) (j6 >> c3)) / 2) {
                                float foxtrot = oVar.foxtrot(delta3);
                                j7 = (Float.floatToRawIntBits(charlie) << c3) | (Float.floatToRawIntBits(((oVar.bravo(delta3) - foxtrot) / 2) + foxtrot) & 4294967295L);
                            }
                        }
                    }
                }
                return new Z.b(j7);
            case 13:
                return InternalCheckoutComponents.juliet((InternalCheckoutComponents) obj2, (PaymentMethodName) obj);
            default:
                return Boolean.valueOf(InternalCheckoutComponents.charlie((CustomTabsEnabledGuard) obj2, (InternalCheckoutComponents) obj));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ a(ab abVar, Function1 function1) {
        this.alpha = 11;
        this.purple = abVar;
        this.red = (i) function1;
    }
}
