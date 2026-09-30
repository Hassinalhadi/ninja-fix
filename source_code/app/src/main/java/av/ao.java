package av;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.SurfaceTexture;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import android.util.Size;
import android.view.Surface;
import androidx.appcompat.widget.C0487w0;
import androidx.appcompat.widget.C0488x;
import androidx.appcompat.widget.P0;
import androidx.appcompat.widget.S0;
import androidx.camera.core.J;
import androidx.camera.core.impl.L;
import androidx.camera.core.impl.M;
import androidx.camera.core.impl.P;
import cf.InterfaceC0845a;
import cf.InterfaceC0847c;
import com.google.android.gms.measurement.internal.C1467s;
import com.google.crypto.tink.shaded.protobuf.AbstractC1490h;
import com.google.crypto.tink.shaded.protobuf.C1489g;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import delivery.samurai.android.R;
import g.C1718a;
import g1.AbstractC1735d;
import ge.InterfaceC1772d;
import i8.InterfaceC1904b;
import j1.AbstractC1928b;
import j8.C1944a;
import j8.C1946c;
import j8.InterfaceC1947d;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.security.GeneralSecurityException;
import java.security.KeyStoreException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.ProviderException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import le.AbstractC2074a;
import pe.AbstractC2347w;
import pe.InterfaceC2330f;
import s1.C2576i;
import s6.AbstractC2607a5;
import s6.AbstractC2617b6;
import s6.AbstractC2625c5;
import s6.AbstractC2634d5;
import s6.V4;
import t6.AbstractC3062u;
import t6.AbstractC3075w2;
import ue.C3157a;
import ue.C3158b;
import ve.AbstractC3192d;
import w7.C3238a;

/* loaded from: classes3.dex */
public final class ao implements InterfaceC0845a, InterfaceC0847c {
    public Object alpha;
    public Object purple;
    public Object red;
    public Object silver;
    public Object teal;
    public Object white;

    public /* synthetic */ ao(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        this.alpha = obj;
        this.purple = obj2;
        this.red = obj3;
        this.silver = obj4;
        this.teal = obj5;
        this.white = obj6;
    }

    public static final Se.g echo(ao aoVar, Ne.f fVar, Object obj) {
        Se.g bravo = Se.h.alpha.bravo(obj, (se.z) aoVar.red);
        if (bravo == null) {
            String message = "Unsupported annotation argument: " + fVar;
            Intrinsics.echo(message, "message");
            return new Se.j(message);
        }
        return bravo;
    }

    public static void emerald(Drawable drawable, int i4, PorterDuff.Mode mode) {
        Drawable mutate = drawable.mutate();
        if (mode == null) {
            mode = C0488x.bravo;
        }
        mutate.setColorFilter(C0488x.charlie(i4, mode));
    }

    public static boolean hotel(int i4, int[] iArr) {
        for (int i5 : iArr) {
            if (i5 == i4) {
                return true;
            }
        }
        return false;
    }

    public static ColorStateList mike(int i4, Context context) {
        int charlie = S0.charlie(R.attr.colorControlHighlight, context);
        return new ColorStateList(new int[][]{S0.bravo, S0.delta, S0.charlie, S0.foxtrot}, new int[]{S0.bravo(R.attr.colorButtonNormal, context), AbstractC1928b.bravo(charlie, i4), AbstractC1928b.bravo(charlie, i4), i4});
    }

    public static /* synthetic */ List sierra(ao aoVar, A2.aj ajVar, Ge.o oVar, Boolean bool, boolean z2, int i4) {
        boolean z10;
        boolean z11;
        if ((i4 & 4) != 0) {
            z10 = false;
        } else {
            z10 = true;
        }
        if ((i4 & 16) != 0) {
            bool = null;
        }
        Boolean bool2 = bool;
        if ((i4 & 32) != 0) {
            z11 = false;
        } else {
            z11 = z2;
        }
        return aoVar.romeo(ajVar, oVar, z10, false, bool2, z11);
    }

    public static Ge.o tango(Oe.l proto, Ke.e nameResolver, G6.j jVar, int i4, boolean z2) {
        Intrinsics.echo(proto, "proto");
        Intrinsics.echo(nameResolver, "nameResolver");
        com.google.android.material.datepicker.j.papa(i4, "kind");
        if (proto instanceof Ie.l) {
            Oe.h hVar = Me.h.alpha;
            Me.e alpha = Me.h.alpha((Ie.l) proto, nameResolver, jVar);
            if (alpha != null) {
                return AbstractC2634d5.foxtrot(alpha);
            }
        } else if (proto instanceof Ie.y) {
            Oe.h hVar2 = Me.h.alpha;
            Me.e charlie = Me.h.charlie((Ie.y) proto, nameResolver, jVar);
            if (charlie != null) {
                return AbstractC2634d5.foxtrot(charlie);
            }
        } else if (proto instanceof Ie.ag) {
            Oe.n propertySignature = Le.k.delta;
            Intrinsics.delta(propertySignature, "propertySignature");
            Le.e eVar = (Le.e) AbstractC2617b6.charlie(proto, propertySignature);
            if (eVar != null) {
                int mike = q.mike(i4);
                if (mike != 1) {
                    if (mike != 2) {
                        if (mike != 3 || (eVar.purple & 8) != 8) {
                            return null;
                        }
                        Le.c cVar = eVar.white;
                        Intrinsics.delta(cVar, "signature.setter");
                        return new Ge.o(nameResolver.getString(cVar.red).concat(nameResolver.getString(cVar.silver)));
                    }
                    if ((eVar.purple & 4) != 4) {
                        return null;
                    }
                    Le.c cVar2 = eVar.teal;
                    Intrinsics.delta(cVar2, "signature.getter");
                    return new Ge.o(nameResolver.getString(cVar2.red).concat(nameResolver.getString(cVar2.silver)));
                }
                return AbstractC2607a5.bravo((Ie.ag) proto, nameResolver, jVar, true, true, z2);
            }
        }
        return null;
    }

    public static LayerDrawable whiskey(C0487w0 c0487w0, Context context, int i4) {
        BitmapDrawable bitmapDrawable;
        BitmapDrawable bitmapDrawable2;
        BitmapDrawable bitmapDrawable3;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(i4);
        Drawable foxtrot = c0487w0.foxtrot(R.drawable.abc_star_black_48dp, context);
        Drawable foxtrot2 = c0487w0.foxtrot(R.drawable.abc_star_half_black_48dp, context);
        if ((foxtrot instanceof BitmapDrawable) && foxtrot.getIntrinsicWidth() == dimensionPixelSize && foxtrot.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable = (BitmapDrawable) foxtrot;
            bitmapDrawable2 = new BitmapDrawable(bitmapDrawable.getBitmap());
        } else {
            Bitmap createBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            foxtrot.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            foxtrot.draw(canvas);
            bitmapDrawable = new BitmapDrawable(createBitmap);
            bitmapDrawable2 = new BitmapDrawable(createBitmap);
        }
        bitmapDrawable2.setTileModeX(Shader.TileMode.REPEAT);
        if ((foxtrot2 instanceof BitmapDrawable) && foxtrot2.getIntrinsicWidth() == dimensionPixelSize && foxtrot2.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable3 = (BitmapDrawable) foxtrot2;
        } else {
            Bitmap createBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(createBitmap2);
            foxtrot2.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            foxtrot2.draw(canvas2);
            bitmapDrawable3 = new BitmapDrawable(createBitmap2);
        }
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable, bitmapDrawable3, bitmapDrawable2});
        layerDrawable.setId(0, android.R.id.background);
        layerDrawable.setId(1, android.R.id.secondaryProgress);
        layerDrawable.setId(2, android.R.id.progress);
        return layerDrawable;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x003e, code lost:
    
        if ((r9 & 64) == 64) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0052, code lost:
    
        if (r9.india != false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x002c, code lost:
    
        if ((r9 & 64) == 64) goto L11;
     */
    @Override // cf.InterfaceC0847c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public List alpha(A2.aj ajVar, Oe.l callableProto, int i4, int i5, Ie.ay ayVar) {
        Intrinsics.echo(callableProto, "callableProto");
        com.google.android.material.datepicker.j.papa(i4, "kind");
        int i10 = 0;
        Ge.o tango = tango(callableProto, (Ke.e) ajVar.bravo, (G6.j) ajVar.charlie, i4, false);
        if (tango != null) {
            if (callableProto instanceof Ie.y) {
                int i11 = ((Ie.y) callableProto).red;
                if ((i11 & 32) != 32) {
                }
                i10 = 1;
            } else if (callableProto instanceof Ie.ag) {
                int i12 = ((Ie.ag) callableProto).red;
                if ((i12 & 32) != 32) {
                }
                i10 = 1;
            } else if (callableProto instanceof Ie.l) {
                cf.r rVar = (cf.r) ajVar;
                if (rVar.hotel == Ie.i.ENUM_CLASS) {
                    i10 = 2;
                }
            } else {
                throw new UnsupportedOperationException("Unsupported message: " + callableProto.getClass());
            }
            return sierra(this, ajVar, new Ge.o(tango.alpha + '@' + (i5 + i10)), null, false, 60);
        }
        return CollectionsKt.emptyList();
    }

    public boolean amber(Ne.b bVar) {
        if (bVar.foxtrot() != null && Intrinsics.areEqual(bVar.india().bravo(), "Container")) {
            C3158b bravo = AbstractC2625c5.bravo((C2576i) this.alpha, bVar, (Me.f) this.white);
            if (bravo != null) {
                LinkedHashSet linkedHashSet = AbstractC2074a.alpha;
                Class klass = bravo.alpha;
                Intrinsics.echo(klass, "klass");
                Annotation[] declaredAnnotations = klass.getDeclaredAnnotations();
                Intrinsics.delta(declaredAnnotations, "klass.declaredAnnotations");
                boolean z2 = false;
                for (Annotation annotation : declaredAnnotations) {
                    Intrinsics.delta(annotation, "annotation");
                    if (Intrinsics.areEqual(AbstractC3192d.alpha(AbstractC3062u.bravo(AbstractC3062u.alpha(annotation))), ye.aa.bravo)) {
                        z2 = true;
                    }
                }
                if (z2) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [U7.c, java.lang.Object] */
    public U7.c azure(Ne.b bVar, pe.an anVar, List result) {
        Intrinsics.echo(result, "result");
        InterfaceC2330f foxtrot = AbstractC2347w.foxtrot((se.z) this.red, bVar, (J2.i) this.silver);
        ?? obj = new Object();
        obj.red = this;
        obj.silver = foxtrot;
        obj.teal = bVar;
        obj.white = result;
        obj.yellow = anVar;
        obj.alpha = this;
        obj.purple = new HashMap();
        return obj;
    }

    public U7.c beige(Ne.b bVar, C3157a c3157a, List result) {
        Intrinsics.echo(result, "result");
        if (AbstractC2074a.alpha.contains(bVar)) {
            return null;
        }
        return azure(bVar, c3157a, result);
    }

    public Object black(A2.aj ajVar, Ie.ag agVar, int i4, kotlin.reflect.jvm.internal.impl.types.y yVar, Xd.l lVar) {
        Object invoke;
        Ge.n nVar;
        C3158b yankee = yankee(ajVar, true, true, Ke.d.amber.echo(agVar.silver), Me.h.delta(agVar));
        if (yankee == null) {
            if (ajVar instanceof cf.r) {
                pe.an anVar = (pe.an) ((cf.r) ajVar).delta;
                if (anVar instanceof Ge.n) {
                    nVar = (Ge.n) anVar;
                } else {
                    nVar = null;
                }
                if (nVar != null) {
                    yankee = nVar.alpha;
                }
            }
            yankee = null;
        }
        if (yankee != null) {
            Me.f fVar = (Me.f) yankee.bravo.echo;
            Me.f version = Ge.e.echo;
            Intrinsics.echo(version, "version");
            Ge.o tango = tango(agVar, (Ke.e) ajVar.bravo, (G6.j) ajVar.charlie, i4, fVar.alpha(version.bravo, version.charlie, version.delta));
            if (tango != null && (invoke = lVar.invoke(((ff.e) this.purple).invoke(yankee), tango)) != null) {
                if (me.r.alpha(yVar)) {
                    invoke = (Se.g) invoke;
                    if (invoke instanceof Se.d) {
                        return new Se.x(((Number) ((Se.d) invoke).alpha).byteValue());
                    }
                    if (invoke instanceof Se.u) {
                        return new Se.x(((Number) ((Se.u) invoke).alpha).shortValue());
                    }
                    if (invoke instanceof Se.k) {
                        return new Se.x(((Number) ((Se.k) invoke).alpha).intValue());
                    }
                    if (invoke instanceof Se.s) {
                        return new Se.x(((Number) ((Se.s) invoke).alpha).longValue());
                    }
                }
                return invoke;
            }
        }
        return null;
    }

    public List blue(A2.aj ajVar, Ie.ag agVar, int i4) {
        Boolean echo = Ke.d.amber.echo(agVar.silver);
        boolean delta = Me.h.delta(agVar);
        boolean z2 = true;
        G6.j jVar = (G6.j) ajVar.charlie;
        Ke.e eVar = (Ke.e) ajVar.bravo;
        if (i4 == 1) {
            Ge.o charlie = AbstractC2607a5.charlie(agVar, eVar, jVar, 40);
            if (charlie == null) {
                return CollectionsKt.emptyList();
            }
            return sierra(this, ajVar, charlie, echo, delta, 8);
        }
        Ge.o charlie2 = AbstractC2607a5.charlie(agVar, eVar, jVar, 48);
        if (charlie2 == null) {
            return CollectionsKt.emptyList();
        }
        boolean beige = StringsKt.beige(charlie2.alpha, "$delegate", false);
        if (i4 != 3) {
            z2 = false;
        }
        if (beige != z2) {
            return CollectionsKt.emptyList();
        }
        return romeo(ajVar, charlie2, true, true, echo, delta);
    }

    @Override // cf.InterfaceC0845a
    public Object bravo(A2.aj container, Ie.ag proto, kotlin.reflect.jvm.internal.impl.types.y yVar) {
        Intrinsics.echo(container, "container");
        Intrinsics.echo(proto, "proto");
        return black(container, proto, 2, yVar, Ge.c.alpha);
    }

    public void bronze(aw awVar) {
        synchronized (this.purple) {
            ((LinkedHashSet) this.teal).add(awVar);
        }
    }

    @Override // cf.InterfaceC0847c
    public ArrayList charlie(Ie.av proto, Ke.e nameResolver) {
        int collectionSizeOrDefault;
        Intrinsics.echo(proto, "proto");
        Intrinsics.echo(nameResolver, "nameResolver");
        Object kilo = proto.kilo(Le.k.hotel);
        Intrinsics.delta(kilo, "proto.getExtension(JvmPr….typeParameterAnnotation)");
        Iterable<Ie.g> iterable = (Iterable) kilo;
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(iterable, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        for (Ie.g it : iterable) {
            Intrinsics.delta(it, "it");
            arrayList.add(((J2.c) this.teal).lima(it, nameResolver));
        }
        return arrayList;
    }

    public C2576i coral() {
        try {
            t7.b bVar = (t7.b) this.silver;
            if (bVar != null) {
                try {
                    z7.av avVar = (z7.av) C1718a.bronze((gd.a) this.alpha, bVar).purple;
                    com.google.crypto.tink.shaded.protobuf.v vVar = (com.google.crypto.tink.shaded.protobuf.v) avVar.delta(5);
                    vVar.charlie();
                    com.google.crypto.tink.shaded.protobuf.v.delta(vVar.purple, avVar);
                    return new C2576i((z7.as) vVar);
                } catch (InvalidProtocolBufferException | GeneralSecurityException e) {
                    Log.w("b", "cannot decrypt keyset: ", e);
                }
            }
            z7.av tango = z7.av.tango(((gd.a) this.alpha).golf(), com.google.crypto.tink.shaded.protobuf.p.alpha());
            if (tango.papa() > 0) {
                com.google.crypto.tink.shaded.protobuf.v vVar2 = (com.google.crypto.tink.shaded.protobuf.v) tango.delta(5);
                vVar2.charlie();
                com.google.crypto.tink.shaded.protobuf.v.delta(vVar2.purple, tango);
                return new C2576i((z7.as) vVar2);
            }
            throw new GeneralSecurityException("empty keyset");
        } catch (FileNotFoundException e4) {
            Log.w("b", "keyset not found, will generate a new one", e4);
            if (((C2576i) this.teal) != null) {
                C2576i c2576i = new C2576i(z7.av.sierra());
                C2576i c2576i2 = (C2576i) this.teal;
                synchronized (c2576i) {
                    c2576i.alpha((z7.aq) c2576i2.alpha);
                    c2576i.juliet(s7.k.alpha((z7.av) c2576i.delta().purple).oscar().quebec());
                    if (((t7.b) this.silver) != null) {
                        C1718a delta = c2576i.delta();
                        com.google.android.material.internal.ab abVar = (com.google.android.material.internal.ab) this.purple;
                        t7.b bVar2 = (t7.b) this.silver;
                        z7.av avVar2 = (z7.av) delta.purple;
                        byte[] alpha = bVar2.alpha(avVar2.bravo(), new byte[0]);
                        try {
                            if (z7.av.tango(bVar2.bravo(alpha, new byte[0]), com.google.crypto.tink.shaded.protobuf.p.alpha()).equals(avVar2)) {
                                z7.ae papa = z7.af.papa();
                                C1489g delta2 = AbstractC1490h.delta(alpha, 0, alpha.length);
                                papa.charlie();
                                z7.af.mike((z7.af) papa.purple, delta2);
                                z7.az alpha2 = s7.k.alpha(avVar2);
                                papa.charlie();
                                z7.af.november((z7.af) papa.purple, alpha2);
                                z7.af afVar = (z7.af) papa.alpha();
                                abVar.getClass();
                                if (!((SharedPreferences.Editor) abVar.purple).putString((String) abVar.red, com.bumptech.glide.c.bravo(afVar.bravo())).commit()) {
                                    throw new IOException("Failed to write to SharedPreferences");
                                }
                            } else {
                                throw new GeneralSecurityException("cannot encrypt keyset");
                            }
                        } catch (InvalidProtocolBufferException unused) {
                            throw new GeneralSecurityException("invalid keyset, corrupted key material");
                        }
                    } else {
                        C1718a delta3 = c2576i.delta();
                        com.google.android.material.internal.ab abVar2 = (com.google.android.material.internal.ab) this.purple;
                        z7.av avVar3 = (z7.av) delta3.purple;
                        abVar2.getClass();
                        if (!((SharedPreferences.Editor) abVar2.purple).putString((String) abVar2.red, com.bumptech.glide.c.bravo(avVar3.bravo())).commit()) {
                            throw new IOException("Failed to write to SharedPreferences");
                        }
                    }
                    return c2576i;
                }
            }
            throw new GeneralSecurityException("cannot read or generate keyset");
        }
    }

    public t7.b crimson() {
        C3238a c3238a = new C3238a();
        boolean charlie = c3238a.charlie((String) this.red);
        if (!charlie) {
            try {
                C3238a.alpha((String) this.red);
            } catch (GeneralSecurityException | ProviderException e) {
                Log.w("b", "cannot use Android Keystore, it'll be disabled", e);
                return null;
            }
        }
        try {
            return c3238a.bravo((String) this.red);
        } catch (GeneralSecurityException | ProviderException e4) {
            if (!charlie) {
                Log.w("b", "cannot use Android Keystore, it'll be disabled", e4);
                return null;
            }
            throw new KeyStoreException(ao.ad.gray("the master key ", (String) this.red, " exists but is unusable"), e4);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00f1 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void cyan(String str, String str2, Bundle bundle) {
        int i4;
        String str3;
        g8.f fVar;
        int alpha;
        PackageInfo echo;
        bundle.putString("scope", str2);
        bundle.putString("sender", str);
        bundle.putString("subtype", str);
        B7.g gVar = (B7.g) this.alpha;
        gVar.alpha();
        bundle.putString("gmp_app_id", gVar.charlie.bravo);
        S.j jVar = (S.j) this.purple;
        synchronized (jVar) {
            try {
                if (jVar.alpha == 0 && (echo = jVar.echo("com.google.android.gms")) != null) {
                    jVar.alpha = echo.versionCode;
                }
                i4 = jVar.alpha;
            } finally {
            }
        }
        bundle.putString("gmsv", Integer.toString(i4));
        bundle.putString("osv", Integer.toString(Build.VERSION.SDK_INT));
        bundle.putString("app_ver", ((S.j) this.purple).bravo());
        bundle.putString("app_ver_name", ((S.j) this.purple).charlie());
        B7.g gVar2 = (B7.g) this.alpha;
        gVar2.alpha();
        try {
            str3 = Base64.encodeToString(MessageDigest.getInstance("SHA-1").digest(gVar2.bravo.getBytes()), 11);
        } catch (NoSuchAlgorithmException unused) {
            str3 = "[HASH-ERROR]";
        }
        bundle.putString("firebase-app-name-hash", str3);
        try {
            String str4 = ((C1944a) V4.bravo(((C1946c) ((InterfaceC1947d) this.white)).echo())).alpha;
            if (!TextUtils.isEmpty(str4)) {
                bundle.putString("Goog-Firebase-Installations-Auth", str4);
            } else {
                Log.w("FirebaseMessaging", "FIS auth token is empty");
            }
        } catch (InterruptedException e) {
            e = e;
            Log.e("FirebaseMessaging", "Failed to get FIS auth token", e);
            bundle.putString("appid", (String) V4.bravo(((C1946c) ((InterfaceC1947d) this.white)).delta()));
            bundle.putString("cliv", "fcm-24.1.1");
            fVar = (g8.f) ((InterfaceC1904b) this.teal).get();
            D8.b bVar = (D8.b) ((InterfaceC1904b) this.silver).get();
            if (fVar != null) {
                return;
            } else {
                return;
            }
        } catch (ExecutionException e4) {
            e = e4;
            Log.e("FirebaseMessaging", "Failed to get FIS auth token", e);
            bundle.putString("appid", (String) V4.bravo(((C1946c) ((InterfaceC1947d) this.white)).delta()));
            bundle.putString("cliv", "fcm-24.1.1");
            fVar = (g8.f) ((InterfaceC1904b) this.teal).get();
            D8.b bVar2 = (D8.b) ((InterfaceC1904b) this.silver).get();
            if (fVar != null) {
            }
        }
        bundle.putString("appid", (String) V4.bravo(((C1946c) ((InterfaceC1947d) this.white)).delta()));
        bundle.putString("cliv", "fcm-24.1.1");
        fVar = (g8.f) ((InterfaceC1904b) this.teal).get();
        D8.b bVar22 = (D8.b) ((InterfaceC1904b) this.silver).get();
        if (fVar != null && bVar22 != null && (alpha = ((g8.c) fVar).alpha()) != 1) {
            bundle.putString("Firebase-Client-Log-Type", Integer.toString(q.mike(alpha)));
            bundle.putString("Firebase-Client", bVar22.alpha());
        }
    }

    @Override // cf.InterfaceC0847c
    public List delta(A2.aj ajVar, Oe.l proto, int i4) {
        Intrinsics.echo(proto, "proto");
        com.google.android.material.datepicker.j.papa(i4, "kind");
        if (i4 == 2) {
            return blue(ajVar, (Ie.ag) proto, 1);
        }
        Ge.o tango = tango(proto, (Ke.e) ajVar.bravo, (G6.j) ajVar.charlie, i4, false);
        if (tango == null) {
            return CollectionsKt.emptyList();
        }
        return sierra(this, ajVar, tango, null, false, 60);
    }

    @Override // cf.InterfaceC0847c
    public List foxtrot(A2.aj ajVar, Ie.ag proto) {
        Intrinsics.echo(proto, "proto");
        return blue(ajVar, proto, 2);
    }

    public G6.q fuchsia(String str, String str2, Bundle bundle) {
        int i4;
        try {
            cyan(str, str2, bundle);
            S5.a aVar = (S5.a) this.red;
            S5.l lVar = aVar.charlie;
            int oscar = lVar.oscar();
            S5.f fVar = S5.f.red;
            if (oscar < 12000000) {
                if (lVar.papa() != 0) {
                    return aVar.alpha(bundle).foxtrot(fVar, new J2.e(15, aVar, bundle));
                }
                return V4.delta(new IOException("MISSING_INSTANCEID_SERVICE"));
            }
            S5.k charlie = S5.k.charlie(aVar.bravo);
            synchronized (charlie) {
                i4 = charlie.alpha;
                charlie.alpha = i4 + 1;
            }
            return charlie.echo(new S5.j(i4, 1, bundle, 1)).mike(fVar, S5.c.purple);
        } catch (InterruptedException | ExecutionException e) {
            return V4.delta(e);
        }
    }

    public void gold(Context context, String str) {
        this.alpha = new gd.a(context, str);
        this.purple = new com.google.android.material.internal.ab(context, str);
    }

    @Override // cf.InterfaceC0847c
    public ArrayList golf(cf.r container) {
        Ge.n nVar;
        Intrinsics.echo(container, "container");
        pe.an anVar = (pe.an) container.delta;
        C3158b c3158b = null;
        if (anVar instanceof Ge.n) {
            nVar = (Ge.n) anVar;
        } else {
            nVar = null;
        }
        if (nVar != null) {
            c3158b = nVar.alpha;
        }
        if (c3158b != null) {
            ArrayList arrayList = new ArrayList(1);
            Class klass = c3158b.alpha;
            Intrinsics.echo(klass, "klass");
            Annotation[] declaredAnnotations = klass.getDeclaredAnnotations();
            Intrinsics.delta(declaredAnnotations, "klass.declaredAnnotations");
            for (Annotation annotation : declaredAnnotations) {
                Intrinsics.delta(annotation, "annotation");
                Class bravo = AbstractC3062u.bravo(AbstractC3062u.alpha(annotation));
                U7.c beige = beige(AbstractC3192d.alpha(bravo), new C3157a(annotation), arrayList);
                if (beige != null) {
                    AbstractC3075w2.bravo(beige, annotation, bravo);
                }
            }
            return arrayList;
        }
        throw new IllegalStateException(("Class for loading annotations is not found: " + container.golf.bravo()).toString());
    }

    @Override // cf.InterfaceC0847c
    public List india(A2.aj container, Ie.t tVar) {
        Intrinsics.echo(container, "container");
        String string = ((Ke.e) container.bravo).getString(tVar.silver);
        String desc = Me.b.bravo(((cf.r) container).golf.charlie());
        Intrinsics.echo(desc, "desc");
        return sierra(this, container, new Ge.o(string + '#' + desc), null, false, 60);
    }

    @Override // cf.InterfaceC0845a
    public Object juliet(A2.aj container, Ie.ag proto, kotlin.reflect.jvm.internal.impl.types.y yVar) {
        Intrinsics.echo(container, "container");
        Intrinsics.echo(proto, "proto");
        return black(container, proto, 3, yVar, Ge.b.alpha);
    }

    public synchronized tg.b kilo() {
        tg.b bVar;
        try {
            if (((String) this.red) != null) {
                this.silver = crimson();
            }
            this.white = coral();
            bVar = new tg.b(4);
            bVar.purple = (C2576i) this.white;
        } catch (Throwable th) {
            throw th;
        }
        return bVar;
    }

    @Override // cf.InterfaceC0847c
    public List lima(A2.aj ajVar, Ie.ag proto) {
        Intrinsics.echo(proto, "proto");
        return blue(ajVar, proto, 3);
    }

    @Override // cf.InterfaceC0847c
    public ArrayList november(Ie.aq proto, Ke.e nameResolver) {
        int collectionSizeOrDefault;
        Intrinsics.echo(proto, "proto");
        Intrinsics.echo(nameResolver, "nameResolver");
        Object kilo = proto.kilo(Le.k.foxtrot);
        Intrinsics.delta(kilo, "proto.getExtension(JvmProtoBuf.typeAnnotation)");
        Iterable<Ie.g> iterable = (Iterable) kilo;
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(iterable, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        for (Ie.g it : iterable) {
            Intrinsics.delta(it, "it");
            arrayList.add(((J2.c) this.teal).lima(it, nameResolver));
        }
        return arrayList;
    }

    @Override // cf.InterfaceC0847c
    public List oscar(A2.aj ajVar, Oe.l proto, int i4) {
        Intrinsics.echo(proto, "proto");
        com.google.android.material.datepicker.j.papa(i4, "kind");
        Ge.o tango = tango(proto, (Ke.e) ajVar.bravo, (G6.j) ajVar.charlie, i4, false);
        if (tango != null) {
            return sierra(this, ajVar, new Ge.o(P0.gold(new StringBuilder(), tango.alpha, "@0")), null, false, 60);
        }
        return CollectionsKt.emptyList();
    }

    public P papa() {
        SurfaceTexture surfaceTexture = new SurfaceTexture(0);
        Size size = (Size) this.silver;
        surfaceTexture.setDefaultBufferSize(size.getWidth(), size.getHeight());
        Surface surface = new Surface(surfaceTexture);
        L delta = L.delta((an) this.red, size);
        delta.bravo.alpha = 1;
        J j5 = new J(surface);
        this.alpha = j5;
        com.google.common.util.concurrent.e delta2 = be.h.delta(j5.echo);
        w.o oVar = new w.o(24, surface, surfaceTexture);
        delta2.foxtrot(new be.g(0, delta2, oVar), tg.k.bravo());
        delta.bravo((J) this.alpha, androidx.camera.core.t.delta, -1);
        M m4 = (M) this.white;
        if (m4 != null) {
            m4.bravo();
        }
        M m5 = new M(new androidx.camera.core.x(4, this));
        this.white = m5;
        delta.foxtrot = m5;
        return delta.charlie();
    }

    public G6.q quebec(G6.q qVar) {
        return qVar.mike(new ap.a(1), new a4.u(18, this));
    }

    public List romeo(A2.aj ajVar, Ge.o oVar, boolean z2, boolean z10, Boolean bool, boolean z11) {
        Ge.n nVar;
        C3158b yankee = yankee(ajVar, z2, z10, bool, z11);
        if (yankee == null) {
            if (ajVar instanceof cf.r) {
                pe.an anVar = (pe.an) ((cf.r) ajVar).delta;
                if (anVar instanceof Ge.n) {
                    nVar = (Ge.n) anVar;
                } else {
                    nVar = null;
                }
                if (nVar != null) {
                    yankee = nVar.alpha;
                }
            }
            yankee = null;
        }
        if (yankee == null) {
            return CollectionsKt.emptyList();
        }
        List list = (List) ((Ge.a) ((ff.e) this.purple).invoke(yankee)).alpha.get(oVar);
        if (list == null) {
            return CollectionsKt.emptyList();
        }
        return list;
    }

    public ArrayList uniform() {
        ArrayList arrayList;
        synchronized (this.purple) {
            arrayList = new ArrayList((LinkedHashSet) this.red);
        }
        return arrayList;
    }

    public ArrayList victor() {
        ArrayList arrayList;
        synchronized (this.purple) {
            arrayList = new ArrayList((LinkedHashSet) this.teal);
        }
        return arrayList;
    }

    public ArrayList xray() {
        ArrayList arrayList;
        synchronized (this.purple) {
            arrayList = new ArrayList();
            arrayList.addAll(uniform());
            arrayList.addAll(victor());
        }
        return arrayList;
    }

    public C3158b yankee(A2.aj container, boolean z2, boolean z10, Boolean bool, boolean z11) {
        cf.r rVar;
        Ge.n nVar;
        Ge.g gVar;
        Ve.b bVar;
        Intrinsics.echo(container, "container");
        Ie.i iVar = Ie.i.INTERFACE;
        C2576i c2576i = (C2576i) this.alpha;
        pe.an anVar = (pe.an) container.delta;
        if (z2) {
            if (bool != null) {
                if (container instanceof cf.r) {
                    cf.r rVar2 = (cf.r) container;
                    if (rVar2.hotel == iVar) {
                        return AbstractC2625c5.bravo(c2576i, rVar2.golf.delta(Ne.f.echo("DefaultImpls")), (Me.f) this.white);
                    }
                }
                if (bool.booleanValue() && (container instanceof cf.s)) {
                    if (anVar instanceof Ge.g) {
                        gVar = (Ge.g) anVar;
                    } else {
                        gVar = null;
                    }
                    if (gVar != null) {
                        bVar = gVar.purple;
                    } else {
                        bVar = null;
                    }
                    if (bVar != null) {
                        String echo = bVar.echo();
                        Intrinsics.delta(echo, "facadeClassName.internalName");
                        return AbstractC2625c5.bravo(c2576i, Ne.b.juliet(new Ne.c(kotlin.text.r.november(echo, '/', '.'))), (Me.f) this.white);
                    }
                }
            } else {
                throw new IllegalStateException(("isConst should not be null for property (container=" + container + ')').toString());
            }
        }
        if (z10 && (container instanceof cf.r)) {
            cf.r rVar3 = (cf.r) container;
            if (rVar3.hotel == Ie.i.COMPANION_OBJECT && (rVar = rVar3.foxtrot) != null) {
                Ie.i iVar2 = Ie.i.CLASS;
                Ie.i iVar3 = rVar.hotel;
                if (iVar3 == iVar2 || iVar3 == Ie.i.ENUM_CLASS || (z11 && (iVar3 == iVar || iVar3 == Ie.i.ANNOTATION_CLASS))) {
                    pe.an anVar2 = (pe.an) rVar.delta;
                    if (anVar2 instanceof Ge.n) {
                        nVar = (Ge.n) anVar2;
                    } else {
                        nVar = null;
                    }
                    if (nVar == null) {
                        return null;
                    }
                    return nVar.alpha;
                }
            }
        }
        if (!(container instanceof cf.s) || !(anVar instanceof Ge.g)) {
            return null;
        }
        Intrinsics.charlie(anVar, "null cannot be cast to non-null type org.jetbrains.kotlin.load.kotlin.JvmPackagePartSource");
        Ge.g gVar2 = (Ge.g) anVar;
        C3158b c3158b = gVar2.red;
        if (c3158b == null) {
            return AbstractC2625c5.bravo(c2576i, gVar2.alpha(), (Me.f) this.white);
        }
        return c3158b;
    }

    public ColorStateList zulu(int i4, Context context) {
        if (i4 == R.drawable.abc_edit_text_material) {
            return AbstractC1735d.charlie(R.color.abc_tint_edittext, context);
        }
        if (i4 == R.drawable.abc_switch_track_mtrl_alpha) {
            return AbstractC1735d.charlie(R.color.abc_tint_switch_track, context);
        }
        if (i4 == R.drawable.abc_switch_thumb_material) {
            int[][] iArr = new int[3];
            int[] iArr2 = new int[3];
            ColorStateList delta = S0.delta(R.attr.colorSwitchThumbNormal, context);
            if (delta != null && delta.isStateful()) {
                int[] iArr3 = S0.bravo;
                iArr[0] = iArr3;
                iArr2[0] = delta.getColorForState(iArr3, 0);
                iArr[1] = S0.echo;
                iArr2[1] = S0.charlie(R.attr.colorControlActivated, context);
                iArr[2] = S0.foxtrot;
                iArr2[2] = delta.getDefaultColor();
            } else {
                iArr[0] = S0.bravo;
                iArr2[0] = S0.bravo(R.attr.colorSwitchThumbNormal, context);
                iArr[1] = S0.echo;
                iArr2[1] = S0.charlie(R.attr.colorControlActivated, context);
                iArr[2] = S0.foxtrot;
                iArr2[2] = S0.charlie(R.attr.colorSwitchThumbNormal, context);
            }
            return new ColorStateList(iArr, iArr2);
        }
        if (i4 == R.drawable.abc_btn_default_mtrl_shape) {
            return mike(S0.charlie(R.attr.colorButtonNormal, context), context);
        }
        if (i4 == R.drawable.abc_btn_borderless_material) {
            return mike(0, context);
        }
        if (i4 == R.drawable.abc_btn_colored_material) {
            return mike(S0.charlie(R.attr.colorAccent, context), context);
        }
        if (i4 != R.drawable.abc_spinner_mtrl_am_alpha && i4 != R.drawable.abc_spinner_textfield_background_material) {
            if (hotel(i4, (int[]) this.purple)) {
                return S0.delta(R.attr.colorControlNormal, context);
            }
            if (hotel(i4, (int[]) this.teal)) {
                return AbstractC1735d.charlie(R.color.abc_tint_default, context);
            }
            if (hotel(i4, (int[]) this.white)) {
                return AbstractC1735d.charlie(R.color.abc_tint_btn_checkable, context);
            }
            if (i4 == R.drawable.abc_seekbar_thumb_material) {
                return AbstractC1735d.charlie(R.color.abc_tint_seek_thumb, context);
            }
            return null;
        }
        return AbstractC1735d.charlie(R.color.abc_tint_spinner, context);
    }

    public ao(Set set, String str, String str2) {
        D6.a aVar = D6.a.alpha;
        Set unmodifiableSet = set == null ? Collections.EMPTY_SET : Collections.unmodifiableSet(set);
        this.alpha = unmodifiableSet;
        Map map = Collections.EMPTY_MAP;
        this.red = str;
        this.silver = str2;
        this.teal = aVar;
        HashSet hashSet = new HashSet(unmodifiableSet);
        Iterator it = map.values().iterator();
        if (!it.hasNext()) {
            this.purple = Collections.unmodifiableSet(hashSet);
            return;
        }
        throw ao.ad.yankee(it);
    }

    public ao(C1467s logger, og.a scope, InterfaceC1772d clazz, lg.b bVar, kg.a aVar) {
        Intrinsics.echo(logger, "logger");
        Intrinsics.echo(scope, "scope");
        Intrinsics.echo(clazz, "clazz");
        this.alpha = logger;
        this.purple = scope;
        this.red = clazz;
        this.silver = bVar;
        this.teal = aVar;
        this.white = "t:'" + pg.a.alpha(clazz) + "' - q:'" + bVar + '\'';
    }

    public ao(int i4) {
        switch (i4) {
            case 16:
                this.alpha = null;
                this.purple = null;
                this.red = null;
                this.silver = null;
                this.teal = null;
                return;
            default:
                this.alpha = new int[]{R.drawable.abc_textfield_search_default_mtrl_alpha, R.drawable.abc_textfield_default_mtrl_alpha, R.drawable.abc_ab_share_pack_mtrl_alpha};
                this.purple = new int[]{R.drawable.abc_ic_commit_search_api_mtrl_alpha, R.drawable.abc_seekbar_tick_mark_material, R.drawable.abc_ic_menu_share_mtrl_alpha, R.drawable.abc_ic_menu_copy_mtrl_am_alpha, R.drawable.abc_ic_menu_cut_mtrl_alpha, R.drawable.abc_ic_menu_selectall_mtrl_alpha, R.drawable.abc_ic_menu_paste_mtrl_am_alpha};
                this.red = new int[]{R.drawable.abc_textfield_activated_mtrl_alpha, R.drawable.abc_textfield_search_activated_mtrl_alpha, R.drawable.abc_cab_background_top_mtrl_alpha, R.drawable.abc_text_cursor_material, R.drawable.abc_text_select_handle_left_mtrl, R.drawable.abc_text_select_handle_middle_mtrl, R.drawable.abc_text_select_handle_right_mtrl};
                this.silver = new int[]{R.drawable.abc_popup_background_mtrl_mult, R.drawable.abc_cab_background_internal_bg, R.drawable.abc_menu_hardkey_panel_mtrl_mult};
                this.teal = new int[]{R.drawable.abc_tab_indicator_material, R.drawable.abc_textfield_search_material};
                this.white = new int[]{R.drawable.abc_btn_check_material, R.drawable.abc_btn_radio_material, R.drawable.abc_btn_check_material_anim, R.drawable.abc_btn_radio_material_anim};
                return;
        }
    }
}
