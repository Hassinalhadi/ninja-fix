package com.clevertap.android.sdk.inapp.images.preload;

import A0.aa;
import A0.ad;
import Nd.c;
import P.i;
import Y1.av;
import Z.e;
import af.C0438i;
import android.content.Context;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.E0;
import androidx.compose.runtime.I;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c0.d;
import c0.h;
import com.checkout.address.ui.edit.ComposableSingletons$AddressEditScreenKt;
import com.checkout.address.ui.view.AddressButtonViewKt;
import com.checkout.components.kmp.rememberme.shared.model.ClickTarget;
import com.checkout.components.rememberme.utils.NavControllerWrapper;
import com.checkout.components.rememberme.utils.PreviewFixtures;
import com.checkout.components.rememberme.wallet.ComposableSingletons$WalletListViewKt;
import com.checkout.components.ui.model.CountryPickerType;
import com.clevertap.android.sdk.inapp.images.preload.FilePreloaderStrategy;
import com.clevertap.android.sdk.utils.UrlHashGenerator;
import d.AbstractC1525d;
import d.C1521b;
import d.InterfaceC1523c;
import g1.AbstractC1735d;
import ge.InterfaceC1772d;
import hd.C1845a;
import id.C1914b;
import java.util.Locale;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import m0.r;
import ob.AbstractC2210c;
import ob.p;
import okhttp3.OkHttpClient;

/* loaded from: classes3.dex */
public final /* synthetic */ class a implements Function1 {
    public final /* synthetic */ int alpha;

    public /* synthetic */ a(int i4) {
        this.alpha = i4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String hash$lambda$0;
        boolean z2;
        boolean z10;
        boolean z11 = true;
        int i4 = 0;
        switch (this.alpha) {
            case 0:
                return FilePreloaderStrategy.DefaultImpls.bravo((Pair) obj);
            case 1:
                return FilePreloaderStrategy.DefaultImpls.delta((Pair) obj);
            case 2:
                return FilePreloaderStrategy.DefaultImpls.alpha((Map) obj);
            case 3:
                hash$lambda$0 = UrlHashGenerator.hash$lambda$0((String) obj);
                return hash$lambda$0;
            case 4:
                E0 e02 = AndroidCompositionLocals_androidKt.bravo;
                i iVar = (i) ((I) obj);
                iVar.getClass();
                if (!((Context) C0564b.azure(iVar, e02)).getPackageManager().hasSystemFeature("android.software.leanback")) {
                    InterfaceC1523c.alpha.getClass();
                    return C1521b.charlie;
                }
                return AbstractC1525d.bravo;
            case 5:
                return Boolean.TRUE;
            case 6:
                ((Long) obj).longValue();
                return Unit.INSTANCE;
            case 7:
                if (((r) obj).india == 2) {
                    i4 = 1;
                }
                return Boolean.valueOf(i4 ^ 1);
            case 8:
                return Unit.INSTANCE;
            case 9:
                return Unit.INSTANCE;
            case 10:
                ad semantics = (ad) obj;
                Intrinsics.echo(semantics, "$this$semantics");
                aa.echo(semantics, 0);
                return Unit.INSTANCE;
            case 11:
                ad semantics2 = (ad) obj;
                Intrinsics.echo(semantics2, "$this$semantics");
                aa.echo(semantics2, 0);
                return Unit.INSTANCE;
            case 12:
                ad semantics3 = (ad) obj;
                Intrinsics.echo(semantics3, "$this$semantics");
                aa.echo(semantics3, 0);
                return Unit.INSTANCE;
            case 13:
                d drawBehind = (d) obj;
                Intrinsics.echo(drawBehind, "$this$drawBehind");
                float lavender = drawBehind.lavender(2);
                float charlie = (e.charlie(drawBehind.bravo()) / 2.0f) - (lavender / 2.0f);
                float f5 = p.alpha;
                long j5 = AbstractC2210c.alpha;
                float intBitsToFloat = Float.intBitsToFloat((int) (drawBehind.bravo() >> 32)) / 2.0f;
                float intBitsToFloat2 = Float.intBitsToFloat((int) (drawBehind.bravo() & 4294967295L)) / 2.0f;
                ao.ad.golf(drawBehind, j5, charlie, (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L), new h(lavender, 0.0f, 0, 0, null, 30), 104);
                return Unit.INSTANCE;
            case 14:
                ad semantics4 = (ad) obj;
                Intrinsics.echo(semantics4, "$this$semantics");
                aa.echo(semantics4, 0);
                return Unit.INSTANCE;
            case 15:
                return ComposableSingletons$AddressEditScreenKt.charlie((CountryPickerType) obj);
            case 16:
                InterfaceC1772d it = (InterfaceC1772d) obj;
                Intrinsics.echo(it, "it");
                return pg.a.alpha(it);
            case 17:
                Context ctx = (Context) obj;
                Intrinsics.echo(ctx, "ctx");
                if (AbstractC1735d.alpha(ctx, "android.permission.ACCESS_FINE_LOCATION") == 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (AbstractC1735d.alpha(ctx, "android.permission.ACCESS_COARSE_LOCATION") == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!z2 || (z10 && !z2)) {
                    z11 = false;
                }
                return Boolean.valueOf(z11);
            case 18:
                return NavControllerWrapper.alpha((av) obj);
            case 19:
                return PreviewFixtures.delta((ClickTarget) obj);
            case 20:
                return PreviewFixtures.charlie((String) obj);
            case 21:
                String s3 = (String) obj;
                Intrinsics.echo(s3, "s");
                StringBuilder sb2 = new StringBuilder();
                int length = s3.length();
                while (i4 < length) {
                    char charAt = s3.charAt(i4);
                    if (Character.isLetter(charAt)) {
                        sb2.append(charAt);
                    }
                    i4++;
                }
                String lowerCase = sb2.toString().toLowerCase(Locale.ROOT);
                Intrinsics.delta(lowerCase, "toLowerCase(...)");
                return lowerCase;
            case 22:
                OkHttpClient.Builder builder = (OkHttpClient.Builder) obj;
                Intrinsics.echo(builder, "<this>");
                builder.followRedirects(false);
                builder.followSslRedirects(false);
                builder.retryOnConnectionFailure(true);
                return Unit.INSTANCE;
            case 23:
                Intrinsics.echo((OkHttpClient) obj, "it");
                return Unit.INSTANCE;
            case 24:
                return AddressButtonViewKt.charlie((ad) obj);
            case 25:
                return AddressButtonViewKt.echo((String) obj);
            case 26:
                return ComposableSingletons$WalletListViewKt.alpha((String) obj);
            case 27:
                return ComposableSingletons$WalletListViewKt.charlie(((Boolean) obj).booleanValue());
            case 28:
                return ComposableSingletons$WalletListViewKt.delta(((Boolean) obj).booleanValue());
            default:
                C1914b createClientPlugin = (C1914b) obj;
                Intrinsics.echo(createClientPlugin, "$this$createClientPlugin");
                createClientPlugin.alpha(C1845a.red, new C0438i(3, (c) null));
                createClientPlugin.alpha(C1845a.purple, new Pd.i(2, null));
                return Unit.INSTANCE;
        }
    }
}
