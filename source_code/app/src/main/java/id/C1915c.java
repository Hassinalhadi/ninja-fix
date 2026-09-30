package id;

import A7.l;
import A7.r;
import K1.p;
import K1.s;
import K1.y;
import K1.z;
import P.j;
import P.k;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.Editable;
import android.text.Selection;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.appcompat.widget.C0488x;
import androidx.appcompat.widget.ay;
import androidx.camera.core.ap;
import androidx.camera.core.ar;
import androidx.camera.core.impl.AbstractC0512j;
import androidx.camera.core.impl.EnumC0516n;
import androidx.camera.core.impl.EnumC0517o;
import androidx.camera.core.impl.EnumC0518p;
import androidx.camera.core.impl.InterfaceC0519q;
import androidx.camera.core.impl.InterfaceC0523v;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import bd.AbstractC0754g;
import be.InterfaceC0757c;
import bv.al;
import bv.au;
import c1.C0807f;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import com.bumptech.glide.load.resource.bitmap.v;
import com.clevertap.android.sdk.Constants;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.o;
import delivery.samurai.android.R;
import g.C1718a;
import g1.AbstractC1735d;
import ge.InterfaceC1772d;
import ge.aa;
import ge.x;
import hd.w;
import j1.AbstractC1930d;
import java.nio.ByteBuffer;
import java.security.InvalidAlgorithmParameterException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.u;
import s6.H4;
import s6.W4;
import t6.AbstractC3032n3;
import t6.S3;
import y7.InterfaceC3401a;
import zd.C3509a;

/* renamed from: id.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1915c implements w, InterfaceC3401a, Q3.a, G6.e, InterfaceC0757c, v {
    public final /* synthetic */ int alpha;
    public Object purple;
    public Object red;
    public Object silver;

    public /* synthetic */ C1915c(int i4, boolean z2) {
        this.alpha = i4;
    }

    public static boolean juliet(Editable editable, KeyEvent keyEvent, boolean z2) {
        z[] zVarArr;
        if (KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState())) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (selectionStart != -1 && selectionEnd != -1 && selectionStart == selectionEnd && (zVarArr = (z[]) editable.getSpans(selectionStart, selectionEnd, z.class)) != null && zVarArr.length > 0) {
                for (z zVar : zVarArr) {
                    int spanStart = editable.getSpanStart(zVar);
                    int spanEnd = editable.getSpanEnd(zVar);
                    if ((z2 && spanStart == selectionStart) || ((!z2 && spanEnd == selectionStart) || (selectionStart > spanStart && selectionStart < spanEnd))) {
                        editable.delete(spanStart, spanEnd);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static C1915c sierra(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.dialog_city_selectioin, viewGroup, false);
        int i4 = R.id.btnClose;
        if (((ImageButton) S3.bravo(R.id.btnClose, inflate)) != null) {
            i4 = R.id.recyclerView;
            RecyclerView recyclerView = (RecyclerView) S3.bravo(R.id.recyclerView, inflate);
            if (recyclerView != null) {
                i4 = R.id.title;
                TextView textView = (TextView) S3.bravo(R.id.title, inflate);
                if (textView != null) {
                    return new C1915c((ConstraintLayout) inflate, recyclerView, textView, 3);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i4)));
    }

    public static C1915c tango(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.dialog_shopping_list_v2, viewGroup, false);
        int i4 = R.id.btnClose;
        ImageButton imageButton = (ImageButton) S3.bravo(R.id.btnClose, inflate);
        if (imageButton != null) {
            i4 = R.id.recyclerView;
            RecyclerView recyclerView = (RecyclerView) S3.bravo(R.id.recyclerView, inflate);
            if (recyclerView != null) {
                i4 = R.id.textView10;
                if (((TextView) S3.bravo(R.id.textView10, inflate)) != null) {
                    return new C1915c((ConstraintLayout) inflate, imageButton, recyclerView, 5);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i4)));
    }

    public static C1915c victor(Context context, AttributeSet attributeSet, int[] iArr, int i4) {
        return new C1915c(context, context.obtainStyledAttributes(attributeSet, iArr, i4, 0));
    }

    @Override // Q3.a
    public com.bumptech.glide.load.engine.w alpha(com.bumptech.glide.load.engine.w wVar, E3.i iVar) {
        Drawable drawable = (Drawable) wVar.get();
        if (drawable instanceof BitmapDrawable) {
            return ((Fe.c) this.red).alpha(com.bumptech.glide.load.resource.bitmap.c.charlie((G3.b) this.purple, ((BitmapDrawable) drawable).getBitmap()), iVar);
        }
        if (drawable instanceof P3.c) {
            return ((Q3.d) this.silver).alpha(wVar, iVar);
        }
        return null;
    }

    public void amber(Z0.e eVar, int i4, int i5, int i10) {
        eVar.getClass();
        int i11 = eVar.plum;
        int i12 = eVar.purple;
        eVar.plum = 0;
        eVar.purple = 0;
        eVar.indigo(i5);
        eVar.gold(i10);
        if (i11 < 0) {
            eVar.plum = 0;
        } else {
            eVar.plum = i11;
        }
        if (i12 < 0) {
            eVar.purple = 0;
        } else {
            eVar.purple = i12;
        }
        Z0.e eVar2 = (Z0.e) this.silver;
        eVar2.f2459l = i4;
        eVar2.maroon();
    }

    public void azure(Z0.e eVar) {
        ArrayList arrayList = (ArrayList) this.purple;
        arrayList.clear();
        int size = eVar.f2456i.size();
        for (int i4 = 0; i4 < size; i4++) {
            Z0.d dVar = (Z0.d) eVar.f2456i.get(i4);
            int[] iArr = dVar.f2454h;
            if (iArr[0] == 3 || iArr[1] == 3) {
                arrayList.add(dVar);
            }
        }
        eVar.f2458k.bravo = true;
    }

    @Override // be.InterfaceC0757c
    public void b(Throwable th) {
        ((bp.c) this.silver).white = null;
        ArrayList arrayList = (ArrayList) this.purple;
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((InterfaceC0523v) this.red).juliet((AbstractC0512j) it.next());
            }
            arrayList.clear();
        }
    }

    @Override // hd.w
    public void bravo(Object obj, cd.c scope) {
        C1916d plugin = (C1916d) obj;
        Intrinsics.echo(plugin, "plugin");
        Intrinsics.echo(scope, "scope");
        C1914b c1914b = new C1914b(plugin.alpha, scope, plugin.purple);
        plugin.red.invoke(c1914b);
        plugin.silver = c1914b.delta;
        Iterator it = c1914b.charlie.iterator();
        while (it.hasNext()) {
            e eVar = (e) it.next();
            eVar.getClass();
            eVar.alpha.alpha(scope, eVar.bravo);
        }
    }

    @Override // com.bumptech.glide.load.resource.bitmap.v
    public int charlie() {
        com.bumptech.glide.load.resource.bitmap.w wVar = (com.bumptech.glide.load.resource.bitmap.w) ((com.bumptech.glide.load.data.h) this.purple).purple;
        wVar.reset();
        return H4.bravo((ArrayList) this.silver, wVar, (G3.g) this.red);
    }

    @Override // y7.InterfaceC3401a
    public byte[] delta(int i4, byte[] bArr) {
        byte[] echo;
        if (i4 <= 16) {
            Cipher cipher = (Cipher) l.echo.alpha("AES/ECB/NoPadding");
            cipher.init(1, (SecretKeySpec) this.purple);
            int max = Math.max(1, (int) Math.ceil(bArr.length / 16.0d));
            if (max * 16 == bArr.length) {
                echo = AbstractC0754g.delta((max - 1) * 16, 0, 16, bArr, (byte[]) this.red);
            } else {
                byte[] copyOfRange = Arrays.copyOfRange(bArr, (max - 1) * 16, bArr.length);
                if (copyOfRange.length < 16) {
                    byte[] copyOf = Arrays.copyOf(copyOfRange, 16);
                    copyOf[copyOfRange.length] = Byte.MIN_VALUE;
                    echo = AbstractC0754g.echo(copyOf, (byte[]) this.silver);
                } else {
                    throw new IllegalArgumentException("x must be smaller than a block.");
                }
            }
            byte[] bArr2 = new byte[16];
            for (int i5 = 0; i5 < max - 1; i5++) {
                bArr2 = cipher.doFinal(AbstractC0754g.delta(0, i5 * 16, 16, bArr2, bArr));
            }
            return Arrays.copyOf(cipher.doFinal(AbstractC0754g.echo(echo, bArr2)), i4);
        }
        throw new InvalidAlgorithmParameterException("outputLength too large, max is 16 bytes");
    }

    @Override // com.bumptech.glide.load.resource.bitmap.v
    public Bitmap echo(BitmapFactory.Options options) {
        com.bumptech.glide.load.resource.bitmap.w wVar = (com.bumptech.glide.load.resource.bitmap.w) ((com.bumptech.glide.load.data.h) this.purple).purple;
        wVar.reset();
        return BitmapFactory.decodeStream(wVar, null, options);
    }

    @Override // hd.w
    public Object foxtrot(Function1 block) {
        Intrinsics.echo(block, "block");
        Object invoke = ((Function0) this.purple).invoke();
        block.invoke(invoke);
        return new C1916d((C3509a) this.silver, invoke, (Function1) this.red);
    }

    @Override // hd.w
    public C3509a getKey() {
        return (C3509a) this.silver;
    }

    @Override // com.bumptech.glide.load.resource.bitmap.v
    public void golf() {
        com.bumptech.glide.load.resource.bitmap.w wVar = (com.bumptech.glide.load.resource.bitmap.w) ((com.bumptech.glide.load.data.h) this.purple).purple;
        synchronized (wVar) {
            wVar.red = wVar.alpha.length;
        }
    }

    public E5.i hotel() {
        String str;
        if (((String) this.purple) == null) {
            str = " backendName";
        } else {
            str = "";
        }
        if (((B5.d) this.silver) == null) {
            str = str.concat(" priority");
        }
        if (str.isEmpty()) {
            return new E5.i((String) this.purple, (byte[]) this.red, (B5.d) this.silver);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    @Override // com.bumptech.glide.load.resource.bitmap.v
    public ImageHeaderParser$ImageType india() {
        com.bumptech.glide.load.resource.bitmap.w wVar = (com.bumptech.glide.load.resource.bitmap.w) ((com.bumptech.glide.load.data.h) this.purple).purple;
        wVar.reset();
        return H4.charlie((ArrayList) this.silver, wVar, (G3.g) this.red);
    }

    public Object kilo() {
        Object removeLast;
        synchronized (this.red) {
            removeLast = ((ArrayDeque) this.purple).removeLast();
        }
        return removeLast;
    }

    public void lima(ar arVar) {
        InterfaceC0519q interfaceC0519q;
        ap red = arVar.red();
        Object obj = null;
        if (red instanceof bf.c) {
            interfaceC0519q = ((bf.c) red).alpha;
        } else {
            interfaceC0519q = null;
        }
        if ((interfaceC0519q.s() != EnumC0517o.white && interfaceC0519q.s() != EnumC0517o.silver) || interfaceC0519q.a() != EnumC0516n.teal || interfaceC0519q.xray() != EnumC0518p.silver) {
            ((S7.a) this.silver).getClass();
            arVar.close();
            return;
        }
        synchronized (this.red) {
            try {
                if (((ArrayDeque) this.purple).size() >= 3) {
                    obj = kilo();
                }
                ((ArrayDeque) this.purple).addFirst(arVar);
            } catch (Throwable th) {
                throw th;
            }
        }
        if (((S7.a) this.silver) != null && obj != null) {
            ((ar) obj).close();
        }
    }

    public Object mike() {
        long charlie = P.e.charlie();
        if (charlie == k.alpha) {
            return this.silver;
        }
        j jVar = (j) ((AtomicReference) this.purple).get();
        int alpha = jVar.alpha(charlie);
        if (alpha >= 0) {
            return jVar.charlie[alpha];
        }
        return null;
    }

    public ColorStateList november(int i4) {
        int resourceId;
        ColorStateList charlie;
        TypedArray typedArray = (TypedArray) this.red;
        if (typedArray.hasValue(i4) && (resourceId = typedArray.getResourceId(i4, 0)) != 0 && (charlie = AbstractC1735d.charlie(resourceId, (Context) this.purple)) != null) {
            return charlie;
        }
        return typedArray.getColorStateList(i4);
    }

    @Override // G6.e
    public void onComplete(Task task) {
        S5.a aVar = (S5.a) this.purple;
        String str = (String) this.red;
        ScheduledFuture scheduledFuture = (ScheduledFuture) this.silver;
        synchronized (aVar.alpha) {
            aVar.alpha.remove(str);
        }
        scheduledFuture.cancel(false);
    }

    @Override // be.InterfaceC0757c
    public void onSuccess(Object obj) {
        ((bp.c) this.silver).white = null;
    }

    public Drawable oscar(int i4) {
        int resourceId;
        TypedArray typedArray = (TypedArray) this.red;
        if (typedArray.hasValue(i4) && (resourceId = typedArray.getResourceId(i4, 0)) != 0) {
            return AbstractC3032n3.echo(resourceId, (Context) this.purple);
        }
        return typedArray.getDrawable(i4);
    }

    public Drawable papa(int i4) {
        int resourceId;
        Drawable golf;
        if (((TypedArray) this.red).hasValue(i4) && (resourceId = ((TypedArray) this.red).getResourceId(i4, 0)) != 0) {
            C0488x alpha = C0488x.alpha();
            Context context = (Context) this.purple;
            synchronized (alpha) {
                golf = alpha.alpha.golf(context, resourceId, true);
            }
            return golf;
        }
        return null;
    }

    public Typeface quebec(int i4, int i5, ay ayVar) {
        int resourceId = ((TypedArray) this.red).getResourceId(i4, 0);
        if (resourceId != 0) {
            if (((TypedValue) this.silver) == null) {
                this.silver = new TypedValue();
            }
            TypedValue typedValue = (TypedValue) this.silver;
            ThreadLocal threadLocal = i1.k.alpha;
            Context context = (Context) this.purple;
            if (context.isRestricted()) {
                return null;
            }
            return i1.k.bravo(context, resourceId, typedValue, i5, ayVar, true, false);
        }
        return null;
    }

    public boolean romeo(CharSequence charSequence, int i4, int i5, y yVar) {
        int i10;
        if ((yVar.charlie & 3) == 0) {
            K1.d dVar = (K1.d) this.silver;
            androidx.emoji2.text.flatbuffer.a bravo = yVar.bravo();
            int alpha = bravo.alpha(8);
            if (alpha != 0) {
                ((ByteBuffer) bravo.silver).getShort(alpha + bravo.alpha);
            }
            dVar.getClass();
            ThreadLocal threadLocal = K1.d.bravo;
            if (threadLocal.get() == null) {
                threadLocal.set(new StringBuilder());
            }
            StringBuilder sb2 = (StringBuilder) threadLocal.get();
            sb2.setLength(0);
            while (i4 < i5) {
                sb2.append(charSequence.charAt(i4));
                i4++;
            }
            TextPaint textPaint = dVar.alpha;
            String sb3 = sb2.toString();
            int i11 = AbstractC1930d.alpha;
            boolean hasGlyph = textPaint.hasGlyph(sb3);
            int i12 = yVar.charlie & 4;
            if (hasGlyph) {
                i10 = i12 | 2;
            } else {
                i10 = i12 | 1;
            }
            yVar.charlie = i10;
        }
        if ((yVar.charlie & 3) == 2) {
            return true;
        }
        return false;
    }

    public String toString() {
        switch (this.alpha) {
            case 20:
                StringBuilder sb2 = new StringBuilder("NavDeepLinkRequest{");
                Uri uri = (Uri) this.purple;
                if (uri != null) {
                    sb2.append(" uri=");
                    sb2.append(String.valueOf(uri));
                }
                String str = (String) this.red;
                if (str != null) {
                    sb2.append(" action=");
                    sb2.append(str);
                }
                String str2 = (String) this.silver;
                if (str2 != null) {
                    sb2.append(" mimetype=");
                    sb2.append(str2);
                }
                sb2.append(" }");
                String sb3 = sb2.toString();
                Intrinsics.delta(sb3, "toString(...)");
                return sb3;
            default:
                return super.toString();
        }
    }

    public boolean uniform(int i4, Z0.d dVar, C0807f c0807f) {
        boolean z2;
        boolean z10;
        boolean z11;
        boolean z12;
        int[] iArr = dVar.f2454h;
        int i5 = iArr[0];
        a1.b bVar = (a1.b) this.red;
        bVar.alpha = i5;
        bVar.bravo = iArr[1];
        bVar.charlie = dVar.quebec();
        bVar.delta = dVar.kilo();
        bVar.india = false;
        bVar.juliet = i4;
        if (bVar.alpha == 3) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (bVar.bravo == 3) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z2 && dVar.ochre > 0.0f) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z10 && dVar.ochre > 0.0f) {
            z12 = true;
        } else {
            z12 = false;
        }
        int[] iArr2 = dVar.tango;
        if (z11 && iArr2[0] == 4) {
            bVar.alpha = 1;
        }
        if (z12 && iArr2[1] == 4) {
            bVar.bravo = 1;
        }
        c0807f.bravo(dVar, bVar);
        dVar.indigo(bVar.echo);
        dVar.gold(bVar.foxtrot);
        dVar.blue = bVar.hotel;
        dVar.cyan(bVar.golf);
        bVar.juliet = 0;
        return bVar.india;
    }

    public Object whiskey(CharSequence charSequence, int i4, int i5, int i10, boolean z2, p pVar) {
        int i11;
        K1.v vVar;
        char c3;
        s sVar = new s((K1.v) ((o) this.red).charlie);
        int codePointAt = Character.codePointAt(charSequence, i4);
        boolean z10 = true;
        int i12 = 0;
        int i13 = i4;
        loop0: while (true) {
            i11 = i13;
            while (i13 < i5 && i12 < i10 && z10) {
                SparseArray sparseArray = sVar.charlie.alpha;
                if (sparseArray == null) {
                    vVar = null;
                } else {
                    vVar = (K1.v) sparseArray.get(codePointAt);
                }
                if (sVar.alpha != 2) {
                    if (vVar == null) {
                        sVar.alpha();
                        c3 = 1;
                    } else {
                        sVar.alpha = 2;
                        sVar.charlie = vVar;
                        sVar.foxtrot = 1;
                        c3 = 2;
                    }
                } else {
                    if (vVar != null) {
                        sVar.charlie = vVar;
                        sVar.foxtrot++;
                    } else {
                        if (codePointAt == 65038) {
                            sVar.alpha();
                        } else if (codePointAt != 65039) {
                            K1.v vVar2 = sVar.charlie;
                            if (vVar2.bravo != null) {
                                if (sVar.foxtrot == 1) {
                                    if (sVar.bravo()) {
                                        sVar.delta = sVar.charlie;
                                        sVar.alpha();
                                    } else {
                                        sVar.alpha();
                                    }
                                } else {
                                    sVar.delta = vVar2;
                                    sVar.alpha();
                                }
                                c3 = 3;
                            } else {
                                sVar.alpha();
                            }
                        }
                        c3 = 1;
                    }
                    c3 = 2;
                }
                sVar.echo = codePointAt;
                if (c3 != 1) {
                    if (c3 != 2) {
                        if (c3 == 3) {
                            if (z2 || !romeo(charSequence, i11, i13, sVar.delta.bravo)) {
                                z10 = pVar.k(charSequence, i11, i13, sVar.delta.bravo);
                                i12++;
                            }
                        }
                    } else {
                        int charCount = Character.charCount(codePointAt) + i13;
                        if (charCount < i5) {
                            codePointAt = Character.codePointAt(charSequence, charCount);
                        }
                        i13 = charCount;
                    }
                } else {
                    i13 = Character.charCount(Character.codePointAt(charSequence, i11)) + i11;
                    if (i13 < i5) {
                        codePointAt = Character.codePointAt(charSequence, i13);
                    }
                }
            }
        }
        if (sVar.alpha == 2 && sVar.charlie.bravo != null && ((sVar.foxtrot > 1 || sVar.bravo()) && i12 < i10 && z10 && (z2 || !romeo(charSequence, i11, i13, sVar.charlie.bravo)))) {
            pVar.k(charSequence, i11, i13, sVar.charlie.bravo);
        }
        return pVar.magenta();
    }

    public void xray() {
        ((TypedArray) this.red).recycle();
    }

    public void yankee(Object obj) {
        long charlie = P.e.charlie();
        if (charlie == k.alpha) {
            this.silver = obj;
            return;
        }
        synchronized (this.red) {
            j jVar = (j) ((AtomicReference) this.purple).get();
            int alpha = jVar.alpha(charlie);
            if (alpha < 0) {
                ((AtomicReference) this.purple).set(jVar.bravo(charlie, obj));
            } else {
                jVar.charlie[alpha] = obj;
            }
        }
    }

    public void zulu(String str) {
        if (str != null) {
            this.purple = str;
            return;
        }
        throw new NullPointerException("Null backendName");
    }

    public /* synthetic */ C1915c(ViewGroup viewGroup, TextView textView, TextView textView2, TextView textView3, int i4) {
        this.alpha = i4;
        this.purple = textView;
        this.red = textView2;
        this.silver = textView3;
    }

    public /* synthetic */ C1915c(Object obj, Object obj2, Object obj3, int i4) {
        this.alpha = i4;
        this.purple = obj;
        this.red = obj2;
        this.silver = obj3;
    }

    public C1915c(int i4) {
        this.alpha = i4;
        switch (i4) {
            case 15:
                this.purple = new AtomicReference(P.e.charlie);
                this.red = new Object();
                return;
            case 23:
                long[] jArr = au.alpha;
                this.purple = new al();
                return;
            default:
                this.purple = new WeakHashMap();
                this.red = new WeakHashMap();
                this.silver = new WeakHashMap();
                return;
        }
    }

    public C1915c(S7.a aVar) {
        this.alpha = 25;
        this.red = new Object();
        this.purple = new ArrayDeque(3);
        this.silver = aVar;
    }

    public C1915c(byte[] bArr) {
        this.alpha = 1;
        r.alpha(bArr.length);
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        this.purple = secretKeySpec;
        Cipher cipher = (Cipher) l.echo.alpha("AES/ECB/NoPadding");
        cipher.init(1, secretKeySpec);
        byte[] bravo = D6.b.bravo(cipher.doFinal(new byte[16]));
        this.red = bravo;
        this.silver = D6.b.bravo(bravo);
    }

    public C1915c(String str, Function0 createConfiguration, Function1 function1) {
        ge.w wVar;
        this.alpha = 0;
        Intrinsics.echo(createConfiguration, "createConfiguration");
        this.purple = createConfiguration;
        this.red = function1;
        kotlin.jvm.internal.v vVar = u.alpha;
        InterfaceC1772d bravo = vVar.bravo(C1916d.class);
        try {
            ge.z zVar = ge.z.charlie;
            InterfaceC1772d bravo2 = vVar.bravo(C1915c.class);
            aa aaVar = aa.alpha;
            x mike = vVar.mike(bravo2);
            vVar.kilo(mike, Collections.singletonList(u.alpha(Object.class)));
            wVar = u.bravo(C1916d.class, W4.bravo(vVar.lima(mike, Collections.EMPTY_LIST, false)));
        } catch (Throwable unused) {
            wVar = null;
        }
        this.silver = new C3509a(str, new Ed.a(bravo, wVar));
    }

    public C1915c(View view) {
        this.alpha = 12;
        this.purple = view;
        this.red = LazyKt.alpha(kotlin.i.purple, new Aa.g(22, this));
        this.silver = new C1718a(view);
    }

    public C1915c(Context context, TypedArray typedArray) {
        this.alpha = 22;
        this.purple = context;
        this.red = typedArray;
    }

    public C1915c(Z0.e eVar) {
        this.alpha = 21;
        this.purple = new ArrayList();
        this.red = new Object();
        this.silver = eVar;
    }

    public C1915c(o oVar, W8.a aVar, K1.d dVar, Set set) {
        this.alpha = 13;
        this.purple = aVar;
        this.red = oVar;
        this.silver = dVar;
        if (set.isEmpty()) {
            return;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            int[] iArr = (int[]) it.next();
            String str = new String(iArr, 0, iArr.length);
            whiskey(str, 0, str.length(), 1, true, new K1.r(str, 0));
        }
    }

    public C1915c(bp.c cVar, ArrayList arrayList, InterfaceC0523v interfaceC0523v) {
        this.alpha = 26;
        this.silver = cVar;
        this.purple = arrayList;
        this.red = interfaceC0523v;
    }

    public C1915c(Oe.a aVar, ArrayList arrayList, G3.g gVar) {
        this.alpha = 29;
        Y3.f.charlie(gVar, "Argument must not be null");
        this.red = gVar;
        Y3.f.charlie(arrayList, "Argument must not be null");
        this.silver = arrayList;
        this.purple = new com.bumptech.glide.load.data.h(aVar, gVar);
    }

    public C1915c(com.bumptech.glide.load.engine.l lVar, U3.h hVar, com.bumptech.glide.load.engine.p pVar) {
        this.alpha = 28;
        this.silver = lVar;
        this.red = hVar;
        this.purple = pVar;
    }

    public C1915c(J2.c cVar) {
        this.alpha = 24;
        this.silver = cVar;
        this.red = new AtomicBoolean(false);
        this.purple = ((av.s) cVar.red).silver.schedule(new av.p(this, 0), Constants.PN_LARGE_ICON_DOWNLOAD_TIMEOUT_IN_MILLIS, TimeUnit.MILLISECONDS);
    }
}
