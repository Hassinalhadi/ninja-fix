package O7;

import A2.ao;
import android.R;
import android.animation.ObjectAnimator;
import android.graphics.Bitmap;
import android.hardware.camera2.CameraCaptureSession;
import android.media.Image;
import android.os.Build;
import android.os.Handler;
import android.os.Parcel;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import androidx.appcompat.widget.J0;
import androidx.appcompat.widget.P0;
import androidx.camera.core.aj;
import androidx.camera.core.impl.B;
import androidx.camera.core.impl.C0505c;
import androidx.camera.core.impl.C0506d;
import androidx.camera.core.impl.ae;
import androidx.camera.core.impl.af;
import androidx.camera.core.impl.az;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.T;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import be.InterfaceC0757c;
import coil.memory.MemoryCache$Key;
import com.app.base.BaseViewModel;
import com.app.network.network.models.Bank;
import com.app.network.network.models.PlatformListResponse;
import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.db.Column;
import com.clevertap.android.sdk.inapp.evaluation.TriggerAdapter;
import com.google.android.gms.common.internal.TelemetryData;
import com.google.android.gms.common.moduleinstall.internal.ApiFeatureRequest;
import com.google.android.gms.tasks.Task;
import com.google.maps.android.BuildConfig;
import delivery.samurai.android.ui.orders.OrderHistoryFragment;
import delivery.samurai.android.ui.splash.AuthViewModel;
import delivery.samurai.android.ui.tickets.presentation.ticketslist.TicketsFragment;
import delivery.samurai.android.ui.tickets.presentation.ticketslist.TicketsViewModel;
import delivery.samurai.android.ui.withdraw.WithDrawHistoryFragment;
import g3.EnumC1747h;
import j9.InterfaceC1954a;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import m6.AbstractC2101b;
import me.AbstractC2120h;
import org.json.JSONObject;
import pe.AbstractC2327c;
import pe.C2339o;
import pe.InterfaceC2330f;
import pe.InterfaceC2335k;
import pe.InterfaceC2337m;
import pe.InterfaceC2345u;
import pe.ak;
import pe.al;
import r1.InterfaceC2482a;
import s6.V4;
import se.AbstractC2858h;
import se.C2859i;
import se.C2871u;
import se.C2873w;
import se.ab;
import se.ah;
import se.ai;
import se.aq;
import t6.AbstractC3066u3;
import t6.Z2;
import vf.ad;
import x9.InterfaceC3312f;
import yf.N;

/* loaded from: classes2.dex */
public class l implements G6.g, InterfaceC2337m, InterfaceC1954a, V2.f, InterfaceC3312f, Vf.a, T5.m, J0, InterfaceC0757c, androidx.camera.core.impl.r, az {
    public final /* synthetic */ int alpha;
    public Object purple;

    public /* synthetic */ l(int i4, Object obj) {
        this.alpha = i4;
        this.purple = obj;
    }

    public static String i(Vf.c cVar) {
        l lVar = new l(10);
        cVar.describeTo(lVar);
        return ((StringBuilder) lVar.purple).toString();
    }

    public static String yellow(Object obj) {
        try {
            return String.valueOf(obj);
        } catch (Exception unused) {
            return obj.getClass().getName() + "@" + Integer.toHexString(obj.hashCode());
        }
    }

    public ByteBuffer a() {
        return ((Image.Plane) this.purple).getBuffer();
    }

    @Override // T5.m
    public void accept(Object obj, Object obj2) {
        switch (this.alpha) {
            case 15:
                G6.h hVar = (G6.h) obj2;
                X5.a aVar = (X5.a) ((X5.c) obj).tango();
                Parcel obtain = Parcel.obtain();
                obtain.writeInterfaceToken(aVar.india);
                AbstractC2101b.charlie(obtain, (TelemetryData) this.purple);
                try {
                    aVar.hotel.transact(1, obtain, null, 1);
                    obtain.recycle();
                    hVar.bravo(null);
                    return;
                } catch (Throwable th) {
                    obtain.recycle();
                    throw th;
                }
            default:
                Z5.e eVar = new Z5.e(1, (G6.h) obj2);
                Z5.d dVar = (Z5.d) ((Z5.g) obj).tango();
                ApiFeatureRequest apiFeatureRequest = (ApiFeatureRequest) this.purple;
                Parcel obtain2 = Parcel.obtain();
                obtain2.writeInterfaceToken(dVar.india);
                AbstractC2101b.delta(obtain2, eVar);
                AbstractC2101b.charlie(obtain2, apiFeatureRequest);
                obtain2.writeStrongBinder(null);
                dVar.bravo(obtain2, 2);
                return;
        }
    }

    @Override // V2.f
    public void alpha(int i4) {
    }

    @Override // pe.InterfaceC2337m
    public /* bridge */ /* synthetic */ Object amber(InterfaceC2345u interfaceC2345u, Object obj) {
        j(interfaceC2345u, (StringBuilder) obj);
        return Unit.INSTANCE;
    }

    @Override // be.InterfaceC0757c
    public void b(Throwable th) {
        ((aj) this.purple).close();
    }

    @Override // androidx.camera.core.impl.af
    public /* synthetic */ Set beige(C0505c c0505c) {
        return P0.juliet(this, c0505c);
    }

    @Override // x9.InterfaceC3312f
    public void black(View view, int i4, Object obj) {
        switch (this.alpha) {
            case 9:
                Bank item = (Bank) obj;
                Intrinsics.echo(item, "item");
                Intrinsics.echo(view, "view");
                Va.a aVar = (Va.a) this.purple;
                wa.i iVar = aVar.f2170v;
                if (iVar != null) {
                    iVar.invoke(item);
                }
                aVar.juliet();
                return;
            default:
                PlatformListResponse item2 = (PlatformListResponse) obj;
                Intrinsics.echo(item2, "item");
                Intrinsics.echo(view, "view");
                Ya.d dVar = (Ya.d) this.purple;
                wa.i iVar2 = dVar.f2274v;
                if (iVar2 != null) {
                    iVar2.invoke(item2);
                }
                dVar.juliet();
                return;
        }
    }

    @Override // V2.f
    public void bravo(MemoryCache$Key memoryCache$Key, Bitmap bitmap, Map map) {
        ((Fe.c) this.purple).kilo(memoryCache$Key, bitmap, map, Z2.bravo(bitmap));
    }

    public int c() {
        return ((Image.Plane) this.purple).getPixelStride();
    }

    @Override // androidx.camera.core.impl.af
    public /* synthetic */ void charlie(ao aoVar) {
        P0.echo(this, aoVar);
    }

    @Override // pe.InterfaceC2337m
    public Object coral(Object obj, se.z zVar) {
        StringBuilder builder = (StringBuilder) obj;
        Intrinsics.echo(builder, "builder");
        ((Pe.t) this.purple).ivory(zVar, builder, true);
        return Unit.INSTANCE;
    }

    public int d() {
        return ((Image.Plane) this.purple).getRowStride();
    }

    @Override // pe.InterfaceC2337m
    public Object delta(AbstractC2858h abstractC2858h, Object obj) {
        StringBuilder builder = (StringBuilder) obj;
        Intrinsics.echo(builder, "builder");
        ((Pe.t) this.purple).plum(abstractC2858h, builder, true);
        return Unit.INSTANCE;
    }

    public void e() {
        if (((B) getConfig()).plum(androidx.camera.core.impl.r.echo, null) == null) {
        } else {
            throw new ClassCastException();
        }
    }

    @Override // androidx.camera.core.impl.af
    public /* synthetic */ boolean echo(C0505c c0505c) {
        return P0.alpha(this, c0505c);
    }

    public W7.b f(JSONObject jSONObject) {
        W7.c uVar;
        int i4 = jSONObject.getInt("settings_version");
        if (i4 != 3) {
            Log.e("FirebaseCrashlytics", "Could not determine SettingsJsonTransform for settings version " + i4 + ". Using default settings values.", null);
            uVar = new g8.d(11);
        } else {
            uVar = new r6.u(11);
        }
        return uVar.golf((U8.a) this.purple, jSONObject);
    }

    @Override // androidx.camera.core.impl.az
    public void foxtrot(Object obj) {
        ((InterfaceC2482a) this.purple).accept(obj);
    }

    public JSONObject g() {
        FileInputStream fileInputStream;
        JSONObject jSONObject;
        FileInputStream fileInputStream2 = null;
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Checking for cached settings...", null);
        }
        try {
            File file = (File) this.purple;
            if (file.exists()) {
                fileInputStream = new FileInputStream(file);
                try {
                    try {
                        jSONObject = new JSONObject(f.india(fileInputStream));
                        fileInputStream2 = fileInputStream;
                    } catch (Exception e) {
                        e = e;
                        Log.e("FirebaseCrashlytics", "Failed to fetch cached settings", e);
                        f.bravo(fileInputStream, "Error while closing settings cache file.");
                        return null;
                    }
                } catch (Throwable th) {
                    th = th;
                    fileInputStream2 = fileInputStream;
                    f.bravo(fileInputStream2, "Error while closing settings cache file.");
                    throw th;
                }
            } else {
                if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                    Log.v("FirebaseCrashlytics", "Settings file does not exist.", null);
                }
                jSONObject = null;
            }
            f.bravo(fileInputStream2, "Error while closing settings cache file.");
            return jSONObject;
        } catch (Exception e4) {
            e = e4;
            fileInputStream = null;
        } catch (Throwable th2) {
            th = th2;
            f.bravo(fileInputStream2, "Error while closing settings cache file.");
            throw th;
        }
    }

    @Override // androidx.camera.core.impl.H
    public af getConfig() {
        return B.red;
    }

    @Override // pe.InterfaceC2337m
    public Object gold(ai aiVar, Object obj) {
        StringBuilder builder = (StringBuilder) obj;
        Intrinsics.echo(builder, "builder");
        k(aiVar, builder, "getter");
        return Unit.INSTANCE;
    }

    @Override // j9.InterfaceC1954a
    public boolean gray() {
        switch (this.alpha) {
            case 4:
                return ((OrderHistoryFragment) this.purple).f12343k;
            case 5:
                return ((Qc.k) ((TicketsFragment) this.purple).romeo().bravo.getValue()).bravo;
            default:
                return ((WithDrawHistoryFragment) this.purple).f12544i;
        }
    }

    public void h(char c3) {
        if (c3 != '\t') {
            if (c3 != '\n') {
                if (c3 != '\r') {
                    if (c3 != '\"') {
                        red(c3);
                        return;
                    } else {
                        silver("\\\"");
                        return;
                    }
                }
                silver("\\r");
                return;
            }
            silver("\\n");
            return;
        }
        silver("\\t");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0133  */
    @Override // pe.InterfaceC2337m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object hotel(C2859i c2859i, Object obj) {
        boolean z2;
        boolean booleanValue;
        boolean z10;
        C2859i lavender;
        ArrayList arrayList;
        StringBuilder builder = (StringBuilder) obj;
        Intrinsics.echo(builder, "builder");
        Pe.t tVar = (Pe.t) this.purple;
        tVar.getClass();
        tVar.yankee(builder, c2859i, null);
        Pe.z zVar = tVar.delta;
        ge.v[] vVarArr = Pe.z.ochre;
        if (((Boolean) zVar.oscar.alpha(vVarArr[13], zVar)).booleanValue() || c2859i.zulu().golf() != 2) {
            C2339o visibility = c2859i.getVisibility();
            Intrinsics.delta(visibility, "constructor.visibility");
            if (tVar.yellow(visibility, builder)) {
                z2 = true;
                tVar.emerald(builder, c2859i);
                booleanValue = ((Boolean) zVar.indigo.alpha(vVarArr[39], zVar)).booleanValue();
                boolean z11 = c2859i.f13752w;
                if (booleanValue && z11 && !z2) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                if (z10) {
                    builder.append(tVar.cyan("constructor"));
                }
                InterfaceC2330f lima = c2859i.lima();
                Intrinsics.delta(lima, "constructor.containingDeclaration");
                if (((Boolean) zVar.zulu.alpha(vVarArr[24], zVar)).booleanValue()) {
                    if (z10) {
                        builder.append(" ");
                    }
                    tVar.ivory(lima, builder, true);
                    tVar.red(builder, c2859i.getTypeParameters(), false);
                }
                List peach = c2859i.peach();
                Intrinsics.delta(peach, "constructor.valueParameters");
                tVar.white(builder, peach, c2859i.blue());
                if (((Boolean) zVar.quebec.alpha(vVarArr[15], zVar)).booleanValue() && !z11 && (lavender = lima.lavender()) != null) {
                    List peach2 = lavender.peach();
                    Intrinsics.delta(peach2, "primaryConstructor.valueParameters");
                    arrayList = new ArrayList();
                    for (Object obj2 : peach2) {
                        aq aqVar = (aq) obj2;
                        if (!aqVar.a0() && aqVar.f13747c == null) {
                            arrayList.add(obj2);
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        builder.append(" : ");
                        builder.append(tVar.cyan("this"));
                        builder.append(CollectionsKt.maroon(arrayList, ", ", "(", ")", Pe.r.alpha, 24));
                    }
                }
                if (((Boolean) zVar.zulu.alpha(Pe.z.ochre[24], zVar)).booleanValue()) {
                    tVar.a(c2859i.getTypeParameters(), builder);
                }
                return Unit.INSTANCE;
            }
        }
        z2 = false;
        tVar.emerald(builder, c2859i);
        booleanValue = ((Boolean) zVar.indigo.alpha(vVarArr[39], zVar)).booleanValue();
        boolean z112 = c2859i.f13752w;
        if (booleanValue) {
        }
        z10 = true;
        if (z10) {
        }
        InterfaceC2330f lima2 = c2859i.lima();
        Intrinsics.delta(lima2, "constructor.containingDeclaration");
        if (((Boolean) zVar.zulu.alpha(vVarArr[24], zVar)).booleanValue()) {
        }
        List peach3 = c2859i.peach();
        Intrinsics.delta(peach3, "constructor.valueParameters");
        tVar.white(builder, peach3, c2859i.blue());
        if (((Boolean) zVar.quebec.alpha(vVarArr[15], zVar)).booleanValue()) {
            List peach22 = lavender.peach();
            Intrinsics.delta(peach22, "primaryConstructor.valueParameters");
            arrayList = new ArrayList();
            while (r5.hasNext()) {
            }
            if (!arrayList.isEmpty()) {
            }
        }
        if (((Boolean) zVar.zulu.alpha(Pe.z.ochre[24], zVar)).booleanValue()) {
        }
        return Unit.INSTANCE;
    }

    @Override // pe.InterfaceC2337m
    public Object india(se.aj ajVar, Object obj) {
        StringBuilder builder = (StringBuilder) obj;
        Intrinsics.echo(builder, "builder");
        k(ajVar, builder, "setter");
        return Unit.INSTANCE;
    }

    @Override // j9.InterfaceC1954a
    public boolean isLoading() {
        switch (this.alpha) {
            case 4:
                return ((SwipeRefreshLayout) ((OrderHistoryFragment) this.purple).romeo().delta).red;
            case 5:
                return ((Qc.k) ((TicketsFragment) this.purple).romeo().bravo.getValue()).charlie;
            default:
                return ((SwipeRefreshLayout) ((WithDrawHistoryFragment) this.purple).romeo().teal).red;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x00b4, code lost:
    
        if (((java.lang.Boolean) r2.green.alpha(Pe.z.ochre[38], r2)).booleanValue() != false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00f8, code lost:
    
        if (((java.lang.Boolean) r2.green.alpha(Pe.z.ochre[38], r2)).booleanValue() != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x01aa, code lost:
    
        if (me.AbstractC2120h.beige(r1, me.m.delta) == false) goto L56;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00bf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void j(InterfaceC2345u interfaceC2345u, StringBuilder builder) {
        String orange;
        boolean z2;
        Intrinsics.echo(builder, "builder");
        Pe.t tVar = (Pe.t) this.purple;
        boolean romeo = tVar.romeo();
        Pe.z zVar = tVar.delta;
        if (!romeo) {
            ge.v[] vVarArr = Pe.z.ochre;
            if (!((Boolean) zVar.golf.alpha(vVarArr[5], zVar)).booleanValue()) {
                tVar.yankee(builder, interfaceC2345u, null);
                List l10 = interfaceC2345u.l();
                Intrinsics.delta(l10, "function.contextReceiverParameters");
                tVar.beige(l10, builder);
                C2339o visibility = interfaceC2345u.getVisibility();
                Intrinsics.delta(visibility, "function.visibility");
                tVar.yellow(visibility, builder);
                tVar.gray(builder, interfaceC2345u);
                if (((Boolean) zVar.lavender.alpha(vVarArr[42], zVar)).booleanValue()) {
                    tVar.fuchsia(interfaceC2345u, builder);
                }
                tVar.lime(builder, interfaceC2345u);
                if (((Boolean) zVar.lavender.alpha(vVarArr[42], zVar)).booleanValue()) {
                    boolean z10 = false;
                    if (interfaceC2345u.isOperator()) {
                        Collection mike = interfaceC2345u.mike();
                        Intrinsics.delta(mike, "functionDescriptor.overriddenDescriptors");
                        Collection collection = mike;
                        if (!collection.isEmpty()) {
                            Iterator it = collection.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    break;
                                } else if (((InterfaceC2345u) it.next()).isOperator()) {
                                }
                            }
                        }
                        z2 = true;
                        if (interfaceC2345u.isInfix()) {
                            Collection mike2 = interfaceC2345u.mike();
                            Intrinsics.delta(mike2, "functionDescriptor.overriddenDescriptors");
                            Collection collection2 = mike2;
                            if (!collection2.isEmpty()) {
                                Iterator it2 = collection2.iterator();
                                while (true) {
                                    if (!it2.hasNext()) {
                                        break;
                                    } else if (((InterfaceC2345u) it2.next()).isInfix()) {
                                    }
                                }
                            }
                            z10 = true;
                        }
                        tVar.green(builder, interfaceC2345u.jade(), "tailrec");
                        tVar.green(builder, interfaceC2345u.isSuspend(), "suspend");
                        tVar.green(builder, interfaceC2345u.isInline(), "inline");
                        tVar.green(builder, z10, "infix");
                        tVar.green(builder, z2, TriggerAdapter.INAPP_OPERATOR);
                    }
                    z2 = false;
                    if (interfaceC2345u.isInfix()) {
                    }
                    tVar.green(builder, interfaceC2345u.jade(), "tailrec");
                    tVar.green(builder, interfaceC2345u.isSuspend(), "suspend");
                    tVar.green(builder, interfaceC2345u.isInline(), "inline");
                    tVar.green(builder, z10, "infix");
                    tVar.green(builder, z2, TriggerAdapter.INAPP_OPERATOR);
                } else {
                    tVar.green(builder, interfaceC2345u.isSuspend(), "suspend");
                }
                tVar.emerald(builder, interfaceC2345u);
                if (tVar.uniform()) {
                    if (interfaceC2345u.q()) {
                        builder.append("/*isHiddenToOvercomeSignatureClash*/ ");
                    }
                    if (interfaceC2345u.v()) {
                        builder.append("/*isHiddenForResolutionEverywhereBesideSupercalls*/ ");
                    }
                }
            }
            builder.append(tVar.cyan("fun"));
            builder.append(" ");
            List typeParameters = interfaceC2345u.getTypeParameters();
            Intrinsics.delta(typeParameters, "function.typeParameters");
            tVar.red(builder, typeParameters, true);
            tVar.navy(builder, interfaceC2345u);
        }
        tVar.ivory(interfaceC2345u, builder, true);
        List peach = interfaceC2345u.peach();
        Intrinsics.delta(peach, "function.valueParameters");
        tVar.white(builder, peach, interfaceC2345u.blue());
        tVar.ochre(builder, interfaceC2345u);
        kotlin.reflect.jvm.internal.impl.types.y returnType = interfaceC2345u.getReturnType();
        ge.v[] vVarArr2 = Pe.z.ochre;
        if (!((Boolean) zVar.lima.alpha(vVarArr2[10], zVar)).booleanValue()) {
            if (!((Boolean) zVar.kilo.alpha(vVarArr2[9], zVar)).booleanValue() && returnType != null) {
                Ne.f fVar = AbstractC2120h.echo;
            }
            builder.append(": ");
            if (returnType == null) {
                orange = "[NULL]";
            } else {
                orange = tVar.orange(returnType);
            }
            builder.append(orange);
        }
        List typeParameters2 = interfaceC2345u.getTypeParameters();
        Intrinsics.delta(typeParameters2, "function.typeParameters");
        tVar.a(typeParameters2, builder);
    }

    @Override // pe.InterfaceC2337m
    public Object jade(se.y yVar, Object obj) {
        boolean z2;
        C2859i lavender;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        String str;
        StringBuilder builder = (StringBuilder) obj;
        Intrinsics.echo(builder, "builder");
        Pe.t tVar = (Pe.t) this.purple;
        tVar.getClass();
        if (yVar.c() == 4) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!tVar.romeo()) {
            tVar.yankee(builder, yVar, null);
            List z15 = yVar.z();
            Intrinsics.delta(z15, "klass.contextReceivers");
            tVar.beige(z15, builder);
            if (!z2) {
                C2339o visibility = yVar.getVisibility();
                Intrinsics.delta(visibility, "klass.visibility");
                tVar.yellow(visibility, builder);
            }
            if ((yVar.c() != 2 || yVar.golf() != 4) && (!AbstractC2327c.oscar(yVar.c()) || yVar.golf() != 1)) {
                int golf = yVar.golf();
                com.google.android.material.datepicker.j.sierra(golf, "klass.modality");
                tVar.gold(builder, golf, Pe.t.victor(yVar));
            }
            tVar.fuchsia(yVar, builder);
            if (tVar.quebec().contains(Pe.u.INNER) && yVar.india()) {
                z10 = true;
            } else {
                z10 = false;
            }
            tVar.green(builder, z10, "inner");
            if (tVar.quebec().contains(Pe.u.DATA) && yVar.B()) {
                z11 = true;
            } else {
                z11 = false;
            }
            tVar.green(builder, z11, Column.DATA);
            if (tVar.quebec().contains(Pe.u.INLINE) && yVar.isInline()) {
                z12 = true;
            } else {
                z12 = false;
            }
            tVar.green(builder, z12, "inline");
            if (tVar.quebec().contains(Pe.u.VALUE) && yVar.hotel()) {
                z13 = true;
            } else {
                z13 = false;
            }
            tVar.green(builder, z13, "value");
            if (tVar.quebec().contains(Pe.u.FUN) && yVar.azure()) {
                z14 = true;
            } else {
                z14 = false;
            }
            tVar.green(builder, z14, "fun");
            if (yVar.uniform()) {
                str = "companion object";
            } else {
                int mike = av.q.mike(yVar.c());
                if (mike != 0) {
                    if (mike != 1) {
                        if (mike != 2) {
                            if (mike != 3) {
                                if (mike != 4) {
                                    if (mike == 5) {
                                        str = "object";
                                    } else {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                } else {
                                    str = "annotation class";
                                }
                            } else {
                                str = "enum entry";
                            }
                        } else {
                            str = "enum class";
                        }
                    } else {
                        str = "interface";
                    }
                } else {
                    str = "class";
                }
            }
            builder.append(tVar.cyan(str));
        }
        boolean lima = Qe.e.lima(yVar);
        Pe.z zVar = tVar.delta;
        if (!lima) {
            if (!tVar.romeo()) {
                Pe.t.olive(builder);
            }
            tVar.ivory(yVar, builder, true);
        } else {
            if (((Boolean) zVar.bronze.alpha(Pe.z.ochre[30], zVar)).booleanValue()) {
                if (tVar.romeo()) {
                    builder.append("companion object");
                }
                Pe.t.olive(builder);
                InterfaceC2335k lima2 = yVar.lima();
                if (lima2 != null) {
                    builder.append("of ");
                    Ne.f name = lima2.getName();
                    Intrinsics.delta(name, "containingDeclaration.name");
                    builder.append(tVar.indigo(name, false));
                }
            }
            if (tVar.uniform() || !Intrinsics.areEqual(yVar.getName(), Ne.h.bravo)) {
                if (!tVar.romeo()) {
                    Pe.t.olive(builder);
                }
                Ne.f name2 = yVar.getName();
                Intrinsics.delta(name2, "descriptor.name");
                builder.append(tVar.indigo(name2, true));
            }
        }
        if (!z2) {
            List papa = yVar.papa();
            Intrinsics.delta(papa, "klass.declaredTypeParameters");
            tVar.red(builder, papa, false);
            tVar.amber(yVar, builder);
            if (!AbstractC2327c.oscar(yVar.c())) {
                if (((Boolean) zVar.india.alpha(Pe.z.ochre[7], zVar)).booleanValue() && (lavender = yVar.lavender()) != null) {
                    builder.append(" ");
                    tVar.yankee(builder, lavender, null);
                    C2859i c2859i = lavender;
                    C2339o visibility2 = c2859i.getVisibility();
                    Intrinsics.delta(visibility2, "primaryConstructor.visibility");
                    tVar.yellow(visibility2, builder);
                    builder.append(tVar.cyan("constructor"));
                    List peach = c2859i.peach();
                    Intrinsics.delta(peach, "primaryConstructor.valueParameters");
                    tVar.white(builder, peach, lavender.blue());
                }
            }
            if (!((Boolean) zVar.whiskey.alpha(Pe.z.ochre[21], zVar)).booleanValue() && !AbstractC2120h.black(yVar.oscar())) {
                Collection lima3 = yVar.tango().lima();
                Intrinsics.delta(lima3, "klass.typeConstructor.supertypes");
                if (!lima3.isEmpty() && (lima3.size() != 1 || !AbstractC2120h.whiskey((kotlin.reflect.jvm.internal.impl.types.y) lima3.iterator().next()))) {
                    Pe.t.olive(builder);
                    builder.append(": ");
                    CollectionsKt.magenta(lima3, builder, ", ", null, null, new Pe.p(tVar, 2), 60);
                }
            }
            tVar.a(papa, builder);
        }
        return Unit.INSTANCE;
    }

    @Override // androidx.camera.core.impl.af
    public /* synthetic */ Object juliet(C0505c c0505c, ae aeVar) {
        return P0.xray(this, c0505c, aeVar);
    }

    public void k(ak akVar, StringBuilder sb2, String str) {
        Pe.t tVar = (Pe.t) this.purple;
        Pe.z zVar = tVar.delta;
        int ordinal = ((Pe.ae) zVar.coral.alpha(Pe.z.ochre[31], zVar)).ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                return;
            }
            j(akVar, sb2);
        } else {
            tVar.fuchsia(akVar, sb2);
            sb2.append(str.concat(" for "));
            al Z4 = ((se.af) akVar).Z();
            Intrinsics.delta(Z4, "descriptor.correspondingProperty");
            Pe.t.november(tVar, Z4, sb2);
        }
    }

    @Override // pe.InterfaceC2337m
    public Object kilo(C2871u descriptor, Object obj) {
        StringBuilder builder = (StringBuilder) obj;
        Intrinsics.echo(descriptor, "descriptor");
        Intrinsics.echo(builder, "builder");
        builder.append(descriptor.getName());
        return Unit.INSTANCE;
    }

    @Override // V2.f
    public V2.a lavender(MemoryCache$Key memoryCache$Key) {
        return null;
    }

    @Override // pe.InterfaceC2337m
    public Object magenta(C2873w c2873w, Object obj) {
        StringBuilder builder = (StringBuilder) obj;
        Intrinsics.echo(builder, "builder");
        Pe.t tVar = (Pe.t) this.purple;
        tVar.getClass();
        tVar.magenta(c2873w.silver, "package", builder);
        if (tVar.delta.november()) {
            builder.append(" in context of ");
            tVar.ivory(c2873w.red, builder, false);
        }
        return Unit.INSTANCE;
    }

    @Override // pe.InterfaceC2337m
    public Object maroon(aq aqVar, Object obj) {
        StringBuilder builder = (StringBuilder) obj;
        Intrinsics.echo(builder, "builder");
        ((Pe.t) this.purple).teal(aqVar, true, builder, true);
        return Unit.INSTANCE;
    }

    @Override // pe.InterfaceC2337m
    public Object navy(ef.s sVar, Object obj) {
        StringBuilder builder = (StringBuilder) obj;
        Intrinsics.echo(builder, "builder");
        Pe.t tVar = (Pe.t) this.purple;
        tVar.getClass();
        tVar.yankee(builder, sVar, null);
        C2339o c2339o = sVar.teal;
        Intrinsics.delta(c2339o, "typeAlias.visibility");
        tVar.yellow(c2339o, builder);
        tVar.fuchsia(sVar, builder);
        builder.append(tVar.cyan("typealias"));
        builder.append(" ");
        tVar.ivory(sVar, builder, true);
        tVar.red(builder, sVar.papa(), false);
        tVar.amber(sVar, builder);
        builder.append(" = ");
        builder.append(tVar.orange(sVar.b0()));
        return Unit.INSTANCE;
    }

    @Override // pe.InterfaceC2337m
    public Object ochre(ah descriptor, Object obj) {
        StringBuilder builder = (StringBuilder) obj;
        Intrinsics.echo(descriptor, "descriptor");
        Intrinsics.echo(builder, "builder");
        Pe.t.november((Pe.t) this.purple, descriptor, builder);
        return Unit.INSTANCE;
    }

    @Override // androidx.camera.core.impl.az
    public void onError(Throwable th) {
        AbstractC3066u3.delta("ObserverToConsumerAdapter", "Unexpected error in Observable", th);
    }

    @Override // androidx.appcompat.widget.J0
    public boolean onQueryTextChange(String str) {
        Xa.g gVar = (Xa.g) this.purple;
        BaseViewModel.launchApi$default((AuthViewModel) gVar.f2249z.getValue(), null, new Xa.e(str, gVar, null), 1, null);
        return true;
    }

    @Override // androidx.appcompat.widget.J0
    public boolean onQueryTextSubmit(String str) {
        return true;
    }

    @Override // be.InterfaceC0757c
    public /* bridge */ /* synthetic */ void onSuccess(Object obj) {
    }

    @Override // androidx.camera.core.impl.af
    public /* synthetic */ ae pink(C0505c c0505c) {
        return P0.hotel(this, c0505c);
    }

    @Override // androidx.camera.core.impl.af
    public /* synthetic */ Object plum(C0505c c0505c, Object obj) {
        return P0.whiskey(this, c0505c, obj);
    }

    public void purple(androidx.appcompat.app.g gVar, ConstraintLayout constraintLayout, EnumC1747h enumC1747h) {
        WindowManager.LayoutParams attributes;
        WindowManager.LayoutParams attributes2;
        int i4 = V9.a.$EnumSwitchMapping$0[enumC1747h.ordinal()];
        if (i4 != 1) {
            if (i4 != 2) {
                if (i4 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                return;
            }
            Window window = gVar.getWindow();
            if (window != null && (attributes2 = window.getAttributes()) != null) {
                attributes2.windowAnimations = R.style.Animation.Dialog;
                return;
            }
            return;
        }
        ObjectAnimator objectAnimator = (ObjectAnimator) this.purple;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        this.purple = null;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(constraintLayout, "alpha", 1.0f, 0.7f, 1.0f);
        ofFloat.setDuration(1000L);
        ofFloat.setRepeatCount(-1);
        ofFloat.setRepeatMode(2);
        ofFloat.start();
        this.purple = ofFloat;
        Window window2 = gVar.getWindow();
        if (window2 != null && (attributes = window2.getAttributes()) != null) {
            attributes.windowAnimations = R.style.Animation.Dialog;
        }
    }

    @Override // androidx.camera.core.impl.af
    public /* synthetic */ Object quebec(C0505c c0505c) {
        return P0.victor(this, c0505c);
    }

    public void red(char c3) {
        try {
            ((StringBuilder) this.purple).append(c3);
        } catch (IOException e) {
            throw new RuntimeException("Could not write description", e);
        }
    }

    @Override // androidx.camera.core.impl.af
    public /* synthetic */ Set romeo() {
        return P0.oscar(this);
    }

    @Override // pe.InterfaceC2337m
    public Object sierra(ab abVar, Object obj) {
        StringBuilder builder = (StringBuilder) obj;
        Intrinsics.echo(builder, "builder");
        Pe.t tVar = (Pe.t) this.purple;
        tVar.getClass();
        tVar.magenta(abVar.teal, "package-fragment", builder);
        if (tVar.delta.november()) {
            builder.append(" in ");
            tVar.ivory(abVar.lima(), builder, false);
        }
        return Unit.INSTANCE;
    }

    public void silver(String str) {
        try {
            ((StringBuilder) this.purple).append((CharSequence) str);
        } catch (IOException e) {
            throw new RuntimeException("Could not write description", e);
        }
    }

    public l teal(Object obj) {
        if (obj == null) {
            silver(BuildConfig.TRAVIS);
            return this;
        }
        int i4 = 0;
        if (obj instanceof String) {
            String str = (String) obj;
            red('\"');
            while (i4 < str.length()) {
                h(str.charAt(i4));
                i4++;
            }
            red('\"');
            return this;
        }
        if (obj instanceof Character) {
            red('\"');
            h(((Character) obj).charValue());
            red('\"');
            return this;
        }
        if (obj instanceof Short) {
            red('<');
            silver(yellow(obj));
            silver("s>");
            return this;
        }
        if (obj instanceof Long) {
            red('<');
            silver(yellow(obj));
            silver("L>");
            return this;
        }
        if (obj instanceof Float) {
            red('<');
            silver(yellow(obj));
            silver("F>");
            return this;
        }
        if (obj.getClass().isArray()) {
            if (obj.getClass().isArray()) {
                silver(Constants.AES_PREFIX);
                for (int i5 = 0; i5 < Array.getLength(obj); i5++) {
                    if (i4 != 0) {
                        silver(", ");
                    }
                    teal(Array.get(obj, i5));
                    i4 = 1;
                }
                silver(Constants.AES_SUFFIX);
                return this;
            }
            throw new IllegalArgumentException("not an array");
        }
        red('<');
        silver(yellow(obj));
        red('>');
        return this;
    }

    @Override // G6.g
    public Task then(Object obj) {
        if (((W7.b) obj) == null) {
            Log.w("FirebaseCrashlytics", "Received null app settings at app startup. Cannot send cached reports", null);
            return V4.echo(null);
        }
        J2.c cVar = (J2.c) this.purple;
        n.alpha((n) cVar.red);
        n nVar = (n) cVar.red;
        nVar.mike.golf(nVar.echo.alpha, null);
        nVar.quebec.delta(null);
        return V4.echo(null);
    }

    public String toString() {
        switch (this.alpha) {
            case 10:
                return ((StringBuilder) this.purple).toString();
            default:
                return super.toString();
        }
    }

    @Override // j9.InterfaceC1954a
    public void whiskey() {
        switch (this.alpha) {
            case 4:
                OrderHistoryFragment orderHistoryFragment = (OrderHistoryFragment) this.purple;
                orderHistoryFragment.f12342j++;
                ((SwipeRefreshLayout) orderHistoryFragment.romeo().delta).setRefreshing(true);
                orderHistoryFragment.quebec();
                return;
            case 5:
                TicketsViewModel romeo = ((TicketsFragment) this.purple).romeo();
                N n5 = romeo.bravo;
                Qc.k kVar = (Qc.k) n5.getValue();
                if (!kVar.charlie && !kVar.bravo) {
                    n5.juliet(null, Qc.k.alpha(kVar, true));
                    ad.zulu(T.hotel(romeo), null, null, new Qc.l(romeo, kVar.alpha + 1, null), 3);
                    return;
                }
                return;
            default:
                WithDrawHistoryFragment withDrawHistoryFragment = (WithDrawHistoryFragment) this.purple;
                withDrawHistoryFragment.f12543h++;
                withDrawHistoryFragment.quebec();
                return;
        }
    }

    public P2.h white() {
        P2.c foxtrot;
        C3.d dVar = (C3.d) this.purple;
        P2.f fVar = (P2.f) dVar.silver;
        synchronized (fVar) {
            dVar.charlie(true);
            foxtrot = fVar.foxtrot(((P2.b) dVar.red).alpha);
        }
        if (foxtrot != null) {
            return new P2.h(foxtrot);
        }
        return null;
    }

    public /* synthetic */ l(int i4, boolean z2) {
        this.alpha = i4;
    }

    public /* synthetic */ l(Z5.f fVar, ApiFeatureRequest apiFeatureRequest) {
        this.alpha = 19;
        this.purple = apiFeatureRequest;
    }

    public l(int i4) {
        this.alpha = i4;
        switch (i4) {
            case 25:
                this.purple = new C0506d(new Object());
                return;
            default:
                this.purple = new StringBuilder();
                return;
        }
    }

    public l(U7.c cVar) {
        this.alpha = 11;
        this.purple = new File((File) cVar.red, "com.crashlytics.settings.json");
    }

    public l(CameraCaptureSession cameraCaptureSession, Handler handler) {
        this.alpha = 21;
        if (Build.VERSION.SDK_INT >= 28) {
            this.purple = new J2.l(cameraCaptureSession, (j) null);
        } else {
            this.purple = new J2.l(cameraCaptureSession, new j(23, handler));
        }
    }

    public l(Hd.b bVar) {
        this.alpha = 3;
        this.purple = new Pf.i(bVar, kotlin.text.a.alpha);
    }
}
