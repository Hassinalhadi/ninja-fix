package L9;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import androidx.fragment.app.ai;
import com.google.firebase.messaging.o;
import delivery.samurai.android.R;
import delivery.samurai.android.ui.common.LocationInfoActivity;
import g3.C1743d;
import g3.C1746g;
import g3.EnumC1747h;
import g3.m;
import g3.n;
import g3.p;
import g3.q;
import g3.r;
import g3.s;
import g3.u;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.ws.WebSocketProtocol;

/* loaded from: classes2.dex */
public final /* synthetic */ class e implements View.OnClickListener {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ androidx.appcompat.app.g purple;
    public final /* synthetic */ Object red;
    public final /* synthetic */ Object silver;
    public final /* synthetic */ Object teal;

    public /* synthetic */ e(o oVar, s sVar, androidx.appcompat.app.g gVar, EnumC1747h enumC1747h, Function0 function0, int i4) {
        this.alpha = i4;
        this.red = oVar;
        switch (i4) {
            case 2:
                this.purple = gVar;
                this.silver = enumC1747h;
                this.teal = function0;
                return;
            default:
                this.silver = sVar;
                this.purple = gVar;
                this.teal = function0;
                return;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onClick(View view) {
        boolean z2 = false;
        androidx.appcompat.app.g gVar = this.purple;
        Object obj = this.silver;
        Object obj2 = this.red;
        switch (this.alpha) {
            case 0:
                C1743d c1743d = (C1743d) obj2;
                boolean alpha = c1743d.alpha();
                Context context = (Context) this.teal;
                ai aiVar = (ai) obj;
                if (!alpha && !c1743d.bravo()) {
                    u uVar = u.purple;
                    List list = c1743d.bravo;
                    if (list.contains(uVar)) {
                        int i4 = LocationInfoActivity.Q;
                        Intent intent = new Intent(context, (Class<?>) LocationInfoActivity.class);
                        intent.putExtra("isFromLogin", false);
                        aiVar.startActivityForResult(intent, WebSocketProtocol.CLOSE_CLIENT_GOING_AWAY);
                        gVar.dismiss();
                        return;
                    }
                    if (list.contains(u.white)) {
                        try {
                            aiVar.startActivity(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
                        } catch (Exception unused) {
                            String string = context.getString(R.string.unable_to_open_settings);
                            Intrinsics.delta(string, "getString(...)");
                            d.pink(context, string);
                            return;
                        }
                    } else {
                        try {
                            Intent intent2 = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                            intent2.setData(Uri.parse("package:" + context.getPackageName()));
                            intent2.setFlags(268435456);
                            aiVar.startActivity(intent2);
                        } catch (Exception unused2) {
                            String string2 = context.getString(R.string.unable_to_open_settings);
                            Intrinsics.delta(string2, "getString(...)");
                            d.pink(context, string2);
                            return;
                        }
                    }
                } else {
                    try {
                        Intent intent3 = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                        intent3.setData(Uri.parse("package:" + context.getPackageName()));
                        intent3.setFlags(268435456);
                        aiVar.startActivity(intent3);
                    } catch (Exception unused3) {
                        String string3 = context.getString(R.string.unable_to_open_settings);
                        Intrinsics.delta(string3, "getString(...)");
                        d.pink(context, string3);
                        return;
                    }
                }
                gVar.dismiss();
                return;
            case 1:
                o oVar = (o) obj2;
                oVar.getClass();
                s sVar = (s) obj;
                boolean z10 = sVar instanceof m;
                d3.k kVar = (d3.k) oVar.alpha;
                C1746g c1746g = (C1746g) oVar.bravo;
                Function1 function1 = c1746g.kilo;
                if (z10) {
                    kVar.requestPermissions(((m) sVar).alpha, WebSocketProtocol.CLOSE_CLIENT_GOING_AWAY);
                    gVar.dismiss();
                    if (function1 != null) {
                        function1.invoke(sVar);
                    }
                } else {
                    boolean z11 = sVar instanceof n;
                    Function0 function0 = c1746g.juliet;
                    if (z11) {
                        try {
                            kVar.startActivity(((n) sVar).alpha);
                            if (function0 != null) {
                                try {
                                    function0.invoke();
                                } catch (Exception unused4) {
                                    z2 = true;
                                    String string4 = kVar.getString(R.string.unable_to_open_settings);
                                    Intrinsics.delta(string4, "getString(...)");
                                    d.pink(kVar, string4);
                                    if (z2) {
                                    }
                                }
                            }
                            if (function1 != null) {
                                function1.invoke(sVar);
                            }
                            z2 = true;
                        } catch (Exception unused5) {
                        }
                    } else if (sVar instanceof g3.o) {
                        try {
                            kVar.startActivity(((g3.o) sVar).alpha);
                            if (function0 != null) {
                                try {
                                    function0.invoke();
                                } catch (Exception unused6) {
                                    z2 = true;
                                    String string5 = kVar.getString(R.string.unable_to_open_settings);
                                    Intrinsics.delta(string5, "getString(...)");
                                    d.pink(kVar, string5);
                                    if (z2) {
                                    }
                                }
                            }
                            if (function1 != null) {
                                function1.invoke(sVar);
                            }
                            z2 = true;
                        } catch (Exception unused7) {
                        }
                    } else if (sVar instanceof p) {
                        if (function1 != null) {
                            function1.invoke(sVar);
                        }
                    } else if (sVar instanceof r) {
                        gVar.dismiss();
                    } else if (!(sVar instanceof q)) {
                        throw new NoWhenBranchMatchedException();
                    }
                }
                if (z2) {
                    gVar.dismiss();
                    return;
                }
                return;
            default:
                o oVar2 = (o) obj2;
                oVar2.getClass();
                int i5 = V9.c.$EnumSwitchMapping$0[((EnumC1747h) obj).ordinal()];
                if (i5 != 1) {
                    if (i5 != 2) {
                        if (i5 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        return;
                    } else {
                        gVar.dismiss();
                        return;
                    }
                }
                d3.k kVar2 = (d3.k) oVar2.alpha;
                String string6 = kVar2.getString(R.string.must_grant_precise_location);
                Intrinsics.delta(string6, "getString(...)");
                d.pink(kVar2, string6);
                return;
        }
    }

    public /* synthetic */ e(C1743d c1743d, ai aiVar, Context context, androidx.appcompat.app.g gVar) {
        this.alpha = 0;
        this.red = c1743d;
        this.silver = aiVar;
        this.teal = context;
        this.purple = gVar;
    }
}
