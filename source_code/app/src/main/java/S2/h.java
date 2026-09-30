package S2;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import t6.AbstractC2977c3;
import vf.ab;
import vf.ad;

/* loaded from: classes3.dex */
public final class h extends Pd.i implements Xd.l {
    public List alpha;
    public X2.k purple;
    public int red;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ a f2036s;
    public int silver;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ X2.k f2037t;
    public int teal;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ List f2038u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ M2.c f2039v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ X2.h f2040w;
    public /* synthetic */ Object white;
    public final /* synthetic */ i yellow;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(i iVar, a aVar, X2.k kVar, List list, M2.c cVar, X2.h hVar, Nd.c cVar2) {
        super(2, cVar2);
        this.yellow = iVar;
        this.f2036s = aVar;
        this.f2037t = kVar;
        this.f2038u = list;
        this.f2039v = cVar;
        this.f2040w = hVar;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        h hVar = new h(this.yellow, this.f2036s, this.f2037t, this.f2038u, this.f2039v, this.f2040w, cVar);
        hVar.white = obj;
        return hVar;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((h) create((ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        ab abVar;
        X2.k kVar;
        Bitmap bravo;
        List list;
        int size;
        int i4;
        Od.a aVar = Od.a.alpha;
        int i5 = this.teal;
        a aVar2 = this.f2036s;
        M2.c cVar = this.f2039v;
        if (i5 != 0) {
            if (i5 == 1) {
                size = this.silver;
                int i10 = this.red;
                kVar = this.purple;
                list = this.alpha;
                abVar = (ab) this.white;
                ResultKt.alpha(obj);
                bravo = (Bitmap) obj;
                ad.oscar(abVar.charlie());
                i4 = i10 + 1;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.alpha(obj);
            abVar = (ab) this.white;
            Drawable drawable = aVar2.alpha;
            boolean z2 = drawable instanceof BitmapDrawable;
            kVar = this.f2037t;
            if (z2) {
                Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
                Bitmap.Config config = bitmap.getConfig();
                if (config == null) {
                    config = Bitmap.Config.ARGB_8888;
                }
                if (ArraysKt.whiskey(a3.h.alpha, config)) {
                    bravo = bitmap;
                    cVar.getClass();
                    list = this.f2038u;
                    size = list.size();
                    i4 = 0;
                }
            }
            bravo = AbstractC2977c3.bravo(drawable, kVar.bravo, kVar.delta, kVar.echo, kVar.foxtrot);
            cVar.getClass();
            list = this.f2038u;
            size = list.size();
            i4 = 0;
        }
        if (i4 >= size) {
            cVar.getClass();
            return new a(new BitmapDrawable(this.f2040w.alpha.getResources(), bravo), aVar2.bravo, aVar2.charlie, aVar2.delta);
        }
        if (list.get(i4) == null) {
            Y2.h hVar = kVar.delta;
            this.white = abVar;
            this.alpha = list;
            this.purple = kVar;
            this.red = i4;
            this.silver = size;
            this.teal = 1;
            throw null;
        }
        throw new ClassCastException();
    }
}
