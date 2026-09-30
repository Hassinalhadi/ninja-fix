package df;

import B9.K;
import Ie.ac;
import Ie.ae;
import Ie.ak;
import Ie.al;
import Ie.j;
import J2.i;
import Ue.e;
import Xe.n;
import Xe.s;
import bx.C0769g;
import ef.p;
import ff.l;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.y;
import kotlin.jvm.internal.Intrinsics;
import pe.InterfaceC2321ad;
import pe.InterfaceC2349y;
import se.ab;
import w.o;

/* loaded from: classes2.dex */
public final class c extends ab implements InterfaceC2321ad {

    /* renamed from: a, reason: collision with root package name */
    public final o f12557a;

    /* renamed from: b, reason: collision with root package name */
    public final i f12558b;

    /* renamed from: c, reason: collision with root package name */
    public ae f12559c;

    /* renamed from: d, reason: collision with root package name */
    public p f12560d;
    public final Je.a yellow;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r4v4, types: [J2.i, java.lang.Object] */
    public c(Ne.c fqName, l lVar, InterfaceC2349y module, ae aeVar, Je.a aVar) {
        super(module, fqName);
        int collectionSizeOrDefault;
        Intrinsics.echo(fqName, "fqName");
        Intrinsics.echo(module, "module");
        this.yellow = aVar;
        al alVar = aeVar.silver;
        Intrinsics.delta(alVar, "proto.strings");
        ak akVar = aeVar.teal;
        Intrinsics.delta(akVar, "proto.qualifiedNames");
        o oVar = new o(alVar, akVar);
        this.f12557a = oVar;
        C0769g c0769g = new C0769g(5, this);
        ?? obj = new Object();
        obj.alpha = oVar;
        obj.purple = aVar;
        obj.red = c0769g;
        List list = aeVar.yellow;
        Intrinsics.delta(list, "proto.class_List");
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
        int quebec = y.quebec(collectionSizeOrDefault);
        LinkedHashMap linkedHashMap = new LinkedHashMap(quebec < 16 ? 16 : quebec);
        for (Object obj2 : list) {
            linkedHashMap.put(Zd.a.alpha((o) obj.alpha, ((j) obj2).teal), obj2);
        }
        obj.silver = linkedHashMap;
        this.f12558b = obj;
        this.f12559c = aeVar;
    }

    public final void a0(K components) {
        Intrinsics.echo(components, "components");
        ae aeVar = this.f12559c;
        if (aeVar != null) {
            this.f12559c = null;
            ac acVar = aeVar.white;
            Intrinsics.delta(acVar, "proto.`package`");
            this.f12560d = new p(this, acVar, this.f12557a, this.yellow, null, components, "scope of " + this, new s(12, this));
            return;
        }
        throw new IllegalStateException("Repeated call to DeserializedPackageFragmentImpl::initialize");
    }

    @Override // pe.InterfaceC2321ad
    public final n olive() {
        p pVar = this.f12560d;
        if (pVar != null) {
            return pVar;
        }
        Intrinsics.lima("_memberScope");
        throw null;
    }

    @Override // se.ab, se.AbstractC2863m
    public final String toString() {
        return "builtins package fragment for " + this.teal + " from " + e.juliet(this);
    }
}
