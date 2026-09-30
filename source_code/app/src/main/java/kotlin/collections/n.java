package kotlin.collections;

import af.C0437h;
import android.app.ActivityOptions;
import android.app.PendingIntent;
import android.app.RemoteAction;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.InputMethodManager;
import ao.ad;
import com.checkout.components.card.operations.PaymentOperationManager;
import com.checkout.components.card.operations.validator.ExpiryDateValidator;
import com.checkout.components.wallet.WalletComponent;
import com.clevertap.android.sdk.inapp.customtemplates.CustomTemplateContext;
import com.clevertap.android.sdk.inapp.customtemplates.system.PlayStoreAppRatingTemplate;
import com.clevertap.android.sdk.network.api.CtApiWrapper;
import com.clevertap.android.sdk.network.http.UrlConnectionHttpClient;
import com.google.android.gms.internal.measurement.C1298c;
import d.K;
import delivery.samurai.android.ui.scanner.invoice.InvoiceScannerActivity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import l.C2042b;
import n.ax;
import n.c0;
import o2.C2191a;
import o2.InterfaceC2196f;
import okhttp3.Handshake;
import okhttp3.internal.connection.ConnectPlan;
import okhttp3.internal.http2.Http2Connection;
import okhttp3.internal.ws.RealWebSocket;
import okhttp3.internal.ws.WebSocketWriter;
import s0.AbstractC2555o;
import s0.AbstractC2557q;
import s6.L5;
import t.C2882h;
import t6.AbstractC3016k2;
import u.InterfaceC3132f;
import x.C3277h;

/* loaded from: classes2.dex */
public final /* synthetic */ class n implements Function0 {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ Object purple;

    public /* synthetic */ n(int i4, Object obj) {
        this.alpha = i4;
        this.purple = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        l lVar;
        PendingIntent actionIntent;
        ActivityOptions pendingIntentBackgroundActivityStartMode;
        Object obj = this.purple;
        switch (this.alpha) {
            case 0:
                return kotlin.jvm.internal.x.golf((Object[]) obj);
            case 1:
                C2042b c2042b = (C2042b) obj;
                c2042b.f12940r.invoke(Boolean.valueOf(true ^ c2042b.f12939q));
                return Unit.INSTANCE;
            case 2:
                return PaymentOperationManager.charlie((PaymentOperationManager) obj);
            case 3:
                return WalletComponent.alpha((WalletComponent) obj);
            case 4:
                return (D0.g) obj;
            case 5:
                return new c0((K) obj, 0.0f);
            case 6:
                return ((ax) obj).delta();
            case 7:
                return new Q0.k(((Q0.l) obj).charlie());
            case 8:
                InterfaceC2196f interfaceC2196f = (InterfaceC2196f) obj;
                interfaceC2196f.getLifecycle().alpha(new C2191a(interfaceC2196f));
                return Unit.INSTANCE;
            case 9:
                og.a aVar = (og.a) obj;
                eg.a aVar2 = aVar.bravo;
                aVar2.alpha.charlie("|- (-) Scope - id:'_root_'");
                LinkedHashSet linkedHashSet = aVar.charlie;
                Iterator it = linkedHashSet.iterator();
                if (!it.hasNext()) {
                    linkedHashSet.clear();
                    aVar.echo = true;
                    ThreadLocal threadLocal = aVar.delta;
                    if (threadLocal != null && (lVar = (l) threadLocal.get()) != null) {
                        lVar.clear();
                    }
                    aVar.delta = null;
                    mg.a aVar3 = aVar2.charlie;
                    aVar3.getClass();
                    C1298c c1298c = aVar3.alpha.delta;
                    c1298c.getClass();
                    hg.b[] bVarArr = (hg.b[]) ((ConcurrentHashMap) c1298c.red).values().toArray(new hg.b[0]);
                    ArrayList arrayList = new ArrayList();
                    for (hg.b bVar : bVarArr) {
                    }
                    Iterator it2 = arrayList.iterator();
                    if (!it2.hasNext()) {
                        aVar3.charlie.remove("_root_");
                        return Unit.INSTANCE;
                    }
                    throw ad.yankee(it2);
                }
                throw ad.yankee(it);
            case 10:
                return ConnectPlan.bravo((Handshake) obj);
            case 11:
                return Http2Connection.juliet((Http2Connection) obj);
            case 12:
                return RealWebSocket.alpha((RealWebSocket) obj);
            case 13:
                return RealWebSocket.bravo((WebSocketWriter) obj);
            case 14:
                ((p3.ad) obj).invoke();
                return Unit.INSTANCE;
            case 15:
                return obj;
            case 16:
                return ExpiryDateValidator.alpha((ExpiryDateValidator) obj);
            case 17:
                return ((InterfaceC3132f) obj).cyan();
            case 18:
                ((q.g) obj).close();
                return Unit.INSTANCE;
            case 19:
                actionIntent = ((RemoteAction) obj).getActionIntent();
                if (Build.VERSION.SDK_INT >= 34) {
                    try {
                        pendingIntentBackgroundActivityStartMode = ActivityOptions.makeBasic().setPendingIntentBackgroundActivityStartMode(1);
                        actionIntent.send(pendingIntentBackgroundActivityStartMode.toBundle());
                    } catch (PendingIntent.CanceledException e) {
                        Log.e("TextClassification", "error sending pendingIntent: " + actionIntent + " error: " + e);
                    }
                } else {
                    actionIntent.send();
                }
                return Unit.INSTANCE;
            case 20:
                return PlayStoreAppRatingTemplate.charlie((CustomTemplateContext.FunctionContext) obj);
            case 21:
                C2882h c2882h = (C2882h) obj;
                if (c2882h.isAttached()) {
                    return AbstractC3016k2.alpha(c2882h);
                }
                return q.c.bravo;
            case 22:
                L5 l52 = (L5) obj;
                Intent addFlags = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS", Uri.fromParts("package", ((Context) l52.alpha).getPackageName(), null)).addFlags(268435456);
                Intrinsics.delta(addFlags, "addFlags(...)");
                ((Context) l52.alpha).startActivity(addFlags);
                return Unit.INSTANCE;
            case 23:
                return CtApiWrapper.alpha((CtApiWrapper) obj);
            case 24:
                Object systemService = ((View) ((w.o) obj).purple).getContext().getSystemService("input_method");
                Intrinsics.charlie(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
                return (InputMethodManager) systemService;
            case 25:
                return new BaseInputConnection(((w.u) obj).alpha, false);
            case 26:
                return UrlConnectionHttpClient.alpha((Ref.ObjectRef) obj);
            case 27:
                int i4 = InvoiceScannerActivity.f12460I;
                InvoiceScannerActivity invoiceScannerActivity = (InvoiceScannerActivity) obj;
                invoiceScannerActivity.setResult(0);
                invoiceScannerActivity.finish();
                return Unit.INSTANCE;
            case 28:
                ((C0437h) obj).alpha("android.permission.CAMERA");
                return Unit.INSTANCE;
            default:
                C3277h c3277h = (C3277h) obj;
                c3277h.f14058i = null;
                AbstractC2555o.golf(c3277h).coral();
                AbstractC2555o.golf(c3277h).blue();
                AbstractC2557q.india(c3277h);
                return Boolean.TRUE;
        }
    }
}
