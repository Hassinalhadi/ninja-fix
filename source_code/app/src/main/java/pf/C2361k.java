package pf;

import A0.ad;
import ae.ac;
import android.graphics.Bitmap;
import android.util.Log;
import av.q;
import bz.C0790o;
import com.checkout.components.card.ui.component.address.AddressViewKt;
import com.checkout.components.card.ui.component.base.InputComponentViewKt;
import com.checkout.components.interfaces.model.contact.ContactData;
import com.clevertap.android.sdk.inapp.customtemplates.CustomTemplate;
import com.clevertap.android.sdk.inapp.customtemplates.TemplateArgument;
import com.clevertap.android.sdk.inapp.images.memory.MemoryAccessObjectKt;
import com.clevertap.android.sdk.inapp.images.repo.FileResourcesRepo;
import com.google.maps.android.BuildConfig;
import delivery.samurai.android.AndroidApp;
import delivery.samurai.android.services.CaptainLocationMonitoringService;
import java.io.File;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import sd.s;
import vf.AbstractC3220y;
import y.al;

/* renamed from: pf.k, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C2361k implements Function1 {
    public final /* synthetic */ int alpha;

    public /* synthetic */ C2361k(int i4) {
        this.alpha = i4;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        boolean z2;
        Unit a6;
        Unit a8;
        Unit a10;
        Unit a11;
        Throwable th;
        long j5;
        switch (this.alpha) {
            case 0:
                InterfaceC2358h it = (InterfaceC2358h) obj;
                Intrinsics.echo(it, "it");
                return it.iterator();
            case 1:
                if (obj == null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                return Boolean.valueOf(z2);
            case 2:
                return CustomTemplate.alpha((TemplateArgument) obj);
            case 3:
                Pair it2 = (Pair) obj;
                Intrinsics.echo(it2, "it");
                String str = (String) it2.getFirst();
                if (it2.getSecond() != null) {
                    return str + '=' + String.valueOf(it2.getSecond());
                }
                return str;
            case 4:
                a6 = AddressViewKt.a((ad) obj);
                return a6;
            case 5:
                a8 = AddressViewKt.a((ContactData) obj);
                return a8;
            case 6:
                a10 = AddressViewKt.a(((Boolean) obj).booleanValue());
                return a10;
            case 7:
                return MemoryAccessObjectKt.charlie((File) obj);
            case 8:
                return MemoryAccessObjectKt.alpha((File) obj);
            case 9:
                return MemoryAccessObjectKt.delta((byte[]) obj);
            case 10:
                return MemoryAccessObjectKt.bravo((Bitmap) obj);
            case 11:
                a11 = InputComponentViewKt.a((ad) obj);
                return a11;
            case 12:
                return FileResourcesRepo.DefaultImpls.echo((Map) obj);
            case 13:
                return FileResourcesRepo.DefaultImpls.alpha((Pair) obj);
            case 14:
                return FileResourcesRepo.DefaultImpls.charlie((Pair) obj);
            case 15:
                return FileResourcesRepo.DefaultImpls.bravo((Map) obj);
            case 16:
                return FileResourcesRepo.DefaultImpls.foxtrot((Pair) obj);
            case 17:
                return FileResourcesRepo.DefaultImpls.golf((Pair) obj);
            case 18:
                return FileResourcesRepo.DefaultImpls.delta((Pair) obj);
            case 19:
                return FileResourcesRepo.DefaultImpls.hotel((Pair) obj);
            case 20:
                CharSequence it3 = (CharSequence) obj;
                Intrinsics.echo(it3, "it");
                return Integer.valueOf(it3.length());
            case 21:
                s it4 = (s) obj;
                Intrinsics.echo(it4, "it");
                return Integer.valueOf(it4.alpha.length());
            case 22:
                Nd.f fVar = (Nd.f) obj;
                if (fVar instanceof AbstractC3220y) {
                    return (AbstractC3220y) fVar;
                }
                return null;
            case 23:
                ((Long) obj).longValue();
                return Unit.INSTANCE;
            case 24:
                return Unit.INSTANCE;
            case 25:
                return Unit.INSTANCE;
            case 26:
                Throwable th2 = (Throwable) obj;
                AndroidApp androidApp = AndroidApp.yellow;
                String name = th2.getClass().getName();
                if (th2.getCause() != null) {
                    th = th2.getCause();
                    Intrinsics.checkNotNull(th);
                } else {
                    th = th2;
                }
                String name2 = th.getClass().getName();
                String message = th.getMessage();
                if (message == null) {
                    message = "";
                }
                String name3 = Thread.currentThread().getName();
                int i4 = CaptainLocationMonitoringService.f12076N;
                String str2 = CaptainLocationMonitoringService.f12071I;
                String str3 = BuildConfig.TRAVIS;
                if (str2 == null) {
                    str2 = BuildConfig.TRAVIS;
                }
                String str4 = CaptainLocationMonitoringService.f12072J;
                if (str4 != null) {
                    str3 = str4;
                }
                Long l10 = CaptainLocationMonitoringService.f12078P;
                if (l10 != null) {
                    j5 = l10.longValue();
                } else {
                    j5 = -1;
                }
                StringBuilder india = q.india("evt=RX_UNDELIVERABLE wrapperType=", name, " rootCauseType=", name2, " rootMessage=");
                Q0.c.azure(india, message, " thread=", name3, " stompAttempt=");
                india.append(i4);
                india.append(" stompLastCloseReason=");
                india.append(str2);
                india.append(" stompLastErrorClass=");
                india.append(str3);
                india.append(" stompConnectionDurationMs=");
                india.append(j5);
                String sb2 = india.toString();
                Log.e("LocationFlow", sb2, th2);
                try {
                    K7.b.alpha().bravo("TAG -> LocationFlow," + sb2);
                } catch (Exception unused) {
                }
                Intrinsics.checkNotNull(th);
                if (!(th instanceof VirtualMachineError)) {
                    if (!(th instanceof ThreadDeath)) {
                        if (!(th instanceof LinkageError)) {
                            return Unit.INSTANCE;
                        }
                        throw th2;
                    }
                    throw th2;
                }
                throw th2;
            case 27:
                ac addCallback = (ac) obj;
                Intrinsics.echo(addCallback, "$this$addCallback");
                return Unit.INSTANCE;
            case 28:
                Z.b bVar = (Z.b) obj;
                long j6 = bVar.alpha;
                if ((9223372034707292159L & j6) != 9205357640488583168L) {
                    return new C0790o(Float.intBitsToFloat((int) (j6 >> 32)), Float.intBitsToFloat((int) (4294967295L & bVar.alpha)));
                }
                return al.alpha;
            default:
                C0790o c0790o = (C0790o) obj;
                float f5 = c0790o.alpha;
                float f10 = c0790o.bravo;
                return new Z.b((4294967295L & Float.floatToRawIntBits(f10)) | (Float.floatToRawIntBits(f5) << 32));
        }
    }

    public /* synthetic */ C2361k(AndroidApp androidApp) {
        this.alpha = 26;
    }
}
