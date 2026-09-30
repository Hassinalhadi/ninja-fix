package S2;

import X2.m;
import a3.n;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import coil.memory.MemoryCache$Key;
import java.util.LinkedHashMap;
import kotlin.ResultKt;
import kotlin.Unit;
import t6.AbstractC2967a3;
import vf.ab;

/* loaded from: classes3.dex */
public final class g extends Pd.i implements Xd.l {
    public int alpha;
    public final /* synthetic */ i purple;
    public final /* synthetic */ X2.h red;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ l f2035s;
    public final /* synthetic */ Object silver;
    public final /* synthetic */ X2.k teal;
    public final /* synthetic */ M2.c white;
    public final /* synthetic */ MemoryCache$Key yellow;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(i iVar, X2.h hVar, Object obj, X2.k kVar, M2.c cVar, MemoryCache$Key memoryCache$Key, l lVar, Nd.c cVar2) {
        super(2, cVar2);
        this.purple = iVar;
        this.red = hVar;
        this.silver = obj;
        this.teal = kVar;
        this.white = cVar;
        this.yellow = memoryCache$Key;
        this.f2035s = lVar;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new g(this.purple, this.red, this.silver, this.teal, this.white, this.yellow, this.f2035s, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((g) create((ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c5  */
    @Override // Pd.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object bravo;
        V2.b bVar;
        BitmapDrawable bitmapDrawable;
        Bitmap bitmap;
        boolean z2;
        MemoryCache$Key memoryCache$Key;
        l lVar;
        boolean z10;
        Od.a aVar = Od.a.alpha;
        int i4 = this.alpha;
        if (i4 != 0) {
            if (i4 == 1) {
                ResultKt.alpha(obj);
                bravo = obj;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.alpha(obj);
            i iVar = this.purple;
            X2.h hVar = this.red;
            Object obj2 = this.silver;
            X2.k kVar = this.teal;
            M2.c cVar = this.white;
            this.alpha = 1;
            bravo = i.bravo(iVar, hVar, obj2, kVar, cVar, this);
            if (bravo == aVar) {
                return aVar;
            }
        }
        a aVar2 = (a) bravo;
        n nVar = this.purple.bravo;
        synchronized (nVar) {
            try {
                M2.k kVar2 = (M2.k) nVar.alpha.get();
                if (kVar2 != null) {
                    if (nVar.purple == null) {
                        Context context = kVar2.alpha;
                        nVar.purple = context;
                        context.registerComponentCallbacks(nVar);
                    }
                } else {
                    nVar.bravo();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        O7.j jVar = this.purple.delta;
        MemoryCache$Key memoryCache$Key2 = this.yellow;
        if (this.red.november.purple && (bVar = (V2.b) ((M2.k) jVar.purple).charlie.getValue()) != null && memoryCache$Key2 != null) {
            Drawable drawable = aVar2.alpha;
            if (drawable instanceof BitmapDrawable) {
                bitmapDrawable = (BitmapDrawable) drawable;
            } else {
                bitmapDrawable = null;
            }
            if (bitmapDrawable != null && (bitmap = bitmapDrawable.getBitmap()) != null) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("coil#is_sampled", Boolean.valueOf(aVar2.bravo));
                String str = aVar2.delta;
                if (str != null) {
                    linkedHashMap.put("coil#disk_cache_key", str);
                }
                bVar.alpha.bravo(new MemoryCache$Key(memoryCache$Key2.alpha, AbstractC2967a3.charlie(memoryCache$Key2.purple)), bitmap, AbstractC2967a3.charlie(linkedHashMap));
                z2 = true;
                Drawable drawable2 = aVar2.alpha;
                X2.h hVar2 = this.red;
                O2.f fVar = aVar2.charlie;
                MemoryCache$Key memoryCache$Key3 = this.yellow;
                if (!z2) {
                    memoryCache$Key = memoryCache$Key3;
                } else {
                    memoryCache$Key = null;
                }
                String str2 = aVar2.delta;
                boolean z11 = aVar2.bravo;
                lVar = this.f2035s;
                Bitmap.Config[] configArr = a3.h.alpha;
                if (lVar == null && lVar.purple) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                return new m(drawable2, hVar2, fVar, memoryCache$Key, str2, z11, z10);
            }
        }
        z2 = false;
        Drawable drawable22 = aVar2.alpha;
        X2.h hVar22 = this.red;
        O2.f fVar2 = aVar2.charlie;
        MemoryCache$Key memoryCache$Key32 = this.yellow;
        if (!z2) {
        }
        String str22 = aVar2.delta;
        boolean z112 = aVar2.bravo;
        lVar = this.f2035s;
        Bitmap.Config[] configArr2 = a3.h.alpha;
        if (lVar == null) {
        }
        z10 = false;
        return new m(drawable22, hVar22, fVar2, memoryCache$Key, str22, z112, z10);
    }
}
